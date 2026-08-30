# ScheduleUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntityId** | Pointer to **string** |  | [optional] 
**EntityType** | Pointer to **string** | Entity type | [optional] 
**Id** | **string** | Schedule ID. | 
**DeltaValue** | Pointer to [**ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  | [optional] 
**EndTimestamp** | Pointer to **int32** | Schedule end time. Unix timestamp in seconds. | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**ScheduleAction** | Pointer to [**ScheduleAction**](ScheduleAction.md) |  | [optional] 
**ScheduleStatus** | Pointer to [**ScheduleStatus**](ScheduleStatus.md) |  | [optional] 
**ScheduleType** | Pointer to [**ScheduleType**](ScheduleType.md) |  | [optional] 
**StartTimestamp** | Pointer to **int32** | Schedule start time. Unix timestamp in seconds. | [optional] 

## Methods

### NewScheduleUpdateRequest

`func NewScheduleUpdateRequest(id string, ) *ScheduleUpdateRequest`

NewScheduleUpdateRequest instantiates a new ScheduleUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewScheduleUpdateRequestWithDefaults

`func NewScheduleUpdateRequestWithDefaults() *ScheduleUpdateRequest`

NewScheduleUpdateRequestWithDefaults instantiates a new ScheduleUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntityId

`func (o *ScheduleUpdateRequest) GetEntityId() string`

GetEntityId returns the EntityId field if non-nil, zero value otherwise.

### GetEntityIdOk

`func (o *ScheduleUpdateRequest) GetEntityIdOk() (*string, bool)`

GetEntityIdOk returns a tuple with the EntityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityId

`func (o *ScheduleUpdateRequest) SetEntityId(v string)`

SetEntityId sets EntityId field to given value.

### HasEntityId

`func (o *ScheduleUpdateRequest) HasEntityId() bool`

HasEntityId returns a boolean if a field has been set.

### GetEntityType

`func (o *ScheduleUpdateRequest) GetEntityType() string`

GetEntityType returns the EntityType field if non-nil, zero value otherwise.

### GetEntityTypeOk

`func (o *ScheduleUpdateRequest) GetEntityTypeOk() (*string, bool)`

GetEntityTypeOk returns a tuple with the EntityType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityType

`func (o *ScheduleUpdateRequest) SetEntityType(v string)`

SetEntityType sets EntityType field to given value.

### HasEntityType

`func (o *ScheduleUpdateRequest) HasEntityType() bool`

HasEntityType returns a boolean if a field has been set.

### GetId

`func (o *ScheduleUpdateRequest) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ScheduleUpdateRequest) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ScheduleUpdateRequest) SetId(v string)`

SetId sets Id field to given value.


### GetDeltaValue

`func (o *ScheduleUpdateRequest) GetDeltaValue() ScheduleCommonDeltaValue`

GetDeltaValue returns the DeltaValue field if non-nil, zero value otherwise.

### GetDeltaValueOk

`func (o *ScheduleUpdateRequest) GetDeltaValueOk() (*ScheduleCommonDeltaValue, bool)`

GetDeltaValueOk returns a tuple with the DeltaValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeltaValue

`func (o *ScheduleUpdateRequest) SetDeltaValue(v ScheduleCommonDeltaValue)`

SetDeltaValue sets DeltaValue field to given value.

### HasDeltaValue

`func (o *ScheduleUpdateRequest) HasDeltaValue() bool`

HasDeltaValue returns a boolean if a field has been set.

### GetEndTimestamp

`func (o *ScheduleUpdateRequest) GetEndTimestamp() int32`

GetEndTimestamp returns the EndTimestamp field if non-nil, zero value otherwise.

### GetEndTimestampOk

`func (o *ScheduleUpdateRequest) GetEndTimestampOk() (*int32, bool)`

GetEndTimestampOk returns a tuple with the EndTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTimestamp

`func (o *ScheduleUpdateRequest) SetEndTimestamp(v int32)`

SetEndTimestamp sets EndTimestamp field to given value.

### HasEndTimestamp

`func (o *ScheduleUpdateRequest) HasEndTimestamp() bool`

HasEndTimestamp returns a boolean if a field has been set.

### GetName

`func (o *ScheduleUpdateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ScheduleUpdateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ScheduleUpdateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ScheduleUpdateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetScheduleAction

`func (o *ScheduleUpdateRequest) GetScheduleAction() ScheduleAction`

GetScheduleAction returns the ScheduleAction field if non-nil, zero value otherwise.

### GetScheduleActionOk

`func (o *ScheduleUpdateRequest) GetScheduleActionOk() (*ScheduleAction, bool)`

GetScheduleActionOk returns a tuple with the ScheduleAction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleAction

`func (o *ScheduleUpdateRequest) SetScheduleAction(v ScheduleAction)`

SetScheduleAction sets ScheduleAction field to given value.

### HasScheduleAction

`func (o *ScheduleUpdateRequest) HasScheduleAction() bool`

HasScheduleAction returns a boolean if a field has been set.

### GetScheduleStatus

`func (o *ScheduleUpdateRequest) GetScheduleStatus() ScheduleStatus`

GetScheduleStatus returns the ScheduleStatus field if non-nil, zero value otherwise.

### GetScheduleStatusOk

`func (o *ScheduleUpdateRequest) GetScheduleStatusOk() (*ScheduleStatus, bool)`

GetScheduleStatusOk returns a tuple with the ScheduleStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleStatus

`func (o *ScheduleUpdateRequest) SetScheduleStatus(v ScheduleStatus)`

SetScheduleStatus sets ScheduleStatus field to given value.

### HasScheduleStatus

`func (o *ScheduleUpdateRequest) HasScheduleStatus() bool`

HasScheduleStatus returns a boolean if a field has been set.

### GetScheduleType

`func (o *ScheduleUpdateRequest) GetScheduleType() ScheduleType`

GetScheduleType returns the ScheduleType field if non-nil, zero value otherwise.

### GetScheduleTypeOk

`func (o *ScheduleUpdateRequest) GetScheduleTypeOk() (*ScheduleType, bool)`

GetScheduleTypeOk returns a tuple with the ScheduleType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleType

`func (o *ScheduleUpdateRequest) SetScheduleType(v ScheduleType)`

SetScheduleType sets ScheduleType field to given value.

### HasScheduleType

`func (o *ScheduleUpdateRequest) HasScheduleType() bool`

HasScheduleType returns a boolean if a field has been set.

### GetStartTimestamp

`func (o *ScheduleUpdateRequest) GetStartTimestamp() int32`

GetStartTimestamp returns the StartTimestamp field if non-nil, zero value otherwise.

### GetStartTimestampOk

`func (o *ScheduleUpdateRequest) GetStartTimestampOk() (*int32, bool)`

GetStartTimestampOk returns a tuple with the StartTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTimestamp

`func (o *ScheduleUpdateRequest) SetStartTimestamp(v int32)`

SetStartTimestamp sets StartTimestamp field to given value.

### HasStartTimestamp

`func (o *ScheduleUpdateRequest) HasStartTimestamp() bool`

HasStartTimestamp returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


