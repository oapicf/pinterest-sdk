# SharedAudienceCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceId** | Pointer to **string** | Unique identifier of an audience | [optional] 
**OperationType** | Pointer to [**OperationType**](OperationType.md) |  | [optional] 

## Methods

### NewSharedAudienceCommon

`func NewSharedAudienceCommon() *SharedAudienceCommon`

NewSharedAudienceCommon instantiates a new SharedAudienceCommon object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSharedAudienceCommonWithDefaults

`func NewSharedAudienceCommonWithDefaults() *SharedAudienceCommon`

NewSharedAudienceCommonWithDefaults instantiates a new SharedAudienceCommon object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAudienceId

`func (o *SharedAudienceCommon) GetAudienceId() string`

GetAudienceId returns the AudienceId field if non-nil, zero value otherwise.

### GetAudienceIdOk

`func (o *SharedAudienceCommon) GetAudienceIdOk() (*string, bool)`

GetAudienceIdOk returns a tuple with the AudienceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAudienceId

`func (o *SharedAudienceCommon) SetAudienceId(v string)`

SetAudienceId sets AudienceId field to given value.

### HasAudienceId

`func (o *SharedAudienceCommon) HasAudienceId() bool`

HasAudienceId returns a boolean if a field has been set.

### GetOperationType

`func (o *SharedAudienceCommon) GetOperationType() OperationType`

GetOperationType returns the OperationType field if non-nil, zero value otherwise.

### GetOperationTypeOk

`func (o *SharedAudienceCommon) GetOperationTypeOk() (*OperationType, bool)`

GetOperationTypeOk returns a tuple with the OperationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperationType

`func (o *SharedAudienceCommon) SetOperationType(v OperationType)`

SetOperationType sets OperationType field to given value.

### HasOperationType

`func (o *SharedAudienceCommon) HasOperationType() bool`

HasOperationType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


