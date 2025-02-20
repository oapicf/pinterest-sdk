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

// checks if the AdsList200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AdsList200Response{}

// AdsList200Response struct for AdsList200Response
type AdsList200Response struct {
	Items []AdResponse `json:"items"`
	Bookmark NullableString `json:"bookmark,omitempty"`
}

type _AdsList200Response AdsList200Response

// NewAdsList200Response instantiates a new AdsList200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdsList200Response(items []AdResponse) *AdsList200Response {
	this := AdsList200Response{}
	this.Items = items
	return &this
}

// NewAdsList200ResponseWithDefaults instantiates a new AdsList200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdsList200ResponseWithDefaults() *AdsList200Response {
	this := AdsList200Response{}
	return &this
}

// GetItems returns the Items field value
func (o *AdsList200Response) GetItems() []AdResponse {
	if o == nil {
		var ret []AdResponse
		return ret
	}

	return o.Items
}

// GetItemsOk returns a tuple with the Items field value
// and a boolean to check if the value has been set.
func (o *AdsList200Response) GetItemsOk() ([]AdResponse, bool) {
	if o == nil {
		return nil, false
	}
	return o.Items, true
}

// SetItems sets field value
func (o *AdsList200Response) SetItems(v []AdResponse) {
	o.Items = v
}

// GetBookmark returns the Bookmark field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *AdsList200Response) GetBookmark() string {
	if o == nil || IsNil(o.Bookmark.Get()) {
		var ret string
		return ret
	}
	return *o.Bookmark.Get()
}

// GetBookmarkOk returns a tuple with the Bookmark field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *AdsList200Response) GetBookmarkOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Bookmark.Get(), o.Bookmark.IsSet()
}

// HasBookmark returns a boolean if a field has been set.
func (o *AdsList200Response) HasBookmark() bool {
	if o != nil && o.Bookmark.IsSet() {
		return true
	}

	return false
}

// SetBookmark gets a reference to the given NullableString and assigns it to the Bookmark field.
func (o *AdsList200Response) SetBookmark(v string) {
	o.Bookmark.Set(&v)
}
// SetBookmarkNil sets the value for Bookmark to be an explicit nil
func (o *AdsList200Response) SetBookmarkNil() {
	o.Bookmark.Set(nil)
}

// UnsetBookmark ensures that no value is present for Bookmark, not even an explicit nil
func (o *AdsList200Response) UnsetBookmark() {
	o.Bookmark.Unset()
}

func (o AdsList200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AdsList200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["items"] = o.Items
	if o.Bookmark.IsSet() {
		toSerialize["bookmark"] = o.Bookmark.Get()
	}
	return toSerialize, nil
}

func (o *AdsList200Response) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"items",
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

	varAdsList200Response := _AdsList200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varAdsList200Response)

	if err != nil {
		return err
	}

	*o = AdsList200Response(varAdsList200Response)

	return err
}

type NullableAdsList200Response struct {
	value *AdsList200Response
	isSet bool
}

func (v NullableAdsList200Response) Get() *AdsList200Response {
	return v.value
}

func (v *NullableAdsList200Response) Set(val *AdsList200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableAdsList200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableAdsList200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdsList200Response(val *AdsList200Response) *NullableAdsList200Response {
	return &NullableAdsList200Response{value: val, isSet: true}
}

func (v NullableAdsList200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdsList200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


