# LeadSubscriptionCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LeadFormId** | Pointer to **string** | Lead form ID. | [optional] 
**WebhookUrl** | **string** | Standard HTTPS webhook URL. | 

## Methods

### NewLeadSubscriptionCreate

`func NewLeadSubscriptionCreate(webhookUrl string, ) *LeadSubscriptionCreate`

NewLeadSubscriptionCreate instantiates a new LeadSubscriptionCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLeadSubscriptionCreateWithDefaults

`func NewLeadSubscriptionCreateWithDefaults() *LeadSubscriptionCreate`

NewLeadSubscriptionCreateWithDefaults instantiates a new LeadSubscriptionCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLeadFormId

`func (o *LeadSubscriptionCreate) GetLeadFormId() string`

GetLeadFormId returns the LeadFormId field if non-nil, zero value otherwise.

### GetLeadFormIdOk

`func (o *LeadSubscriptionCreate) GetLeadFormIdOk() (*string, bool)`

GetLeadFormIdOk returns a tuple with the LeadFormId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeadFormId

`func (o *LeadSubscriptionCreate) SetLeadFormId(v string)`

SetLeadFormId sets LeadFormId field to given value.

### HasLeadFormId

`func (o *LeadSubscriptionCreate) HasLeadFormId() bool`

HasLeadFormId returns a boolean if a field has been set.

### GetWebhookUrl

`func (o *LeadSubscriptionCreate) GetWebhookUrl() string`

GetWebhookUrl returns the WebhookUrl field if non-nil, zero value otherwise.

### GetWebhookUrlOk

`func (o *LeadSubscriptionCreate) GetWebhookUrlOk() (*string, bool)`

GetWebhookUrlOk returns a tuple with the WebhookUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebhookUrl

`func (o *LeadSubscriptionCreate) SetWebhookUrl(v string)`

SetWebhookUrl sets WebhookUrl field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


