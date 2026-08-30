# ScheduleBatchUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeltaValue** | Pointer to [**ScheduleDeltaValue**](ScheduleDeltaValue.md) |  | [optional] 
**EndTimestamp** | Pointer to **int32** | Schedule end time. Unix timestamp in seconds. | [optional] 
**EntityId** | Pointer to **string** | entity ID. | [optional] 
**EntityType** | Pointer to [**AdAccountEntityType**](AdAccountEntityType.md) | Specify the entity_type to get summary information | [optional] 
**Id** | **string** |  | 
**Name** | Pointer to **string** | Schedule name. | [optional] 
**ScheduleAction** | Pointer to [**ScheduleAction**](ScheduleAction.md) | The schedule action. | [optional] 
**ScheduleId** | **string** | Schedule ID. | 
**ScheduleStatus** | Pointer to [**ScheduleStatus**](ScheduleStatus.md) | Schedule status. | [optional] 
**ScheduleType** | Pointer to [**ScheduleType**](ScheduleType.md) | The schedule type. | [optional] 
**StartTimestamp** | Pointer to **int32** | Schedule start time. Unix timestamp in seconds. | [optional] 

## Methods

### NewScheduleBatchUpdate

`func NewScheduleBatchUpdate(id string, scheduleId string, ) *ScheduleBatchUpdate`

NewScheduleBatchUpdate instantiates a new ScheduleBatchUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewScheduleBatchUpdateWithDefaults

`func NewScheduleBatchUpdateWithDefaults() *ScheduleBatchUpdate`

NewScheduleBatchUpdateWithDefaults instantiates a new ScheduleBatchUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDeltaValue

`func (o *ScheduleBatchUpdate) GetDeltaValue() ScheduleDeltaValue`

GetDeltaValue returns the DeltaValue field if non-nil, zero value otherwise.

### GetDeltaValueOk

`func (o *ScheduleBatchUpdate) GetDeltaValueOk() (*ScheduleDeltaValue, bool)`

GetDeltaValueOk returns a tuple with the DeltaValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeltaValue

`func (o *ScheduleBatchUpdate) SetDeltaValue(v ScheduleDeltaValue)`

SetDeltaValue sets DeltaValue field to given value.

### HasDeltaValue

`func (o *ScheduleBatchUpdate) HasDeltaValue() bool`

HasDeltaValue returns a boolean if a field has been set.

### GetEndTimestamp

`func (o *ScheduleBatchUpdate) GetEndTimestamp() int32`

GetEndTimestamp returns the EndTimestamp field if non-nil, zero value otherwise.

### GetEndTimestampOk

`func (o *ScheduleBatchUpdate) GetEndTimestampOk() (*int32, bool)`

GetEndTimestampOk returns a tuple with the EndTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTimestamp

`func (o *ScheduleBatchUpdate) SetEndTimestamp(v int32)`

SetEndTimestamp sets EndTimestamp field to given value.

### HasEndTimestamp

`func (o *ScheduleBatchUpdate) HasEndTimestamp() bool`

HasEndTimestamp returns a boolean if a field has been set.

### GetEntityId

`func (o *ScheduleBatchUpdate) GetEntityId() string`

GetEntityId returns the EntityId field if non-nil, zero value otherwise.

### GetEntityIdOk

`func (o *ScheduleBatchUpdate) GetEntityIdOk() (*string, bool)`

GetEntityIdOk returns a tuple with the EntityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityId

`func (o *ScheduleBatchUpdate) SetEntityId(v string)`

SetEntityId sets EntityId field to given value.

### HasEntityId

`func (o *ScheduleBatchUpdate) HasEntityId() bool`

HasEntityId returns a boolean if a field has been set.

### GetEntityType

`func (o *ScheduleBatchUpdate) GetEntityType() AdAccountEntityType`

GetEntityType returns the EntityType field if non-nil, zero value otherwise.

### GetEntityTypeOk

`func (o *ScheduleBatchUpdate) GetEntityTypeOk() (*AdAccountEntityType, bool)`

GetEntityTypeOk returns a tuple with the EntityType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityType

