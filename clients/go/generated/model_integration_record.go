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

// checks if the IntegrationRecord type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &IntegrationRecord{}

// IntegrationRecord Integration record
type IntegrationRecord struct {
	Id *string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`
	ExternalBusinessId NullableString `json:"external_business_id,omitempty"`
	ConnectedMerchantId NullableString `json:"connected_merchant_id,omitempty"`
	ConnectedUserId *string `json:"connected_user_id,omitempty"`
	ConnectedAdvertiserId NullableString `json:"connected_advertiser_id,omitempty"`
	ConnectedLbaId NullableString `json:"connected_lba_id,omitempty"`
	ConnectedTagId NullableString `json:"connected_tag_id,omitempty"`
	PartnerAccessToken NullableString `json:"partner_access_token,omitempty"`
	PartnerRefreshToken NullableString `json:"partner_refresh_token,omitempty"`
	PartnerPrimaryEmail NullableString `json:"partner_primary_email,omitempty"`
	PartnerAccessTokenExpiry NullableInt32 `json:"partner_access_token_expiry,omitempty"`
	PartnerRefreshTokenExpiry NullableInt32 `json:"partner_refresh_token_expiry,omitempty"`
	Scopes NullableString `json:"scopes,omitempty"`
	PartnerMetadata NullableString `json:"partner_metadata,omitempty"`
	AdditionalId1 NullableString `json:"additional_id_1,omitempty"`
	CreatedTime *int32 `json:"created_time,omitempty"`
	UpdatedTime *int32 `json:"updated_time,omitempty"`
}

// NewIntegrationRecord instantiates a new IntegrationRecord object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewIntegrationRecord() *IntegrationRecord {
	this := IntegrationRecord{}
	return &this
}

// NewIntegrationRecordWithDefaults instantiates a new IntegrationRecord object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewIntegrationRecordWithDefaults() *IntegrationRecord {
	this := IntegrationRecord{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *IntegrationRecord) GetId() string {
	if o == nil || IsNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IntegrationRecord) GetIdOk() (*string, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *IntegrationRecord) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *IntegrationRecord) SetId(v string) {
	o.Id = &v
}

// GetExternalBusinessId returns the ExternalBusinessId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IntegrationRecord) GetExternalBusinessId() string {
	if o == nil || IsNil(o.ExternalBusinessId.Get()) {
		var ret string
		return ret
	}
	return *o.ExternalBusinessId.Get()
}

// GetExternalBusinessIdOk returns a tuple with the ExternalBusinessId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IntegrationRecord) GetExternalBusinessIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.ExternalBusinessId.Get(), o.ExternalBusinessId.IsSet()
}

// HasExternalBusinessId returns a boolean if a field has been set.
func (o *IntegrationRecord) HasExternalBusinessId() bool {
	if o != nil && o.ExternalBusinessId.IsSet() {
		return true
	}

	return false
}

// SetExternalBusinessId gets a reference to the given NullableString and assigns it to the ExternalBusinessId field.
func (o *IntegrationRecord) SetExternalBusinessId(v string) {
	o.ExternalBusinessId.Set(&v)
}
// SetExternalBusinessIdNil sets the value for ExternalBusinessId to be an explicit nil
func (o *IntegrationRecord) SetExternalBusinessIdNil() {
	o.ExternalBusinessId.Set(nil)
}

// UnsetExternalBusinessId ensures that no value is present for ExternalBusinessId, not even an explicit nil
func (o *IntegrationRecord) UnsetExternalBusinessId() {
	o.ExternalBusinessId.Unset()
}

// GetConnectedMerchantId returns the ConnectedMerchantId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IntegrationRecord) GetConnectedMerchantId() string {
	if o == nil || IsNil(o.ConnectedMerchantId.Get()) {
		var ret string
		return ret
	}
	return *o.ConnectedMerchantId.Get()
}

// GetConnectedMerchantIdOk returns a tuple with the ConnectedMerchantId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IntegrationRecord) GetConnectedMerchantIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.ConnectedMerchantId.Get(), o.ConnectedMerchantId.IsSet()
}

// HasConnectedMerchantId returns a boolean if a field has been set.
func (o *IntegrationRecord) HasConnectedMerchantId() bool {
	if o != nil && o.ConnectedMerchantId.IsSet() {
		return true
	}

	return false
}

// SetConnectedMerchantId gets a reference to the given NullableString and assigns it to the ConnectedMerchantId field.
func (o *IntegrationRecord) SetConnectedMerchantId(v string) {
	o.ConnectedMerchantId.Set(&v)
}
// SetConnectedMerchantIdNil sets the value for ConnectedMerchantId to be an explicit nil
func (o *IntegrationRecord) SetConnectedMerchantIdNil() {
	o.ConnectedMerchantId.Set(nil)
}

// UnsetConnectedMerchantId ensures that no value is present for ConnectedMerchantId, not even an explicit nil
func (o *IntegrationRecord) UnsetConnectedMerchantId() {
	o.ConnectedMerchantId.Unset()
}

// GetConnectedUserId returns the ConnectedUserId field value if set, zero value otherwise.
func (o *IntegrationRecord) GetConnectedUserId() string {
	if o == nil || IsNil(o.ConnectedUserId) {
		var ret string
		return ret
	}
	return *o.ConnectedUserId
}

// GetConnectedUserIdOk returns a tuple with the ConnectedUserId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IntegrationRecord) GetConnectedUserIdOk() (*string, bool) {
	if o == nil || IsNil(o.ConnectedUserId) {
		return nil, false
	}
	return o.ConnectedUserId, true
}

// HasConnectedUserId returns a boolean if a field has been set.
func (o *IntegrationRecord) HasConnectedUserId() bool {
	if o != nil && !IsNil(o.ConnectedUserId) {
		return true
	}

	return false
}

// SetConnectedUserId gets a reference to the given string and assigns it to the ConnectedUserId field.
func (o *IntegrationRecord) SetConnectedUserId(v string) {
	o.ConnectedUserId = &v
}

// GetConnectedAdvertiserId returns the ConnectedAdvertiserId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IntegrationRecord) GetConnectedAdvertiserId() string {
	if o == nil || IsNil(o.ConnectedAdvertiserId.Get()) {
		var ret string
		return ret
	}
	return *o.ConnectedAdvertiserId.Get()
}

// GetConnectedAdvertiserIdOk returns a tuple with the ConnectedAdvertiserId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IntegrationRecord) GetConnectedAdvertiserIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.ConnectedAdvertiserId.Get(), o.ConnectedAdvertiserId.IsSet()
}

// HasConnectedAdvertiserId returns a boolean if a field has been set.
func (o *IntegrationRecord) HasConnectedAdvertiserId() bool {
	if o != nil && o.ConnectedAdvertiserId.IsSet() {
		return true
	}

	return false
}

// SetConnectedAdvertiserId gets a reference to the given NullableString and assigns it to the ConnectedAdvertiserId field.
func (o *IntegrationRecord) SetConnectedAdvertiserId(v string) {
	o.ConnectedAdvertiserId.Set(&v)
}
// SetConnectedAdvertiserIdNil sets the value for ConnectedAdvertiserId to be an explicit nil
func (o *IntegrationRecord) SetConnectedAdvertiserIdNil() {
	o.ConnectedAdvertiserId.Set(nil)
}

// UnsetConnectedAdvertiserId ensures that no value is present for ConnectedAdvertiserId, not even an explicit nil
func (o *IntegrationRecord) UnsetConnectedAdvertiserId() {
	o.ConnectedAdvertiserId.Unset()
}

// GetConnectedLbaId returns the ConnectedLbaId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IntegrationRecord) GetConnectedLbaId() string {
	if o == nil || IsNil(o.ConnectedLbaId.Get()) {
		var ret string
		return ret
	}
	return *o.ConnectedLbaId.Get()
}

// GetConnectedLbaIdOk returns a tuple with the ConnectedLbaId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IntegrationRecord) GetConnectedLbaIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.ConnectedLbaId.Get(), o.ConnectedLbaId.IsSet()
}

// HasConnectedLbaId returns a boolean if a field has been set.
func (o *IntegrationRecord) HasConnectedLbaId() bool {
	if o != nil && o.ConnectedLbaId.IsSet() {
		return true
	}

	return false
}

// SetConnectedLbaId gets a reference to the given NullableString and assigns it to the ConnectedLbaId field.
func (o *IntegrationRecord) SetConnectedLbaId(v string) {
	o.ConnectedLbaId.Set(&v)
}
// SetConnectedLbaIdNil sets the value for ConnectedLbaId to be an explicit nil
func (o *IntegrationRecord) SetConnectedLbaIdNil() {
	o.ConnectedLbaId.Set(nil)
}

// UnsetConnectedLbaId ensures that no value is present for ConnectedLbaId, not even an explicit nil
func (o *IntegrationRecord) UnsetConnectedLbaId() {
	o.ConnectedLbaId.Unset()
}

// GetConnectedTagId returns the ConnectedTagId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IntegrationRecord) GetConnectedTagId() string {
	if o == nil || IsNil(o.ConnectedTagId.Get()) {
		var ret string
		return ret
	}
	return *o.ConnectedTagId.Get()
}

// GetConnectedTagIdOk returns a tuple with the ConnectedTagId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IntegrationRecord) GetConnectedTagIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.ConnectedTagId.Get(), o.ConnectedTagId.IsSet()
}

// HasConnectedTagId returns a boolean if a field has been set.
func (o *IntegrationRecord) HasConnectedTagId() bool {
	if o != nil && o.ConnectedTagId.IsSet() {
		return true
	}

	return false
}

// SetConnectedTagId gets a reference to the given NullableString and assigns it to the ConnectedTagId field.
func (o *IntegrationRecord) SetConnectedTagId(v string) {
	o.ConnectedTagId.Set(&v)
}
// SetConnectedTagIdNil sets the value for ConnectedTagId to be an explicit nil
func (o *IntegrationRecord) SetConnectedTagIdNil() {
	o.ConnectedTagId.Set(nil)
}

// UnsetConnectedTagId ensures that no value is present for ConnectedTagId, not even an explicit nil
func (o *IntegrationRecord) UnsetConnectedTagId() {
	o.ConnectedTagId.Unset()
}

// GetPartnerAccessToken returns the PartnerAccessToken field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IntegrationRecord) GetPartnerAccessToken() string {
	if o == nil || IsNil(o.PartnerAccessToken.Get()) {
		var ret string
		return ret
	}
	return *o.PartnerAccessToken.Get()
}

// GetPartnerAccessTokenOk returns a tuple with the PartnerAccessToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IntegrationRecord) GetPartnerAccessTokenOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.PartnerAccessToken.Get(), o.PartnerAccessToken.IsSet()
}

// HasPartnerAccessToken returns a boolean if a field has been set.
func (o *IntegrationRecord) HasPartnerAccessToken() bool {
	if o != nil && o.PartnerAccessToken.IsSet() {
		return true
	}

	return false
}

// SetPartnerAccessToken gets a reference to the given NullableString and assigns it to the PartnerAccessToken field.
func (o *IntegrationRecord) SetPartnerAccessToken(v string) {
	o.PartnerAccessToken.Set(&v)
}
// SetPartnerAccessTokenNil sets the value for PartnerAccessToken to be an explicit nil
func (o *IntegrationRecord) SetPartnerAccessTokenNil() {
	o.PartnerAccessToken.Set(nil)
}

// UnsetPartnerAccessToken ensures that no value is present for PartnerAccessToken, not even an explicit nil
func (o *IntegrationRecord) UnsetPartnerAccessToken() {
	o.PartnerAccessToken.Unset()
}

// GetPartnerRefreshToken returns the PartnerRefreshToken field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IntegrationRecord) GetPartnerRefreshToken() string {
	if o == nil || IsNil(o.PartnerRefreshToken.Get()) {
		var ret string
		return ret
	}
	return *o.PartnerRefreshToken.Get()
}

// GetPartnerRefreshTokenOk returns a tuple with the PartnerRefreshToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IntegrationRecord) GetPartnerRefreshTokenOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.PartnerRefreshToken.Get(), o.PartnerRefreshToken.IsSet()
}

// HasPartnerRefreshToken returns a boolean if a field has been set.
func (o *IntegrationRecord) HasPartnerRefreshToken() bool {
	if o != nil && o.PartnerRefreshToken.IsSet() {
		return true
	}

	return false
}

// SetPartnerRefreshToken gets a reference to the given NullableString and assigns it to the PartnerRefreshToken field.
func (o *IntegrationRecord) SetPartnerRefreshToken(v string) {
	o.PartnerRefreshToken.Set(&v)
}
// SetPartnerRefreshTokenNil sets the value for PartnerRefreshToken to be an explicit nil
func (o *IntegrationRecord) SetPartnerRefreshTokenNil() {
	o.PartnerRefreshToken.Set(nil)
}

// UnsetPartnerRefreshToken ensures that no value is present for PartnerRefreshToken, not even an explicit nil
func (o *IntegrationRecord) UnsetPartnerRefreshToken() {
	o.PartnerRefreshToken.Unset()
}

// GetPartnerPrimaryEmail returns the PartnerPrimaryEmail field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IntegrationRecord) GetPartnerPrimaryEmail() string {
	if o == nil || IsNil(o.PartnerPrimaryEmail.Get()) {
		var ret string
		return ret
	}
	return *o.PartnerPrimaryEmail.Get()
}

// GetPartnerPrimaryEmailOk returns a tuple with the PartnerPrimaryEmail field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IntegrationRecord) GetPartnerPrimaryEmailOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.PartnerPrimaryEmail.Get(), o.PartnerPrimaryEmail.IsSet()
}

// HasPartnerPrimaryEmail returns a boolean if a field has been set.
func (o *IntegrationRecord) HasPartnerPrimaryEmail() bool {
	if o != nil && o.PartnerPrimaryEmail.IsSet() {
		return true
	}

	return false
}

// SetPartnerPrimaryEmail gets a reference to the given NullableString and assigns it to the PartnerPrimaryEmail field.
func (o *IntegrationRecord) SetPartnerPrimaryEmail(v string) {
	o.PartnerPrimaryEmail.Set(&v)
}
// SetPartnerPrimaryEmailNil sets the value for PartnerPrimaryEmail to be an explicit nil
func (o *IntegrationRecord) SetPartnerPrimaryEmailNil() {
	o.PartnerPrimaryEmail.Set(nil)
}

// UnsetPartnerPrimaryEmail ensures that no value is present for PartnerPrimaryEmail, not even an explicit nil
func (o *IntegrationRecord) UnsetPartnerPrimaryEmail() {
	o.PartnerPrimaryEmail.Unset()
}

// GetPartnerAccessTokenExpiry returns the PartnerAccessTokenExpiry field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IntegrationRecord) GetPartnerAccessTokenExpiry() int32 {
	if o == nil || IsNil(o.PartnerAccessTokenExpiry.Get()) {
		var ret int32
		return ret
	}
	return *o.PartnerAccessTokenExpiry.Get()
}

// GetPartnerAccessTokenExpiryOk returns a tuple with the PartnerAccessTokenExpiry field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IntegrationRecord) GetPartnerAccessTokenExpiryOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.PartnerAccessTokenExpiry.Get(), o.PartnerAccessTokenExpiry.IsSet()
}

// HasPartnerAccessTokenExpiry returns a boolean if a field has been set.
func (o *IntegrationRecord) HasPartnerAccessTokenExpiry() bool {
	if o != nil && o.PartnerAccessTokenExpiry.IsSet() {
		return true
	}

	return false
}

// SetPartnerAccessTokenExpiry gets a reference to the given NullableInt32 and assigns it to the PartnerAccessTokenExpiry field.
func (o *IntegrationRecord) SetPartnerAccessTokenExpiry(v int32) {
	o.PartnerAccessTokenExpiry.Set(&v)
}
// SetPartnerAccessTokenExpiryNil sets the value for PartnerAccessTokenExpiry to be an explicit nil
func (o *IntegrationRecord) SetPartnerAccessTokenExpiryNil() {
	o.PartnerAccessTokenExpiry.Set(nil)
}

// UnsetPartnerAccessTokenExpiry ensures that no value is present for PartnerAccessTokenExpiry, not even an explicit nil
func (o *IntegrationRecord) UnsetPartnerAccessTokenExpiry() {
	o.PartnerAccessTokenExpiry.Unset()
}

// GetPartnerRefreshTokenExpiry returns the PartnerRefreshTokenExpiry field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IntegrationRecord) GetPartnerRefreshTokenExpiry() int32 {
	if o == nil || IsNil(o.PartnerRefreshTokenExpiry.Get()) {
		var ret int32
		return ret
	}
	return *o.PartnerRefreshTokenExpiry.Get()
}

// GetPartnerRefreshTokenExpiryOk returns a tuple with the PartnerRefreshTokenExpiry field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IntegrationRecord) GetPartnerRefreshTokenExpiryOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.PartnerRefreshTokenExpiry.Get(), o.PartnerRefreshTokenExpiry.IsSet()
}

// HasPartnerRefreshTokenExpiry returns a boolean if a field has been set.
func (o *IntegrationRecord) HasPartnerRefreshTokenExpiry() bool {
	if o != nil && o.PartnerRefreshTokenExpiry.IsSet() {
		return true
	}

	return false
}

// SetPartnerRefreshTokenExpiry gets a reference to the given NullableInt32 and assigns it to the PartnerRefreshTokenExpiry field.
func (o *IntegrationRecord) SetPartnerRefreshTokenExpiry(v int32) {
	o.PartnerRefreshTokenExpiry.Set(&v)
}
// SetPartnerRefreshTokenExpiryNil sets the value for PartnerRefreshTokenExpiry to be an explicit nil
func (o *IntegrationRecord) SetPartnerRefreshTokenExpiryNil() {
	o.PartnerRefreshTokenExpiry.Set(nil)
}

// UnsetPartnerRefreshTokenExpiry ensures that no value is present for PartnerRefreshTokenExpiry, not even an explicit nil
func (o *IntegrationRecord) UnsetPartnerRefreshTokenExpiry() {
	o.PartnerRefreshTokenExpiry.Unset()
}

// GetScopes returns the Scopes field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IntegrationRecord) GetScopes() string {
	if o == nil || IsNil(o.Scopes.Get()) {
		var ret string
		return ret
	}
	return *o.Scopes.Get()
}

// GetScopesOk returns a tuple with the Scopes field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IntegrationRecord) GetScopesOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Scopes.Get(), o.Scopes.IsSet()
}

// HasScopes returns a boolean if a field has been set.
func (o *IntegrationRecord) HasScopes() bool {
	if o != nil && o.Scopes.IsSet() {
		return true
	}

	return false
}

// SetScopes gets a reference to the given NullableString and assigns it to the Scopes field.
func (o *IntegrationRecord) SetScopes(v string) {
	o.Scopes.Set(&v)
}
// SetScopesNil sets the value for Scopes to be an explicit nil
func (o *IntegrationRecord) SetScopesNil() {
	o.Scopes.Set(nil)
}

// UnsetScopes ensures that no value is present for Scopes, not even an explicit nil
func (o *IntegrationRecord) UnsetScopes() {
	o.Scopes.Unset()
}

// GetPartnerMetadata returns the PartnerMetadata field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IntegrationRecord) GetPartnerMetadata() string {
	if o == nil || IsNil(o.PartnerMetadata.Get()) {
		var ret string
		return ret
	}
	return *o.PartnerMetadata.Get()
}

// GetPartnerMetadataOk returns a tuple with the PartnerMetadata field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IntegrationRecord) GetPartnerMetadataOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.PartnerMetadata.Get(), o.PartnerMetadata.IsSet()
}

// HasPartnerMetadata returns a boolean if a field has been set.
func (o *IntegrationRecord) HasPartnerMetadata() bool {
	if o != nil && o.PartnerMetadata.IsSet() {
		return true
	}

	return false
}

// SetPartnerMetadata gets a reference to the given NullableString and assigns it to the PartnerMetadata field.
func (o *IntegrationRecord) SetPartnerMetadata(v string) {
	o.PartnerMetadata.Set(&v)
}
// SetPartnerMetadataNil sets the value for PartnerMetadata to be an explicit nil
func (o *IntegrationRecord) SetPartnerMetadataNil() {
	o.PartnerMetadata.Set(nil)
}

// UnsetPartnerMetadata ensures that no value is present for PartnerMetadata, not even an explicit nil
func (o *IntegrationRecord) UnsetPartnerMetadata() {
	o.PartnerMetadata.Unset()
}

// GetAdditionalId1 returns the AdditionalId1 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IntegrationRecord) GetAdditionalId1() string {
	if o == nil || IsNil(o.AdditionalId1.Get()) {
		var ret string
		return ret
	}
	return *o.AdditionalId1.Get()
}

// GetAdditionalId1Ok returns a tuple with the AdditionalId1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IntegrationRecord) GetAdditionalId1Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.AdditionalId1.Get(), o.AdditionalId1.IsSet()
}

// HasAdditionalId1 returns a boolean if a field has been set.
func (o *IntegrationRecord) HasAdditionalId1() bool {
	if o != nil && o.AdditionalId1.IsSet() {
		return true
	}

	return false
}

// SetAdditionalId1 gets a reference to the given NullableString and assigns it to the AdditionalId1 field.
func (o *IntegrationRecord) SetAdditionalId1(v string) {
	o.AdditionalId1.Set(&v)
}
// SetAdditionalId1Nil sets the value for AdditionalId1 to be an explicit nil
func (o *IntegrationRecord) SetAdditionalId1Nil() {
	o.AdditionalId1.Set(nil)
}

// UnsetAdditionalId1 ensures that no value is present for AdditionalId1, not even an explicit nil
func (o *IntegrationRecord) UnsetAdditionalId1() {
	o.AdditionalId1.Unset()
}

// GetCreatedTime returns the CreatedTime field value if set, zero value otherwise.
func (o *IntegrationRecord) GetCreatedTime() int32 {
	if o == nil || IsNil(o.CreatedTime) {
		var ret int32
		return ret
	}
	return *o.CreatedTime
}

// GetCreatedTimeOk returns a tuple with the CreatedTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IntegrationRecord) GetCreatedTimeOk() (*int32, bool) {
	if o == nil || IsNil(o.CreatedTime) {
		return nil, false
	}
	return o.CreatedTime, true
}

// HasCreatedTime returns a boolean if a field has been set.
func (o *IntegrationRecord) HasCreatedTime() bool {
	if o != nil && !IsNil(o.CreatedTime) {
		return true
	}

	return false
}

// SetCreatedTime gets a reference to the given int32 and assigns it to the CreatedTime field.
func (o *IntegrationRecord) SetCreatedTime(v int32) {
	o.CreatedTime = &v
}

// GetUpdatedTime returns the UpdatedTime field value if set, zero value otherwise.
func (o *IntegrationRecord) GetUpdatedTime() int32 {
	if o == nil || IsNil(o.UpdatedTime) {
		var ret int32
		return ret
	}
	return *o.UpdatedTime
}

// GetUpdatedTimeOk returns a tuple with the UpdatedTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IntegrationRecord) GetUpdatedTimeOk() (*int32, bool) {
	if o == nil || IsNil(o.UpdatedTime) {
		return nil, false
	}
	return o.UpdatedTime, true
}

// HasUpdatedTime returns a boolean if a field has been set.
func (o *IntegrationRecord) HasUpdatedTime() bool {
	if o != nil && !IsNil(o.UpdatedTime) {
		return true
	}

	return false
}

// SetUpdatedTime gets a reference to the given int32 and assigns it to the UpdatedTime field.
func (o *IntegrationRecord) SetUpdatedTime(v int32) {
	o.UpdatedTime = &v
}

func (o IntegrationRecord) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o IntegrationRecord) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if o.ExternalBusinessId.IsSet() {
		toSerialize["external_business_id"] = o.ExternalBusinessId.Get()
	}
	if o.ConnectedMerchantId.IsSet() {
		toSerialize["connected_merchant_id"] = o.ConnectedMerchantId.Get()
	}
	if !IsNil(o.ConnectedUserId) {
		toSerialize["connected_user_id"] = o.ConnectedUserId
	}
	if o.ConnectedAdvertiserId.IsSet() {
		toSerialize["connected_advertiser_id"] = o.ConnectedAdvertiserId.Get()
	}
	if o.ConnectedLbaId.IsSet() {
		toSerialize["connected_lba_id"] = o.ConnectedLbaId.Get()
	}
	if o.ConnectedTagId.IsSet() {
		toSerialize["connected_tag_id"] = o.ConnectedTagId.Get()
	}
	if o.PartnerAccessToken.IsSet() {
		toSerialize["partner_access_token"] = o.PartnerAccessToken.Get()
	}
	if o.PartnerRefreshToken.IsSet() {
		toSerialize["partner_refresh_token"] = o.PartnerRefreshToken.Get()
	}
	if o.PartnerPrimaryEmail.IsSet() {
		toSerialize["partner_primary_email"] = o.PartnerPrimaryEmail.Get()
	}
	if o.PartnerAccessTokenExpiry.IsSet() {
		toSerialize["partner_access_token_expiry"] = o.PartnerAccessTokenExpiry.Get()
	}
	if o.PartnerRefreshTokenExpiry.IsSet() {
		toSerialize["partner_refresh_token_expiry"] = o.PartnerRefreshTokenExpiry.Get()
	}
	if o.Scopes.IsSet() {
		toSerialize["scopes"] = o.Scopes.Get()
	}
	if o.PartnerMetadata.IsSet() {
		toSerialize["partner_metadata"] = o.PartnerMetadata.Get()
	}
	if o.AdditionalId1.IsSet() {
		toSerialize["additional_id_1"] = o.AdditionalId1.Get()
	}
	if !IsNil(o.CreatedTime) {
		toSerialize["created_time"] = o.CreatedTime
	}
	if !IsNil(o.UpdatedTime) {
		toSerialize["updated_time"] = o.UpdatedTime
	}
	return toSerialize, nil
}

type NullableIntegrationRecord struct {
	value *IntegrationRecord
	isSet bool
}

func (v NullableIntegrationRecord) Get() *IntegrationRecord {
	return v.value
}

func (v *NullableIntegrationRecord) Set(val *IntegrationRecord) {
	v.value = val
	v.isSet = true
}

func (v NullableIntegrationRecord) IsSet() bool {
	return v.isSet
}

func (v *NullableIntegrationRecord) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableIntegrationRecord(val *IntegrationRecord) *NullableIntegrationRecord {
	return &NullableIntegrationRecord{value: val, isSet: true}
}

func (v NullableIntegrationRecord) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableIntegrationRecord) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


