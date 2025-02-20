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
	"bytes"
	"fmt"
)

// checks if the BidFloorSpec type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &BidFloorSpec{}

// BidFloorSpec struct for BidFloorSpec
type BidFloorSpec struct {
	Countries []Country `json:"countries,omitempty"`
	Currency Currency `json:"currency"`
	ObjectiveType *ObjectiveType `json:"objective_type,omitempty"`
	BillableEvent ActionType `json:"billable_event"`
	OptimizationGoalMetadata *OptimizationGoalMetadata `json:"optimization_goal_metadata,omitempty"`
	CreativeType *CreativeType `json:"creative_type,omitempty"`
}

type _BidFloorSpec BidFloorSpec

// NewBidFloorSpec instantiates a new BidFloorSpec object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBidFloorSpec(currency Currency, billableEvent ActionType) *BidFloorSpec {
	this := BidFloorSpec{}
	this.Currency = currency
	this.BillableEvent = billableEvent
	return &this
}

// NewBidFloorSpecWithDefaults instantiates a new BidFloorSpec object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBidFloorSpecWithDefaults() *BidFloorSpec {
	this := BidFloorSpec{}
	return &this
}

// GetCountries returns the Countries field value if set, zero value otherwise.
func (o *BidFloorSpec) GetCountries() []Country {
	if o == nil || IsNil(o.Countries) {
		var ret []Country
		return ret
	}
	return o.Countries
}

// GetCountriesOk returns a tuple with the Countries field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BidFloorSpec) GetCountriesOk() ([]Country, bool) {
	if o == nil || IsNil(o.Countries) {
		return nil, false
	}
	return o.Countries, true
}

// HasCountries returns a boolean if a field has been set.
func (o *BidFloorSpec) HasCountries() bool {
	if o != nil && !IsNil(o.Countries) {
		return true
	}

	return false
}

// SetCountries gets a reference to the given []Country and assigns it to the Countries field.
func (o *BidFloorSpec) SetCountries(v []Country) {
	o.Countries = v
}

// GetCurrency returns the Currency field value
func (o *BidFloorSpec) GetCurrency() Currency {
	if o == nil {
		var ret Currency
		return ret
	}

	return o.Currency
}

// GetCurrencyOk returns a tuple with the Currency field value
// and a boolean to check if the value has been set.
func (o *BidFloorSpec) GetCurrencyOk() (*Currency, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Currency, true
}

// SetCurrency sets field value
func (o *BidFloorSpec) SetCurrency(v Currency) {
	o.Currency = v
}

// GetObjectiveType returns the ObjectiveType field value if set, zero value otherwise.
func (o *BidFloorSpec) GetObjectiveType() ObjectiveType {
	if o == nil || IsNil(o.ObjectiveType) {
		var ret ObjectiveType
		return ret
	}
	return *o.ObjectiveType
}

// GetObjectiveTypeOk returns a tuple with the ObjectiveType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BidFloorSpec) GetObjectiveTypeOk() (*ObjectiveType, bool) {
	if o == nil || IsNil(o.ObjectiveType) {
		return nil, false
	}
	return o.ObjectiveType, true
}

// HasObjectiveType returns a boolean if a field has been set.
func (o *BidFloorSpec) HasObjectiveType() bool {
	if o != nil && !IsNil(o.ObjectiveType) {
		return true
	}

	return false
}

// SetObjectiveType gets a reference to the given ObjectiveType and assigns it to the ObjectiveType field.
func (o *BidFloorSpec) SetObjectiveType(v ObjectiveType) {
	o.ObjectiveType = &v
}

// GetBillableEvent returns the BillableEvent field value
func (o *BidFloorSpec) GetBillableEvent() ActionType {
	if o == nil {
		var ret ActionType
		return ret
	}

	return o.BillableEvent
}

// GetBillableEventOk returns a tuple with the BillableEvent field value
// and a boolean to check if the value has been set.
func (o *BidFloorSpec) GetBillableEventOk() (*ActionType, bool) {
	if o == nil {
		return nil, false
	}
	return &o.BillableEvent, true
}

