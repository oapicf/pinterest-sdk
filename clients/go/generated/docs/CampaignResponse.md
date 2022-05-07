# CampaignResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Campaign ID. | 
**AdAccountId** | **string** | Campaign&#39;s Advertiser ID. | 
**Name** | Pointer to **string** | Campaign name. | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] [default to "ACTIVE"]
**LifetimeSpendCap** | Pointer to **NullableInt32** | Campaign total spending cap. | [optional] 
**DailySpendCap** | Pointer to **NullableInt32** | Campaign daily spending cap. | [optional] 
**OrderLineId** | Pointer to **NullableString** | Order line ID that appears on the invoice. | [optional] 
**TrackingUrls** | Pointer to [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**StartTime** | Pointer to **NullableInt32** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**EndTime** | Pointer to **NullableInt32** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**ObjectiveType** | Pointer to [**ObjectiveType**](ObjectiveType.md) |  | [optional] 
**CreatedTime** | Pointer to **int32** | Campaign creation time. Unix timestamp in seconds. | [optional] 
**UpdatedTime** | Pointer to **int32** | UTC timestamp. Last update time. | [optional] 
**Type** | Pointer to **string** | Always \&quot;campaign\&quot;. | [optional] 

## Methods

### NewCampaignResponse

`func NewCampaignResponse(id string, adAccountId string, ) *CampaignResponse`

NewCampaignResponse instantiates a new CampaignResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignResponseWithDefaults

`func NewCampaignResponseWithDefaults() *CampaignResponse`

NewCampaignResponseWithDefaults instantiates a new CampaignResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CampaignResponse) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CampaignResponse) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CampaignResponse) SetId(v string)`

SetId sets Id field to given value.


### GetAdAccountId

`func (o *CampaignResponse) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *CampaignResponse) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *CampaignResponse) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.


### GetName

`func (o *CampaignResponse) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CampaignResponse) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CampaignResponse) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CampaignResponse) HasName() bool`

HasName returns a boolean if a field has been set.

### GetStatus

`func (o *CampaignResponse) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CampaignResponse) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CampaignResponse) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CampaignResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetLifetimeSpendCap

`func (o *CampaignResponse) GetLifetimeSpendCap() int32`

GetLifetimeSpendCap returns the LifetimeSpendCap field if non-nil, zero value otherwise.

### GetLifetimeSpendCapOk

`func (o *CampaignResponse) GetLifetimeSpendCapOk() (*int32, bool)`

GetLifetimeSpendCapOk returns a tuple with the LifetimeSpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLifetimeSpendCap

`func (o *CampaignResponse) SetLifetimeSpendCap(v int32)`

SetLifetimeSpendCap sets LifetimeSpendCap field to given value.

### HasLifetimeSpendCap

`func (o *CampaignResponse) HasLifetimeSpendCap() bool`

HasLifetimeSpendCap returns a boolean if a field has been set.

### SetLifetimeSpendCapNil

`func (o *CampaignResponse) SetLifetimeSpendCapNil(b bool)`

 SetLifetimeSpendCapNil sets the value for LifetimeSpendCap to be an explicit nil

### UnsetLifetimeSpendCap
`func (o *CampaignResponse) UnsetLifetimeSpendCap()`

UnsetLifetimeSpendCap ensures that no value is present for LifetimeSpendCap, not even an explicit nil
### GetDailySpendCap

`func (o *CampaignResponse) GetDailySpendCap() int32`

GetDailySpendCap returns the DailySpendCap field if non-nil, zero value otherwise.

### GetDailySpendCapOk

`func (o *CampaignResponse) GetDailySpendCapOk() (*int32, bool)`

GetDailySpendCapOk returns a tuple with the DailySpendCap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDailySpendCap

`func (o *CampaignResponse) SetDailySpendCap(v int32)`

SetDailySpendCap sets DailySpendCap field to given value.

### HasDailySpendCap

`func (o *CampaignResponse) HasDailySpendCap() bool`

HasDailySpendCap returns a boolean if a field has been set.

### SetDailySpendCapNil

`func (o *CampaignResponse) SetDailySpendCapNil(b bool)`

 SetDailySpendCapNil sets the value for DailySpendCap to be an explicit nil

### UnsetDailySpendCap
`func (o *CampaignResponse) UnsetDailySpendCap()`

UnsetDailySpendCap ensures that no value is present for DailySpendCap, not even an explicit nil
### GetOrderLineId

`func (o *CampaignResponse) GetOrderLineId() string`

GetOrderLineId returns the OrderLineId field if non-nil, zero value otherwise.

### GetOrderLineIdOk

`func (o *CampaignResponse) GetOrderLineIdOk() (*string, bool)`

GetOrderLineIdOk returns a tuple with the OrderLineId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderLineId

`func (o *CampaignResponse) SetOrderLineId(v string)`

SetOrderLineId sets OrderLineId field to given value.

### HasOrderLineId

`func (o *CampaignResponse) HasOrderLineId() bool`

HasOrderLineId returns a boolean if a field has been set.

### SetOrderLineIdNil

`func (o *CampaignResponse) SetOrderLineIdNil(b bool)`

 SetOrderLineIdNil sets the value for OrderLineId to be an explicit nil

### UnsetOrderLineId
`func (o *CampaignResponse) UnsetOrderLineId()`

UnsetOrderLineId ensures that no value is present for OrderLineId, not even an explicit nil
### GetTrackingUrls

`func (o *CampaignResponse) GetTrackingUrls() TrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *CampaignResponse) GetTrackingUrlsOk() (*TrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *CampaignResponse) SetTrackingUrls(v TrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *CampaignResponse) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *CampaignResponse) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *CampaignResponse) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetStartTime

