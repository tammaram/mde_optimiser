/**
 * generated by Xtext 2.10.0
 */
package uk.ac.kcl.mdeoptimise;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.mdeoptimise.MdeoptimisePackage
 * @generated
 */
public interface MdeoptimiseFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MdeoptimiseFactory eINSTANCE = uk.ac.kcl.mdeoptimise.impl.MdeoptimiseFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Optimisation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optimisation</em>'.
   * @generated
   */
  Optimisation createOptimisation();

  /**
   * Returns a new object of class '<em>Basepath Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basepath Spec</em>'.
   * @generated
   */
  BasepathSpec createBasepathSpec();

  /**
   * Returns a new object of class '<em>Meta Model Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meta Model Spec</em>'.
   * @generated
   */
  MetaModelSpec createMetaModelSpec();

  /**
   * Returns a new object of class '<em>Model Path Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Path Spec</em>'.
   * @generated
   */
  ModelPathSpec createModelPathSpec();

  /**
   * Returns a new object of class '<em>Objective Interpreter Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objective Interpreter Spec</em>'.
   * @generated
   */
  ObjectiveInterpreterSpec createObjectiveInterpreterSpec();

  /**
   * Returns a new object of class '<em>Constraint Interpreter Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint Interpreter Spec</em>'.
   * @generated
   */
  ConstraintInterpreterSpec createConstraintInterpreterSpec();

  /**
   * Returns a new object of class '<em>Evolver Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evolver Spec</em>'.
   * @generated
   */
  EvolverSpec createEvolverSpec();

  /**
   * Returns a new object of class '<em>Evolver Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evolver Parameter</em>'.
   * @generated
   */
  EvolverParameter createEvolverParameter();

  /**
   * Returns a new object of class '<em>Parameter Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Function</em>'.
   * @generated
   */
  ParameterFunction createParameterFunction();

  /**
   * Returns a new object of class '<em>Optimisation Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optimisation Spec</em>'.
   * @generated
   */
  OptimisationSpec createOptimisationSpec();

  /**
   * Returns a new object of class '<em>Algorithm Variation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Algorithm Variation</em>'.
   * @generated
   */
  AlgorithmVariation createAlgorithmVariation();

  /**
   * Returns a new object of class '<em>Probability Variation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Probability Variation</em>'.
   * @generated
   */
  ProbabilityVariation createProbabilityVariation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MdeoptimisePackage getMdeoptimisePackage();

} //MdeoptimiseFactory
