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

// checks if the CatalogsFeedIngestionWarnings type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CatalogsFeedIngestionWarnings{}

// CatalogsFeedIngestionWarnings struct for CatalogsFeedIngestionWarnings
type CatalogsFeedIngestionWarnings struct {
	// We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR *int32 `json:"ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR,omitempty"`
	// Additional image files are unreadable. Please upload new files to continue.
	ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE *int32 `json:"ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE,omitempty"`
	// Additional image files are unreadable. Please check your link and upload new files to continue.
	ADDITIONAL_IMAGE_MALFORMED_URL *int32 `json:"ADDITIONAL_IMAGE_MALFORMED_URL,omitempty"`
	// Additional image files are unreadable. Please upload new files to continue.
	ADDITIONAL_IMAGE_FILE_NOT_FOUND *int32 `json:"ADDITIONAL_IMAGE_FILE_NOT_FOUND,omitempty"`
	// Additional image files are unreadable. Please upload new files to continue.
	ADDITIONAL_IMAGE_INVALID_FILE *int32 `json:"ADDITIONAL_IMAGE_INVALID_FILE,omitempty"`
	// price is not a supported column. Use base_price and sale_price instead.
	HOTEL_PRICE_HEADER_IS_PRESENT *int32 `json:"HOTEL_PRICE_HEADER_IS_PRESENT,omitempty"`
}

// NewCatalogsFeedIngestionWarnings instantiates a new CatalogsFeedIngestionWarnings object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalogsFeedIngestionWarnings() *CatalogsFeedIngestionWarnings {
	this := CatalogsFeedIngestionWarnings{}
	return &this
}

// NewCatalogsFeedIngestionWarningsWithDefaults instantiates a new CatalogsFeedIngestionWarnings object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogsFeedIngestionWarningsWithDefaults() *CatalogsFeedIngestionWarnings {
	this := CatalogsFeedIngestionWarnings{}
	return &this
}

// GetADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR returns the ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR field value if set, zero value otherwise.
func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR() int32 {
	if o == nil || IsNil(o.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR) {
		var ret int32
		return ret
	}
	return *o.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR
}

// GetADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROROk returns a tuple with the ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROROk() (*int32, bool) {
	if o == nil || IsNil(o.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR) {
		return nil, false
	}
	return o.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR, true
}

// HasADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR returns a boolean if a field has been set.
func (o *CatalogsFeedIngestionWarnings) HasADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR() bool {
	if o != nil && !IsNil(o.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR) {
		return true
	}

	return false
}

// SetADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR gets a reference to the given int32 and assigns it to the ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR field.
func (o *CatalogsFeedIngestionWarnings) SetADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR(v int32) {
	o.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR = &v
}

// GetADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE returns the ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE field value if set, zero value otherwise.
func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE() int32 {
	if o == nil || IsNil(o.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE) {
		var ret int32
		return ret
	}
	return *o.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE
}

// GetADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLEOk returns a tuple with the ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLEOk() (*int32, bool) {
	if o == nil || IsNil(o.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE) {
		return nil, false
	}
	return o.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE, true
}

// HasADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE returns a boolean if a field has been set.
func (o *CatalogsFeedIngestionWarnings) HasADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE() bool {
	if o != nil && !IsNil(o.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE) {
		return true
	}

	return false
}

// SetADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE gets a reference to the given int32 and assigns it to the ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE field.
func (o *CatalogsFeedIngestionWarnings) SetADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE(v int32) {
	o.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE = &v
}

// GetADDITIONAL_IMAGE_MALFORMED_URL returns the ADDITIONAL_IMAGE_MALFORMED_URL field value if set, zero value otherwise.
func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_MALFORMED_URL() int32 {
	if o == nil || IsNil(o.ADDITIONAL_IMAGE_MALFORMED_URL) {
		var ret int32
		return ret
	}
	return *o.ADDITIONAL_IMAGE_MALFORMED_URL
}

