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

// checks if the IntegrationsGetList200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &IntegrationsGetList200Response{}

// IntegrationsGetList200Response struct for IntegrationsGetList200Response
type IntegrationsGetList200Response struct {
	Items []IntegrationRecord `json:"items"`
	Bookmark NullableString `json:"bookmark,omitempty"`
}

type _IntegrationsGetList200Response IntegrationsGetList200Response

// NewIntegrationsGetList200Response instantiates a new IntegrationsGetList200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewIntegrationsGetList200Response(items []IntegrationRecord) *IntegrationsGetList200Response {
	this := IntegrationsGetList200Response{}
	this.Items = items
	return &this
}

// NewIntegrationsGetList200ResponseWithDefaults instantiates a new IntegrationsGetList200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewIntegrationsGetList200ResponseWithDefaults() *IntegrationsGetList200Response {
	this := IntegrationsGetList200Response{}
	return &this
}

// GetItems returns the Items field value
func (o *IntegrationsGetList200Response) GetItems() []IntegrationRecord {
	if o == nil {
		var ret []IntegrationRecord
		return ret
	}

	return o.Items
}

// GetItemsOk returns a tuple with the Items field value
// and a boolean to check if the value has been set.
func (o *IntegrationsGetList200Response) GetItemsOk() ([]IntegrationRecord, bool) {
	if o == nil {
		return nil, false
	}
	return o.Items, true
}

// SetItems sets field value
func (o *IntegrationsGetList200Response) SetItems(v []IntegrationRecord) {
	o.Items = v
}

// GetBookmark returns the Bookmark field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IntegrationsGetList200Response) GetBookmark() string {
	if o == nil || IsNil(o.Bookmark.Get()) {
		var ret string
		return ret
	}
	return *o.Bookmark.Get()
}

// GetBookmarkOk returns a tuple with the Bookmark field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IntegrationsGetList200Response) GetBookmarkOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Bookmark.Get(), o.Bookmark.IsSet()
}

// HasBookmark returns a boolean if a field has been set.
func (o *IntegrationsGetList200Response) HasBookmark() bool {
	if o != nil && o.Bookmark.IsSet() {
		return true
	}

	return false
}

// SetBookmark gets a reference to the given NullableString and assigns it to the Bookmark field.
func (o *IntegrationsGetList200Response) SetBookmark(v string) {
	o.Bookmark.Set(&v)
}
// SetBookmarkNil sets the value for Bookmark to be an explicit nil
func (o *IntegrationsGetList200Response) SetBookmarkNil() {
	o.Bookmark.Set(nil)
}

// UnsetBookmark ensures that no value is present for Bookmark, not even an explicit nil
func (o *IntegrationsGetList200Response) UnsetBookmark() {
	o.Bookmark.Unset()
}

func (o IntegrationsGetList200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o IntegrationsGetList200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["items"] = o.Items
	if o.Bookmark.IsSet() {
		toSerialize["bookmark"] = o.Bookmark.Get()
	}
	return toSerialize, nil
}

func (o *IntegrationsGetList200Response) UnmarshalJSON(data []byte) (err error) {
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

	varIntegrationsGetList200Response := _IntegrationsGetList200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varIntegrationsGetList200Response)

	if err != nil {
		return err
	}

	*o = IntegrationsGetList200Response(varIntegrationsGetList200Response)

	return err
}

type NullableIntegrationsGetList200Response struct {
	value *IntegrationsGetList200Response
	isSet bool
}

func (v NullableIntegrationsGetList200Response) Get() *IntegrationsGetList200Response {
	return v.value
}

func (v *NullableIntegrationsGetList200Response) Set(val *IntegrationsGetList200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableIntegrationsGetList200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableIntegrationsGetList200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableIntegrationsGetList200Response(val *IntegrationsGetList200Response) *NullableIntegrationsGetList200Response {
	return &NullableIntegrationsGetList200Response{value: val, isSet: true}
}

func (v NullableIntegrationsGetList200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableIntegrationsGetList200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


