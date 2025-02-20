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

// checks if the CatalogsHotelAttributesAllOfMainImage type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CatalogsHotelAttributesAllOfMainImage{}

// CatalogsHotelAttributesAllOfMainImage The main hotel image
type CatalogsHotelAttributesAllOfMainImage struct {
	// <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>
	Link *string `json:"link,omitempty"`
	// Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
	Tag []string `json:"tag,omitempty"`
}

// NewCatalogsHotelAttributesAllOfMainImage instantiates a new CatalogsHotelAttributesAllOfMainImage object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalogsHotelAttributesAllOfMainImage() *CatalogsHotelAttributesAllOfMainImage {
	this := CatalogsHotelAttributesAllOfMainImage{}
	return &this
}

// NewCatalogsHotelAttributesAllOfMainImageWithDefaults instantiates a new CatalogsHotelAttributesAllOfMainImage object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogsHotelAttributesAllOfMainImageWithDefaults() *CatalogsHotelAttributesAllOfMainImage {
	this := CatalogsHotelAttributesAllOfMainImage{}
	return &this
}

// GetLink returns the Link field value if set, zero value otherwise.
func (o *CatalogsHotelAttributesAllOfMainImage) GetLink() string {
	if o == nil || IsNil(o.Link) {
		var ret string
		return ret
	}
	return *o.Link
}

// GetLinkOk returns a tuple with the Link field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsHotelAttributesAllOfMainImage) GetLinkOk() (*string, bool) {
	if o == nil || IsNil(o.Link) {
		return nil, false
	}
	return o.Link, true
}

// HasLink returns a boolean if a field has been set.
func (o *CatalogsHotelAttributesAllOfMainImage) HasLink() bool {
	if o != nil && !IsNil(o.Link) {
		return true
	}

	return false
}

// SetLink gets a reference to the given string and assigns it to the Link field.
func (o *CatalogsHotelAttributesAllOfMainImage) SetLink(v string) {
	o.Link = &v
}

// GetTag returns the Tag field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CatalogsHotelAttributesAllOfMainImage) GetTag() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.Tag
}

// GetTagOk returns a tuple with the Tag field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CatalogsHotelAttributesAllOfMainImage) GetTagOk() ([]string, bool) {
	if o == nil || IsNil(o.Tag) {
		return nil, false
	}
	return o.Tag, true
}

// HasTag returns a boolean if a field has been set.
func (o *CatalogsHotelAttributesAllOfMainImage) HasTag() bool {
	if o != nil && !IsNil(o.Tag) {
		return true
	}

	return false
}

// SetTag gets a reference to the given []string and assigns it to the Tag field.
func (o *CatalogsHotelAttributesAllOfMainImage) SetTag(v []string) {
	o.Tag = v
}

func (o CatalogsHotelAttributesAllOfMainImage) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CatalogsHotelAttributesAllOfMainImage) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Link) {
		toSerialize["link"] = o.Link
	}
	if o.Tag != nil {
		toSerialize["tag"] = o.Tag
	}
	return toSerialize, nil
}

type NullableCatalogsHotelAttributesAllOfMainImage struct {
	value *CatalogsHotelAttributesAllOfMainImage
	isSet bool
}

func (v NullableCatalogsHotelAttributesAllOfMainImage) Get() *CatalogsHotelAttributesAllOfMainImage {
	return v.value
}

func (v *NullableCatalogsHotelAttributesAllOfMainImage) Set(val *CatalogsHotelAttributesAllOfMainImage) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsHotelAttributesAllOfMainImage) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsHotelAttributesAllOfMainImage) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsHotelAttributesAllOfMainImage(val *CatalogsHotelAttributesAllOfMainImage) *NullableCatalogsHotelAttributesAllOfMainImage {
	return &NullableCatalogsHotelAttributesAllOfMainImage{value: val, isSet: true}
}

func (v NullableCatalogsHotelAttributesAllOfMainImage) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsHotelAttributesAllOfMainImage) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


