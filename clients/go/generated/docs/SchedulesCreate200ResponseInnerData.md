# SchedulesCreate200ResponseInnerData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeltaValue** | Pointer to [**ScheduleDeltaValue**](ScheduleDeltaValue.md) |  | [optional] 
**EndTimestamp** | Pointer to **int32** | Schedule end time. Unix timestamp in seconds. | [optional] 
**EntityId** | **string** | entity ID. | 
**EntityType** | Pointer to [**AdAccountEntityType**](AdAccountEntityType.md) | Specify the entity_type to get summary information | [optional] 
**Name** | Pointer to **string** | Schedule name. | [optional] 
**ScheduleAction** | Pointer to [**ScheduleAction**](ScheduleAction.md) | The schedule action. | [optional] 
**ScheduleId** | **string** | Schedule ID. | 
**ScheduleStatus** | Pointer to [**ScheduleStatus**](ScheduleStatus.md) | Schedule status. | [optional] 
**ScheduleType** | Pointer to [**ScheduleType**](ScheduleType.md) | The schedule type. | [optional] 
**StartTimestamp** | Pointer to **int32** | Schedule start time. Unix timestamp in seconds. | [optional] 
**Id** | **string** |  | 
**Exceptions** | [**PinterestLibError**](PinterestLibError.md) |  | 

## Methods

### NewSchedulesCreate200ResponseInnerData

`func NewSchedulesCreate200ResponseInnerData(entityId string, scheduleId string, id string, exceptions PinterestLibError, ) *SchedulesCreate200ResponseInnerData`

NewSchedulesCreate200ResponseInnerData instantiates a new SchedulesCreate200ResponseInnerData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSchedulesCreate200ResponseInnerDataWithDefaults

`func NewSchedulesCreate200ResponseInnerDataWithDefaults() *SchedulesCreate200ResponseInnerData`

NewSchedulesCreate200ResponseInnerDataWithDefaults instantiates a new SchedulesCreate200ResponseInnerData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDeltaValue

`func (o *SchedulesCreate200ResponseInnerData) GetDeltaValue() ScheduleDeltaValue`

GetDeltaValue returns the DeltaValue field if non-nil, zero value otherwise.

### GetDeltaValueOk

`func (o *SchedulesCreate200ResponseInnerData) GetDeltaValueOk() (*ScheduleDeltaValue, bool)`

GetDeltaValueOk returns a tuple with the DeltaValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeltaValue

`func (o *SchedulesCreate200ResponseInnerData) SetDeltaValue(v ScheduleDeltaValue)`

SetDeltaValue sets DeltaValue field to given value.

### HasDeltaValue

`func (o *SchedulesCreate200ResponseInnerData) HasDeltaValue() bool`

HasDeltaValue returns a boolean if a field has been set.

### GetEndTimestamp

`func (o *SchedulesCreate200ResponseInnerData) GetEndTimestamp() int32`

GetEndTimestamp returns the EndTimestamp field if non-nil, zero value otherwise.

### GetEndTimestampOk

`func (o *SchedulesCreate200ResponseInnerData) GetEndTimestampOk() (*int32, bool)`

GetEndTimestampOk returns a tuple with the EndTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTimestamp

`func (o *SchedulesCreate200ResponseInnerData) SetEndTimestamp(v int32)`

SetEndTimestamp sets EndTimestamp field to given value.

### HasEndTimestamp

`func (o *SchedulesCreate200ResponseInnerData) HasEndTimestamp() bool`

HasEndTimestamp returns a boolean if a field has been set.

### GetEntityId

`func (o *SchedulesCreate200ResponseInnerData) GetEntityId() string`

GetEntityId returns the EntityId field if non-nil, zero value otherwise.

### GetEntityIdOk

`func (o *SchedulesCreate200ResponseInnerData) GetEntityIdOk() (*string, bool)`

GetEntityIdOk returns a tuple with the EntityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityId

`func (o *SchedulesCreate200ResponseInnerData) SetEntityId(v string)`

SetEntityId sets EntityId field to given value.


### GetEntityType

`func (o *SchedulesCreate200ResponseInnerData) GetEntityType() AdAccountEntityType`

GetEntityType returns the EntityType field if non-nil, zero value otherwise.

### GetEntityTypeOk

`func (o *SchedulesCreate200ResponseInnerData) GetEntityTypeOk() (*AdAccountEntityType, bool)`

GetEntityTypeOk returns a tuple with the EntityType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityType

`func (o *SchedulesCreate200ResponseInnerData) SetEntityType(v AdAccountEntityType)`

SetEntityType sets EntityType field to given value.

### HasEntityType

