/**
 * generated by Xtext 2.10.0
 */
package uk.ac.kcl.mdeoptimise.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.mdeoptimise.BasepathSpec;
import uk.ac.kcl.mdeoptimise.ConstraintInterpreterSpec;
import uk.ac.kcl.mdeoptimise.EvolverSpec;
import uk.ac.kcl.mdeoptimise.MdeoptimiseFactory;
import uk.ac.kcl.mdeoptimise.MdeoptimisePackage;
import uk.ac.kcl.mdeoptimise.MetaModelSpec;
import uk.ac.kcl.mdeoptimise.ModelPathSpec;
import uk.ac.kcl.mdeoptimise.ObjectiveInterpreterSpec;
import uk.ac.kcl.mdeoptimise.Optimisation;
import uk.ac.kcl.mdeoptimise.OptimisationSpec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MdeoptimisePackageImpl extends EPackageImpl implements MdeoptimisePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optimisationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basepathSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaModelSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelPathSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectiveInterpreterSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintInterpreterSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evolverSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optimisationSpecEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.mdeoptimise.MdeoptimisePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MdeoptimisePackageImpl()
  {
    super(eNS_URI, MdeoptimiseFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MdeoptimisePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MdeoptimisePackage init()
  {
    if (isInited) return (MdeoptimisePackage)EPackage.Registry.INSTANCE.getEPackage(MdeoptimisePackage.eNS_URI);

    // Obtain or create and register package
    MdeoptimisePackageImpl theMdeoptimisePackage = (MdeoptimisePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MdeoptimisePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MdeoptimisePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMdeoptimisePackage.createPackageContents();

    // Initialize created meta-data
    theMdeoptimisePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMdeoptimisePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MdeoptimisePackage.eNS_URI, theMdeoptimisePackage);
    return theMdeoptimisePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptimisation()
  {
    return optimisationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptimisation_Basepath()
  {
    return (EReference)optimisationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptimisation_Metamodel()
  {
    return (EReference)optimisationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptimisation_Model()
  {
    return (EReference)optimisationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptimisation_Objectives()
  {
    return (EReference)optimisationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptimisation_Constraints()
  {
    return (EReference)optimisationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptimisation_Evolvers()
  {
    return (EReference)optimisationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptimisation_Optimisation()
  {
    return (EReference)optimisationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasepathSpec()
  {
    return basepathSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBasepathSpec_Location()
  {
    return (EAttribute)basepathSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaModelSpec()
  {
    return metaModelSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaModelSpec_Location()
  {
    return (EAttribute)metaModelSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelPathSpec()
  {
    return modelPathSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelPathSpec_Location()
  {
    return (EAttribute)modelPathSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectiveInterpreterSpec()
  {
    return objectiveInterpreterSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectiveInterpreterSpec_ObjectiveName()
  {
    return (EAttribute)objectiveInterpreterSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectiveInterpreterSpec_ObjectiveTendency()
  {
    return (EAttribute)objectiveInterpreterSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectiveInterpreterSpec_ObjectiveType()
  {
    return (EAttribute)objectiveInterpreterSpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectiveInterpreterSpec_ObjectiveSpec()
  {
    return (EAttribute)objectiveInterpreterSpecEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraintInterpreterSpec()
  {
    return constraintInterpreterSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraintInterpreterSpec_ConstraintName()
  {
    return (EAttribute)constraintInterpreterSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraintInterpreterSpec_ConstraintType()
  {
    return (EAttribute)constraintInterpreterSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstraintInterpreterSpec_ConstraintSpec()
  {
    return (EAttribute)constraintInterpreterSpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvolverSpec()
  {
    return evolverSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvolverSpec_Rule_location()
  {
    return (EAttribute)evolverSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvolverSpec_Unit()
  {
    return (EAttribute)evolverSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvolverSpec_Type()
  {
    return (EAttribute)evolverSpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptimisationSpec()
  {
    return optimisationSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptimisationSpec_AlgorithmFactory()
  {
    return (EAttribute)optimisationSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptimisationSpec_AlgorithmName()
  {
    return (EAttribute)optimisationSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptimisationSpec_AlgorithmVariation()
  {
    return (EAttribute)optimisationSpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptimisationSpec_AlgorithmEvolutions()
  {
    return (EAttribute)optimisationSpecEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptimisationSpec_AlgorithmPopulation()
  {
    return (EAttribute)optimisationSpecEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdeoptimiseFactory getMdeoptimiseFactory()
  {
    return (MdeoptimiseFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    optimisationEClass = createEClass(OPTIMISATION);
    createEReference(optimisationEClass, OPTIMISATION__BASEPATH);
    createEReference(optimisationEClass, OPTIMISATION__METAMODEL);
    createEReference(optimisationEClass, OPTIMISATION__MODEL);
    createEReference(optimisationEClass, OPTIMISATION__OBJECTIVES);
    createEReference(optimisationEClass, OPTIMISATION__CONSTRAINTS);
    createEReference(optimisationEClass, OPTIMISATION__EVOLVERS);
    createEReference(optimisationEClass, OPTIMISATION__OPTIMISATION);

    basepathSpecEClass = createEClass(BASEPATH_SPEC);
    createEAttribute(basepathSpecEClass, BASEPATH_SPEC__LOCATION);

    metaModelSpecEClass = createEClass(META_MODEL_SPEC);
    createEAttribute(metaModelSpecEClass, META_MODEL_SPEC__LOCATION);

    modelPathSpecEClass = createEClass(MODEL_PATH_SPEC);
    createEAttribute(modelPathSpecEClass, MODEL_PATH_SPEC__LOCATION);

    objectiveInterpreterSpecEClass = createEClass(OBJECTIVE_INTERPRETER_SPEC);
    createEAttribute(objectiveInterpreterSpecEClass, OBJECTIVE_INTERPRETER_SPEC__OBJECTIVE_NAME);
    createEAttribute(objectiveInterpreterSpecEClass, OBJECTIVE_INTERPRETER_SPEC__OBJECTIVE_TENDENCY);
    createEAttribute(objectiveInterpreterSpecEClass, OBJECTIVE_INTERPRETER_SPEC__OBJECTIVE_TYPE);
    createEAttribute(objectiveInterpreterSpecEClass, OBJECTIVE_INTERPRETER_SPEC__OBJECTIVE_SPEC);

    constraintInterpreterSpecEClass = createEClass(CONSTRAINT_INTERPRETER_SPEC);
    createEAttribute(constraintInterpreterSpecEClass, CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_NAME);
    createEAttribute(constraintInterpreterSpecEClass, CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_TYPE);
    createEAttribute(constraintInterpreterSpecEClass, CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_SPEC);

    evolverSpecEClass = createEClass(EVOLVER_SPEC);
    createEAttribute(evolverSpecEClass, EVOLVER_SPEC__RULE_LOCATION);
    createEAttribute(evolverSpecEClass, EVOLVER_SPEC__UNIT);
    createEAttribute(evolverSpecEClass, EVOLVER_SPEC__TYPE);

    optimisationSpecEClass = createEClass(OPTIMISATION_SPEC);
    createEAttribute(optimisationSpecEClass, OPTIMISATION_SPEC__ALGORITHM_FACTORY);
    createEAttribute(optimisationSpecEClass, OPTIMISATION_SPEC__ALGORITHM_NAME);
    createEAttribute(optimisationSpecEClass, OPTIMISATION_SPEC__ALGORITHM_VARIATION);
    createEAttribute(optimisationSpecEClass, OPTIMISATION_SPEC__ALGORITHM_EVOLUTIONS);
    createEAttribute(optimisationSpecEClass, OPTIMISATION_SPEC__ALGORITHM_POPULATION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(optimisationEClass, Optimisation.class, "Optimisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptimisation_Basepath(), this.getBasepathSpec(), null, "basepath", null, 0, 1, Optimisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOptimisation_Metamodel(), this.getMetaModelSpec(), null, "metamodel", null, 0, 1, Optimisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOptimisation_Model(), this.getModelPathSpec(), null, "model", null, 0, 1, Optimisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOptimisation_Objectives(), this.getObjectiveInterpreterSpec(), null, "objectives", null, 0, -1, Optimisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOptimisation_Constraints(), this.getConstraintInterpreterSpec(), null, "constraints", null, 0, -1, Optimisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOptimisation_Evolvers(), this.getEvolverSpec(), null, "evolvers", null, 0, -1, Optimisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOptimisation_Optimisation(), this.getOptimisationSpec(), null, "optimisation", null, 0, 1, Optimisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basepathSpecEClass, BasepathSpec.class, "BasepathSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBasepathSpec_Location(), ecorePackage.getEString(), "location", null, 0, 1, BasepathSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaModelSpecEClass, MetaModelSpec.class, "MetaModelSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetaModelSpec_Location(), ecorePackage.getEString(), "location", null, 0, 1, MetaModelSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelPathSpecEClass, ModelPathSpec.class, "ModelPathSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelPathSpec_Location(), ecorePackage.getEString(), "location", null, 0, 1, ModelPathSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectiveInterpreterSpecEClass, ObjectiveInterpreterSpec.class, "ObjectiveInterpreterSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectiveInterpreterSpec_ObjectiveName(), ecorePackage.getEString(), "objectiveName", null, 0, 1, ObjectiveInterpreterSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjectiveInterpreterSpec_ObjectiveTendency(), ecorePackage.getEString(), "objectiveTendency", null, 0, 1, ObjectiveInterpreterSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjectiveInterpreterSpec_ObjectiveType(), ecorePackage.getEString(), "objectiveType", null, 0, 1, ObjectiveInterpreterSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjectiveInterpreterSpec_ObjectiveSpec(), ecorePackage.getEString(), "objectiveSpec", null, 0, 1, ObjectiveInterpreterSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintInterpreterSpecEClass, ConstraintInterpreterSpec.class, "ConstraintInterpreterSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstraintInterpreterSpec_ConstraintName(), ecorePackage.getEString(), "constraintName", null, 0, 1, ConstraintInterpreterSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstraintInterpreterSpec_ConstraintType(), ecorePackage.getEString(), "constraintType", null, 0, 1, ConstraintInterpreterSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstraintInterpreterSpec_ConstraintSpec(), ecorePackage.getEString(), "constraintSpec", null, 0, 1, ConstraintInterpreterSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evolverSpecEClass, EvolverSpec.class, "EvolverSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvolverSpec_Rule_location(), ecorePackage.getEString(), "rule_location", null, 0, 1, EvolverSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvolverSpec_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, EvolverSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvolverSpec_Type(), ecorePackage.getEString(), "type", null, 0, 1, EvolverSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optimisationSpecEClass, OptimisationSpec.class, "OptimisationSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOptimisationSpec_AlgorithmFactory(), ecorePackage.getEString(), "algorithmFactory", null, 0, 1, OptimisationSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOptimisationSpec_AlgorithmName(), ecorePackage.getEString(), "algorithmName", null, 0, 1, OptimisationSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOptimisationSpec_AlgorithmVariation(), ecorePackage.getEString(), "algorithmVariation", null, 0, 1, OptimisationSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOptimisationSpec_AlgorithmEvolutions(), ecorePackage.getEInt(), "algorithmEvolutions", null, 0, 1, OptimisationSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOptimisationSpec_AlgorithmPopulation(), ecorePackage.getEInt(), "algorithmPopulation", null, 0, 1, OptimisationSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MdeoptimisePackageImpl
