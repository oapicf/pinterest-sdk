# ScheduleCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntityId** | **string** |  | 
**EntityType** | **string** | Entity type | 
**DeltaValue** | [**ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  | 
**EndTimestamp** | **int32** | Schedule end time. Unix timestamp in seconds. | 
**Name** | **string** |  | 
**ScheduleAction** | [**ScheduleAction**](ScheduleAction.md) |  | 
**ScheduleStatus** | [**ScheduleStatus**](ScheduleStatus.md) |  | 
**ScheduleType** | [**ScheduleType**](ScheduleType.md) |  | 
**StartTimestamp** | **int32** | Schedule start time. Unix timestamp in seconds. | 

## Methods

### NewScheduleCreateRequest

`func NewScheduleCreateRequest(entityId string, entityType string, deltaValue ScheduleCommonDeltaValue, endTimestamp int32, name string, scheduleAction ScheduleAction, scheduleStatus ScheduleStatus, scheduleType ScheduleType, startTimestamp int32, ) *ScheduleCreateRequest`

NewScheduleCreateRequest instantiates a new ScheduleCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewScheduleCreateRequestWithDefaults

`func NewScheduleCreateRequestWithDefaults() *ScheduleCreateRequest`

NewScheduleCreateRequestWithDefaults instantiates a new ScheduleCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntityId

`func (o *ScheduleCreateRequest) GetEntityId() string`

GetEntityId returns the EntityId field if non-nil, zero value otherwise.

### GetEntityIdOk

`func (o *ScheduleCreateRequest) GetEntityIdOk() (*string, bool)`

GetEntityIdOk returns a tuple with the EntityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityId

`func (o *ScheduleCreateRequest) SetEntityId(v string)`

SetEntityId sets EntityId field to given value.


### GetEntityType

`func (o *ScheduleCreateRequest) GetEntityType() string`

GetEntityType returns the EntityType field if non-nil, zero value otherwise.

### GetEntityTypeOk

`func (o *ScheduleCreateRequest) GetEntityTypeOk() (*string, bool)`

GetEntityTypeOk returns a tuple with the EntityType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntityType

`func (o *ScheduleCreateRequest) SetEntityType(v string)`

SetEntityType sets EntityType field to given value.


### GetDeltaValue

`func (o *ScheduleCreateRequest) GetDeltaValue() ScheduleCommonDeltaValue`

GetDeltaValue returns the DeltaValue field if non-nil, zero value otherwise.

### GetDeltaValueOk

`func (o *ScheduleCreateRequest) GetDeltaValueOk() (*ScheduleCommonDeltaValue, bool)`

GetDeltaValueOk returns a tuple with the DeltaValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeltaValue

`func (o *ScheduleCreateRequest) SetDeltaValue(v ScheduleCommonDeltaValue)`

SetDeltaValue sets DeltaValue field to given value.


### GetEndTimestamp

`func (o *ScheduleCreateRequest) GetEndTimestamp() int32`

GetEndTimestamp returns the EndTimestamp field if non-nil, zero value otherwise.

### GetEndTimestampOk

`func (o *ScheduleCreateRequest) GetEndTimestampOk() (*int32, bool)`

GetEndTimestampOk returns a tuple with the EndTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTimestamp

`func (o *ScheduleCreateRequest) SetEndTimestamp(v int32)`

SetEndTimestamp sets EndTimestamp field to given value.


### GetName

`func (o *ScheduleCreateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ScheduleCreateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ScheduleCreateRequest) SetName(v string)`

SetName sets Name field to given value.


### GetScheduleAction

`func (o *ScheduleCreateRequest) GetScheduleAction() ScheduleAction`

GetScheduleAction returns the ScheduleAction field if non-nil, zero value otherwise.

### GetScheduleActionOk

`func (o *ScheduleCreateRequest) GetScheduleActionOk() (*ScheduleAction, bool)`

GetScheduleActionOk returns a tuple with the ScheduleAction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleAction

`func (o *ScheduleCreateRequest) SetScheduleAction(v ScheduleAction)`

SetScheduleAction sets ScheduleAction field to given value.


### GetScheduleStatus

`func (o *ScheduleCreateRequest) GetScheduleStatus() ScheduleStatus`

GetScheduleStatus returns the ScheduleStatus field if non-nil, zero value otherwise.

### GetScheduleStatusOk

`func (o *ScheduleCreateRequest) GetScheduleStatusOk() (*ScheduleStatus, bool)`

GetScheduleStatusOk returns a tuple with the ScheduleStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleStatus

`func (o *ScheduleCreateRequest) SetScheduleStatus(v ScheduleStatus)`

SetScheduleStatus sets ScheduleStatus field to given value.


### GetScheduleType

`func (o *ScheduleCreateRequest) GetScheduleType() ScheduleType`

GetScheduleType returns the ScheduleType field if non-nil, zero value otherwise.

### GetScheduleTypeOk

`func (o *ScheduleCreateRequest) GetScheduleTypeOk() (*ScheduleType, bool)`

GetScheduleTypeOk returns a tuple with the ScheduleType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleType

`func (o *ScheduleCreateRequest) SetScheduleType(v ScheduleType)`

SetScheduleType sets ScheduleType field to given value.


### GetStartTimestamp

`func (o *ScheduleCreateRequest) GetStartTimestamp() int32`

GetStartTimestamp returns the StartTimestamp field if non-nil, zero value otherwise.

### GetStartTimestampOk

`func (o *ScheduleCreateRequest) GetStartTimestampOk() (*int32, bool)`

GetStartTimestampOk returns a tuple with the StartTimestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTimestamp

`func (o *ScheduleCreateRequest) SetStartTimestamp(v int32)`

SetStartTimestamp sets StartTimestamp field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