`func (o *ScheduleBatchUpdate) SetEntityType(v AdAccountEntityType)`

SetEntityType sets EntityType field to given value.

### HasEntityType

`func (o *ScheduleBatchUpdate) HasEntityType() bool`

HasEntityType returns a boolean if a field has been set.

### GetId

`func (o *ScheduleBatchUpdate) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ScheduleBatchUpdate) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ScheduleBatchUpdate) SetId(v string)`

SetId sets Id field to given value.


### GetName

`func (o *ScheduleBatchUpdate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ScheduleBatchUpdate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ScheduleBatchUpdate) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ScheduleBatchUpdate) HasName() bool`

HasName returns a boolean if a field has been set.

### GetScheduleAction

`func (o *ScheduleBatchUpdate) GetScheduleAction() ScheduleAction`

GetScheduleAction returns the ScheduleAction field if non-nil, zero value otherwise.

### GetScheduleActionOk

`func (o *ScheduleBatchUpdate) GetScheduleActionOk() (*ScheduleAction, bool)`

GetScheduleActionOk returns a tuple with the ScheduleAction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleAction

`func (o *ScheduleBatchUpdate) SetScheduleAction(v ScheduleAction)`

SetScheduleAction sets ScheduleAction field to given value.

### HasScheduleAction

`func (o *ScheduleBatchUpdate) HasScheduleAction() bool`

HasScheduleAction returns a boolean if a field has been set.

### GetScheduleId

`func (o *ScheduleBatchUpdate) GetScheduleId() string`

GetScheduleId returns the ScheduleId field if non-nil, zero value otherwise.

### GetScheduleIdOk

`func (o *ScheduleBatchUpdate) GetScheduleIdOk() (*string, bool)`

GetScheduleIdOk returns a tuple with the ScheduleId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleId

`func (o *ScheduleBatchUpdate) SetScheduleId(v string)`

SetScheduleId sets ScheduleId field to given value.


### GetScheduleStatus

`func (o *ScheduleBatchUpdate) GetScheduleStatus() ScheduleStatus`

GetScheduleStatus returns the ScheduleStatus field if non-nil, zero value otherwise.

### GetScheduleStatusOk

`func (o *ScheduleBatchUpdate) GetScheduleStatusOk() (*ScheduleStatus, bool)`

GetScheduleStatusOk returns a tuple with the ScheduleStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleStatus

`func (o *ScheduleBatchUpdate) SetScheduleStatus(v ScheduleStatus)`

SetScheduleStatus sets ScheduleStatus field to given value.

### HasScheduleStatus

`func (o *ScheduleBatchUpdate) HasScheduleStatus() bool`

HasScheduleStatus returns a boolean if a field has been set.

### GetScheduleType

`func (o *ScheduleBatchUpdate) GetScheduleType() ScheduleType`

GetScheduleType returns the ScheduleType field if non-nil, zero value otherwise.

### GetScheduleTypeOk

`func (o *ScheduleBatchUpdate) GetScheduleTypeOk() (*ScheduleType, bool)`

GetScheduleTypeOk returns a tuple with the ScheduleType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleType

`func (o *ScheduleBatchUpdate) SetScheduleType(v ScheduleType)`

SetScheduleType sets ScheduleType field to given value.

### HasScheduleType

`func (o *ScheduleBatchUpdate) HasScheduleType() bool`

HasScheduleType returns a boolean if a field has been set.

### GetStartTimestamp

`func (o *ScheduleBatchUpdate) GetStartTimestamp() int32`

GetStartTimestamp returns the StartTimestamp field if non-nil, zero value otherwise.

### GetStartTimestampOk

`func (o *ScheduleBatchUpdate) GetStartTimestampOk() (*int32, bool)`

GetStartTimestampOk returns a tuple with the StartTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTimestamp

`func (o *ScheduleBatchUpdate) SetStartTimestamp(v int32)`

SetStartTimestamp sets StartTimestamp field to given value.

### HasStartTimestamp

`func (o *ScheduleBatchUpdate) HasStartTimestamp() bool`

HasStartTimestamp returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


