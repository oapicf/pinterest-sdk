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
)

// checks if the AdAccountGetSubscriptionResponse type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AdAccountGetSubscriptionResponse{}

// AdAccountGetSubscriptionResponse struct for AdAccountGetSubscriptionResponse
type AdAccountGetSubscriptionResponse struct {
	// Lead form ID.
	LeadFormId NullableString `json:"lead_form_id,omitempty"`
	// Standard HTTPS webhook URL.
	WebhookUrl *string `json:"webhook_url,omitempty"`
	// Subscription ID.
	Id *string `json:"id,omitempty"`
	// User account used to subscribe lead data.
	UserAccountId *string `json:"user_account_id,omitempty"`
	// The Ad Account ID that this lead form belongs to.
	AdAccountId *string `json:"ad_account_id,omitempty"`
	// API version.
	ApiVersion *string `json:"api_version,omitempty"`
	// Base64 encoded key for client to decrypt lead data.
	CryptographicKey *string `json:"cryptographic_key,omitempty"`
	// Lead data encryption algorithm.
	CryptographicAlgorithm *string `json:"cryptographic_algorithm,omitempty"`
	// Lead form creation time. Unix timestamp in milliseconds.
	CreatedTime *int32 `json:"created_time,omitempty"`
}

// NewAdAccountGetSubscriptionResponse instantiates a new AdAccountGetSubscriptionResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdAccountGetSubscriptionResponse() *AdAccountGetSubscriptionResponse {
	this := AdAccountGetSubscriptionResponse{}
	return &this
}

// NewAdAccountGetSubscriptionResponseWithDefaults instantiates a new AdAccountGetSubscriptionResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdAccountGetSubscriptionResponseWithDefaults() *AdAccountGetSubscriptionResponse {
	this := AdAccountGetSubscriptionResponse{}
	return &this
}

// GetLeadFormId returns the LeadFormId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *AdAccountGetSubscriptionResponse) GetLeadFormId() string {
	if o == nil || IsNil(o.LeadFormId.Get()) {
		var ret string
		return ret
	}
	return *o.LeadFormId.Get()
}

// GetLeadFormIdOk returns a tuple with the LeadFormId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *AdAccountGetSubscriptionResponse) GetLeadFormIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.LeadFormId.Get(), o.LeadFormId.IsSet()
}

// HasLeadFormId returns a boolean if a field has been set.
func (o *AdAccountGetSubscriptionResponse) HasLeadFormId() bool {
	if o != nil && o.LeadFormId.IsSet() {
		return true
	}

	return false
}

// SetLeadFormId gets a reference to the given NullableString and assigns it to the LeadFormId field.
func (o *AdAccountGetSubscriptionResponse) SetLeadFormId(v string) {
	o.LeadFormId.Set(&v)
}
// SetLeadFormIdNil sets the value for LeadFormId to be an explicit nil
func (o *AdAccountGetSubscriptionResponse) SetLeadFormIdNil() {
	o.LeadFormId.Set(nil)
}

// UnsetLeadFormId ensures that no value is present for LeadFormId, not even an explicit nil
func (o *AdAccountGetSubscriptionResponse) UnsetLeadFormId() {
	o.LeadFormId.Unset()
}

// GetWebhookUrl returns the WebhookUrl field value if set, zero value otherwise.
func (o *AdAccountGetSubscriptionResponse) GetWebhookUrl() string {
	if o == nil || IsNil(o.WebhookUrl) {
		var ret string
		return ret
	}
	return *o.WebhookUrl
}

// GetWebhookUrlOk returns a tuple with the WebhookUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdAccountGetSubscriptionResponse) GetWebhookUrlOk() (*string, bool) {
	if o == nil || IsNil(o.WebhookUrl) {
		return nil, false
	}
	return o.WebhookUrl, true
}

// HasWebhookUrl returns a boolean if a field has been set.
func (o *AdAccountGetSubscriptionResponse) HasWebhookUrl() bool {
	if o != nil && !IsNil(o.WebhookUrl) {
		return true
	}

	return false
}

