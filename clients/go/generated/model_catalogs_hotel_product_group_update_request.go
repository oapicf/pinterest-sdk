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

// checks if the CatalogsHotelProductGroupUpdateRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CatalogsHotelProductGroupUpdateRequest{}

// CatalogsHotelProductGroupUpdateRequest Request object for updating a hotel product group.
type CatalogsHotelProductGroupUpdateRequest struct {
	CatalogType *string `json:"catalog_type,omitempty"`
	Name *string `json:"name,omitempty"`
	Description NullableString `json:"description,omitempty"`
	Filters *CatalogsHotelProductGroupFilters `json:"filters,omitempty"`
}

// NewCatalogsHotelProductGroupUpdateRequest instantiates a new CatalogsHotelProductGroupUpdateRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalogsHotelProductGroupUpdateRequest() *CatalogsHotelProductGroupUpdateRequest {
	this := CatalogsHotelProductGroupUpdateRequest{}
	return &this
}

// NewCatalogsHotelProductGroupUpdateRequestWithDefaults instantiates a new CatalogsHotelProductGroupUpdateRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogsHotelProductGroupUpdateRequestWithDefaults() *CatalogsHotelProductGroupUpdateRequest {
	this := CatalogsHotelProductGroupUpdateRequest{}
	return &this
}

// GetCatalogType returns the CatalogType field value if set, zero value otherwise.
func (o *CatalogsHotelProductGroupUpdateRequest) GetCatalogType() string {
	if o == nil || IsNil(o.CatalogType) {
		var ret string
		return ret
	}
	return *o.CatalogType
}

// GetCatalogTypeOk returns a tuple with the CatalogType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsHotelProductGroupUpdateRequest) GetCatalogTypeOk() (*string, bool) {
	if o == nil || IsNil(o.CatalogType) {
		return nil, false
	}
	return o.CatalogType, true
}

// HasCatalogType returns a boolean if a field has been set.
func (o *CatalogsHotelProductGroupUpdateRequest) HasCatalogType() bool {
	if o != nil && !IsNil(o.CatalogType) {
		return true
	}

	return false
}

// SetCatalogType gets a reference to the given string and assigns it to the CatalogType field.
func (o *CatalogsHotelProductGroupUpdateRequest) SetCatalogType(v string) {
	o.CatalogType = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *CatalogsHotelProductGroupUpdateRequest) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsHotelProductGroupUpdateRequest) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *CatalogsHotelProductGroupUpdateRequest) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *CatalogsHotelProductGroupUpdateRequest) SetName(v string) {
	o.Name = &v
}

// GetDescription returns the Description field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CatalogsHotelProductGroupUpdateRequest) GetDescription() string {
	if o == nil || IsNil(o.Description.Get()) {
		var ret string
		return ret
	}
	return *o.Description.Get()
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CatalogsHotelProductGroupUpdateRequest) GetDescriptionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Description.Get(), o.Description.IsSet()
}

// HasDescription returns a boolean if a field has been set.
func (o *CatalogsHotelProductGroupUpdateRequest) HasDescription() bool {
	if o != nil && o.Description.IsSet() {
		return true
	}

	return false
}

// SetDescription gets a reference to the given NullableString and assigns it to the Description field.
func (o *CatalogsHotelProductGroupUpdateRequest) SetDescription(v string) {
	o.Description.Set(&v)
}
// SetDescriptionNil sets the value for Description to be an explicit nil
func (o *CatalogsHotelProductGroupUpdateRequest) SetDescriptionNil() {
	o.Description.Set(nil)
}

// UnsetDescription ensures that no value is present for Description, not even an explicit nil
func (o *CatalogsHotelProductGroupUpdateRequest) UnsetDescription() {
	o.Description.Unset()
}

// GetFilters returns the Filters field value if set, zero value otherwise.
func (o *CatalogsHotelProductGroupUpdateRequest) GetFilters() CatalogsHotelProductGroupFilters {
	if o == nil || IsNil(o.Filters) {
		var ret CatalogsHotelProductGroupFilters
		return ret
	}
	return *o.Filters
}

// GetFiltersOk returns a tuple with the Filters field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsHotelProductGroupUpdateRequest) GetFiltersOk() (*CatalogsHotelProductGroupFilters, bool) {
	if o == nil || IsNil(o.Filters) {
		return nil, false
	}
	return o.Filters, true
}

// HasFilters returns a boolean if a field has been set.
func (o *CatalogsHotelProductGroupUpdateRequest) HasFilters() bool {
	if o != nil && !IsNil(o.Filters) {
		return true
	}

	return false
}

// SetFilters gets a reference to the given CatalogsHotelProductGroupFilters and assigns it to the Filters field.
func (o *CatalogsHotelProductGroupUpdateRequest) SetFilters(v CatalogsHotelProductGroupFilters) {
	o.Filters = &v
}

func (o CatalogsHotelProductGroupUpdateRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CatalogsHotelProductGroupUpdateRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.CatalogType) {
		toSerialize["catalog_type"] = o.CatalogType
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if o.Description.IsSet() {
		toSerialize["description"] = o.Description.Get()
	}
	if !IsNil(o.Filters) {
		toSerialize["filters"] = o.Filters
	}
	return toSerialize, nil
}

type NullableCatalogsHotelProductGroupUpdateRequest struct {
	value *CatalogsHotelProductGroupUpdateRequest
	isSet bool
}

func (v NullableCatalogsHotelProductGroupUpdateRequest) Get() *CatalogsHotelProductGroupUpdateRequest {
	return v.value
}

func (v *NullableCatalogsHotelProductGroupUpdateRequest) Set(val *CatalogsHotelProductGroupUpdateRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsHotelProductGroupUpdateRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsHotelProductGroupUpdateRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsHotelProductGroupUpdateRequest(val *CatalogsHotelProductGroupUpdateRequest) *NullableCatalogsHotelProductGroupUpdateRequest {
	return &NullableCatalogsHotelProductGroupUpdateRequest{value: val, isSet: true}
}

func (v NullableCatalogsHotelProductGroupUpdateRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsHotelProductGroupUpdateRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