`func (o *SchedulesCreate200ResponseInnerData) HasEntityType() bool`

HasEntityType returns a boolean if a field has been set.

### GetName

`func (o *SchedulesCreate200ResponseInnerData) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *SchedulesCreate200ResponseInnerData) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *SchedulesCreate200ResponseInnerData) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *SchedulesCreate200ResponseInnerData) HasName() bool`

HasName returns a boolean if a field has been set.

### GetScheduleAction

`func (o *SchedulesCreate200ResponseInnerData) GetScheduleAction() ScheduleAction`

GetScheduleAction returns the ScheduleAction field if non-nil, zero value otherwise.

### GetScheduleActionOk

`func (o *SchedulesCreate200ResponseInnerData) GetScheduleActionOk() (*ScheduleAction, bool)`

GetScheduleActionOk returns a tuple with the ScheduleAction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleAction

`func (o *SchedulesCreate200ResponseInnerData) SetScheduleAction(v ScheduleAction)`

SetScheduleAction sets ScheduleAction field to given value.

### HasScheduleAction

`func (o *SchedulesCreate200ResponseInnerData) HasScheduleAction() bool`

HasScheduleAction returns a boolean if a field has been set.

### GetScheduleId

`func (o *SchedulesCreate200ResponseInnerData) GetScheduleId() string`

GetScheduleId returns the ScheduleId field if non-nil, zero value otherwise.

### GetScheduleIdOk

`func (o *SchedulesCreate200ResponseInnerData) GetScheduleIdOk() (*string, bool)`

GetScheduleIdOk returns a tuple with the ScheduleId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleId

`func (o *SchedulesCreate200ResponseInnerData) SetScheduleId(v string)`

SetScheduleId sets ScheduleId field to given value.


### GetScheduleStatus

`func (o *SchedulesCreate200ResponseInnerData) GetScheduleStatus() ScheduleStatus`

GetScheduleStatus returns the ScheduleStatus field if non-nil, zero value otherwise.

### GetScheduleStatusOk

`func (o *SchedulesCreate200ResponseInnerData) GetScheduleStatusOk() (*ScheduleStatus, bool)`

GetScheduleStatusOk returns a tuple with the ScheduleStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleStatus

`func (o *SchedulesCreate200ResponseInnerData) SetScheduleStatus(v ScheduleStatus)`

SetScheduleStatus sets ScheduleStatus field to given value.

### HasScheduleStatus

`func (o *SchedulesCreate200ResponseInnerData) HasScheduleStatus() bool`

HasScheduleStatus returns a boolean if a field has been set.

### GetScheduleType

`func (o *SchedulesCreate200ResponseInnerData) GetScheduleType() ScheduleType`

GetScheduleType returns the ScheduleType field if non-nil, zero value otherwise.

### GetScheduleTypeOk

`func (o *SchedulesCreate200ResponseInnerData) GetScheduleTypeOk() (*ScheduleType, bool)`

GetScheduleTypeOk returns a tuple with the ScheduleType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleType

`func (o *SchedulesCreate200ResponseInnerData) SetScheduleType(v ScheduleType)`

SetScheduleType sets ScheduleType field to given value.

### HasScheduleType

`func (o *SchedulesCreate200ResponseInnerData) HasScheduleType() bool`

HasScheduleType returns a boolean if a field has been set.

### GetStartTimestamp

`func (o *SchedulesCreate200ResponseInnerData) GetStartTimestamp() int32`

GetStartTimestamp returns the StartTimestamp field if non-nil, zero value otherwise.

### GetStartTimestampOk

`func (o *SchedulesCreate200ResponseInnerData) GetStartTimestampOk() (*int32, bool)`

GetStartTimestampOk returns a tuple with the StartTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTimestamp

`func (o *SchedulesCreate200ResponseInnerData) SetStartTimestamp(v int32)`

SetStartTimestamp sets StartTimestamp field to given value.

### HasStartTimestamp

`func (o *SchedulesCreate200ResponseInnerData) HasStartTimestamp() bool`

HasStartTimestamp returns a boolean if a field has been set.

### GetId

`func (o *SchedulesCreate200ResponseInnerData) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *SchedulesCreate200ResponseInnerData) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *SchedulesCreate200ResponseInnerData) SetId(v string)`

SetId sets Id field to given value.


### GetExceptions

`func (o *SchedulesCreate200ResponseInnerData) GetExceptions() PinterestLibError`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *SchedulesCreate200ResponseInnerData) GetExceptionsOk() (*PinterestLibError, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *SchedulesCreate200ResponseInnerData) SetExceptions(v PinterestLibError)`

SetExceptions sets Exceptions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


