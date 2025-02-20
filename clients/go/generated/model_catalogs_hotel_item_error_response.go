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

// checks if the CatalogsHotelItemErrorResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CatalogsHotelItemErrorResponse{}

// CatalogsHotelItemErrorResponse Object describing a hotel item error
type CatalogsHotelItemErrorResponse struct {
	CatalogType CatalogsType `json:"catalog_type"`
	// The catalog hotel id in the merchant namespace
	HotelId *string `json:"hotel_id,omitempty"`
	// Array with the errors for the item id requested
	Errors []ItemValidationEvent `json:"errors,omitempty"`
}

type _CatalogsHotelItemErrorResponse CatalogsHotelItemErrorResponse

// NewCatalogsHotelItemErrorResponse instantiates a new CatalogsHotelItemErrorResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalogsHotelItemErrorResponse(catalogType CatalogsType) *CatalogsHotelItemErrorResponse {
	this := CatalogsHotelItemErrorResponse{}
	this.CatalogType = catalogType
	return &this
}

// NewCatalogsHotelItemErrorResponseWithDefaults instantiates a new CatalogsHotelItemErrorResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogsHotelItemErrorResponseWithDefaults() *CatalogsHotelItemErrorResponse {
	this := CatalogsHotelItemErrorResponse{}
	return &this
}

// GetCatalogType returns the CatalogType field value
func (o *CatalogsHotelItemErrorResponse) GetCatalogType() CatalogsType {
	if o == nil {
		var ret CatalogsType
		return ret
	}

	return o.CatalogType
}

// GetCatalogTypeOk returns a tuple with the CatalogType field value
// and a boolean to check if the value has been set.
func (o *CatalogsHotelItemErrorResponse) GetCatalogTypeOk() (*CatalogsType, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CatalogType, true
}

// SetCatalogType sets field value
func (o *CatalogsHotelItemErrorResponse) SetCatalogType(v CatalogsType) {
	o.CatalogType = v
}

// GetHotelId returns the HotelId field value if set, zero value otherwise.
func (o *CatalogsHotelItemErrorResponse) GetHotelId() string {
	if o == nil || IsNil(o.HotelId) {
		var ret string
		return ret
	}
	return *o.HotelId
}

// GetHotelIdOk returns a tuple with the HotelId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsHotelItemErrorResponse) GetHotelIdOk() (*string, bool) {
	if o == nil || IsNil(o.HotelId) {
		return nil, false
	}
	return o.HotelId, true
}

// HasHotelId returns a boolean if a field has been set.
func (o *CatalogsHotelItemErrorResponse) HasHotelId() bool {
	if o != nil && !IsNil(o.HotelId) {
		return true
	}

	return false
}

// SetHotelId gets a reference to the given string and assigns it to the HotelId field.
func (o *CatalogsHotelItemErrorResponse) SetHotelId(v string) {
	o.HotelId = &v
}

// GetErrors returns the Errors field value if set, zero value otherwise.
func (o *CatalogsHotelItemErrorResponse) GetErrors() []ItemValidationEvent {
	if o == nil || IsNil(o.Errors) {
		var ret []ItemValidationEvent
		return ret
	}
	return o.Errors
}

// GetErrorsOk returns a tuple with the Errors field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsHotelItemErrorResponse) GetErrorsOk() ([]ItemValidationEvent, bool) {
	if o == nil || IsNil(o.Errors) {
		return nil, false
	}
	return o.Errors, true
}

// HasErrors returns a boolean if a field has been set.
func (o *CatalogsHotelItemErrorResponse) HasErrors() bool {
	if o != nil && !IsNil(o.Errors) {
		return true
	}

	return false
}

// SetErrors gets a reference to the given []ItemValidationEvent and assigns it to the Errors field.
func (o *CatalogsHotelItemErrorResponse) SetErrors(v []ItemValidationEvent) {
	o.Errors = v
}

func (o CatalogsHotelItemErrorResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CatalogsHotelItemErrorResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["catalog_type"] = o.CatalogType
	if !IsNil(o.HotelId) {
		toSerialize["hotel_id"] = o.HotelId
	}
	if !IsNil(o.Errors) {
		toSerialize["errors"] = o.Errors
	}
	return toSerialize, nil
}

func (o *CatalogsHotelItemErrorResponse) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"catalog_type",
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

	varCatalogsHotelItemErrorResponse := _CatalogsHotelItemErrorResponse{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCatalogsHotelItemErrorResponse)

	if err != nil {
		return err
	}

	*o = CatalogsHotelItemErrorResponse(varCatalogsHotelItemErrorResponse)

	return err
}

type NullableCatalogsHotelItemErrorResponse struct {
	value *CatalogsHotelItemErrorResponse
	isSet bool
}

func (v NullableCatalogsHotelItemErrorResponse) Get() *CatalogsHotelItemErrorResponse {
	return v.value
}

func (v *NullableCatalogsHotelItemErrorResponse) Set(val *CatalogsHotelItemErrorResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsHotelItemErrorResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsHotelItemErrorResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsHotelItemErrorResponse(val *CatalogsHotelItemErrorResponse) *NullableCatalogsHotelItemErrorResponse {
	return &NullableCatalogsHotelItemErrorResponse{value: val, isSet: true}
}

func (v NullableCatalogsHotelItemErrorResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsHotelItemErrorResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