// GetADDITIONAL_IMAGE_MALFORMED_URLOk returns a tuple with the ADDITIONAL_IMAGE_MALFORMED_URL field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_MALFORMED_URLOk() (*int32, bool) {
	if o == nil || IsNil(o.ADDITIONAL_IMAGE_MALFORMED_URL) {
		return nil, false
	}
	return o.ADDITIONAL_IMAGE_MALFORMED_URL, true
}

// HasADDITIONAL_IMAGE_MALFORMED_URL returns a boolean if a field has been set.
func (o *CatalogsFeedIngestionWarnings) HasADDITIONAL_IMAGE_MALFORMED_URL() bool {
	if o != nil && !IsNil(o.ADDITIONAL_IMAGE_MALFORMED_URL) {
		return true
	}

	return false
}

// SetADDITIONAL_IMAGE_MALFORMED_URL gets a reference to the given int32 and assigns it to the ADDITIONAL_IMAGE_MALFORMED_URL field.
func (o *CatalogsFeedIngestionWarnings) SetADDITIONAL_IMAGE_MALFORMED_URL(v int32) {
	o.ADDITIONAL_IMAGE_MALFORMED_URL = &v
}

// GetADDITIONAL_IMAGE_FILE_NOT_FOUND returns the ADDITIONAL_IMAGE_FILE_NOT_FOUND field value if set, zero value otherwise.
func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_FILE_NOT_FOUND() int32 {
	if o == nil || IsNil(o.ADDITIONAL_IMAGE_FILE_NOT_FOUND) {
		var ret int32
		return ret
	}
	return *o.ADDITIONAL_IMAGE_FILE_NOT_FOUND
}

// GetADDITIONAL_IMAGE_FILE_NOT_FOUNDOk returns a tuple with the ADDITIONAL_IMAGE_FILE_NOT_FOUND field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_FILE_NOT_FOUNDOk() (*int32, bool) {
	if o == nil || IsNil(o.ADDITIONAL_IMAGE_FILE_NOT_FOUND) {
		return nil, false
	}
	return o.ADDITIONAL_IMAGE_FILE_NOT_FOUND, true
}

// HasADDITIONAL_IMAGE_FILE_NOT_FOUND returns a boolean if a field has been set.
func (o *CatalogsFeedIngestionWarnings) HasADDITIONAL_IMAGE_FILE_NOT_FOUND() bool {
	if o != nil && !IsNil(o.ADDITIONAL_IMAGE_FILE_NOT_FOUND) {
		return true
	}

	return false
}

// SetADDITIONAL_IMAGE_FILE_NOT_FOUND gets a reference to the given int32 and assigns it to the ADDITIONAL_IMAGE_FILE_NOT_FOUND field.
func (o *CatalogsFeedIngestionWarnings) SetADDITIONAL_IMAGE_FILE_NOT_FOUND(v int32) {
	o.ADDITIONAL_IMAGE_FILE_NOT_FOUND = &v
}

// GetADDITIONAL_IMAGE_INVALID_FILE returns the ADDITIONAL_IMAGE_INVALID_FILE field value if set, zero value otherwise.
func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_INVALID_FILE() int32 {
	if o == nil || IsNil(o.ADDITIONAL_IMAGE_INVALID_FILE) {
		var ret int32
		return ret
	}
	return *o.ADDITIONAL_IMAGE_INVALID_FILE
}

// GetADDITIONAL_IMAGE_INVALID_FILEOk returns a tuple with the ADDITIONAL_IMAGE_INVALID_FILE field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsFeedIngestionWarnings) GetADDITIONAL_IMAGE_INVALID_FILEOk() (*int32, bool) {
	if o == nil || IsNil(o.ADDITIONAL_IMAGE_INVALID_FILE) {
		return nil, false
	}
	return o.ADDITIONAL_IMAGE_INVALID_FILE, true
}

// HasADDITIONAL_IMAGE_INVALID_FILE returns a boolean if a field has been set.
func (o *CatalogsFeedIngestionWarnings) HasADDITIONAL_IMAGE_INVALID_FILE() bool {
	if o != nil && !IsNil(o.ADDITIONAL_IMAGE_INVALID_FILE) {
		return true
	}

	return false
}

