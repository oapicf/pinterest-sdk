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

// checks if the CatalogsCreativeAssetsProductGroupProductCounts type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CatalogsCreativeAssetsProductGroupProductCounts{}

// CatalogsCreativeAssetsProductGroupProductCounts Product counts for a Creative Assets CatalogsProductGroup
type CatalogsCreativeAssetsProductGroupProductCounts struct {
	CatalogType string `json:"catalog_type"`
	Total float32 `json:"total"`
	Videos float32 `json:"videos"`
}

type _CatalogsCreativeAssetsProductGroupProductCounts CatalogsCreativeAssetsProductGroupProductCounts

// NewCatalogsCreativeAssetsProductGroupProductCounts instantiates a new CatalogsCreativeAssetsProductGroupProductCounts object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalogsCreativeAssetsProductGroupProductCounts(catalogType string, total float32, videos float32) *CatalogsCreativeAssetsProductGroupProductCounts {
	this := CatalogsCreativeAssetsProductGroupProductCounts{}
	this.CatalogType = catalogType
	this.Total = total
	this.Videos = videos
	return &this
}

// NewCatalogsCreativeAssetsProductGroupProductCountsWithDefaults instantiates a new CatalogsCreativeAssetsProductGroupProductCounts object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogsCreativeAssetsProductGroupProductCountsWithDefaults() *CatalogsCreativeAssetsProductGroupProductCounts {
	this := CatalogsCreativeAssetsProductGroupProductCounts{}
	return &this
}

// GetCatalogType returns the CatalogType field value
func (o *CatalogsCreativeAssetsProductGroupProductCounts) GetCatalogType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.CatalogType
}

// GetCatalogTypeOk returns a tuple with the CatalogType field value
// and a boolean to check if the value has been set.
func (o *CatalogsCreativeAssetsProductGroupProductCounts) GetCatalogTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CatalogType, true
}

// SetCatalogType sets field value
func (o *CatalogsCreativeAssetsProductGroupProductCounts) SetCatalogType(v string) {
	o.CatalogType = v
}

// GetTotal returns the Total field value
func (o *CatalogsCreativeAssetsProductGroupProductCounts) GetTotal() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Total
}

// GetTotalOk returns a tuple with the Total field value
// and a boolean to check if the value has been set.
func (o *CatalogsCreativeAssetsProductGroupProductCounts) GetTotalOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Total, true
}

// SetTotal sets field value
func (o *CatalogsCreativeAssetsProductGroupProductCounts) SetTotal(v float32) {
	o.Total = v
}

// GetVideos returns the Videos field value
func (o *CatalogsCreativeAssetsProductGroupProductCounts) GetVideos() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Videos
}

// GetVideosOk returns a tuple with the Videos field value
// and a boolean to check if the value has been set.
func (o *CatalogsCreativeAssetsProductGroupProductCounts) GetVideosOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Videos, true
}

// SetVideos sets field value
func (o *CatalogsCreativeAssetsProductGroupProductCounts) SetVideos(v float32) {
	o.Videos = v
}

func (o CatalogsCreativeAssetsProductGroupProductCounts) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CatalogsCreativeAssetsProductGroupProductCounts) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["catalog_type"] = o.CatalogType
	toSerialize["total"] = o.Total
	toSerialize["videos"] = o.Videos
	return toSerialize, nil
}

func (o *CatalogsCreativeAssetsProductGroupProductCounts) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"catalog_type",
		"total",
		"videos",
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

	varCatalogsCreativeAssetsProductGroupProductCounts := _CatalogsCreativeAssetsProductGroupProductCounts{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCatalogsCreativeAssetsProductGroupProductCounts)

	if err != nil {
		return err
	}

	*o = CatalogsCreativeAssetsProductGroupProductCounts(varCatalogsCreativeAssetsProductGroupProductCounts)

	return err
}

type NullableCatalogsCreativeAssetsProductGroupProductCounts struct {
	value *CatalogsCreativeAssetsProductGroupProductCounts
	isSet bool
}

func (v NullableCatalogsCreativeAssetsProductGroupProductCounts) Get() *CatalogsCreativeAssetsProductGroupProductCounts {
	return v.value
}

func (v *NullableCatalogsCreativeAssetsProductGroupProductCounts) Set(val *CatalogsCreativeAssetsProductGroupProductCounts) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsCreativeAssetsProductGroupProductCounts) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsCreativeAssetsProductGroupProductCounts) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsCreativeAssetsProductGroupProductCounts(val *CatalogsCreativeAssetsProductGroupProductCounts) *NullableCatalogsCreativeAssetsProductGroupProductCounts {
	return &NullableCatalogsCreativeAssetsProductGroupProductCounts{value: val, isSet: true}
}

func (v NullableCatalogsCreativeAssetsProductGroupProductCounts) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsCreativeAssetsProductGroupProductCounts) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