// SetWebhookUrl gets a reference to the given string and assigns it to the WebhookUrl field.
func (o *AdAccountGetSubscriptionResponse) SetWebhookUrl(v string) {
	o.WebhookUrl = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *AdAccountGetSubscriptionResponse) GetId() string {
	if o == nil || IsNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdAccountGetSubscriptionResponse) GetIdOk() (*string, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *AdAccountGetSubscriptionResponse) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *AdAccountGetSubscriptionResponse) SetId(v string) {
	o.Id = &v
}

// GetUserAccountId returns the UserAccountId field value if set, zero value otherwise.
func (o *AdAccountGetSubscriptionResponse) GetUserAccountId() string {
	if o == nil || IsNil(o.UserAccountId) {
		var ret string
		return ret
	}
	return *o.UserAccountId
}

// GetUserAccountIdOk returns a tuple with the UserAccountId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdAccountGetSubscriptionResponse) GetUserAccountIdOk() (*string, bool) {
	if o == nil || IsNil(o.UserAccountId) {
		return nil, false
	}
	return o.UserAccountId, true
}

// HasUserAccountId returns a boolean if a field has been set.
func (o *AdAccountGetSubscriptionResponse) HasUserAccountId() bool {
	if o != nil && !IsNil(o.UserAccountId) {
		return true
	}

	return false
}

// SetUserAccountId gets a reference to the given string and assigns it to the UserAccountId field.
func (o *AdAccountGetSubscriptionResponse) SetUserAccountId(v string) {
	o.UserAccountId = &v
}

// GetAdAccountId returns the AdAccountId field value if set, zero value otherwise.
func (o *AdAccountGetSubscriptionResponse) GetAdAccountId() string {
	if o == nil || IsNil(o.AdAccountId) {
		var ret string
		return ret
	}
	return *o.AdAccountId
}

// GetAdAccountIdOk returns a tuple with the AdAccountId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdAccountGetSubscriptionResponse) GetAdAccountIdOk() (*string, bool) {
	if o == nil || IsNil(o.AdAccountId) {
		return nil, false
	}
	return o.AdAccountId, true
}

// HasAdAccountId returns a boolean if a field has been set.
func (o *AdAccountGetSubscriptionResponse) HasAdAccountId() bool {
	if o != nil && !IsNil(o.AdAccountId) {
		return true
	}

	return false
}

// SetAdAccountId gets a reference to the given string and assigns it to the AdAccountId field.
func (o *AdAccountGetSubscriptionResponse) SetAdAccountId(v string) {
	o.AdAccountId = &v
}

// GetApiVersion returns the ApiVersion field value if set, zero value otherwise.
func (o *AdAccountGetSubscriptionResponse) GetApiVersion() string {
	if o == nil || IsNil(o.ApiVersion) {
		var ret string
		return ret
	}
	return *o.ApiVersion
}

// GetApiVersionOk returns a tuple with the ApiVersion field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdAccountGetSubscriptionResponse) GetApiVersionOk() (*string, bool) {
	if o == nil || IsNil(o.ApiVersion) {
		return nil, false
	}
	return o.ApiVersion, true
}

// HasApiVersion returns a boolean if a field has been set.
func (o *AdAccountGetSubscriptionResponse) HasApiVersion() bool {
	if o != nil && !IsNil(o.ApiVersion) {
		return true
	}

	return false
}

// SetApiVersion gets a reference to the given string and assigns it to the ApiVersion field.
func (o *AdAccountGetSubscriptionResponse) SetApiVersion(v string) {
	o.ApiVersion = &v
}

// GetCryptographicKey returns the CryptographicKey field value if set, zero value otherwise.
func (o *AdAccountGetSubscriptionResponse) GetCryptographicKey() string {
	if o == nil || IsNil(o.CryptographicKey) {
		var ret string
		return ret
	}
	return *o.CryptographicKey
}

// GetCryptographicKeyOk returns a tuple with the CryptographicKey field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdAccountGetSubscriptionResponse) GetCryptographicKeyOk() (*string, bool) {
	if o == nil || IsNil(o.CryptographicKey) {
		return nil, false
	}
	return o.CryptographicKey, true
}

// HasCryptographicKey returns a boolean if a field has been set.
func (o *AdAccountGetSubscriptionResponse) HasCryptographicKey() bool {
	if o != nil && !IsNil(o.CryptographicKey) {
		return true
	}

	return false
}

