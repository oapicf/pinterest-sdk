/*
Pinterest REST API

Pinterest's REST API

API version: 5.14.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// checks if the OptimizationGoalMetadata type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OptimizationGoalMetadata{}

// OptimizationGoalMetadata struct for OptimizationGoalMetadata
type OptimizationGoalMetadata struct {
	ConversionTagV3GoalMetadata *OptimizationGoalMetadataConversionTagV3GoalMetadata `json:"conversion_tag_v3_goal_metadata,omitempty"`
	FrequencyGoalMetadata *OptimizationGoalMetadataFrequencyGoalMetadata `json:"frequency_goal_metadata,omitempty"`
	ScrollupGoalMetadata *OptimizationGoalMetadataScrollupGoalMetadata `json:"scrollup_goal_metadata,omitempty"`
}

// NewOptimizationGoalMetadata instantiates a new OptimizationGoalMetadata object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOptimizationGoalMetadata() *OptimizationGoalMetadata {
	this := OptimizationGoalMetadata{}
	return &this
}

// NewOptimizationGoalMetadataWithDefaults instantiates a new OptimizationGoalMetadata object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOptimizationGoalMetadataWithDefaults() *OptimizationGoalMetadata {
	this := OptimizationGoalMetadata{}
	return &this
}

// GetConversionTagV3GoalMetadata returns the ConversionTagV3GoalMetadata field value if set, zero value otherwise.
func (o *OptimizationGoalMetadata) GetConversionTagV3GoalMetadata() OptimizationGoalMetadataConversionTagV3GoalMetadata {
	if o == nil || IsNil(o.ConversionTagV3GoalMetadata) {
		var ret OptimizationGoalMetadataConversionTagV3GoalMetadata
		return ret
	}
	return *o.ConversionTagV3GoalMetadata
}

// GetConversionTagV3GoalMetadataOk returns a tuple with the ConversionTagV3GoalMetadata field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OptimizationGoalMetadata) GetConversionTagV3GoalMetadataOk() (*OptimizationGoalMetadataConversionTagV3GoalMetadata, bool) {
	if o == nil || IsNil(o.ConversionTagV3GoalMetadata) {
		return nil, false
	}
	return o.ConversionTagV3GoalMetadata, true
}

// HasConversionTagV3GoalMetadata returns a boolean if a field has been set.
func (o *OptimizationGoalMetadata) HasConversionTagV3GoalMetadata() bool {
	if o != nil && !IsNil(o.ConversionTagV3GoalMetadata) {
		return true
	}

	return false
}

// SetConversionTagV3GoalMetadata gets a reference to the given OptimizationGoalMetadataConversionTagV3GoalMetadata and assigns it to the ConversionTagV3GoalMetadata field.
func (o *OptimizationGoalMetadata) SetConversionTagV3GoalMetadata(v OptimizationGoalMetadataConversionTagV3GoalMetadata) {
	o.ConversionTagV3GoalMetadata = &v
}

// GetFrequencyGoalMetadata returns the FrequencyGoalMetadata field value if set, zero value otherwise.
func (o *OptimizationGoalMetadata) GetFrequencyGoalMetadata() OptimizationGoalMetadataFrequencyGoalMetadata {
	if o == nil || IsNil(o.FrequencyGoalMetadata) {
		var ret OptimizationGoalMetadataFrequencyGoalMetadata
		return ret
	}
	return *o.FrequencyGoalMetadata
}

// GetFrequencyGoalMetadataOk returns a tuple with the FrequencyGoalMetadata field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OptimizationGoalMetadata) GetFrequencyGoalMetadataOk() (*OptimizationGoalMetadataFrequencyGoalMetadata, bool) {
	if o == nil || IsNil(o.FrequencyGoalMetadata) {
		return nil, false
	}
	return o.FrequencyGoalMetadata, true
}

// HasFrequencyGoalMetadata returns a boolean if a field has been set.
func (o *OptimizationGoalMetadata) HasFrequencyGoalMetadata() bool {
	if o != nil && !IsNil(o.FrequencyGoalMetadata) {
		return true
	}

	return false
}

// SetFrequencyGoalMetadata gets a reference to the given OptimizationGoalMetadataFrequencyGoalMetadata and assigns it to the FrequencyGoalMetadata field.
func (o *OptimizationGoalMetadata) SetFrequencyGoalMetadata(v OptimizationGoalMetadataFrequencyGoalMetadata) {
	o.FrequencyGoalMetadata = &v
}

// GetScrollupGoalMetadata returns the ScrollupGoalMetadata field value if set, zero value otherwise.
func (o *OptimizationGoalMetadata) GetScrollupGoalMetadata() OptimizationGoalMetadataScrollupGoalMetadata {
	if o == nil || IsNil(o.ScrollupGoalMetadata) {
		var ret OptimizationGoalMetadataScrollupGoalMetadata
		return ret
	}
	return *o.ScrollupGoalMetadata
}

// GetScrollupGoalMetadataOk returns a tuple with the ScrollupGoalMetadata field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OptimizationGoalMetadata) GetScrollupGoalMetadataOk() (*OptimizationGoalMetadataScrollupGoalMetadata, bool) {
	if o == nil || IsNil(o.ScrollupGoalMetadata) {
		return nil, false
	}
	return o.ScrollupGoalMetadata, true
}

// HasScrollupGoalMetadata returns a boolean if a field has been set.
func (o *OptimizationGoalMetadata) HasScrollupGoalMetadata() bool {
	if o != nil && !IsNil(o.ScrollupGoalMetadata) {
		return true
	}

	return false
}

// SetScrollupGoalMetadata gets a reference to the given OptimizationGoalMetadataScrollupGoalMetadata and assigns it to the ScrollupGoalMetadata field.
func (o *OptimizationGoalMetadata) SetScrollupGoalMetadata(v OptimizationGoalMetadataScrollupGoalMetadata) {
	o.ScrollupGoalMetadata = &v
}

func (o OptimizationGoalMetadata) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OptimizationGoalMetadata) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.ConversionTagV3GoalMetadata) {
		toSerialize["conversion_tag_v3_goal_metadata"] = o.ConversionTagV3GoalMetadata
	}
	if !IsNil(o.FrequencyGoalMetadata) {
		toSerialize["frequency_goal_metadata"] = o.FrequencyGoalMetadata
	}
	if !IsNil(o.ScrollupGoalMetadata) {
		toSerialize["scrollup_goal_metadata"] = o.ScrollupGoalMetadata
	}
	return toSerialize, nil
}

type NullableOptimizationGoalMetadata struct {
	value *OptimizationGoalMetadata
	isSet bool
}

func (v NullableOptimizationGoalMetadata) Get() *OptimizationGoalMetadata {
	return v.value
}

func (v *NullableOptimizationGoalMetadata) Set(val *OptimizationGoalMetadata) {
	v.value = val
	v.isSet = true
}

func (v NullableOptimizationGoalMetadata) IsSet() bool {
	return v.isSet
}

func (v *NullableOptimizationGoalMetadata) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOptimizationGoalMetadata(val *OptimizationGoalMetadata) *NullableOptimizationGoalMetadata {
	return &NullableOptimizationGoalMetadata{value: val, isSet: true}
}

func (v NullableOptimizationGoalMetadata) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOptimizationGoalMetadata) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


