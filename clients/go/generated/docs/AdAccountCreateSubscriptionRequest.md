# AdAccountCreateSubscriptionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WebhookUrl** | **string** | Standard HTTPS webhook URL. | 
**LeadFormId** | Pointer to **string** | Lead form ID. | [optional] 
**PartnerAccessToken** | Pointer to **string** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**PartnerRefreshToken** | Pointer to **string** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 

## Methods

### NewAdAccountCreateSubscriptionRequest

`func NewAdAccountCreateSubscriptionRequest(webhookUrl string, ) *AdAccountCreateSubscriptionRequest`

NewAdAccountCreateSubscriptionRequest instantiates a new AdAccountCreateSubscriptionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdAccountCreateSubscriptionRequestWithDefaults

`func NewAdAccountCreateSubscriptionRequestWithDefaults() *AdAccountCreateSubscriptionRequest`

NewAdAccountCreateSubscriptionRequestWithDefaults instantiates a new AdAccountCreateSubscriptionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWebhookUrl

`func (o *AdAccountCreateSubscriptionRequest) GetWebhookUrl() string`

GetWebhookUrl returns the WebhookUrl field if non-nil, zero value otherwise.

### GetWebhookUrlOk

`func (o *AdAccountCreateSubscriptionRequest) GetWebhookUrlOk() (*string, bool)`

GetWebhookUrlOk returns a tuple with the WebhookUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebhookUrl

`func (o *AdAccountCreateSubscriptionRequest) SetWebhookUrl(v string)`

SetWebhookUrl sets WebhookUrl field to given value.


### GetLeadFormId

`func (o *AdAccountCreateSubscriptionRequest) GetLeadFormId() string`

GetLeadFormId returns the LeadFormId field if non-nil, zero value otherwise.

### GetLeadFormIdOk

`func (o *AdAccountCreateSubscriptionRequest) GetLeadFormIdOk() (*string, bool)`

GetLeadFormIdOk returns a tuple with the LeadFormId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeadFormId

`func (o *AdAccountCreateSubscriptionRequest) SetLeadFormId(v string)`

SetLeadFormId sets LeadFormId field to given value.

### HasLeadFormId

`func (o *AdAccountCreateSubscriptionRequest) HasLeadFormId() bool`

HasLeadFormId returns a boolean if a field has been set.

### GetPartnerAccessToken

`func (o *AdAccountCreateSubscriptionRequest) GetPartnerAccessToken() string`

GetPartnerAccessToken returns the PartnerAccessToken field if non-nil, zero value otherwise.

### GetPartnerAccessTokenOk

`func (o *AdAccountCreateSubscriptionRequest) GetPartnerAccessTokenOk() (*string, bool)`

GetPartnerAccessTokenOk returns a tuple with the PartnerAccessToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerAccessToken

`func (o *AdAccountCreateSubscriptionRequest) SetPartnerAccessToken(v string)`

SetPartnerAccessToken sets PartnerAccessToken field to given value.

### HasPartnerAccessToken

`func (o *AdAccountCreateSubscriptionRequest) HasPartnerAccessToken() bool`

HasPartnerAccessToken returns a boolean if a field has been set.

### GetPartnerRefreshToken

`func (o *AdAccountCreateSubscriptionRequest) GetPartnerRefreshToken() string`

GetPartnerRefreshToken returns the PartnerRefreshToken field if non-nil, zero value otherwise.

### GetPartnerRefreshTokenOk

`func (o *AdAccountCreateSubscriptionRequest) GetPartnerRefreshTokenOk() (*string, bool)`

GetPartnerRefreshTokenOk returns a tuple with the PartnerRefreshToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartnerRefreshToken

`func (o *AdAccountCreateSubscriptionRequest) SetPartnerRefreshToken(v string)`

SetPartnerRefreshToken sets PartnerRefreshToken field to given value.

### HasPartnerRefreshToken

`func (o *AdAccountCreateSubscriptionRequest) HasPartnerRefreshToken() bool`

HasPartnerRefreshToken returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


