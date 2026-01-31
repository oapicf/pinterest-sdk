package models

type BidFloorSpec struct {

	BillableEvent ActionType `json:"billable_event"`

	Countries []Country `json:"countries,omitempty"`

	CreativeType CreativeType `json:"creative_type,omitempty"`

	Currency Currency `json:"currency"`

	ObjectiveType ObjectiveType `json:"objective_type,omitempty"`

	OptimizationGoalMetadata OptimizationGoalMetadata `json:"optimization_goal_metadata,omitempty"`
}
