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

// checks if the CatalogsCreativeAssetsItemsFilter type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CatalogsCreativeAssetsItemsFilter{}

// CatalogsCreativeAssetsItemsFilter struct for CatalogsCreativeAssetsItemsFilter
type CatalogsCreativeAssetsItemsFilter struct {
	CatalogType string `json:"catalog_type"`
	CreativeAssetsIds []string `json:"creative_assets_ids"`
	// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	CatalogId *string `json:"catalog_id,omitempty" validate:"regexp=^\\\\d+$"`
}

type _CatalogsCreativeAssetsItemsFilter CatalogsCreativeAssetsItemsFilter

// NewCatalogsCreativeAssetsItemsFilter instantiates a new CatalogsCreativeAssetsItemsFilter object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalogsCreativeAssetsItemsFilter(catalogType string, creativeAssetsIds []string) *CatalogsCreativeAssetsItemsFilter {
	this := CatalogsCreativeAssetsItemsFilter{}
	this.CatalogType = catalogType
	this.CreativeAssetsIds = creativeAssetsIds
	return &this
}

// NewCatalogsCreativeAssetsItemsFilterWithDefaults instantiates a new CatalogsCreativeAssetsItemsFilter object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogsCreativeAssetsItemsFilterWithDefaults() *CatalogsCreativeAssetsItemsFilter {
	this := CatalogsCreativeAssetsItemsFilter{}
	return &this
}

// GetCatalogType returns the CatalogType field value
func (o *CatalogsCreativeAssetsItemsFilter) GetCatalogType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.CatalogType
}

// GetCatalogTypeOk returns a tuple with the CatalogType field value
// and a boolean to check if the value has been set.
func (o *CatalogsCreativeAssetsItemsFilter) GetCatalogTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CatalogType, true
}

// SetCatalogType sets field value
func (o *CatalogsCreativeAssetsItemsFilter) SetCatalogType(v string) {
	o.CatalogType = v
}

// GetCreativeAssetsIds returns the CreativeAssetsIds field value
func (o *CatalogsCreativeAssetsItemsFilter) GetCreativeAssetsIds() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.CreativeAssetsIds
}

// GetCreativeAssetsIdsOk returns a tuple with the CreativeAssetsIds field value
// and a boolean to check if the value has been set.
func (o *CatalogsCreativeAssetsItemsFilter) GetCreativeAssetsIdsOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CreativeAssetsIds, true
}

// SetCreativeAssetsIds sets field value
func (o *CatalogsCreativeAssetsItemsFilter) SetCreativeAssetsIds(v []string) {
	o.CreativeAssetsIds = v
}

// GetCatalogId returns the CatalogId field value if set, zero value otherwise.
func (o *CatalogsCreativeAssetsItemsFilter) GetCatalogId() string {
	if o == nil || IsNil(o.CatalogId) {
		var ret string
		return ret
	}
	return *o.CatalogId
}

// GetCatalogIdOk returns a tuple with the CatalogId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsCreativeAssetsItemsFilter) GetCatalogIdOk() (*string, bool) {
	if o == nil || IsNil(o.CatalogId) {
		return nil, false
	}
	return o.CatalogId, true
}

// HasCatalogId returns a boolean if a field has been set.
func (o *CatalogsCreativeAssetsItemsFilter) HasCatalogId() bool {
	if o != nil && !IsNil(o.CatalogId) {
		return true
	}

	return false
}

// SetCatalogId gets a reference to the given string and assigns it to the CatalogId field.
func (o *CatalogsCreativeAssetsItemsFilter) SetCatalogId(v string) {
	o.CatalogId = &v
}

func (o CatalogsCreativeAssetsItemsFilter) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CatalogsCreativeAssetsItemsFilter) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["catalog_type"] = o.CatalogType
	toSerialize["creative_assets_ids"] = o.CreativeAssetsIds
	if !IsNil(o.CatalogId) {
		toSerialize["catalog_id"] = o.CatalogId
	}
	return toSerialize, nil
}

func (o *CatalogsCreativeAssetsItemsFilter) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"catalog_type",
		"creative_assets_ids",
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

	varCatalogsCreativeAssetsItemsFilter := _CatalogsCreativeAssetsItemsFilter{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCatalogsCreativeAssetsItemsFilter)

	if err != nil {
		return err
	}

	*o = CatalogsCreativeAssetsItemsFilter(varCatalogsCreativeAssetsItemsFilter)

	return err
}

type NullableCatalogsCreativeAssetsItemsFilter struct {
	value *CatalogsCreativeAssetsItemsFilter
	isSet bool
}

func (v NullableCatalogsCreativeAssetsItemsFilter) Get() *CatalogsCreativeAssetsItemsFilter {
	return v.value
}

func (v *NullableCatalogsCreativeAssetsItemsFilter) Set(val *CatalogsCreativeAssetsItemsFilter) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsCreativeAssetsItemsFilter) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsCreativeAssetsItemsFilter) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsCreativeAssetsItemsFilter(val *CatalogsCreativeAssetsItemsFilter) *NullableCatalogsCreativeAssetsItemsFilter {
	return &NullableCatalogsCreativeAssetsItemsFilter{value: val, isSet: true}
}

func (v NullableCatalogsCreativeAssetsItemsFilter) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsCreativeAssetsItemsFilter) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


