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

// checks if the CatalogsRetailListProductsByCatalogBasedFilterRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CatalogsRetailListProductsByCatalogBasedFilterRequest{}

// CatalogsRetailListProductsByCatalogBasedFilterRequest Request object to list products for a given retail catalog_id and product group filter.
type CatalogsRetailListProductsByCatalogBasedFilterRequest struct {
	// Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
	CatalogType string `json:"catalog_type"`
	// Catalog id pertaining to the retail product group.
	CatalogId string `json:"catalog_id" validate:"regexp=^\\\\d+$"`
	Filters CatalogsProductGroupFilters `json:"filters"`
	Country Country `json:"country"`
	Locale CatalogsLocale `json:"locale"`
}

type _CatalogsRetailListProductsByCatalogBasedFilterRequest CatalogsRetailListProductsByCatalogBasedFilterRequest

// NewCatalogsRetailListProductsByCatalogBasedFilterRequest instantiates a new CatalogsRetailListProductsByCatalogBasedFilterRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalogsRetailListProductsByCatalogBasedFilterRequest(catalogType string, catalogId string, filters CatalogsProductGroupFilters, country Country, locale CatalogsLocale) *CatalogsRetailListProductsByCatalogBasedFilterRequest {
	this := CatalogsRetailListProductsByCatalogBasedFilterRequest{}
	this.CatalogType = catalogType
	this.CatalogId = catalogId
	this.Filters = filters
	this.Country = country
	this.Locale = locale
	return &this
}

// NewCatalogsRetailListProductsByCatalogBasedFilterRequestWithDefaults instantiates a new CatalogsRetailListProductsByCatalogBasedFilterRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogsRetailListProductsByCatalogBasedFilterRequestWithDefaults() *CatalogsRetailListProductsByCatalogBasedFilterRequest {
	this := CatalogsRetailListProductsByCatalogBasedFilterRequest{}
	return &this
}

// GetCatalogType returns the CatalogType field value
func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetCatalogType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.CatalogType
}

// GetCatalogTypeOk returns a tuple with the CatalogType field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetCatalogTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CatalogType, true
}

// SetCatalogType sets field value
func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) SetCatalogType(v string) {
	o.CatalogType = v
}

// GetCatalogId returns the CatalogId field value
func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetCatalogId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.CatalogId
}

// GetCatalogIdOk returns a tuple with the CatalogId field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetCatalogIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CatalogId, true
}

// SetCatalogId sets field value
func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) SetCatalogId(v string) {
	o.CatalogId = v
}

// GetFilters returns the Filters field value
func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetFilters() CatalogsProductGroupFilters {
	if o == nil {
		var ret CatalogsProductGroupFilters
		return ret
	}

	return o.Filters
}

// GetFiltersOk returns a tuple with the Filters field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetFiltersOk() (*CatalogsProductGroupFilters, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Filters, true
}

// SetFilters sets field value
func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) SetFilters(v CatalogsProductGroupFilters) {
	o.Filters = v
}

// GetCountry returns the Country field value
func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetCountry() Country {
	if o == nil {
		var ret Country
		return ret
	}

	return o.Country
}

// GetCountryOk returns a tuple with the Country field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetCountryOk() (*Country, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Country, true
}

// SetCountry sets field value
func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) SetCountry(v Country) {
	o.Country = v
}

// GetLocale returns the Locale field value
func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetLocale() CatalogsLocale {
	if o == nil {
		var ret CatalogsLocale
		return ret
	}

	return o.Locale
}

// GetLocaleOk returns a tuple with the Locale field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) GetLocaleOk() (*CatalogsLocale, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Locale, true
}

// SetLocale sets field value
func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) SetLocale(v CatalogsLocale) {
	o.Locale = v
}

func (o CatalogsRetailListProductsByCatalogBasedFilterRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CatalogsRetailListProductsByCatalogBasedFilterRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["catalog_type"] = o.CatalogType
	toSerialize["catalog_id"] = o.CatalogId
	toSerialize["filters"] = o.Filters
	toSerialize["country"] = o.Country
	toSerialize["locale"] = o.Locale
	return toSerialize, nil
}

func (o *CatalogsRetailListProductsByCatalogBasedFilterRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"catalog_type",
		"catalog_id",
		"filters",
		"country",
		"locale",
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

	varCatalogsRetailListProductsByCatalogBasedFilterRequest := _CatalogsRetailListProductsByCatalogBasedFilterRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCatalogsRetailListProductsByCatalogBasedFilterRequest)

	if err != nil {
		return err
	}

	*o = CatalogsRetailListProductsByCatalogBasedFilterRequest(varCatalogsRetailListProductsByCatalogBasedFilterRequest)

	return err
}

type NullableCatalogsRetailListProductsByCatalogBasedFilterRequest struct {
	value *CatalogsRetailListProductsByCatalogBasedFilterRequest
	isSet bool
}

func (v NullableCatalogsRetailListProductsByCatalogBasedFilterRequest) Get() *CatalogsRetailListProductsByCatalogBasedFilterRequest {
	return v.value
}

func (v *NullableCatalogsRetailListProductsByCatalogBasedFilterRequest) Set(val *CatalogsRetailListProductsByCatalogBasedFilterRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsRetailListProductsByCatalogBasedFilterRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsRetailListProductsByCatalogBasedFilterRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsRetailListProductsByCatalogBasedFilterRequest(val *CatalogsRetailListProductsByCatalogBasedFilterRequest) *NullableCatalogsRetailListProductsByCatalogBasedFilterRequest {
	return &NullableCatalogsRetailListProductsByCatalogBasedFilterRequest{value: val, isSet: true}
}

func (v NullableCatalogsRetailListProductsByCatalogBasedFilterRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsRetailListProductsByCatalogBasedFilterRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


