/**
 * generated by Xtext 2.10.0
 */
package uk.ac.kcl.mdeoptimise.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.mdeoptimise.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MdeoptimiseFactoryImpl extends EFactoryImpl implements MdeoptimiseFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MdeoptimiseFactory init()
  {
    try
    {
      MdeoptimiseFactory theMdeoptimiseFactory = (MdeoptimiseFactory)EPackage.Registry.INSTANCE.getEFactory(MdeoptimisePackage.eNS_URI);
      if (theMdeoptimiseFactory != null)
      {
        return theMdeoptimiseFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MdeoptimiseFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdeoptimiseFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MdeoptimisePackage.OPTIMISATION: return createOptimisation();
      case MdeoptimisePackage.BASEPATH_SPEC: return createBasepathSpec();
      case MdeoptimisePackage.META_MODEL_SPEC: return createMetaModelSpec();
      case MdeoptimisePackage.MODEL_PATH_SPEC: return createModelPathSpec();
      case MdeoptimisePackage.OBJECTIVE_INTERPRETER_SPEC: return createObjectiveInterpreterSpec();
      case MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC: return createConstraintInterpreterSpec();
      case MdeoptimisePackage.EVOLVER_SPEC: return createEvolverSpec();
      case MdeoptimisePackage.OPTIMISATION_SPEC: return createOptimisationSpec();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Optimisation createOptimisation()
  {
    OptimisationImpl optimisation = new OptimisationImpl();
    return optimisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasepathSpec createBasepathSpec()
  {
    BasepathSpecImpl basepathSpec = new BasepathSpecImpl();
    return basepathSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaModelSpec createMetaModelSpec()
  {
    MetaModelSpecImpl metaModelSpec = new MetaModelSpecImpl();
    return metaModelSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelPathSpec createModelPathSpec()
  {
    ModelPathSpecImpl modelPathSpec = new ModelPathSpecImpl();
    return modelPathSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectiveInterpreterSpec createObjectiveInterpreterSpec()
  {
    ObjectiveInterpreterSpecImpl objectiveInterpreterSpec = new ObjectiveInterpreterSpecImpl();
    return objectiveInterpreterSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintInterpreterSpec createConstraintInterpreterSpec()
  {
    ConstraintInterpreterSpecImpl constraintInterpreterSpec = new ConstraintInterpreterSpecImpl();
    return constraintInterpreterSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvolverSpec createEvolverSpec()
  {
    EvolverSpecImpl evolverSpec = new EvolverSpecImpl();
    return evolverSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptimisationSpec createOptimisationSpec()
  {
    OptimisationSpecImpl optimisationSpec = new OptimisationSpecImpl();
    return optimisationSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MdeoptimisePackage getMdeoptimisePackage()
  {
    return (MdeoptimisePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MdeoptimisePackage getPackage()
  {
    return MdeoptimisePackage.eINSTANCE;
  }

} //MdeoptimiseFactoryImpl
