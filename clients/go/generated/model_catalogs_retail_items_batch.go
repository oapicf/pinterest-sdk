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
	"time"
	"bytes"
	"fmt"
)

// checks if the CatalogsRetailItemsBatch type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CatalogsRetailItemsBatch{}

// CatalogsRetailItemsBatch Object describing the catalogs retail items batch
type CatalogsRetailItemsBatch struct {
	// Id of the catalogs items batch
	BatchId *string `json:"batch_id,omitempty"`
	// Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
	CreatedTime *time.Time `json:"created_time,omitempty"`
	// Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
	CompletedTime NullableTime `json:"completed_time,omitempty"`
	Status *BatchOperationStatus `json:"status,omitempty"`
	CatalogType CatalogsType `json:"catalog_type"`
	// Array with the catalogs items processing records part of the catalogs items batch
	Items []ItemProcessingRecord `json:"items,omitempty"`
}

type _CatalogsRetailItemsBatch CatalogsRetailItemsBatch

// NewCatalogsRetailItemsBatch instantiates a new CatalogsRetailItemsBatch object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalogsRetailItemsBatch(catalogType CatalogsType) *CatalogsRetailItemsBatch {
	this := CatalogsRetailItemsBatch{}
	this.CatalogType = catalogType
	return &this
}

// NewCatalogsRetailItemsBatchWithDefaults instantiates a new CatalogsRetailItemsBatch object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogsRetailItemsBatchWithDefaults() *CatalogsRetailItemsBatch {
	this := CatalogsRetailItemsBatch{}
	return &this
}

// GetBatchId returns the BatchId field value if set, zero value otherwise.
func (o *CatalogsRetailItemsBatch) GetBatchId() string {
	if o == nil || IsNil(o.BatchId) {
		var ret string
		return ret
	}
	return *o.BatchId
}

// GetBatchIdOk returns a tuple with the BatchId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsRetailItemsBatch) GetBatchIdOk() (*string, bool) {
	if o == nil || IsNil(o.BatchId) {
		return nil, false
	}
	return o.BatchId, true
}

// HasBatchId returns a boolean if a field has been set.
func (o *CatalogsRetailItemsBatch) HasBatchId() bool {
	if o != nil && !IsNil(o.BatchId) {
		return true
	}

	return false
}

// SetBatchId gets a reference to the given string and assigns it to the BatchId field.
func (o *CatalogsRetailItemsBatch) SetBatchId(v string) {
	o.BatchId = &v
}

// GetCreatedTime returns the CreatedTime field value if set, zero value otherwise.
func (o *CatalogsRetailItemsBatch) GetCreatedTime() time.Time {
	if o == nil || IsNil(o.CreatedTime) {
		var ret time.Time
		return ret
	}
	return *o.CreatedTime
}

// GetCreatedTimeOk returns a tuple with the CreatedTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsRetailItemsBatch) GetCreatedTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.CreatedTime) {
		return nil, false
	}
	return o.CreatedTime, true
}

// HasCreatedTime returns a boolean if a field has been set.
func (o *CatalogsRetailItemsBatch) HasCreatedTime() bool {
	if o != nil && !IsNil(o.CreatedTime) {
		return true
	}

	return false
}

// SetCreatedTime gets a reference to the given time.Time and assigns it to the CreatedTime field.
func (o *CatalogsRetailItemsBatch) SetCreatedTime(v time.Time) {
	o.CreatedTime = &v
}

// GetCompletedTime returns the CompletedTime field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CatalogsRetailItemsBatch) GetCompletedTime() time.Time {
	if o == nil || IsNil(o.CompletedTime.Get()) {
		var ret time.Time
		return ret
	}
	return *o.CompletedTime.Get()
}

// GetCompletedTimeOk returns a tuple with the CompletedTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CatalogsRetailItemsBatch) GetCompletedTimeOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return o.CompletedTime.Get(), o.CompletedTime.IsSet()
}

// HasCompletedTime returns a boolean if a field has been set.
func (o *CatalogsRetailItemsBatch) HasCompletedTime() bool {
	if o != nil && o.CompletedTime.IsSet() {
		return true
	}

	return false
}

// SetCompletedTime gets a reference to the given NullableTime and assigns it to the CompletedTime field.
func (o *CatalogsRetailItemsBatch) SetCompletedTime(v time.Time) {
	o.CompletedTime.Set(&v)
}
// SetCompletedTimeNil sets the value for CompletedTime to be an explicit nil
func (o *CatalogsRetailItemsBatch) SetCompletedTimeNil() {
	o.CompletedTime.Set(nil)
}