// SetADDITIONAL_IMAGE_INVALID_FILE gets a reference to the given int32 and assigns it to the ADDITIONAL_IMAGE_INVALID_FILE field.
func (o *CatalogsFeedIngestionWarnings) SetADDITIONAL_IMAGE_INVALID_FILE(v int32) {
	o.ADDITIONAL_IMAGE_INVALID_FILE = &v
}

// GetHOTEL_PRICE_HEADER_IS_PRESENT returns the HOTEL_PRICE_HEADER_IS_PRESENT field value if set, zero value otherwise.
func (o *CatalogsFeedIngestionWarnings) GetHOTEL_PRICE_HEADER_IS_PRESENT() int32 {
	if o == nil || IsNil(o.HOTEL_PRICE_HEADER_IS_PRESENT) {
		var ret int32
		return ret
	}
	return *o.HOTEL_PRICE_HEADER_IS_PRESENT
}

// GetHOTEL_PRICE_HEADER_IS_PRESENTOk returns a tuple with the HOTEL_PRICE_HEADER_IS_PRESENT field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsFeedIngestionWarnings) GetHOTEL_PRICE_HEADER_IS_PRESENTOk() (*int32, bool) {
	if o == nil || IsNil(o.HOTEL_PRICE_HEADER_IS_PRESENT) {
		return nil, false
	}
	return o.HOTEL_PRICE_HEADER_IS_PRESENT, true
}

// HasHOTEL_PRICE_HEADER_IS_PRESENT returns a boolean if a field has been set.
func (o *CatalogsFeedIngestionWarnings) HasHOTEL_PRICE_HEADER_IS_PRESENT() bool {
	if o != nil && !IsNil(o.HOTEL_PRICE_HEADER_IS_PRESENT) {
		return true
	}

	return false
}

// SetHOTEL_PRICE_HEADER_IS_PRESENT gets a reference to the given int32 and assigns it to the HOTEL_PRICE_HEADER_IS_PRESENT field.
func (o *CatalogsFeedIngestionWarnings) SetHOTEL_PRICE_HEADER_IS_PRESENT(v int32) {
	o.HOTEL_PRICE_HEADER_IS_PRESENT = &v
}

func (o CatalogsFeedIngestionWarnings) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CatalogsFeedIngestionWarnings) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR) {
		toSerialize["ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR"] = o.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR
	}
	if !IsNil(o.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE) {
		toSerialize["ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE"] = o.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE
	}
	if !IsNil(o.ADDITIONAL_IMAGE_MALFORMED_URL) {
		toSerialize["ADDITIONAL_IMAGE_MALFORMED_URL"] = o.ADDITIONAL_IMAGE_MALFORMED_URL
	}
	if !IsNil(o.ADDITIONAL_IMAGE_FILE_NOT_FOUND) {
		toSerialize["ADDITIONAL_IMAGE_FILE_NOT_FOUND"] = o.ADDITIONAL_IMAGE_FILE_NOT_FOUND
	}
	if !IsNil(o.ADDITIONAL_IMAGE_INVALID_FILE) {
		toSerialize["ADDITIONAL_IMAGE_INVALID_FILE"] = o.ADDITIONAL_IMAGE_INVALID_FILE
	}
	if !IsNil(o.HOTEL_PRICE_HEADER_IS_PRESENT) {
		toSerialize["HOTEL_PRICE_HEADER_IS_PRESENT"] = o.HOTEL_PRICE_HEADER_IS_PRESENT
	}
	return toSerialize, nil
}

type NullableCatalogsFeedIngestionWarnings struct {
	value *CatalogsFeedIngestionWarnings
	isSet bool
}

func (v NullableCatalogsFeedIngestionWarnings) Get() *CatalogsFeedIngestionWarnings {
	return v.value
}

func (v *NullableCatalogsFeedIngestionWarnings) Set(val *CatalogsFeedIngestionWarnings) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsFeedIngestionWarnings) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsFeedIngestionWarnings) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsFeedIngestionWarnings(val *CatalogsFeedIngestionWarnings) *NullableCatalogsFeedIngestionWarnings {
	return &NullableCatalogsFeedIngestionWarnings{value: val, isSet: true}
}

func (v NullableCatalogsFeedIngestionWarnings) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsFeedIngestionWarnings) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


