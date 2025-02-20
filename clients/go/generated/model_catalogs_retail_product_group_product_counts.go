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

// checks if the CatalogsRetailProductGroupProductCounts type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CatalogsRetailProductGroupProductCounts{}

// CatalogsRetailProductGroupProductCounts Product counts for a Retail CatalogsProductGroup
type CatalogsRetailProductGroupProductCounts struct {
	CatalogType string `json:"catalog_type"`
	InStock float32 `json:"in_stock"`
	OutOfStock float32 `json:"out_of_stock"`
	Preorder float32 `json:"preorder"`
	Total float32 `json:"total"`
	Videos *float32 `json:"videos,omitempty"`
}

type _CatalogsRetailProductGroupProductCounts CatalogsRetailProductGroupProductCounts

// NewCatalogsRetailProductGroupProductCounts instantiates a new CatalogsRetailProductGroupProductCounts object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalogsRetailProductGroupProductCounts(catalogType string, inStock float32, outOfStock float32, preorder float32, total float32) *CatalogsRetailProductGroupProductCounts {
	this := CatalogsRetailProductGroupProductCounts{}
	this.CatalogType = catalogType
	this.InStock = inStock
	this.OutOfStock = outOfStock
	this.Preorder = preorder
	this.Total = total
	return &this
}

// NewCatalogsRetailProductGroupProductCountsWithDefaults instantiates a new CatalogsRetailProductGroupProductCounts object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogsRetailProductGroupProductCountsWithDefaults() *CatalogsRetailProductGroupProductCounts {
	this := CatalogsRetailProductGroupProductCounts{}
	return &this
}

// GetCatalogType returns the CatalogType field value
func (o *CatalogsRetailProductGroupProductCounts) GetCatalogType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.CatalogType
}

// GetCatalogTypeOk returns a tuple with the CatalogType field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailProductGroupProductCounts) GetCatalogTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CatalogType, true
}

// SetCatalogType sets field value
func (o *CatalogsRetailProductGroupProductCounts) SetCatalogType(v string) {
	o.CatalogType = v
}

// GetInStock returns the InStock field value
func (o *CatalogsRetailProductGroupProductCounts) GetInStock() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.InStock
}

// GetInStockOk returns a tuple with the InStock field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailProductGroupProductCounts) GetInStockOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.InStock, true
}

// SetInStock sets field value
func (o *CatalogsRetailProductGroupProductCounts) SetInStock(v float32) {
	o.InStock = v
}

// GetOutOfStock returns the OutOfStock field value
func (o *CatalogsRetailProductGroupProductCounts) GetOutOfStock() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.OutOfStock
}

// GetOutOfStockOk returns a tuple with the OutOfStock field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailProductGroupProductCounts) GetOutOfStockOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.OutOfStock, true
}

// SetOutOfStock sets field value
func (o *CatalogsRetailProductGroupProductCounts) SetOutOfStock(v float32) {
	o.OutOfStock = v
}

// GetPreorder returns the Preorder field value
func (o *CatalogsRetailProductGroupProductCounts) GetPreorder() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Preorder
}

// GetPreorderOk returns a tuple with the Preorder field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailProductGroupProductCounts) GetPreorderOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Preorder, true
}

// SetPreorder sets field value
func (o *CatalogsRetailProductGroupProductCounts) SetPreorder(v float32) {
	o.Preorder = v
}

// GetTotal returns the Total field value
func (o *CatalogsRetailProductGroupProductCounts) GetTotal() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Total
}

// GetTotalOk returns a tuple with the Total field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailProductGroupProductCounts) GetTotalOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Total, true
}

// SetTotal sets field value
func (o *CatalogsRetailProductGroupProductCounts) SetTotal(v float32) {
	o.Total = v
}

// GetVideos returns the Videos field value if set, zero value otherwise.
func (o *CatalogsRetailProductGroupProductCounts) GetVideos() float32 {
	if o == nil || IsNil(o.Videos) {
		var ret float32
		return ret
	}
	return *o.Videos
}

// GetVideosOk returns a tuple with the Videos field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsRetailProductGroupProductCounts) GetVideosOk() (*float32, bool) {
	if o == nil || IsNil(o.Videos) {
		return nil, false
	}
	return o.Videos, true
}

// HasVideos returns a boolean if a field has been set.
func (o *CatalogsRetailProductGroupProductCounts) HasVideos() bool {
	if o != nil && !IsNil(o.Videos) {
		return true
	}

	return false
}

// SetVideos gets a reference to the given float32 and assigns it to the Videos field.
func (o *CatalogsRetailProductGroupProductCounts) SetVideos(v float32) {
	o.Videos = &v
}

func (o CatalogsRetailProductGroupProductCounts) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CatalogsRetailProductGroupProductCounts) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["catalog_type"] = o.CatalogType
	toSerialize["in_stock"] = o.InStock
	toSerialize["out_of_stock"] = o.OutOfStock
	toSerialize["preorder"] = o.Preorder
	toSerialize["total"] = o.Total
	if !IsNil(o.Videos) {
		toSerialize["videos"] = o.Videos
	}
	return toSerialize, nil
}

func (o *CatalogsRetailProductGroupProductCounts) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"catalog_type",
		"in_stock",
		"out_of_stock",
		"preorder",
		"total",
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

	varCatalogsRetailProductGroupProductCounts := _CatalogsRetailProductGroupProductCounts{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCatalogsRetailProductGroupProductCounts)

	if err != nil {
		return err
	}

	*o = CatalogsRetailProductGroupProductCounts(varCatalogsRetailProductGroupProductCounts)

	return err
}

type NullableCatalogsRetailProductGroupProductCounts struct {
	value *CatalogsRetailProductGroupProductCounts
	isSet bool
}

func (v NullableCatalogsRetailProductGroupProductCounts) Get() *CatalogsRetailProductGroupProductCounts {
	return v.value
}

func (v *NullableCatalogsRetailProductGroupProductCounts) Set(val *CatalogsRetailProductGroupProductCounts) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsRetailProductGroupProductCounts) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsRetailProductGroupProductCounts) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsRetailProductGroupProductCounts(val *CatalogsRetailProductGroupProductCounts) *NullableCatalogsRetailProductGroupProductCounts {
	return &NullableCatalogsRetailProductGroupProductCounts{value: val, isSet: true}
}

func (v NullableCatalogsRetailProductGroupProductCounts) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsRetailProductGroupProductCounts) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


