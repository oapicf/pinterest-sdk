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

// checks if the CatalogsHotelFeedsCreateRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CatalogsHotelFeedsCreateRequest{}

// CatalogsHotelFeedsCreateRequest Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
type CatalogsHotelFeedsCreateRequest struct {
	DefaultCurrency NullableNullableCurrency `json:"default_currency,omitempty"`
	// A human-friendly name associated to a given feed.
	Name string `json:"name"`
	Format CatalogsFormat `json:"format"`
	DefaultLocale CatalogsFeedsCreateRequestDefaultLocale `json:"default_locale"`
	Credentials NullableCatalogsFeedCredentials `json:"credentials,omitempty"`
	// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
	Location string `json:"location"`
	PreferredProcessingSchedule NullableCatalogsFeedProcessingSchedule `json:"preferred_processing_schedule,omitempty"`
	CatalogType CatalogsType `json:"catalog_type"`
	// Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
	CatalogId NullableString `json:"catalog_id,omitempty"`
}

type _CatalogsHotelFeedsCreateRequest CatalogsHotelFeedsCreateRequest

// NewCatalogsHotelFeedsCreateRequest instantiates a new CatalogsHotelFeedsCreateRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalogsHotelFeedsCreateRequest(name string, format CatalogsFormat, defaultLocale CatalogsFeedsCreateRequestDefaultLocale, location string, catalogType CatalogsType) *CatalogsHotelFeedsCreateRequest {
	this := CatalogsHotelFeedsCreateRequest{}
	this.Name = name
	this.Format = format
	this.DefaultLocale = defaultLocale
	this.Location = location
	this.CatalogType = catalogType
	return &this
}

// NewCatalogsHotelFeedsCreateRequestWithDefaults instantiates a new CatalogsHotelFeedsCreateRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogsHotelFeedsCreateRequestWithDefaults() *CatalogsHotelFeedsCreateRequest {
	this := CatalogsHotelFeedsCreateRequest{}
	return &this
}

// GetDefaultCurrency returns the DefaultCurrency field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CatalogsHotelFeedsCreateRequest) GetDefaultCurrency() NullableCurrency {
	if o == nil || IsNil(o.DefaultCurrency.Get()) {
		var ret NullableCurrency
		return ret
	}
	return *o.DefaultCurrency.Get()
}

// GetDefaultCurrencyOk returns a tuple with the DefaultCurrency field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CatalogsHotelFeedsCreateRequest) GetDefaultCurrencyOk() (*NullableCurrency, bool) {
	if o == nil {
		return nil, false
	}
	return o.DefaultCurrency.Get(), o.DefaultCurrency.IsSet()
}

// HasDefaultCurrency returns a boolean if a field has been set.
func (o *CatalogsHotelFeedsCreateRequest) HasDefaultCurrency() bool {
	if o != nil && o.DefaultCurrency.IsSet() {
		return true
	}

	return false
}

// SetDefaultCurrency gets a reference to the given NullableNullableCurrency and assigns it to the DefaultCurrency field.
func (o *CatalogsHotelFeedsCreateRequest) SetDefaultCurrency(v NullableCurrency) {
	o.DefaultCurrency.Set(&v)
}
// SetDefaultCurrencyNil sets the value for DefaultCurrency to be an explicit nil
func (o *CatalogsHotelFeedsCreateRequest) SetDefaultCurrencyNil() {
	o.DefaultCurrency.Set(nil)
}

// UnsetDefaultCurrency ensures that no value is present for DefaultCurrency, not even an explicit nil
func (o *CatalogsHotelFeedsCreateRequest) UnsetDefaultCurrency() {
	o.DefaultCurrency.Unset()
}

// GetName returns the Name field value
func (o *CatalogsHotelFeedsCreateRequest) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *CatalogsHotelFeedsCreateRequest) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *CatalogsHotelFeedsCreateRequest) SetName(v string) {
	o.Name = v
}

// GetFormat returns the Format field value
func (o *CatalogsHotelFeedsCreateRequest) GetFormat() CatalogsFormat {
	if o == nil {
		var ret CatalogsFormat
		return ret
	}

	return o.Format
}

// GetFormatOk returns a tuple with the Format field value
// and a boolean to check if the value has been set.
func (o *CatalogsHotelFeedsCreateRequest) GetFormatOk() (*CatalogsFormat, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Format, true
}

// SetFormat sets field value
func (o *CatalogsHotelFeedsCreateRequest) SetFormat(v CatalogsFormat) {
	o.Format = v
}

