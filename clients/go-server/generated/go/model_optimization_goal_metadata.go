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




type OptimizationGoalMetadata struct {

	ConversionTagV3GoalMetadata OptimizationGoalMetadataConversionTagV3GoalMetadata `json:"conversion_tag_v3_goal_metadata,omitempty"`

	FrequencyGoalMetadata OptimizationGoalMetadataFrequencyGoalMetadata `json:"frequency_goal_metadata,omitempty"`

	ScrollupGoalMetadata OptimizationGoalMetadataScrollupGoalMetadata `json:"scrollup_goal_metadata,omitempty"`
}

// AssertOptimizationGoalMetadataRequired checks if the required fields are not zero-ed
func AssertOptimizationGoalMetadataRequired(obj OptimizationGoalMetadata) error {
	if err := AssertOptimizationGoalMetadataConversionTagV3GoalMetadataRequired(obj.ConversionTagV3GoalMetadata); err != nil {
		return err
	}
	if err := AssertOptimizationGoalMetadataFrequencyGoalMetadataRequired(obj.FrequencyGoalMetadata); err != nil {
		return err
	}
	if err := AssertOptimizationGoalMetadataScrollupGoalMetadataRequired(obj.ScrollupGoalMetadata); err != nil {
		return err
	}
	return nil
}

// AssertOptimizationGoalMetadataConstraints checks if the values respects the defined constraints
func AssertOptimizationGoalMetadataConstraints(obj OptimizationGoalMetadata) error {
	if err := AssertOptimizationGoalMetadataConversionTagV3GoalMetadataConstraints(obj.ConversionTagV3GoalMetadata); err != nil {
		return err
	}
	if err := AssertOptimizationGoalMetadataFrequencyGoalMetadataConstraints(obj.FrequencyGoalMetadata); err != nil {
		return err
	}
	if err := AssertOptimizationGoalMetadataScrollupGoalMetadataConstraints(obj.ScrollupGoalMetadata); err != nil {
		return err
	}
	return nil
}
