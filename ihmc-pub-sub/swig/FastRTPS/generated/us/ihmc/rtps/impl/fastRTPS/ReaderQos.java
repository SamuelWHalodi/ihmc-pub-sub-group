/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public class ReaderQos {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ReaderQos(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ReaderQos obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FastRTPSJNI.delete_ReaderQos(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ReaderQos() {
    this(FastRTPSJNI.new_ReaderQos(), true);
  }

  public void setM_durability(DurabilityQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_durability_set(swigCPtr, this, DurabilityQosPolicy.getCPtr(value), value);
  }

  public DurabilityQosPolicy getM_durability() {
    long cPtr = FastRTPSJNI.ReaderQos_m_durability_get(swigCPtr, this);
    return (cPtr == 0) ? null : new DurabilityQosPolicy(cPtr, false);
  }

  public void setM_deadline(DeadlineQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_deadline_set(swigCPtr, this, DeadlineQosPolicy.getCPtr(value), value);
  }

  public DeadlineQosPolicy getM_deadline() {
    long cPtr = FastRTPSJNI.ReaderQos_m_deadline_get(swigCPtr, this);
    return (cPtr == 0) ? null : new DeadlineQosPolicy(cPtr, false);
  }

  public void setM_latencyBudget(LatencyBudgetQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_latencyBudget_set(swigCPtr, this, LatencyBudgetQosPolicy.getCPtr(value), value);
  }

  public LatencyBudgetQosPolicy getM_latencyBudget() {
    long cPtr = FastRTPSJNI.ReaderQos_m_latencyBudget_get(swigCPtr, this);
    return (cPtr == 0) ? null : new LatencyBudgetQosPolicy(cPtr, false);
  }

  public void setM_liveliness(LivelinessQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_liveliness_set(swigCPtr, this, LivelinessQosPolicy.getCPtr(value), value);
  }

  public LivelinessQosPolicy getM_liveliness() {
    long cPtr = FastRTPSJNI.ReaderQos_m_liveliness_get(swigCPtr, this);
    return (cPtr == 0) ? null : new LivelinessQosPolicy(cPtr, false);
  }

  public void setM_reliability(ReliabilityQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_reliability_set(swigCPtr, this, ReliabilityQosPolicy.getCPtr(value), value);
  }

  public ReliabilityQosPolicy getM_reliability() {
    long cPtr = FastRTPSJNI.ReaderQos_m_reliability_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ReliabilityQosPolicy(cPtr, false);
  }

  public void setM_ownership(OwnershipQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_ownership_set(swigCPtr, this, OwnershipQosPolicy.getCPtr(value), value);
  }

  public OwnershipQosPolicy getM_ownership() {
    long cPtr = FastRTPSJNI.ReaderQos_m_ownership_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OwnershipQosPolicy(cPtr, false);
  }

  public void setM_destinationOrder(DestinationOrderQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_destinationOrder_set(swigCPtr, this, DestinationOrderQosPolicy.getCPtr(value), value);
  }

  public DestinationOrderQosPolicy getM_destinationOrder() {
    long cPtr = FastRTPSJNI.ReaderQos_m_destinationOrder_get(swigCPtr, this);
    return (cPtr == 0) ? null : new DestinationOrderQosPolicy(cPtr, false);
  }

  public void setM_userData(UserDataQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_userData_set(swigCPtr, this, UserDataQosPolicy.getCPtr(value), value);
  }

  public UserDataQosPolicy getM_userData() {
    long cPtr = FastRTPSJNI.ReaderQos_m_userData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new UserDataQosPolicy(cPtr, false);
  }

  public void setM_timeBasedFilter(TimeBasedFilterQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_timeBasedFilter_set(swigCPtr, this, TimeBasedFilterQosPolicy.getCPtr(value), value);
  }

  public TimeBasedFilterQosPolicy getM_timeBasedFilter() {
    long cPtr = FastRTPSJNI.ReaderQos_m_timeBasedFilter_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TimeBasedFilterQosPolicy(cPtr, false);
  }

  public void setM_presentation(PresentationQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_presentation_set(swigCPtr, this, PresentationQosPolicy.getCPtr(value), value);
  }

  public PresentationQosPolicy getM_presentation() {
    long cPtr = FastRTPSJNI.ReaderQos_m_presentation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new PresentationQosPolicy(cPtr, false);
  }

  public void setM_partition(PartitionQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_partition_set(swigCPtr, this, PartitionQosPolicy.getCPtr(value), value);
  }

  public PartitionQosPolicy getM_partition() {
    long cPtr = FastRTPSJNI.ReaderQos_m_partition_get(swigCPtr, this);
    return (cPtr == 0) ? null : new PartitionQosPolicy(cPtr, false);
  }

  public void setM_topicData(TopicDataQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_topicData_set(swigCPtr, this, TopicDataQosPolicy.getCPtr(value), value);
  }

  public TopicDataQosPolicy getM_topicData() {
    long cPtr = FastRTPSJNI.ReaderQos_m_topicData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TopicDataQosPolicy(cPtr, false);
  }

  public void setM_groupData(GroupDataQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_groupData_set(swigCPtr, this, GroupDataQosPolicy.getCPtr(value), value);
  }

  public GroupDataQosPolicy getM_groupData() {
    long cPtr = FastRTPSJNI.ReaderQos_m_groupData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new GroupDataQosPolicy(cPtr, false);
  }

  public void setM_durabilityService(DurabilityServiceQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_durabilityService_set(swigCPtr, this, DurabilityServiceQosPolicy.getCPtr(value), value);
  }

  public DurabilityServiceQosPolicy getM_durabilityService() {
    long cPtr = FastRTPSJNI.ReaderQos_m_durabilityService_get(swigCPtr, this);
    return (cPtr == 0) ? null : new DurabilityServiceQosPolicy(cPtr, false);
  }

  public void setM_lifespan(LifespanQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_lifespan_set(swigCPtr, this, LifespanQosPolicy.getCPtr(value), value);
  }

  public LifespanQosPolicy getM_lifespan() {
    long cPtr = FastRTPSJNI.ReaderQos_m_lifespan_get(swigCPtr, this);
    return (cPtr == 0) ? null : new LifespanQosPolicy(cPtr, false);
  }

  public void setM_dataRepresentation(DataRepresentationQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_dataRepresentation_set(swigCPtr, this, DataRepresentationQosPolicy.getCPtr(value), value);
  }

  public DataRepresentationQosPolicy getM_dataRepresentation() {
    long cPtr = FastRTPSJNI.ReaderQos_m_dataRepresentation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new DataRepresentationQosPolicy(cPtr, false);
  }

  public void setM_typeConsistency(TypeConsistencyEnforcementQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_typeConsistency_set(swigCPtr, this, TypeConsistencyEnforcementQosPolicy.getCPtr(value), value);
  }

  public TypeConsistencyEnforcementQosPolicy getM_typeConsistency() {
    long cPtr = FastRTPSJNI.ReaderQos_m_typeConsistency_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TypeConsistencyEnforcementQosPolicy(cPtr, false);
  }

  public void setM_disablePositiveACKs(DisablePositiveACKsQosPolicy value) {
    FastRTPSJNI.ReaderQos_m_disablePositiveACKs_set(swigCPtr, this, DisablePositiveACKsQosPolicy.getCPtr(value), value);
  }

  public DisablePositiveACKsQosPolicy getM_disablePositiveACKs() {
    long cPtr = FastRTPSJNI.ReaderQos_m_disablePositiveACKs_get(swigCPtr, this);
    return (cPtr == 0) ? null : new DisablePositiveACKsQosPolicy(cPtr, false);
  }

  public void setQos(ReaderQos readerqos, boolean first_time) {
    FastRTPSJNI.ReaderQos_setQos(swigCPtr, this, ReaderQos.getCPtr(readerqos), readerqos, first_time);
  }

  public boolean checkQos() {
    return FastRTPSJNI.ReaderQos_checkQos(swigCPtr, this);
  }

  public boolean canQosBeUpdated(ReaderQos qos) {
    return FastRTPSJNI.ReaderQos_canQosBeUpdated(swigCPtr, this, ReaderQos.getCPtr(qos), qos);
  }

}