// GetDefaultLocale returns the DefaultLocale field value
func (o *CatalogsHotelFeedsCreateRequest) GetDefaultLocale() CatalogsFeedsCreateRequestDefaultLocale {
	if o == nil {
		var ret CatalogsFeedsCreateRequestDefaultLocale
		return ret
	}

	return o.DefaultLocale
}

// GetDefaultLocaleOk returns a tuple with the DefaultLocale field value
// and a boolean to check if the value has been set.
func (o *CatalogsHotelFeedsCreateRequest) GetDefaultLocaleOk() (*CatalogsFeedsCreateRequestDefaultLocale, bool) {
	if o == nil {
		return nil, false
	}
	return &o.DefaultLocale, true
}

// SetDefaultLocale sets field value
func (o *CatalogsHotelFeedsCreateRequest) SetDefaultLocale(v CatalogsFeedsCreateRequestDefaultLocale) {
	o.DefaultLocale = v
}

// GetCredentials returns the Credentials field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CatalogsHotelFeedsCreateRequest) GetCredentials() CatalogsFeedCredentials {
	if o == nil || IsNil(o.Credentials.Get()) {
		var ret CatalogsFeedCredentials
		return ret
	}
	return *o.Credentials.Get()
}

// GetCredentialsOk returns a tuple with the Credentials field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CatalogsHotelFeedsCreateRequest) GetCredentialsOk() (*CatalogsFeedCredentials, bool) {
	if o == nil {
		return nil, false
	}
	return o.Credentials.Get(), o.Credentials.IsSet()
}

// HasCredentials returns a boolean if a field has been set.
func (o *CatalogsHotelFeedsCreateRequest) HasCredentials() bool {
	if o != nil && o.Credentials.IsSet() {
		return true
	}

	return false
}

// SetCredentials gets a reference to the given NullableCatalogsFeedCredentials and assigns it to the Credentials field.
func (o *CatalogsHotelFeedsCreateRequest) SetCredentials(v CatalogsFeedCredentials) {
	o.Credentials.Set(&v)
}
// SetCredentialsNil sets the value for Credentials to be an explicit nil
func (o *CatalogsHotelFeedsCreateRequest) SetCredentialsNil() {
	o.Credentials.Set(nil)
}

// UnsetCredentials ensures that no value is present for Credentials, not even an explicit nil
func (o *CatalogsHotelFeedsCreateRequest) UnsetCredentials() {
	o.Credentials.Unset()
}

// GetLocation returns the Location field value
func (o *CatalogsHotelFeedsCreateRequest) GetLocation() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Location
}

// GetLocationOk returns a tuple with the Location field value
// and a boolean to check if the value has been set.
func (o *CatalogsHotelFeedsCreateRequest) GetLocationOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Location, true
}

// SetLocation sets field value
func (o *CatalogsHotelFeedsCreateRequest) SetLocation(v string) {
	o.Location = v
}

// GetPreferredProcessingSchedule returns the PreferredProcessingSchedule field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CatalogsHotelFeedsCreateRequest) GetPreferredProcessingSchedule() CatalogsFeedProcessingSchedule {
	if o == nil || IsNil(o.PreferredProcessingSchedule.Get()) {
		var ret CatalogsFeedProcessingSchedule
		return ret
	}
	return *o.PreferredProcessingSchedule.Get()
}

// GetPreferredProcessingScheduleOk returns a tuple with the PreferredProcessingSchedule field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CatalogsHotelFeedsCreateRequest) GetPreferredProcessingScheduleOk() (*CatalogsFeedProcessingSchedule, bool) {
	if o == nil {
		return nil, false
	}
	return o.PreferredProcessingSchedule.Get(), o.PreferredProcessingSchedule.IsSet()
}

// HasPreferredProcessingSchedule returns a boolean if a field has been set.
func (o *CatalogsHotelFeedsCreateRequest) HasPreferredProcessingSchedule() bool {
	if o != nil && o.PreferredProcessingSchedule.IsSet() {
		return true
	}

	return false
}

// SetPreferredProcessingSchedule gets a reference to the given NullableCatalogsFeedProcessingSchedule and assigns it to the PreferredProcessingSchedule field.
func (o *CatalogsHotelFeedsCreateRequest) SetPreferredProcessingSchedule(v CatalogsFeedProcessingSchedule) {
	o.PreferredProcessingSchedule.Set(&v)
}
// SetPreferredProcessingScheduleNil sets the value for PreferredProcessingSchedule to be an explicit nil
func (o *CatalogsHotelFeedsCreateRequest) SetPreferredProcessingScheduleNil() {
	o.PreferredProcessingSchedule.Set(nil)
}

