/**
 */
package de.oaam.model.oaam.scenario;

import de.oaam.model.oaam.common.OaamBaseElementA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Numeric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A parameter with a numeric value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.scenario.ScenarioParameterNumeric#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.oaam.model.oaam.scenario.ScenarioPackage#getScenarioParameterNumeric()
 * @model
 * @generated
 */
public interface ScenarioParameterNumeric extends ScenarioParameterA, OaamBaseElementA {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see de.oaam.model.oaam.scenario.ScenarioPackage#getScenarioParameterNumeric_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link de.oaam.model.oaam.scenario.ScenarioParameterNumeric#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // ScenarioParameterNumeric
