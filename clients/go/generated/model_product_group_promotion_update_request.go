/*
Pinterest REST API

Pinterest's REST API

API version: 5.12.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the ProductGroupPromotionUpdateRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ProductGroupPromotionUpdateRequest{}

// ProductGroupPromotionUpdateRequest struct for ProductGroupPromotionUpdateRequest
type ProductGroupPromotionUpdateRequest struct {
	// ID of the ad group the product group belongs to.
	AdGroupId string `json:"ad_group_id"`
	ProductGroupPromotion []ProductGroupPromotion `json:"product_group_promotion"`
}

type _ProductGroupPromotionUpdateRequest ProductGroupPromotionUpdateRequest

// NewProductGroupPromotionUpdateRequest instantiates a new ProductGroupPromotionUpdateRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewProductGroupPromotionUpdateRequest(adGroupId string, productGroupPromotion []ProductGroupPromotion) *ProductGroupPromotionUpdateRequest {
	this := ProductGroupPromotionUpdateRequest{}
	this.AdGroupId = adGroupId
	this.ProductGroupPromotion = productGroupPromotion
	return &this
}

// NewProductGroupPromotionUpdateRequestWithDefaults instantiates a new ProductGroupPromotionUpdateRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewProductGroupPromotionUpdateRequestWithDefaults() *ProductGroupPromotionUpdateRequest {
	this := ProductGroupPromotionUpdateRequest{}
	return &this
}

// GetAdGroupId returns the AdGroupId field value
func (o *ProductGroupPromotionUpdateRequest) GetAdGroupId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.AdGroupId
}

// GetAdGroupIdOk returns a tuple with the AdGroupId field value
// and a boolean to check if the value has been set.
func (o *ProductGroupPromotionUpdateRequest) GetAdGroupIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.AdGroupId, true
}

// SetAdGroupId sets field value
func (o *ProductGroupPromotionUpdateRequest) SetAdGroupId(v string) {
	o.AdGroupId = v
}

// GetProductGroupPromotion returns the ProductGroupPromotion field value
func (o *ProductGroupPromotionUpdateRequest) GetProductGroupPromotion() []ProductGroupPromotion {
	if o == nil {
		var ret []ProductGroupPromotion
		return ret
	}

	return o.ProductGroupPromotion
}

// GetProductGroupPromotionOk returns a tuple with the ProductGroupPromotion field value
// and a boolean to check if the value has been set.
func (o *ProductGroupPromotionUpdateRequest) GetProductGroupPromotionOk() ([]ProductGroupPromotion, bool) {
	if o == nil {
		return nil, false
	}
	return o.ProductGroupPromotion, true
}

// SetProductGroupPromotion sets field value
func (o *ProductGroupPromotionUpdateRequest) SetProductGroupPromotion(v []ProductGroupPromotion) {
	o.ProductGroupPromotion = v
}

func (o ProductGroupPromotionUpdateRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ProductGroupPromotionUpdateRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["ad_group_id"] = o.AdGroupId
	toSerialize["product_group_promotion"] = o.ProductGroupPromotion
	return toSerialize, nil
}

func (o *ProductGroupPromotionUpdateRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"ad_group_id",
		"product_group_promotion",
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

	varProductGroupPromotionUpdateRequest := _ProductGroupPromotionUpdateRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varProductGroupPromotionUpdateRequest)

	if err != nil {
		return err
	}

	*o = ProductGroupPromotionUpdateRequest(varProductGroupPromotionUpdateRequest)

	return err
}

type NullableProductGroupPromotionUpdateRequest struct {
	value *ProductGroupPromotionUpdateRequest
	isSet bool
}

func (v NullableProductGroupPromotionUpdateRequest) Get() *ProductGroupPromotionUpdateRequest {
	return v.value
}

func (v *NullableProductGroupPromotionUpdateRequest) Set(val *ProductGroupPromotionUpdateRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableProductGroupPromotionUpdateRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableProductGroupPromotionUpdateRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableProductGroupPromotionUpdateRequest(val *ProductGroupPromotionUpdateRequest) *NullableProductGroupPromotionUpdateRequest {
	return &NullableProductGroupPromotionUpdateRequest{value: val, isSet: true}
}

func (v NullableProductGroupPromotionUpdateRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableProductGroupPromotionUpdateRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