// SetBillableEvent sets field value
func (o *BidFloorSpec) SetBillableEvent(v ActionType) {
	o.BillableEvent = v
}

// GetOptimizationGoalMetadata returns the OptimizationGoalMetadata field value if set, zero value otherwise.
func (o *BidFloorSpec) GetOptimizationGoalMetadata() OptimizationGoalMetadata {
	if o == nil || IsNil(o.OptimizationGoalMetadata) {
		var ret OptimizationGoalMetadata
		return ret
	}
	return *o.OptimizationGoalMetadata
}

// GetOptimizationGoalMetadataOk returns a tuple with the OptimizationGoalMetadata field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BidFloorSpec) GetOptimizationGoalMetadataOk() (*OptimizationGoalMetadata, bool) {
	if o == nil || IsNil(o.OptimizationGoalMetadata) {
		return nil, false
	}
	return o.OptimizationGoalMetadata, true
}

// HasOptimizationGoalMetadata returns a boolean if a field has been set.
func (o *BidFloorSpec) HasOptimizationGoalMetadata() bool {
	if o != nil && !IsNil(o.OptimizationGoalMetadata) {
		return true
	}

	return false
}

// SetOptimizationGoalMetadata gets a reference to the given OptimizationGoalMetadata and assigns it to the OptimizationGoalMetadata field.
func (o *BidFloorSpec) SetOptimizationGoalMetadata(v OptimizationGoalMetadata) {
	o.OptimizationGoalMetadata = &v
}

// GetCreativeType returns the CreativeType field value if set, zero value otherwise.
func (o *BidFloorSpec) GetCreativeType() CreativeType {
	if o == nil || IsNil(o.CreativeType) {
		var ret CreativeType
		return ret
	}
	return *o.CreativeType
}

// GetCreativeTypeOk returns a tuple with the CreativeType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BidFloorSpec) GetCreativeTypeOk() (*CreativeType, bool) {
	if o == nil || IsNil(o.CreativeType) {
		return nil, false
	}
	return o.CreativeType, true
}

// HasCreativeType returns a boolean if a field has been set.
func (o *BidFloorSpec) HasCreativeType() bool {
	if o != nil && !IsNil(o.CreativeType) {
		return true
	}

	return false
}

// SetCreativeType gets a reference to the given CreativeType and assigns it to the CreativeType field.
func (o *BidFloorSpec) SetCreativeType(v CreativeType) {
	o.CreativeType = &v
}

func (o BidFloorSpec) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o BidFloorSpec) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Countries) {
		toSerialize["countries"] = o.Countries
	}
	toSerialize["currency"] = o.Currency
	if !IsNil(o.ObjectiveType) {
		toSerialize["objective_type"] = o.ObjectiveType
	}
	toSerialize["billable_event"] = o.BillableEvent
	if !IsNil(o.OptimizationGoalMetadata) {
		toSerialize["optimization_goal_metadata"] = o.OptimizationGoalMetadata
	}
	if !IsNil(o.CreativeType) {
		toSerialize["creative_type"] = o.CreativeType
	}
	return toSerialize, nil
}

func (o *BidFloorSpec) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"currency",
		"billable_event",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varBidFloorSpec := _BidFloorSpec{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varBidFloorSpec)

	if err != nil {
		return err
	}

	*o = BidFloorSpec(varBidFloorSpec)

	return err
}

type NullableBidFloorSpec struct {
	value *BidFloorSpec
	isSet bool
}

func (v NullableBidFloorSpec) Get() *BidFloorSpec {
	return v.value
}

func (v *NullableBidFloorSpec) Set(val *BidFloorSpec) {
	v.value = val
	v.isSet = true
}

func (v NullableBidFloorSpec) IsSet() bool {
	return v.isSet
}

func (v *NullableBidFloorSpec) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBidFloorSpec(val *BidFloorSpec) *NullableBidFloorSpec {
	return &NullableBidFloorSpec{value: val, isSet: true}
}

func (v NullableBidFloorSpec) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBidFloorSpec) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


