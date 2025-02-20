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

// checks if the CatalogsRetailFeed type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CatalogsRetailFeed{}

// CatalogsRetailFeed Catalogs Retail Feed object
type CatalogsRetailFeed struct {
	CreatedAt time.Time `json:"created_at"`
	Id string `json:"id"`
	UpdatedAt time.Time `json:"updated_at"`
	// A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
	Name NullableString `json:"name"`
	Format CatalogsFormat `json:"format"`
	CatalogType CatalogsType `json:"catalog_type"`
	Credentials NullableCatalogsFeedCredentials `json:"credentials"`
	// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
	Location string `json:"location"`
	PreferredProcessingSchedule NullableCatalogsFeedProcessingSchedule `json:"preferred_processing_schedule"`
	Status CatalogsStatus `json:"status"`
	DefaultCurrency NullableNullableCurrency `json:"default_currency"`
	// The locale used within a feed for product descriptions.
	DefaultLocale string `json:"default_locale"`
	DefaultCountry Country `json:"default_country"`
	DefaultAvailability NullableProductAvailabilityType `json:"default_availability"`
}

type _CatalogsRetailFeed CatalogsRetailFeed

// NewCatalogsRetailFeed instantiates a new CatalogsRetailFeed object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCatalogsRetailFeed(createdAt time.Time, id string, updatedAt time.Time, name NullableString, format CatalogsFormat, catalogType CatalogsType, credentials NullableCatalogsFeedCredentials, location string, preferredProcessingSchedule NullableCatalogsFeedProcessingSchedule, status CatalogsStatus, defaultCurrency NullableNullableCurrency, defaultLocale string, defaultCountry Country, defaultAvailability NullableProductAvailabilityType) *CatalogsRetailFeed {
	this := CatalogsRetailFeed{}
	this.CreatedAt = createdAt
	this.Id = id
	this.UpdatedAt = updatedAt
	this.Name = name
	this.Format = format
	this.CatalogType = catalogType
	this.Credentials = credentials
	this.Location = location
	this.PreferredProcessingSchedule = preferredProcessingSchedule
	this.Status = status
	this.DefaultCurrency = defaultCurrency
	this.DefaultLocale = defaultLocale
	this.DefaultCountry = defaultCountry
	this.DefaultAvailability = defaultAvailability
	return &this
}

// NewCatalogsRetailFeedWithDefaults instantiates a new CatalogsRetailFeed object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCatalogsRetailFeedWithDefaults() *CatalogsRetailFeed {
	this := CatalogsRetailFeed{}
	return &this
}

// GetCreatedAt returns the CreatedAt field value
func (o *CatalogsRetailFeed) GetCreatedAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailFeed) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CreatedAt, true
}

// SetCreatedAt sets field value
func (o *CatalogsRetailFeed) SetCreatedAt(v time.Time) {
	o.CreatedAt = v
}

// GetId returns the Id field value
func (o *CatalogsRetailFeed) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailFeed) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *CatalogsRetailFeed) SetId(v string) {
	o.Id = v
}

// GetUpdatedAt returns the UpdatedAt field value
func (o *CatalogsRetailFeed) GetUpdatedAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.UpdatedAt
}

// GetUpdatedAtOk returns a tuple with the UpdatedAt field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailFeed) GetUpdatedAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.UpdatedAt, true
}

// SetUpdatedAt sets field value
func (o *CatalogsRetailFeed) SetUpdatedAt(v time.Time) {
	o.UpdatedAt = v
}

// GetName returns the Name field value
// If the value is explicit nil, the zero value for string will be returned
func (o *CatalogsRetailFeed) GetName() string {
	if o == nil || o.Name.Get() == nil {
		var ret string
		return ret
	}

	return *o.Name.Get()
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CatalogsRetailFeed) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Name.Get(), o.Name.IsSet()
}

// SetName sets field value
func (o *CatalogsRetailFeed) SetName(v string) {
	o.Name.Set(&v)
}

// GetFormat returns the Format field value
func (o *CatalogsRetailFeed) GetFormat() CatalogsFormat {
	if o == nil {
		var ret CatalogsFormat
		return ret
	}

	return o.Format
}

// GetFormatOk returns a tuple with the Format field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailFeed) GetFormatOk() (*CatalogsFormat, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Format, true
}

