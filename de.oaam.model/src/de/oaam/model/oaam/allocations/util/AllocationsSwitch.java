/**
 */
package de.oaam.model.oaam.allocations.util;

import de.oaam.model.oaam.allocations.*;
import de.oaam.model.oaam.common.OaamBaseElementA;
import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.oaam.model.oaam.allocations.AllocationsPackage
 * @generated
 */
public class AllocationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AllocationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationsSwitch() {
		if (modelPackage == null) {
			modelPackage = AllocationsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AllocationsPackage.ALLOCATIONS_CONTAINER_A: {
				AllocationsContainerA allocationsContainerA = (AllocationsContainerA)theEObject;
				T result = caseAllocationsContainerA(allocationsContainerA);
				if (result == null) result = caseOaamBaseElementA(allocationsContainerA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllocationsPackage.TASK_ASSIGNMENT: {
				TaskAssignment taskAssignment = (TaskAssignment)theEObject;
				T result = caseTaskAssignment(taskAssignment);
				if (result == null) result = caseOaamBaseElementA(taskAssignment);
				if (result == null) result = caseVariantDependentElementA(taskAssignment);
				if (result == null) result = caseModeDependentElementA(taskAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllocationsPackage.SIGNAL_ASSIGNMENT: {
				SignalAssignment signalAssignment = (SignalAssignment)theEObject;
				T result = caseSignalAssignment(signalAssignment);
				if (result == null) result = caseOaamBaseElementA(signalAssignment);
				if (result == null) result = caseVariantDependentElementA(signalAssignment);
				if (result == null) result = caseModeDependentElementA(signalAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllocationsPackage.CONNECTION_ASSIGNMENT: {
				ConnectionAssignment connectionAssignment = (ConnectionAssignment)theEObject;
				T result = caseConnectionAssignment(connectionAssignment);
				if (result == null) result = caseOaamBaseElementA(connectionAssignment);
				if (result == null) result = caseVariantDependentElementA(connectionAssignment);
				if (result == null) result = caseModeDependentElementA(connectionAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllocationsPackage.SIGNAL_ASSIGNMENT_SEGMENT: {
				SignalAssignmentSegment signalAssignmentSegment = (SignalAssignmentSegment)theEObject;
				T result = caseSignalAssignmentSegment(signalAssignmentSegment);
				if (result == null) result = caseOaamBaseElementA(signalAssignmentSegment);
				if (result == null) result = caseVariantDependentElementA(signalAssignmentSegment);
				if (result == null) result = caseModeDependentElementA(signalAssignmentSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllocationsPackage.DEVICE_ASSIGNMENT: {
				DeviceAssignment deviceAssignment = (DeviceAssignment)theEObject;
				T result = caseDeviceAssignment(deviceAssignment);
				if (result == null) result = caseOaamBaseElementA(deviceAssignment);
				if (result == null) result = caseVariantDependentElementA(deviceAssignment);
				if (result == null) result = caseModeDependentElementA(deviceAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllocationsPackage.CONNECTION_ASSIGNMENT_SEGMENT: {
				ConnectionAssignmentSegment connectionAssignmentSegment = (ConnectionAssignmentSegment)theEObject;
				T result = caseConnectionAssignmentSegment(connectionAssignmentSegment);
				if (result == null) result = caseOaamBaseElementA(connectionAssignmentSegment);
				if (result == null) result = caseVariantDependentElementA(connectionAssignmentSegment);
				if (result == null) result = caseModeDependentElementA(connectionAssignmentSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllocationsPackage.SUBDEVICE_ASSIGNMENT: {
				SubdeviceAssignment subdeviceAssignment = (SubdeviceAssignment)theEObject;
				T result = caseSubdeviceAssignment(subdeviceAssignment);
				if (result == null) result = caseOaamBaseElementA(subdeviceAssignment);
				if (result == null) result = caseVariantDependentElementA(subdeviceAssignment);
				if (result == null) result = caseModeDependentElementA(subdeviceAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllocationsPackage.SUBCONNECTION_ASSIGNMENT: {
				SubconnectionAssignment subconnectionAssignment = (SubconnectionAssignment)theEObject;
				T result = caseSubconnectionAssignment(subconnectionAssignment);
				if (result == null) result = caseOaamBaseElementA(subconnectionAssignment);
				if (result == null) result = caseVariantDependentElementA(subconnectionAssignment);
				if (result == null) result = caseModeDependentElementA(subconnectionAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllocationsPackage.ALLOCATIONS: {
				Allocations allocations = (Allocations)theEObject;
				T result = caseAllocations(allocations);
				if (result == null) result = caseAllocationsContainerA(allocations);
				if (result == null) result = caseOaamBaseElementA(allocations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllocationsPackage.SUBALLOCATIONS: {
				Suballocations suballocations = (Suballocations)theEObject;
				T result = caseSuballocations(suballocations);
				if (result == null) result = caseAllocationsContainerA(suballocations);
				if (result == null) result = caseModeDependentElementA(suballocations);
				if (result == null) result = caseVariantDependentElementA(suballocations);
				if (result == null) result = caseOaamBaseElementA(suballocations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllocationsPackage.SCHEDULE: {
				Schedule schedule = (Schedule)theEObject;
				T result = caseSchedule(schedule);
				if (result == null) result = caseOaamBaseElementA(schedule);
				if (result == null) result = caseModeDependentElementA(schedule);
				if (result == null) result = caseVariantDependentElementA(schedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AllocationsPackage.SCHEDULED_TIME: {
				ScheduledTime scheduledTime = (ScheduledTime)theEObject;
				T result = caseScheduledTime(scheduledTime);
				if (result == null) result = caseOaamBaseElementA(scheduledTime);
				if (result == null) result = caseModeDependentElementA(scheduledTime);
				if (result == null) result = caseVariantDependentElementA(scheduledTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocationsContainerA(AllocationsContainerA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskAssignment(TaskAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalAssignment(SignalAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionAssignment(ConnectionAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Assignment Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Assignment Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalAssignmentSegment(SignalAssignmentSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceAssignment(DeviceAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Assignment Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Assignment Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionAssignmentSegment(ConnectionAssignmentSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subdevice Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subdevice Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubdeviceAssignment(SubdeviceAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subconnection Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subconnection Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubconnectionAssignment(SubconnectionAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocations(Allocations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suballocations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suballocations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuballocations(Suballocations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedule(Schedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduled Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduled Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduledTime(ScheduledTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oaam Base Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oaam Base Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOaamBaseElementA(OaamBaseElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Dependent Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Dependent Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantDependentElementA(VariantDependentElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Dependent Element A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Dependent Element A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModeDependentElementA(ModeDependentElementA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AllocationsSwitch