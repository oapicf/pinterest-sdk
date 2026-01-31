# LeadSubscriptionPostParamsCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LeadFormId** | Pointer to **string** | Lead form ID. | [optional] 
**WebhookUrl** | **string** | Standard HTTPS webhook URL. | 
**PartnerAccessToken** | Pointer to **string** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**PartnerMetadata** | Pointer to [**LeadSubscriptionPostParamsCreateAllOfPartnerMetadata**](LeadSubscriptionPostParamsCreateAllOfPartnerMetadata.md) |  | [optional] 
**PartnerRefreshToken** | Pointer to **string** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 

## Methods

### NewLeadSubscriptionPostParamsCreate

`func NewLeadSubscriptionPostParamsCreate(webhookUrl string, ) *LeadSubscriptionPostParamsCreate`

NewLeadSubscriptionPostParamsCreate instantiates a new LeadSubscriptionPostParamsCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLeadSubscriptionPostParamsCreateWithDefaults

`func NewLeadSubscriptionPostParamsCreateWithDefaults() *LeadSubscriptionPostParamsCreate`

NewLeadSubscriptionPostParamsCreateWithDefaults instantiates a new LeadSubscriptionPostParamsCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLeadFormId

`func (o *LeadSubscriptionPostParamsCreate) GetLeadFormId() string`

GetLeadFormId returns the LeadFormId field if non-nil, zero value otherwise.

### GetLeadFormIdOk

`func (o *LeadSubscriptionPostParamsCreate) GetLeadFormIdOk() (*string, bool)`

GetLeadFormIdOk returns a tuple with the LeadFormId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeadFormId

`func (o *LeadSubscriptionPostParamsCreate) SetLeadFormId(v string)`

SetLeadFormId sets LeadFormId field to given value.

### HasLeadFormId

`func (o *LeadSubscriptionPostParamsCreate) HasLeadFormId() bool`

HasLeadFormId returns a boolean if a field has been set.

### GetWebhookUrl

`func (o *LeadSubscriptionPostParamsCreate) GetWebhookUrl() string`

GetWebhookUrl returns the WebhookUrl field if non-nil, zero value otherwise.

### GetWebhookUrlOk

`func (o *LeadSubscriptionPostParamsCreate) GetWebhookUrlOk() (*string, bool)`

GetWebhookUrlOk returns a tuple with the WebhookUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebhookUrl

`func (o *LeadSubscriptionPostParamsCreate) SetWebhookUrl(v string)`

SetWebhookUrl sets WebhookUrl field to given value.


### GetPartnerAccessToken

`func (o *LeadSubscriptionPostParamsCreate) GetPartnerAccessToken() string`

GetPartnerAccessToken returns the PartnerAccessToken field if non-nil, zero value otherwise.

### GetPartnerAccessTokenOk

`func (o *LeadSubscriptionPostParamsCreate) GetPartnerAccessTokenOk() (*string, bool)`

GetPartnerAccessTokenOk returns a tuple with the PartnerAccessToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerAccessToken

`func (o *LeadSubscriptionPostParamsCreate) SetPartnerAccessToken(v string)`

SetPartnerAccessToken sets PartnerAccessToken field to given value.

### HasPartnerAccessToken

`func (o *LeadSubscriptionPostParamsCreate) HasPartnerAccessToken() bool`

HasPartnerAccessToken returns a boolean if a field has been set.

### GetPartnerMetadata

`func (o *LeadSubscriptionPostParamsCreate) GetPartnerMetadata() LeadSubscriptionPostParamsCreateAllOfPartnerMetadata`

GetPartnerMetadata returns the PartnerMetadata field if non-nil, zero value otherwise.

### GetPartnerMetadataOk

`func (o *LeadSubscriptionPostParamsCreate) GetPartnerMetadataOk() (*LeadSubscriptionPostParamsCreateAllOfPartnerMetadata, bool)`

GetPartnerMetadataOk returns a tuple with the PartnerMetadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerMetadata

`func (o *LeadSubscriptionPostParamsCreate) SetPartnerMetadata(v LeadSubscriptionPostParamsCreateAllOfPartnerMetadata)`

SetPartnerMetadata sets PartnerMetadata field to given value.

### HasPartnerMetadata

`func (o *LeadSubscriptionPostParamsCreate) HasPartnerMetadata() bool`

HasPartnerMetadata returns a boolean if a field has been set.

### GetPartnerRefreshToken

`func (o *LeadSubscriptionPostParamsCreate) GetPartnerRefreshToken() string`

GetPartnerRefreshToken returns the PartnerRefreshToken field if non-nil, zero value otherwise.

### GetPartnerRefreshTokenOk

`func (o *LeadSubscriptionPostParamsCreate) GetPartnerRefreshTokenOk() (*string, bool)`

GetPartnerRefreshTokenOk returns a tuple with the PartnerRefreshToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerRefreshToken

`func (o *LeadSubscriptionPostParamsCreate) SetPartnerRefreshToken(v string)`

SetPartnerRefreshToken sets PartnerRefreshToken field to given value.

### HasPartnerRefreshToken

`func (o *LeadSubscriptionPostParamsCreate) HasPartnerRefreshToken() bool`

HasPartnerRefreshToken returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


