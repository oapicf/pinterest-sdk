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

// checks if the CatalogsList200Response type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CatalogsList200Response{}

// CatalogsList200Response struct for CatalogsList200Response
type CatalogsList200Response struct {
	Items []Catalog `json:"items"`
	Bookmark NullableString `json:"bookmark,omitempty"`
}

type _CatalogsList200Response CatalogsList200Response

// NewCatalogsList200Response instantiates a new CatalogsList200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalogsList200Response(items []Catalog) *CatalogsList200Response {
	this := CatalogsList200Response{}
	this.Items = items
	return &this
}

// NewCatalogsList200ResponseWithDefaults instantiates a new CatalogsList200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogsList200ResponseWithDefaults() *CatalogsList200Response {
	this := CatalogsList200Response{}
	return &this
}

// GetItems returns the Items field value
func (o *CatalogsList200Response) GetItems() []Catalog {
	if o == nil {
		var ret []Catalog
		return ret
	}

	return o.Items
}

// GetItemsOk returns a tuple with the Items field value
// and a boolean to check if the value has been set.
func (o *CatalogsList200Response) GetItemsOk() ([]Catalog, bool) {
	if o == nil {
		return nil, false
	}
	return o.Items, true
}

// SetItems sets field value
func (o *CatalogsList200Response) SetItems(v []Catalog) {
	o.Items = v
}

// GetBookmark returns the Bookmark field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CatalogsList200Response) GetBookmark() string {
	if o == nil || IsNil(o.Bookmark.Get()) {
		var ret string
		return ret
	}
	return *o.Bookmark.Get()
}

// GetBookmarkOk returns a tuple with the Bookmark field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CatalogsList200Response) GetBookmarkOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Bookmark.Get(), o.Bookmark.IsSet()
}

// HasBookmark returns a boolean if a field has been set.
func (o *CatalogsList200Response) HasBookmark() bool {
	if o != nil && o.Bookmark.IsSet() {
		return true
	}

	return false
}

// SetBookmark gets a reference to the given NullableString and assigns it to the Bookmark field.
func (o *CatalogsList200Response) SetBookmark(v string) {
	o.Bookmark.Set(&v)
}
// SetBookmarkNil sets the value for Bookmark to be an explicit nil
func (o *CatalogsList200Response) SetBookmarkNil() {
	o.Bookmark.Set(nil)
}

// UnsetBookmark ensures that no value is present for Bookmark, not even an explicit nil
func (o *CatalogsList200Response) UnsetBookmark() {
	o.Bookmark.Unset()
}

func (o CatalogsList200Response) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CatalogsList200Response) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["items"] = o.Items
	if o.Bookmark.IsSet() {
		toSerialize["bookmark"] = o.Bookmark.Get()
	}
	return toSerialize, nil
}

func (o *CatalogsList200Response) UnmarshalJSON(data []byte) (err error) {
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

	varCatalogsList200Response := _CatalogsList200Response{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCatalogsList200Response)

	if err != nil {
		return err
	}

	*o = CatalogsList200Response(varCatalogsList200Response)

	return err
}

type NullableCatalogsList200Response struct {
	value *CatalogsList200Response
	isSet bool
}

func (v NullableCatalogsList200Response) Get() *CatalogsList200Response {
	return v.value
}

func (v *NullableCatalogsList200Response) Set(val *CatalogsList200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsList200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsList200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsList200Response(val *CatalogsList200Response) *NullableCatalogsList200Response {
	return &NullableCatalogsList200Response{value: val, isSet: true}
}

func (v NullableCatalogsList200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsList200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