// SetFormat sets field value
func (o *CatalogsRetailFeed) SetFormat(v CatalogsFormat) {
	o.Format = v
}

// GetCatalogType returns the CatalogType field value
func (o *CatalogsRetailFeed) GetCatalogType() CatalogsType {
	if o == nil {
		var ret CatalogsType
		return ret
	}

	return o.CatalogType
}

// GetCatalogTypeOk returns a tuple with the CatalogType field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailFeed) GetCatalogTypeOk() (*CatalogsType, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CatalogType, true
}

// SetCatalogType sets field value
func (o *CatalogsRetailFeed) SetCatalogType(v CatalogsType) {
	o.CatalogType = v
}

// GetCredentials returns the Credentials field value
// If the value is explicit nil, the zero value for CatalogsFeedCredentials will be returned
func (o *CatalogsRetailFeed) GetCredentials() CatalogsFeedCredentials {
	if o == nil || o.Credentials.Get() == nil {
		var ret CatalogsFeedCredentials
		return ret
	}

	return *o.Credentials.Get()
}

// GetCredentialsOk returns a tuple with the Credentials field value
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CatalogsRetailFeed) GetCredentialsOk() (*CatalogsFeedCredentials, bool) {
	if o == nil {
		return nil, false
	}
	return o.Credentials.Get(), o.Credentials.IsSet()
}

// SetCredentials sets field value
func (o *CatalogsRetailFeed) SetCredentials(v CatalogsFeedCredentials) {
	o.Credentials.Set(&v)
}

// GetLocation returns the Location field value
func (o *CatalogsRetailFeed) GetLocation() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Location
}

// GetLocationOk returns a tuple with the Location field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailFeed) GetLocationOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Location, true
}

// SetLocation sets field value
func (o *CatalogsRetailFeed) SetLocation(v string) {
	o.Location = v
}

// GetPreferredProcessingSchedule returns the PreferredProcessingSchedule field value
// If the value is explicit nil, the zero value for CatalogsFeedProcessingSchedule will be returned
func (o *CatalogsRetailFeed) GetPreferredProcessingSchedule() CatalogsFeedProcessingSchedule {
	if o == nil || o.PreferredProcessingSchedule.Get() == nil {
		var ret CatalogsFeedProcessingSchedule
		return ret
	}

	return *o.PreferredProcessingSchedule.Get()
}

// GetPreferredProcessingScheduleOk returns a tuple with the PreferredProcessingSchedule field value
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CatalogsRetailFeed) GetPreferredProcessingScheduleOk() (*CatalogsFeedProcessingSchedule, bool) {
	if o == nil {
		return nil, false
	}
	return o.PreferredProcessingSchedule.Get(), o.PreferredProcessingSchedule.IsSet()
}

// SetPreferredProcessingSchedule sets field value
func (o *CatalogsRetailFeed) SetPreferredProcessingSchedule(v CatalogsFeedProcessingSchedule) {
	o.PreferredProcessingSchedule.Set(&v)
}

// GetStatus returns the Status field value
func (o *CatalogsRetailFeed) GetStatus() CatalogsStatus {
	if o == nil {
		var ret CatalogsStatus
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailFeed) GetStatusOk() (*CatalogsStatus, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *CatalogsRetailFeed) SetStatus(v CatalogsStatus) {
	o.Status = v
}

// GetDefaultCurrency returns the DefaultCurrency field value
// If the value is explicit nil, the zero value for NullableCurrency will be returned
func (o *CatalogsRetailFeed) GetDefaultCurrency() NullableCurrency {
	if o == nil || o.DefaultCurrency.Get() == nil {
		var ret NullableCurrency
		return ret
	}

	return *o.DefaultCurrency.Get()
}

// GetDefaultCurrencyOk returns a tuple with the DefaultCurrency field value
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CatalogsRetailFeed) GetDefaultCurrencyOk() (*NullableCurrency, bool) {
	if o == nil {
		return nil, false
	}
	return o.DefaultCurrency.Get(), o.DefaultCurrency.IsSet()
}

// SetDefaultCurrency sets field value
func (o *CatalogsRetailFeed) SetDefaultCurrency(v NullableCurrency) {
	o.DefaultCurrency.Set(&v)
}

