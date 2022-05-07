# AdGroupResponseAllOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | Pointer to **string** | Campaign ID of the ad group. | [optional] 
**BillableEvent** | Pointer to [**ActionType**](ActionType.md) |  | [optional] 
**Id** | Pointer to **string** | Ad group ID. | [optional] 
**Type** | Pointer to **string** | Always \&quot;adgroup\&quot;. | [optional] 
**AdAccountId** | Pointer to **string** | Advertiser ID. | [optional] 
**CreatedTime** | Pointer to **int32** | Ad group creation time. Unix timestamp in seconds. | [optional] 
**UpdatedTime** | Pointer to **int32** | Ad group last update time. Unix timestamp in seconds. | [optional] 

## Methods

### NewAdGroupResponseAllOf1

`func NewAdGroupResponseAllOf1() *AdGroupResponseAllOf1`

NewAdGroupResponseAllOf1 instantiates a new AdGroupResponseAllOf1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdGroupResponseAllOf1WithDefaults

`func NewAdGroupResponseAllOf1WithDefaults() *AdGroupResponseAllOf1`

NewAdGroupResponseAllOf1WithDefaults instantiates a new AdGroupResponseAllOf1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCampaignId

`func (o *AdGroupResponseAllOf1) GetCampaignId() string`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *AdGroupResponseAllOf1) GetCampaignIdOk() (*string, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *AdGroupResponseAllOf1) SetCampaignId(v string)`

SetCampaignId sets CampaignId field to given value.

### HasCampaignId

`func (o *AdGroupResponseAllOf1) HasCampaignId() bool`

HasCampaignId returns a boolean if a field has been set.

### GetBillableEvent

`func (o *AdGroupResponseAllOf1) GetBillableEvent() ActionType`

GetBillableEvent returns the BillableEvent field if non-nil, zero value otherwise.

### GetBillableEventOk

`func (o *AdGroupResponseAllOf1) GetBillableEventOk() (*ActionType, bool)`

GetBillableEventOk returns a tuple with the BillableEvent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBillableEvent

`func (o *AdGroupResponseAllOf1) SetBillableEvent(v ActionType)`

SetBillableEvent sets BillableEvent field to given value.

### HasBillableEvent

`func (o *AdGroupResponseAllOf1) HasBillableEvent() bool`

HasBillableEvent returns a boolean if a field has been set.

### GetId

`func (o *AdGroupResponseAllOf1) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AdGroupResponseAllOf1) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AdGroupResponseAllOf1) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AdGroupResponseAllOf1) HasId() bool`

HasId returns a boolean if a field has been set.

### GetType

`func (o *AdGroupResponseAllOf1) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *AdGroupResponseAllOf1) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *AdGroupResponseAllOf1) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *AdGroupResponseAllOf1) HasType() bool`

HasType returns a boolean if a field has been set.

### GetAdAccountId

`func (o *AdGroupResponseAllOf1) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *AdGroupResponseAllOf1) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *AdGroupResponseAllOf1) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.

### HasAdAccountId

`func (o *AdGroupResponseAllOf1) HasAdAccountId() bool`

HasAdAccountId returns a boolean if a field has been set.

### GetCreatedTime

`func (o *AdGroupResponseAllOf1) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *AdGroupResponseAllOf1) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *AdGroupResponseAllOf1) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *AdGroupResponseAllOf1) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetUpdatedTime

`func (o *AdGroupResponseAllOf1) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *AdGroupResponseAllOf1) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *AdGroupResponseAllOf1) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *AdGroupResponseAllOf1) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


