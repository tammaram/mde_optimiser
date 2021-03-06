/**
 * generated by Xtext 2.10.0
 */
package uk.ac.kcl.mdeoptimise.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.mdeoptimise.ConstraintInterpreterSpec;
import uk.ac.kcl.mdeoptimise.MdeoptimisePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Interpreter Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.mdeoptimise.impl.ConstraintInterpreterSpecImpl#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link uk.ac.kcl.mdeoptimise.impl.ConstraintInterpreterSpecImpl#getConstraintType <em>Constraint Type</em>}</li>
 *   <li>{@link uk.ac.kcl.mdeoptimise.impl.ConstraintInterpreterSpecImpl#getConstraintSpec <em>Constraint Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintInterpreterSpecImpl extends MinimalEObjectImpl.Container implements ConstraintInterpreterSpec
{
  /**
   * The default value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintName()
   * @generated
   * @ordered
   */
  protected static final String CONSTRAINT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstraintName() <em>Constraint Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintName()
   * @generated
   * @ordered
   */
  protected String constraintName = CONSTRAINT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getConstraintType() <em>Constraint Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintType()
   * @generated
   * @ordered
   */
  protected static final String CONSTRAINT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstraintType() <em>Constraint Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintType()
   * @generated
   * @ordered
   */
  protected String constraintType = CONSTRAINT_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getConstraintSpec() <em>Constraint Spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintSpec()
   * @generated
   * @ordered
   */
  protected static final String CONSTRAINT_SPEC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstraintSpec() <em>Constraint Spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintSpec()
   * @generated
   * @ordered
   */
  protected String constraintSpec = CONSTRAINT_SPEC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintInterpreterSpecImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MdeoptimisePackage.Literals.CONSTRAINT_INTERPRETER_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstraintName()
  {
    return constraintName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraintName(String newConstraintName)
  {
    String oldConstraintName = constraintName;
    constraintName = newConstraintName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_NAME, oldConstraintName, constraintName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstraintType()
  {
    return constraintType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraintType(String newConstraintType)
  {
    String oldConstraintType = constraintType;
    constraintType = newConstraintType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_TYPE, oldConstraintType, constraintType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstraintSpec()
  {
    return constraintSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraintSpec(String newConstraintSpec)
  {
    String oldConstraintSpec = constraintSpec;
    constraintSpec = newConstraintSpec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_SPEC, oldConstraintSpec, constraintSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_NAME:
        return getConstraintName();
      case MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_TYPE:
        return getConstraintType();
      case MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_SPEC:
        return getConstraintSpec();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_NAME:
        setConstraintName((String)newValue);
        return;
      case MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_TYPE:
        setConstraintType((String)newValue);
        return;
      case MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_SPEC:
        setConstraintSpec((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_NAME:
        setConstraintName(CONSTRAINT_NAME_EDEFAULT);
        return;
      case MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_TYPE:
        setConstraintType(CONSTRAINT_TYPE_EDEFAULT);
        return;
      case MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_SPEC:
        setConstraintSpec(CONSTRAINT_SPEC_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_NAME:
        return CONSTRAINT_NAME_EDEFAULT == null ? constraintName != null : !CONSTRAINT_NAME_EDEFAULT.equals(constraintName);
      case MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_TYPE:
        return CONSTRAINT_TYPE_EDEFAULT == null ? constraintType != null : !CONSTRAINT_TYPE_EDEFAULT.equals(constraintType);
      case MdeoptimisePackage.CONSTRAINT_INTERPRETER_SPEC__CONSTRAINT_SPEC:
        return CONSTRAINT_SPEC_EDEFAULT == null ? constraintSpec != null : !CONSTRAINT_SPEC_EDEFAULT.equals(constraintSpec);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (constraintName: ");
    result.append(constraintName);
    result.append(", constraintType: ");
    result.append(constraintType);
    result.append(", constraintSpec: ");
    result.append(constraintSpec);
    result.append(')');
    return result.toString();
  }

} //ConstraintInterpreterSpecImpl
