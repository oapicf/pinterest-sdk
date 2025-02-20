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

// checks if the CatalogsProductGroupCreateRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CatalogsProductGroupCreateRequest{}

// CatalogsProductGroupCreateRequest Request object for creating a product group.
type CatalogsProductGroupCreateRequest struct {
	Name string `json:"name"`
	Description NullableString `json:"description,omitempty"`
	// boolean indicator of whether the product group is being featured or not
	// Deprecated
	IsFeatured *bool `json:"is_featured,omitempty"`
	Filters CatalogsProductGroupFiltersRequest `json:"filters"`
	// Catalog Feed id pertaining to the catalog product group.
	FeedId string `json:"feed_id" validate:"regexp=^\\\\d+$"`
}

type _CatalogsProductGroupCreateRequest CatalogsProductGroupCreateRequest

// NewCatalogsProductGroupCreateRequest instantiates a new CatalogsProductGroupCreateRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalogsProductGroupCreateRequest(name string, filters CatalogsProductGroupFiltersRequest, feedId string) *CatalogsProductGroupCreateRequest {
	this := CatalogsProductGroupCreateRequest{}
	this.Name = name
	var isFeatured bool = false
	this.IsFeatured = &isFeatured
	this.Filters = filters
	this.FeedId = feedId
	return &this
}

// NewCatalogsProductGroupCreateRequestWithDefaults instantiates a new CatalogsProductGroupCreateRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogsProductGroupCreateRequestWithDefaults() *CatalogsProductGroupCreateRequest {
	this := CatalogsProductGroupCreateRequest{}
	var isFeatured bool = false
	this.IsFeatured = &isFeatured
	return &this
}

// GetName returns the Name field value
func (o *CatalogsProductGroupCreateRequest) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *CatalogsProductGroupCreateRequest) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *CatalogsProductGroupCreateRequest) SetName(v string) {
	o.Name = v
}

// GetDescription returns the Description field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CatalogsProductGroupCreateRequest) GetDescription() string {
	if o == nil || IsNil(o.Description.Get()) {
		var ret string
		return ret
	}
	return *o.Description.Get()
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CatalogsProductGroupCreateRequest) GetDescriptionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Description.Get(), o.Description.IsSet()
}

// HasDescription returns a boolean if a field has been set.
func (o *CatalogsProductGroupCreateRequest) HasDescription() bool {
	if o != nil && o.Description.IsSet() {
		return true
	}

	return false
}

// SetDescription gets a reference to the given NullableString and assigns it to the Description field.
func (o *CatalogsProductGroupCreateRequest) SetDescription(v string) {
	o.Description.Set(&v)
}
// SetDescriptionNil sets the value for Description to be an explicit nil
func (o *CatalogsProductGroupCreateRequest) SetDescriptionNil() {
	o.Description.Set(nil)
}

// UnsetDescription ensures that no value is present for Description, not even an explicit nil
func (o *CatalogsProductGroupCreateRequest) UnsetDescription() {
	o.Description.Unset()
}

// GetIsFeatured returns the IsFeatured field value if set, zero value otherwise.
// Deprecated
func (o *CatalogsProductGroupCreateRequest) GetIsFeatured() bool {
	if o == nil || IsNil(o.IsFeatured) {
		var ret bool
		return ret
	}
	return *o.IsFeatured
}

// GetIsFeaturedOk returns a tuple with the IsFeatured field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *CatalogsProductGroupCreateRequest) GetIsFeaturedOk() (*bool, bool) {
	if o == nil || IsNil(o.IsFeatured) {
		return nil, false
	}
	return o.IsFeatured, true
}

// HasIsFeatured returns a boolean if a field has been set.
func (o *CatalogsProductGroupCreateRequest) HasIsFeatured() bool {
	if o != nil && !IsNil(o.IsFeatured) {
		return true
	}

	return false
}

// SetIsFeatured gets a reference to the given bool and assigns it to the IsFeatured field.
// Deprecated
func (o *CatalogsProductGroupCreateRequest) SetIsFeatured(v bool) {
	o.IsFeatured = &v
}

// GetFilters returns the Filters field value
func (o *CatalogsProductGroupCreateRequest) GetFilters() CatalogsProductGroupFiltersRequest {
	if o == nil {
		var ret CatalogsProductGroupFiltersRequest
		return ret
	}

	return o.Filters
}

// GetFiltersOk returns a tuple with the Filters field value
// and a boolean to check if the value has been set.
func (o *CatalogsProductGroupCreateRequest) GetFiltersOk() (*CatalogsProductGroupFiltersRequest, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Filters, true
}

// SetFilters sets field value
func (o *CatalogsProductGroupCreateRequest) SetFilters(v CatalogsProductGroupFiltersRequest) {
	o.Filters = v
}

// GetFeedId returns the FeedId field value
func (o *CatalogsProductGroupCreateRequest) GetFeedId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.FeedId
}

// GetFeedIdOk returns a tuple with the FeedId field value
// and a boolean to check if the value has been set.
func (o *CatalogsProductGroupCreateRequest) GetFeedIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.FeedId, true
}

// SetFeedId sets field value
func (o *CatalogsProductGroupCreateRequest) SetFeedId(v string) {
	o.FeedId = v
}

func (o CatalogsProductGroupCreateRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CatalogsProductGroupCreateRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["name"] = o.Name
	if o.Description.IsSet() {
		toSerialize["description"] = o.Description.Get()
	}
	if !IsNil(o.IsFeatured) {
		toSerialize["is_featured"] = o.IsFeatured
	}
	toSerialize["filters"] = o.Filters
	toSerialize["feed_id"] = o.FeedId
	return toSerialize, nil
}

func (o *CatalogsProductGroupCreateRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"name",
		"filters",
		"feed_id",
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

	varCatalogsProductGroupCreateRequest := _CatalogsProductGroupCreateRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCatalogsProductGroupCreateRequest)

	if err != nil {
		return err
	}

	*o = CatalogsProductGroupCreateRequest(varCatalogsProductGroupCreateRequest)

	return err
}

type NullableCatalogsProductGroupCreateRequest struct {
	value *CatalogsProductGroupCreateRequest
	isSet bool
}

func (v NullableCatalogsProductGroupCreateRequest) Get() *CatalogsProductGroupCreateRequest {
	return v.value
}

func (v *NullableCatalogsProductGroupCreateRequest) Set(val *CatalogsProductGroupCreateRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsProductGroupCreateRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsProductGroupCreateRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsProductGroupCreateRequest(val *CatalogsProductGroupCreateRequest) *NullableCatalogsProductGroupCreateRequest {
	return &NullableCatalogsProductGroupCreateRequest{value: val, isSet: true}
}

func (v NullableCatalogsProductGroupCreateRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsProductGroupCreateRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


