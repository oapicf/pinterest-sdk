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

// checks if the DeliveryMetricsResponseItemsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &DeliveryMetricsResponseItemsInner{}

// DeliveryMetricsResponseItemsInner struct for DeliveryMetricsResponseItemsInner
type DeliveryMetricsResponseItemsInner struct {
	// Metric's name.
	Name *string `json:"name,omitempty"`
	// Category name
	Category *string `json:"category,omitempty"`
	// How the metric is defined.
	Definition *string `json:"definition,omitempty"`
	// Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
	DisplayName *string `json:"display_name,omitempty"`
}

// NewDeliveryMetricsResponseItemsInner instantiates a new DeliveryMetricsResponseItemsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDeliveryMetricsResponseItemsInner() *DeliveryMetricsResponseItemsInner {
	this := DeliveryMetricsResponseItemsInner{}
	return &this
}

// NewDeliveryMetricsResponseItemsInnerWithDefaults instantiates a new DeliveryMetricsResponseItemsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDeliveryMetricsResponseItemsInnerWithDefaults() *DeliveryMetricsResponseItemsInner {
	this := DeliveryMetricsResponseItemsInner{}
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *DeliveryMetricsResponseItemsInner) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DeliveryMetricsResponseItemsInner) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *DeliveryMetricsResponseItemsInner) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *DeliveryMetricsResponseItemsInner) SetName(v string) {
	o.Name = &v
}

// GetCategory returns the Category field value if set, zero value otherwise.
func (o *DeliveryMetricsResponseItemsInner) GetCategory() string {
	if o == nil || IsNil(o.Category) {
		var ret string
		return ret
	}
	return *o.Category
}

// GetCategoryOk returns a tuple with the Category field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DeliveryMetricsResponseItemsInner) GetCategoryOk() (*string, bool) {
	if o == nil || IsNil(o.Category) {
		return nil, false
	}
	return o.Category, true
}

// HasCategory returns a boolean if a field has been set.
func (o *DeliveryMetricsResponseItemsInner) HasCategory() bool {
	if o != nil && !IsNil(o.Category) {
		return true
	}

	return false
}

// SetCategory gets a reference to the given string and assigns it to the Category field.
func (o *DeliveryMetricsResponseItemsInner) SetCategory(v string) {
	o.Category = &v
}

// GetDefinition returns the Definition field value if set, zero value otherwise.
func (o *DeliveryMetricsResponseItemsInner) GetDefinition() string {
	if o == nil || IsNil(o.Definition) {
		var ret string
		return ret
	}
	return *o.Definition
}

// GetDefinitionOk returns a tuple with the Definition field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DeliveryMetricsResponseItemsInner) GetDefinitionOk() (*string, bool) {
	if o == nil || IsNil(o.Definition) {
		return nil, false
	}
	return o.Definition, true
}

// HasDefinition returns a boolean if a field has been set.
func (o *DeliveryMetricsResponseItemsInner) HasDefinition() bool {
	if o != nil && !IsNil(o.Definition) {
		return true
	}

	return false
}

// SetDefinition gets a reference to the given string and assigns it to the Definition field.
func (o *DeliveryMetricsResponseItemsInner) SetDefinition(v string) {
	o.Definition = &v
}

// GetDisplayName returns the DisplayName field value if set, zero value otherwise.
func (o *DeliveryMetricsResponseItemsInner) GetDisplayName() string {
	if o == nil || IsNil(o.DisplayName) {
		var ret string
		return ret
	}
	return *o.DisplayName
}

// GetDisplayNameOk returns a tuple with the DisplayName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DeliveryMetricsResponseItemsInner) GetDisplayNameOk() (*string, bool) {
	if o == nil || IsNil(o.DisplayName) {
		return nil, false
	}
	return o.DisplayName, true
}

// HasDisplayName returns a boolean if a field has been set.
func (o *DeliveryMetricsResponseItemsInner) HasDisplayName() bool {
	if o != nil && !IsNil(o.DisplayName) {
		return true
	}

	return false
}

// SetDisplayName gets a reference to the given string and assigns it to the DisplayName field.
func (o *DeliveryMetricsResponseItemsInner) SetDisplayName(v string) {
	o.DisplayName = &v
}

func (o DeliveryMetricsResponseItemsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o DeliveryMetricsResponseItemsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Category) {
		toSerialize["category"] = o.Category
	}
	if !IsNil(o.Definition) {
		toSerialize["definition"] = o.Definition
	}
	if !IsNil(o.DisplayName) {
		toSerialize["display_name"] = o.DisplayName
	}
	return toSerialize, nil
}

type NullableDeliveryMetricsResponseItemsInner struct {
	value *DeliveryMetricsResponseItemsInner
	isSet bool
}

func (v NullableDeliveryMetricsResponseItemsInner) Get() *DeliveryMetricsResponseItemsInner {
	return v.value
}

func (v *NullableDeliveryMetricsResponseItemsInner) Set(val *DeliveryMetricsResponseItemsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableDeliveryMetricsResponseItemsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableDeliveryMetricsResponseItemsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDeliveryMetricsResponseItemsInner(val *DeliveryMetricsResponseItemsInner) *NullableDeliveryMetricsResponseItemsInner {
	return &NullableDeliveryMetricsResponseItemsInner{value: val, isSet: true}
}

func (v NullableDeliveryMetricsResponseItemsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDeliveryMetricsResponseItemsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


