# PinsSaveRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BoardId** | Pointer to **NullableString** | Unique identifier of the board to which the pin will be saved. | [optional] 
**BoardSectionId** | Pointer to **NullableString** | Unique identifier of the board section to which the pin will be saved. | [optional] 

## Methods

### NewPinsSaveRequest

`func NewPinsSaveRequest() *PinsSaveRequest`

NewPinsSaveRequest instantiates a new PinsSaveRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPinsSaveRequestWithDefaults

`func NewPinsSaveRequestWithDefaults() *PinsSaveRequest`

NewPinsSaveRequestWithDefaults instantiates a new PinsSaveRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBoardId

`func (o *PinsSaveRequest) GetBoardId() string`

GetBoardId returns the BoardId field if non-nil, zero value otherwise.

### GetBoardIdOk

`func (o *PinsSaveRequest) GetBoardIdOk() (*string, bool)`

GetBoardIdOk returns a tuple with the BoardId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardId

`func (o *PinsSaveRequest) SetBoardId(v string)`

SetBoardId sets BoardId field to given value.

### HasBoardId

`func (o *PinsSaveRequest) HasBoardId() bool`

HasBoardId returns a boolean if a field has been set.

### SetBoardIdNil

`func (o *PinsSaveRequest) SetBoardIdNil(b bool)`

 SetBoardIdNil sets the value for BoardId to be an explicit nil

### UnsetBoardId
`func (o *PinsSaveRequest) UnsetBoardId()`

UnsetBoardId ensures that no value is present for BoardId, not even an explicit nil
### GetBoardSectionId

`func (o *PinsSaveRequest) GetBoardSectionId() string`

GetBoardSectionId returns the BoardSectionId field if non-nil, zero value otherwise.

### GetBoardSectionIdOk

`func (o *PinsSaveRequest) GetBoardSectionIdOk() (*string, bool)`

GetBoardSectionIdOk returns a tuple with the BoardSectionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardSectionId

`func (o *PinsSaveRequest) SetBoardSectionId(v string)`

SetBoardSectionId sets BoardSectionId field to given value.

### HasBoardSectionId

`func (o *PinsSaveRequest) HasBoardSectionId() bool`

HasBoardSectionId returns a boolean if a field has been set.

### SetBoardSectionIdNil

`func (o *PinsSaveRequest) SetBoardSectionIdNil(b bool)`

 SetBoardSectionIdNil sets the value for BoardSectionId to be an explicit nil

### UnsetBoardSectionId
`func (o *PinsSaveRequest) UnsetBoardSectionId()`

UnsetBoardSectionId ensures that no value is present for BoardSectionId, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