// UnsetCompletedTime ensures that no value is present for CompletedTime, not even an explicit nil
func (o *CatalogsRetailItemsBatch) UnsetCompletedTime() {
	o.CompletedTime.Unset()
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *CatalogsRetailItemsBatch) GetStatus() BatchOperationStatus {
	if o == nil || IsNil(o.Status) {
		var ret BatchOperationStatus
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsRetailItemsBatch) GetStatusOk() (*BatchOperationStatus, bool) {
	if o == nil || IsNil(o.Status) {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *CatalogsRetailItemsBatch) HasStatus() bool {
	if o != nil && !IsNil(o.Status) {
		return true
	}

	return false
}

// SetStatus gets a reference to the given BatchOperationStatus and assigns it to the Status field.
func (o *CatalogsRetailItemsBatch) SetStatus(v BatchOperationStatus) {
	o.Status = &v
}

// GetCatalogType returns the CatalogType field value
func (o *CatalogsRetailItemsBatch) GetCatalogType() CatalogsType {
	if o == nil {
		var ret CatalogsType
		return ret
	}

	return o.CatalogType
}

// GetCatalogTypeOk returns a tuple with the CatalogType field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailItemsBatch) GetCatalogTypeOk() (*CatalogsType, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CatalogType, true
}

// SetCatalogType sets field value
func (o *CatalogsRetailItemsBatch) SetCatalogType(v CatalogsType) {
	o.CatalogType = v
}

// GetItems returns the Items field value if set, zero value otherwise.
func (o *CatalogsRetailItemsBatch) GetItems() []ItemProcessingRecord {
	if o == nil || IsNil(o.Items) {
		var ret []ItemProcessingRecord
		return ret
	}
	return o.Items
}

// GetItemsOk returns a tuple with the Items field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CatalogsRetailItemsBatch) GetItemsOk() ([]ItemProcessingRecord, bool) {
	if o == nil || IsNil(o.Items) {
		return nil, false
	}
	return o.Items, true
}

// HasItems returns a boolean if a field has been set.
func (o *CatalogsRetailItemsBatch) HasItems() bool {
	if o != nil && !IsNil(o.Items) {
		return true
	}

	return false
}

// SetItems gets a reference to the given []ItemProcessingRecord and assigns it to the Items field.
func (o *CatalogsRetailItemsBatch) SetItems(v []ItemProcessingRecord) {
	o.Items = v
}

func (o CatalogsRetailItemsBatch) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CatalogsRetailItemsBatch) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.BatchId) {
		toSerialize["batch_id"] = o.BatchId
	}
	if !IsNil(o.CreatedTime) {
		toSerialize["created_time"] = o.CreatedTime
	}
	if o.CompletedTime.IsSet() {
		toSerialize["completed_time"] = o.CompletedTime.Get()
	}
	if !IsNil(o.Status) {
		toSerialize["status"] = o.Status
	}
	toSerialize["catalog_type"] = o.CatalogType
	if !IsNil(o.Items) {
		toSerialize["items"] = o.Items
	}
	return toSerialize, nil
}

func (o *CatalogsRetailItemsBatch) UnmarshalJSON(data []byte) (err error) {
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

	varCatalogsRetailItemsBatch := _CatalogsRetailItemsBatch{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCatalogsRetailItemsBatch)

	if err != nil {
		return err
	}

	*o = CatalogsRetailItemsBatch(varCatalogsRetailItemsBatch)

	return err
}

type NullableCatalogsRetailItemsBatch struct {
	value *CatalogsRetailItemsBatch
	isSet bool
}

func (v NullableCatalogsRetailItemsBatch) Get() *CatalogsRetailItemsBatch {
	return v.value
}

func (v *NullableCatalogsRetailItemsBatch) Set(val *CatalogsRetailItemsBatch) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsRetailItemsBatch) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsRetailItemsBatch) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsRetailItemsBatch(val *CatalogsRetailItemsBatch) *NullableCatalogsRetailItemsBatch {
	return &NullableCatalogsRetailItemsBatch{value: val, isSet: true}
}

func (v NullableCatalogsRetailItemsBatch) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsRetailItemsBatch) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

