# CustomerListRecordRow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | Pointer to **string** | Email address (plain or hashed with SHA1, SHA256, or MD5). | [optional] 
**ExternalId** | Pointer to **string** | External ID identifier (not hashed). | [optional] 
**HashedPhoneNumber** | Pointer to **string** | Hashed phone number (hashed with SHA1, SHA256, or MD5). | [optional] 
**HashedPinnerId** | Pointer to **string** | Hashed pinner ID (hashed with SHA1, SHA256, or MD5). | [optional] 
**IpAddress** | Pointer to **string** | IP address (not hashed). | [optional] 
**LiverampEnvelope** | Pointer to **string** | LiveRamp envelope identifier (Base64-encoded, not hashed). | [optional] 
**Maid** | Pointer to **string** | Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5). | [optional] 
**UserAgent** | Pointer to **string** | User agent string (not hashed). | [optional] 

## Methods

### NewCustomerListRecordRow

`func NewCustomerListRecordRow() *CustomerListRecordRow`

NewCustomerListRecordRow instantiates a new CustomerListRecordRow object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCustomerListRecordRowWithDefaults

`func NewCustomerListRecordRowWithDefaults() *CustomerListRecordRow`

NewCustomerListRecordRowWithDefaults instantiates a new CustomerListRecordRow object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmail

`func (o *CustomerListRecordRow) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *CustomerListRecordRow) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *CustomerListRecordRow) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *CustomerListRecordRow) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### GetExternalId

`func (o *CustomerListRecordRow) GetExternalId() string`

GetExternalId returns the ExternalId field if non-nil, zero value otherwise.

### GetExternalIdOk

`func (o *CustomerListRecordRow) GetExternalIdOk() (*string, bool)`

GetExternalIdOk returns a tuple with the ExternalId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalId

`func (o *CustomerListRecordRow) SetExternalId(v string)`

SetExternalId sets ExternalId field to given value.

### HasExternalId

`func (o *CustomerListRecordRow) HasExternalId() bool`

HasExternalId returns a boolean if a field has been set.

### GetHashedPhoneNumber

`func (o *CustomerListRecordRow) GetHashedPhoneNumber() string`

GetHashedPhoneNumber returns the HashedPhoneNumber field if non-nil, zero value otherwise.

### GetHashedPhoneNumberOk

`func (o *CustomerListRecordRow) GetHashedPhoneNumberOk() (*string, bool)`

GetHashedPhoneNumberOk returns a tuple with the HashedPhoneNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHashedPhoneNumber

`func (o *CustomerListRecordRow) SetHashedPhoneNumber(v string)`

SetHashedPhoneNumber sets HashedPhoneNumber field to given value.

### HasHashedPhoneNumber

`func (o *CustomerListRecordRow) HasHashedPhoneNumber() bool`

HasHashedPhoneNumber returns a boolean if a field has been set.

### GetHashedPinnerId

`func (o *CustomerListRecordRow) GetHashedPinnerId() string`

GetHashedPinnerId returns the HashedPinnerId field if non-nil, zero value otherwise.

### GetHashedPinnerIdOk

`func (o *CustomerListRecordRow) GetHashedPinnerIdOk() (*string, bool)`

GetHashedPinnerIdOk returns a tuple with the HashedPinnerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHashedPinnerId

`func (o *CustomerListRecordRow) SetHashedPinnerId(v string)`

SetHashedPinnerId sets HashedPinnerId field to given value.

### HasHashedPinnerId

`func (o *CustomerListRecordRow) HasHashedPinnerId() bool`

HasHashedPinnerId returns a boolean if a field has been set.

### GetIpAddress

`func (o *CustomerListRecordRow) GetIpAddress() string`

GetIpAddress returns the IpAddress field if non-nil, zero value otherwise.

### GetIpAddressOk

`func (o *CustomerListRecordRow) GetIpAddressOk() (*string, bool)`

GetIpAddressOk returns a tuple with the IpAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIpAddress

`func (o *CustomerListRecordRow) SetIpAddress(v string)`

SetIpAddress sets IpAddress field to given value.

### HasIpAddress

`func (o *CustomerListRecordRow) HasIpAddress() bool`

HasIpAddress returns a boolean if a field has been set.

### GetLiverampEnvelope

`func (o *CustomerListRecordRow) GetLiverampEnvelope() string`

GetLiverampEnvelope returns the LiverampEnvelope field if non-nil, zero value otherwise.

### GetLiverampEnvelopeOk

`func (o *CustomerListRecordRow) GetLiverampEnvelopeOk() (*string, bool)`

GetLiverampEnvelopeOk returns a tuple with the LiverampEnvelope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLiverampEnvelope

`func (o *CustomerListRecordRow) SetLiverampEnvelope(v string)`

SetLiverampEnvelope sets LiverampEnvelope field to given value.

### HasLiverampEnvelope

`func (o *CustomerListRecordRow) HasLiverampEnvelope() bool`

HasLiverampEnvelope returns a boolean if a field has been set.

### GetMaid

`func (o *CustomerListRecordRow) GetMaid() string`

GetMaid returns the Maid field if non-nil, zero value otherwise.

### GetMaidOk

`func (o *CustomerListRecordRow) GetMaidOk() (*string, bool)`

GetMaidOk returns a tuple with the Maid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaid

`func (o *CustomerListRecordRow) SetMaid(v string)`

SetMaid sets Maid field to given value.

### HasMaid

`func (o *CustomerListRecordRow) HasMaid() bool`

HasMaid returns a boolean if a field has been set.

### GetUserAgent

`func (o *CustomerListRecordRow) GetUserAgent() string`

GetUserAgent returns the UserAgent field if non-nil, zero value otherwise.

### GetUserAgentOk

`func (o *CustomerListRecordRow) GetUserAgentOk() (*string, bool)`

GetUserAgentOk returns a tuple with the UserAgent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserAgent

`func (o *CustomerListRecordRow) SetUserAgent(v string)`

SetUserAgent sets UserAgent field to given value.

### HasUserAgent

`func (o *CustomerListRecordRow) HasUserAgent() bool`

HasUserAgent returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


