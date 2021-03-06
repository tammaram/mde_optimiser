#!/usr/bin/env bash

if [ $TRAVIS_BRANCH != "master" ] && [ $TRAVIS_BRANCH != "develop" ]; then
    echo "$TRAVIS_BRANCH is not a deployment branch so no deployment necessary."
    exit 0
fi

echo "Deployment branch detected as $TRAVIS_BRANCH. Deploying code to P2 repo"

cd ../deploy/

ENCRYPTED_KEY_VAR="encrypted_${ENCRYPTION_LABEL}_key"
ENCRYPTED_IV_VAR="encrypted_${ENCRYPTION_LABEL}_iv"
ENCRYPTED_KEY=${!ENCRYPTED_KEY_VAR}
ENCRYPTED_IV=${!ENCRYPTED_IV_VAR}

openssl aes-256-cbc -K $ENCRYPTED_KEY -iv $ENCRYPTED_IV -in $DEPLOY_KEY -out deploy_key -d

eval `ssh-agent -s`

chmod 600 deploy_key
ssh-add deploy_key

cd $TRAVIS_BUILD_DIR/..

rm -rf gh-pages

git clone -b gh-pages git@github.com:$TRAVIS_REPO_SLUG gh-pages

cd gh-pages

mkdir -p downloads/eclipse/$TRAVIS_BRANCH
rm -rf downloads/eclipse/$TRAVIS_BRANCH/*

mv ../mde_optimiser/src/releng/uk.ac.kcl.mdeoptimise.repository/target/* downloads/eclipse/$TRAVIS_BRANCH/

git add --all

git config user.name "Travis CI"
git config user.email "travis-ci@mde-optimiser.github.io"

git commit -m "Published build id: $TRAVIS_BUILD_NUMBER"

git push origin gh-pages

echo "Code deployed to $TRAVIS_REPO_SLUG repository in github.com."