// GetDefaultLocale returns the DefaultLocale field value
func (o *CatalogsRetailFeed) GetDefaultLocale() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.DefaultLocale
}

// GetDefaultLocaleOk returns a tuple with the DefaultLocale field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailFeed) GetDefaultLocaleOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.DefaultLocale, true
}

// SetDefaultLocale sets field value
func (o *CatalogsRetailFeed) SetDefaultLocale(v string) {
	o.DefaultLocale = v
}

// GetDefaultCountry returns the DefaultCountry field value
func (o *CatalogsRetailFeed) GetDefaultCountry() Country {
	if o == nil {
		var ret Country
		return ret
	}

	return o.DefaultCountry
}

// GetDefaultCountryOk returns a tuple with the DefaultCountry field value
// and a boolean to check if the value has been set.
func (o *CatalogsRetailFeed) GetDefaultCountryOk() (*Country, bool) {
	if o == nil {
		return nil, false
	}
	return &o.DefaultCountry, true
}

// SetDefaultCountry sets field value
func (o *CatalogsRetailFeed) SetDefaultCountry(v Country) {
	o.DefaultCountry = v
}

// GetDefaultAvailability returns the DefaultAvailability field value
// If the value is explicit nil, the zero value for ProductAvailabilityType will be returned
func (o *CatalogsRetailFeed) GetDefaultAvailability() ProductAvailabilityType {
	if o == nil || o.DefaultAvailability.Get() == nil {
		var ret ProductAvailabilityType
		return ret
	}

	return *o.DefaultAvailability.Get()
}

// GetDefaultAvailabilityOk returns a tuple with the DefaultAvailability field value
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CatalogsRetailFeed) GetDefaultAvailabilityOk() (*ProductAvailabilityType, bool) {
	if o == nil {
		return nil, false
	}
	return o.DefaultAvailability.Get(), o.DefaultAvailability.IsSet()
}

// SetDefaultAvailability sets field value
func (o *CatalogsRetailFeed) SetDefaultAvailability(v ProductAvailabilityType) {
	o.DefaultAvailability.Set(&v)
}

func (o CatalogsRetailFeed) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CatalogsRetailFeed) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["created_at"] = o.CreatedAt
	toSerialize["id"] = o.Id
	toSerialize["updated_at"] = o.UpdatedAt
	toSerialize["name"] = o.Name.Get()
	toSerialize["format"] = o.Format
	toSerialize["catalog_type"] = o.CatalogType
	toSerialize["credentials"] = o.Credentials.Get()
	toSerialize["location"] = o.Location
	toSerialize["preferred_processing_schedule"] = o.PreferredProcessingSchedule.Get()
	toSerialize["status"] = o.Status
	toSerialize["default_currency"] = o.DefaultCurrency.Get()
	toSerialize["default_locale"] = o.DefaultLocale
	toSerialize["default_country"] = o.DefaultCountry
	toSerialize["default_availability"] = o.DefaultAvailability.Get()
	return toSerialize, nil
}

func (o *CatalogsRetailFeed) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"created_at",
		"id",
		"updated_at",
		"name",
		"format",
		"catalog_type",
		"credentials",
		"location",
		"preferred_processing_schedule",
		"status",
		"default_currency",
		"default_locale",
		"default_country",
		"default_availability",
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

	varCatalogsRetailFeed := _CatalogsRetailFeed{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCatalogsRetailFeed)

	if err != nil {
		return err
	}

	*o = CatalogsRetailFeed(varCatalogsRetailFeed)

	return err
}

type NullableCatalogsRetailFeed struct {
	value *CatalogsRetailFeed
	isSet bool
}

func (v NullableCatalogsRetailFeed) Get() *CatalogsRetailFeed {
	return v.value
}

func (v *NullableCatalogsRetailFeed) Set(val *CatalogsRetailFeed) {
	v.value = val
	v.isSet = true
}

func (v NullableCatalogsRetailFeed) IsSet() bool {
	return v.isSet
}

func (v *NullableCatalogsRetailFeed) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCatalogsRetailFeed(val *CatalogsRetailFeed) *NullableCatalogsRetailFeed {
	return &NullableCatalogsRetailFeed{value: val, isSet: true}
}

func (v NullableCatalogsRetailFeed) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCatalogsRetailFeed) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