// SetCryptographicKey gets a reference to the given string and assigns it to the CryptographicKey field.
func (o *AdAccountGetSubscriptionResponse) SetCryptographicKey(v string) {
	o.CryptographicKey = &v
}

// GetCryptographicAlgorithm returns the CryptographicAlgorithm field value if set, zero value otherwise.
func (o *AdAccountGetSubscriptionResponse) GetCryptographicAlgorithm() string {
	if o == nil || IsNil(o.CryptographicAlgorithm) {
		var ret string
		return ret
	}
	return *o.CryptographicAlgorithm
}

// GetCryptographicAlgorithmOk returns a tuple with the CryptographicAlgorithm field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdAccountGetSubscriptionResponse) GetCryptographicAlgorithmOk() (*string, bool) {
	if o == nil || IsNil(o.CryptographicAlgorithm) {
		return nil, false
	}
	return o.CryptographicAlgorithm, true
}

// HasCryptographicAlgorithm returns a boolean if a field has been set.
func (o *AdAccountGetSubscriptionResponse) HasCryptographicAlgorithm() bool {
	if o != nil && !IsNil(o.CryptographicAlgorithm) {
		return true
	}

	return false
}

// SetCryptographicAlgorithm gets a reference to the given string and assigns it to the CryptographicAlgorithm field.
func (o *AdAccountGetSubscriptionResponse) SetCryptographicAlgorithm(v string) {
	o.CryptographicAlgorithm = &v
}

// GetCreatedTime returns the CreatedTime field value if set, zero value otherwise.
func (o *AdAccountGetSubscriptionResponse) GetCreatedTime() int32 {
	if o == nil || IsNil(o.CreatedTime) {
		var ret int32
		return ret
	}
	return *o.CreatedTime
}

// GetCreatedTimeOk returns a tuple with the CreatedTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AdAccountGetSubscriptionResponse) GetCreatedTimeOk() (*int32, bool) {
	if o == nil || IsNil(o.CreatedTime) {
		return nil, false
	}
	return o.CreatedTime, true
}

// HasCreatedTime returns a boolean if a field has been set.
func (o *AdAccountGetSubscriptionResponse) HasCreatedTime() bool {
	if o != nil && !IsNil(o.CreatedTime) {
		return true
	}

	return false
}

// SetCreatedTime gets a reference to the given int32 and assigns it to the CreatedTime field.
func (o *AdAccountGetSubscriptionResponse) SetCreatedTime(v int32) {
	o.CreatedTime = &v
}

func (o AdAccountGetSubscriptionResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AdAccountGetSubscriptionResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.LeadFormId.IsSet() {
		toSerialize["lead_form_id"] = o.LeadFormId.Get()
	}
	if !IsNil(o.WebhookUrl) {
		toSerialize["webhook_url"] = o.WebhookUrl
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.UserAccountId) {
		toSerialize["user_account_id"] = o.UserAccountId
	}
	if !IsNil(o.AdAccountId) {
		toSerialize["ad_account_id"] = o.AdAccountId
	}
	if !IsNil(o.ApiVersion) {
		toSerialize["api_version"] = o.ApiVersion
	}
	if !IsNil(o.CryptographicKey) {
		toSerialize["cryptographic_key"] = o.CryptographicKey
	}
	if !IsNil(o.CryptographicAlgorithm) {
		toSerialize["cryptographic_algorithm"] = o.CryptographicAlgorithm
	}
	if !IsNil(o.CreatedTime) {
		toSerialize["created_time"] = o.CreatedTime
	}
	return toSerialize, nil
}

type NullableAdAccountGetSubscriptionResponse struct {
	value *AdAccountGetSubscriptionResponse
	isSet bool
}

func (v NullableAdAccountGetSubscriptionResponse) Get() *AdAccountGetSubscriptionResponse {
	return v.value
}

func (v *NullableAdAccountGetSubscriptionResponse) Set(val *AdAccountGetSubscriptionResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableAdAccountGetSubscriptionResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableAdAccountGetSubscriptionResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdAccountGetSubscriptionResponse(val *AdAccountGetSubscriptionResponse) *NullableAdAccountGetSubscriptionResponse {
	return &NullableAdAccountGetSubscriptionResponse{value: val, isSet: true}
}

func (v NullableAdAccountGetSubscriptionResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdAccountGetSubscriptionResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

