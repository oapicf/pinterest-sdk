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
	"time"
	"bytes"
	"fmt"
)

// checks if the Catalog type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Catalog{}

// Catalog Catalog entity
type Catalog struct {
	CreatedAt time.Time `json:"created_at"`
	// ID of the catalog entity.
	Id string `json:"id" validate:"regexp=^\\\\d+$"`
	UpdatedAt time.Time `json:"updated_at"`
	// A human-friendly name associated to a catalog entity.
	Name NullableString `json:"name"`
	CatalogType CatalogsType `json:"catalog_type"`
}

type _Catalog Catalog

// NewCatalog instantiates a new Catalog object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalog(createdAt time.Time, id string, updatedAt time.Time, name NullableString, catalogType CatalogsType) *Catalog {
	this := Catalog{}
	this.CreatedAt = createdAt
	this.Id = id
	this.UpdatedAt = updatedAt
	this.Name = name
	this.CatalogType = catalogType
	return &this
}

// NewCatalogWithDefaults instantiates a new Catalog object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogWithDefaults() *Catalog {
	this := Catalog{}
	return &this
}

// GetCreatedAt returns the CreatedAt field value
func (o *Catalog) GetCreatedAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value
// and a boolean to check if the value has been set.
func (o *Catalog) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CreatedAt, true
}

// SetCreatedAt sets field value
func (o *Catalog) SetCreatedAt(v time.Time) {
	o.CreatedAt = v
}

// GetId returns the Id field value
func (o *Catalog) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *Catalog) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *Catalog) SetId(v string) {
	o.Id = v
}

// GetUpdatedAt returns the UpdatedAt field value
func (o *Catalog) GetUpdatedAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.UpdatedAt
}

// GetUpdatedAtOk returns a tuple with the UpdatedAt field value
// and a boolean to check if the value has been set.
func (o *Catalog) GetUpdatedAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.UpdatedAt, true
}

// SetUpdatedAt sets field value
func (o *Catalog) SetUpdatedAt(v time.Time) {
	o.UpdatedAt = v
}

// GetName returns the Name field value
// If the value is explicit nil, the zero value for string will be returned
func (o *Catalog) GetName() string {
	if o == nil || o.Name.Get() == nil {
		var ret string
		return ret
	}

	return *o.Name.Get()
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Catalog) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Name.Get(), o.Name.IsSet()
}

// SetName sets field value
func (o *Catalog) SetName(v string) {
	o.Name.Set(&v)
}

// GetCatalogType returns the CatalogType field value
func (o *Catalog) GetCatalogType() CatalogsType {
	if o == nil {
		var ret CatalogsType
		return ret
	}

	return o.CatalogType
}

// GetCatalogTypeOk returns a tuple with the CatalogType field value
// and a boolean to check if the value has been set.
func (o *Catalog) GetCatalogTypeOk() (*CatalogsType, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CatalogType, true
}

// SetCatalogType sets field value
func (o *Catalog) SetCatalogType(v CatalogsType) {
	o.CatalogType = v
}

func (o Catalog) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Catalog) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["created_at"] = o.CreatedAt
	toSerialize["id"] = o.Id
	toSerialize["updated_at"] = o.UpdatedAt
	toSerialize["name"] = o.Name.Get()
	toSerialize["catalog_type"] = o.CatalogType
	return toSerialize, nil
}

func (o *Catalog) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"created_at",
		"id",
		"updated_at",
		"name",
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

	varCatalog := _Catalog{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCatalog)

	if err != nil {
		return err
	}

	*o = Catalog(varCatalog)

	return err
}

type NullableCatalog struct {
	value *Catalog
	isSet bool
}

func (v NullableCatalog) Get() *Catalog {
	return v.value
}

func (v *NullableCatalog) Set(val *Catalog) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalog) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalog) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalog(val *Catalog) *NullableCatalog {
	return &NullableCatalog{value: val, isSet: true}
}

func (v NullableCatalog) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalog) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