`func (o *CampaignResponse) GetStartTime() int32`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *CampaignResponse) GetStartTimeOk() (*int32, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *CampaignResponse) SetStartTime(v int32)`

SetStartTime sets StartTime field to given value.

### HasStartTime

`func (o *CampaignResponse) HasStartTime() bool`

HasStartTime returns a boolean if a field has been set.

### SetStartTimeNil

`func (o *CampaignResponse) SetStartTimeNil(b bool)`

 SetStartTimeNil sets the value for StartTime to be an explicit nil

### UnsetStartTime
`func (o *CampaignResponse) UnsetStartTime()`

UnsetStartTime ensures that no value is present for StartTime, not even an explicit nil
### GetEndTime

`func (o *CampaignResponse) GetEndTime() int32`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *CampaignResponse) GetEndTimeOk() (*int32, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *CampaignResponse) SetEndTime(v int32)`

SetEndTime sets EndTime field to given value.

### HasEndTime

`func (o *CampaignResponse) HasEndTime() bool`

HasEndTime returns a boolean if a field has been set.

### SetEndTimeNil

`func (o *CampaignResponse) SetEndTimeNil(b bool)`

 SetEndTimeNil sets the value for EndTime to be an explicit nil

### UnsetEndTime
`func (o *CampaignResponse) UnsetEndTime()`

UnsetEndTime ensures that no value is present for EndTime, not even an explicit nil
### GetObjectiveType

`func (o *CampaignResponse) GetObjectiveType() ObjectiveType`

GetObjectiveType returns the ObjectiveType field if non-nil, zero value otherwise.

### GetObjectiveTypeOk

`func (o *CampaignResponse) GetObjectiveTypeOk() (*ObjectiveType, bool)`

GetObjectiveTypeOk returns a tuple with the ObjectiveType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetObjectiveType

`func (o *CampaignResponse) SetObjectiveType(v ObjectiveType)`

SetObjectiveType sets ObjectiveType field to given value.

### HasObjectiveType

`func (o *CampaignResponse) HasObjectiveType() bool`

HasObjectiveType returns a boolean if a field has been set.

### GetCreatedTime

`func (o *CampaignResponse) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *CampaignResponse) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *CampaignResponse) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *CampaignResponse) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetUpdatedTime

`func (o *CampaignResponse) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *CampaignResponse) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *CampaignResponse) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *CampaignResponse) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.

### GetType

`func (o *CampaignResponse) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CampaignResponse) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CampaignResponse) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *CampaignResponse) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