// UnsetPreferredProcessingSchedule ensures that no value is present for PreferredProcessingSchedule, not even an explicit nil
func (o *CatalogsHotelFeedsCreateRequest) UnsetPreferredProcessingSchedule() {
	o.PreferredProcessingSchedule.Unset()
}

// GetCatalogType returns the CatalogType field value
func (o *CatalogsHotelFeedsCreateRequest) GetCatalogType() CatalogsType {
	if o == nil {
		var ret CatalogsType
		return ret
	}

	return o.CatalogType
}

// GetCatalogTypeOk returns a tuple with the CatalogType field value
// and a boolean to check if the value has been set.
func (o *CatalogsHotelFeedsCreateRequest) GetCatalogTypeOk() (*CatalogsType, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CatalogType, true
}

// SetCatalogType sets field value
func (o *CatalogsHotelFeedsCreateRequest) SetCatalogType(v CatalogsType) {
	o.CatalogType = v
}

// GetCatalogId returns the CatalogId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CatalogsHotelFeedsCreateRequest) GetCatalogId() string {
	if o == nil || IsNil(o.CatalogId.Get()) {
		var ret string
		return ret
	}
	return *o.CatalogId.Get()
}

// GetCatalogIdOk returns a tuple with the CatalogId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CatalogsHotelFeedsCreateRequest) GetCatalogIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CatalogId.Get(), o.CatalogId.IsSet()
}

// HasCatalogId returns a boolean if a field has been set.
func (o *CatalogsHotelFeedsCreateRequest) HasCatalogId() bool {
	if o != nil && o.CatalogId.IsSet() {
		return true
	}

	return false
}

// SetCatalogId gets a reference to the given NullableString and assigns it to the CatalogId field.
func (o *CatalogsHotelFeedsCreateRequest) SetCatalogId(v string) {
	o.CatalogId.Set(&v)
}
// SetCatalogIdNil sets the value for CatalogId to be an explicit nil
func (o *CatalogsHotelFeedsCreateRequest) SetCatalogIdNil() {
	o.CatalogId.Set(nil)
}

// UnsetCatalogId ensures that no value is present for CatalogId, not even an explicit nil
func (o *CatalogsHotelFeedsCreateRequest) UnsetCatalogId() {
	o.CatalogId.Unset()
}

func (o CatalogsHotelFeedsCreateRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CatalogsHotelFeedsCreateRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.DefaultCurrency.IsSet() {
		toSerialize["default_currency"] = o.DefaultCurrency.Get()
	}
	toSerialize["name"] = o.Name
	toSerialize["format"] = o.Format
	toSerialize["default_locale"] = o.DefaultLocale
	if o.Credentials.IsSet() {
		toSerialize["credentials"] = o.Credentials.Get()
	}
	toSerialize["location"] = o.Location
	if o.PreferredProcessingSchedule.IsSet() {
		toSerialize["preferred_processing_schedule"] = o.PreferredProcessingSchedule.Get()
	}
	toSerialize["catalog_type"] = o.CatalogType
	if o.CatalogId.IsSet() {
		toSerialize["catalog_id"] = o.CatalogId.Get()
	}
	return toSerialize, nil
}

func (o *CatalogsHotelFeedsCreateRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"name",
		"format",
		"default_locale",
		"location",
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

	varCatalogsHotelFeedsCreateRequest := _CatalogsHotelFeedsCreateRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCatalogsHotelFeedsCreateRequest)

	if err != nil {
		return err
	}

	*o = CatalogsHotelFeedsCreateRequest(varCatalogsHotelFeedsCreateRequest)

	return err
}

type NullableCatalogsHotelFeedsCreateRequest struct {
	value *CatalogsHotelFeedsCreateRequest
	isSet bool
}

func (v NullableCatalogsHotelFeedsCreateRequest) Get() *CatalogsHotelFeedsCreateRequest {
	return v.value
}

func (v *NullableCatalogsHotelFeedsCreateRequest) Set(val *CatalogsHotelFeedsCreateRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsHotelFeedsCreateRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsHotelFeedsCreateRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsHotelFeedsCreateRequest(val *CatalogsHotelFeedsCreateRequest) *NullableCatalogsHotelFeedsCreateRequest {
	return &NullableCatalogsHotelFeedsCreateRequest{value: val, isSet: true}
}

func (v NullableCatalogsHotelFeedsCreateRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsHotelFeedsCreateRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

