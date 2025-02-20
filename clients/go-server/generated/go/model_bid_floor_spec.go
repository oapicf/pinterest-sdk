// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




type BidFloorSpec struct {

	Countries []Country `json:"countries,omitempty"`

	Currency Currency `json:"currency"`

	ObjectiveType ObjectiveType `json:"objective_type,omitempty"`

	BillableEvent ActionType `json:"billable_event"`

	OptimizationGoalMetadata OptimizationGoalMetadata `json:"optimization_goal_metadata,omitempty"`

	CreativeType CreativeType `json:"creative_type,omitempty"`
}

// AssertBidFloorSpecRequired checks if the required fields are not zero-ed
func AssertBidFloorSpecRequired(obj BidFloorSpec) error {
	elements := map[string]interface{}{
		"currency": obj.Currency,
		"billable_event": obj.BillableEvent,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertOptimizationGoalMetadataRequired(obj.OptimizationGoalMetadata); err != nil {
		return err
	}
	return nil
}

// AssertBidFloorSpecConstraints checks if the values respects the defined constraints
func AssertBidFloorSpecConstraints(obj BidFloorSpec) error {
	if err := AssertOptimizationGoalMetadataConstraints(obj.OptimizationGoalMetadata); err != nil {
		return err
	}
	return nil
}
