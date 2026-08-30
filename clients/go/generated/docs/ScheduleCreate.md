# ScheduleCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeltaValue** | Pointer to [**ScheduleDeltaValue**](ScheduleDeltaValue.md) |  | [optional] 
**EndTimestamp** | Pointer to **int32** | Schedule end time. Unix timestamp in seconds. | [optional] 
**EntityId** | **string** | entity ID. | 
**EntityType** | Pointer to [**AdAccountEntityType**](AdAccountEntityType.md) | Specify the entity_type to get summary information | [optional] 
**Name** | Pointer to **string** | Schedule name. | [optional] 
**ScheduleAction** | Pointer to [**ScheduleAction**](ScheduleAction.md) | The schedule action. | [optional] 
**ScheduleStatus** | Pointer to [**ScheduleStatus**](ScheduleStatus.md) | Schedule status. | [optional] 
**ScheduleType** | Pointer to [**ScheduleType**](ScheduleType.md) | The schedule type. | [optional] 
**StartTimestamp** | Pointer to **int32** | Schedule start time. Unix timestamp in seconds. | [optional] 

## Methods

### NewScheduleCreate

`func NewScheduleCreate(entityId string, ) *ScheduleCreate`

NewScheduleCreate instantiates a new ScheduleCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewScheduleCreateWithDefaults

`func NewScheduleCreateWithDefaults() *ScheduleCreate`

NewScheduleCreateWithDefaults instantiates a new ScheduleCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDeltaValue

`func (o *ScheduleCreate) GetDeltaValue() ScheduleDeltaValue`

GetDeltaValue returns the DeltaValue field if non-nil, zero value otherwise.

### GetDeltaValueOk

`func (o *ScheduleCreate) GetDeltaValueOk() (*ScheduleDeltaValue, bool)`

GetDeltaValueOk returns a tuple with the DeltaValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeltaValue

`func (o *ScheduleCreate) SetDeltaValue(v ScheduleDeltaValue)`

SetDeltaValue sets DeltaValue field to given value.

### HasDeltaValue

`func (o *ScheduleCreate) HasDeltaValue() bool`

HasDeltaValue returns a boolean if a field has been set.

### GetEndTimestamp

`func (o *ScheduleCreate) GetEndTimestamp() int32`

GetEndTimestamp returns the EndTimestamp field if non-nil, zero value otherwise.

### GetEndTimestampOk

`func (o *ScheduleCreate) GetEndTimestampOk() (*int32, bool)`

GetEndTimestampOk returns a tuple with the EndTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTimestamp

`func (o *ScheduleCreate) SetEndTimestamp(v int32)`

SetEndTimestamp sets EndTimestamp field to given value.

### HasEndTimestamp

`func (o *ScheduleCreate) HasEndTimestamp() bool`

HasEndTimestamp returns a boolean if a field has been set.

### GetEntityId

`func (o *ScheduleCreate) GetEntityId() string`

GetEntityId returns the EntityId field if non-nil, zero value otherwise.

### GetEntityIdOk

`func (o *ScheduleCreate) GetEntityIdOk() (*string, bool)`

GetEntityIdOk returns a tuple with the EntityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityId

`func (o *ScheduleCreate) SetEntityId(v string)`

SetEntityId sets EntityId field to given value.


### GetEntityType

`func (o *ScheduleCreate) GetEntityType() AdAccountEntityType`

GetEntityType returns the EntityType field if non-nil, zero value otherwise.

### GetEntityTypeOk

`func (o *ScheduleCreate) GetEntityTypeOk() (*AdAccountEntityType, bool)`

GetEntityTypeOk returns a tuple with the EntityType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityType

`func (o *ScheduleCreate) SetEntityType(v AdAccountEntityType)`

SetEntityType sets EntityType field to given value.

### HasEntityType

`func (o *ScheduleCreate) HasEntityType() bool`

HasEntityType returns a boolean if a field has been set.

### GetName

`func (o *ScheduleCreate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ScheduleCreate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ScheduleCreate) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ScheduleCreate) HasName() bool`

HasName returns a boolean if a field has been set.

### GetScheduleAction

`func (o *ScheduleCreate) GetScheduleAction() ScheduleAction`

GetScheduleAction returns the ScheduleAction field if non-nil, zero value otherwise.

### GetScheduleActionOk

`func (o *ScheduleCreate) GetScheduleActionOk() (*ScheduleAction, bool)`

GetScheduleActionOk returns a tuple with the ScheduleAction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleAction

`func (o *ScheduleCreate) SetScheduleAction(v ScheduleAction)`

SetScheduleAction sets ScheduleAction field to given value.

### HasScheduleAction

`func (o *ScheduleCreate) HasScheduleAction() bool`

HasScheduleAction returns a boolean if a field has been set.

### GetScheduleStatus

`func (o *ScheduleCreate) GetScheduleStatus() ScheduleStatus`

GetScheduleStatus returns the ScheduleStatus field if non-nil, zero value otherwise.

### GetScheduleStatusOk

`func (o *ScheduleCreate) GetScheduleStatusOk() (*ScheduleStatus, bool)`

GetScheduleStatusOk returns a tuple with the ScheduleStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleStatus

`func (o *ScheduleCreate) SetScheduleStatus(v ScheduleStatus)`

SetScheduleStatus sets ScheduleStatus field to given value.

### HasScheduleStatus

`func (o *ScheduleCreate) HasScheduleStatus() bool`

HasScheduleStatus returns a boolean if a field has been set.

### GetScheduleType

`func (o *ScheduleCreate) GetScheduleType() ScheduleType`

GetScheduleType returns the ScheduleType field if non-nil, zero value otherwise.

### GetScheduleTypeOk

`func (o *ScheduleCreate) GetScheduleTypeOk() (*ScheduleType, bool)`

GetScheduleTypeOk returns a tuple with the ScheduleType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleType

`func (o *ScheduleCreate) SetScheduleType(v ScheduleType)`

SetScheduleType sets ScheduleType field to given value.

### HasScheduleType

`func (o *ScheduleCreate) HasScheduleType() bool`

HasScheduleType returns a boolean if a field has been set.

### GetStartTimestamp

`func (o *ScheduleCreate) GetStartTimestamp() int32`

GetStartTimestamp returns the StartTimestamp field if non-nil, zero value otherwise.

### GetStartTimestampOk

`func (o *ScheduleCreate) GetStartTimestampOk() (*int32, bool)`

GetStartTimestampOk returns a tuple with the StartTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTimestamp

`func (o *ScheduleCreate) SetStartTimestamp(v int32)`

SetStartTimestamp sets StartTimestamp field to given value.

### HasStartTimestamp

`func (o *ScheduleCreate) HasStartTimestamp() bool`

HasStartTimestamp returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


