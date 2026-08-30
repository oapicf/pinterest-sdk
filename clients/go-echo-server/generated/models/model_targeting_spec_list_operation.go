package models

type TargetingSpecListOperation string

// List of TargetingSpecListOperation
const (
	SET TargetingSpecListOperation = "SET"
	ADD TargetingSpecListOperation = "ADD"
	REMOVE TargetingSpecListOperation = "REMOVE"
)
