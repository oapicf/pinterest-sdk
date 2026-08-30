# SchedulesCreate200ResponseInnerDataOneOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**ScheduleId** | **string** | Schedule ID. | 
**Exceptions** | [**PinterestLibError**](PinterestLibError.md) |  | 

## Methods

### NewSchedulesCreate200ResponseInnerDataOneOf

`func NewSchedulesCreate200ResponseInnerDataOneOf(id string, scheduleId string, exceptions PinterestLibError, ) *SchedulesCreate200ResponseInnerDataOneOf`

NewSchedulesCreate200ResponseInnerDataOneOf instantiates a new SchedulesCreate200ResponseInnerDataOneOf object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSchedulesCreate200ResponseInnerDataOneOfWithDefaults

`func NewSchedulesCreate200ResponseInnerDataOneOfWithDefaults() *SchedulesCreate200ResponseInnerDataOneOf`

NewSchedulesCreate200ResponseInnerDataOneOfWithDefaults instantiates a new SchedulesCreate200ResponseInnerDataOneOf object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *SchedulesCreate200ResponseInnerDataOneOf) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *SchedulesCreate200ResponseInnerDataOneOf) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *SchedulesCreate200ResponseInnerDataOneOf) SetId(v string)`

SetId sets Id field to given value.


### GetScheduleId

`func (o *SchedulesCreate200ResponseInnerDataOneOf) GetScheduleId() string`

GetScheduleId returns the ScheduleId field if non-nil, zero value otherwise.

### GetScheduleIdOk

`func (o *SchedulesCreate200ResponseInnerDataOneOf) GetScheduleIdOk() (*string, bool)`

GetScheduleIdOk returns a tuple with the ScheduleId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleId

`func (o *SchedulesCreate200ResponseInnerDataOneOf) SetScheduleId(v string)`

SetScheduleId sets ScheduleId field to given value.


### GetExceptions

`func (o *SchedulesCreate200ResponseInnerDataOneOf) GetExceptions() PinterestLibError`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *SchedulesCreate200ResponseInnerDataOneOf) GetExceptionsOk() (*PinterestLibError, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *SchedulesCreate200ResponseInnerDataOneOf) SetExceptions(v PinterestLibError)`

SetExceptions sets Exceptions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


