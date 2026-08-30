package models
// WorkloadState : Workload processing state
type WorkloadState string

// List of WorkloadState
const (
	NOT_STARTED WorkloadState = "NOT_STARTED"
	RUNNING WorkloadState = "RUNNING"
	PAUSED WorkloadState = "PAUSED"
	SUCCEEDED WorkloadState = "SUCCEEDED"
	FAILED WorkloadState = "FAILED"
)
