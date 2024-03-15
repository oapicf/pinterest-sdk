package models

type BidFloorSpec struct {

	Countries []Country `json:"countries,omitempty"`

	Currency Currency `json:"currency"`

	ObjectiveType ObjectiveType `json:"objective_type,omitempty"`

	BillableEvent ActionType `json:"billable_event"`

	OptimizationGoalMetadata OptimizationGoalMetadata `json:"optimization_goal_metadata,omitempty"`

	CreativeType CreativeType `json:"creative_type,omitempty"`
}
