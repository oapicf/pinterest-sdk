# DeleteAssetGroupResponseExceptionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | Pointer to **int32** | Error code associated with the error deleting asset group. | [optional] 
**Message** | Pointer to **string** | Error message associated with the error deleting asset group. | [optional] 
**AssetGroupId** | Pointer to **string** | Asset group id of the exception. | [optional] 

## Methods

### NewDeleteAssetGroupResponseExceptionsInner

`func NewDeleteAssetGroupResponseExceptionsInner() *DeleteAssetGroupResponseExceptionsInner`

NewDeleteAssetGroupResponseExceptionsInner instantiates a new DeleteAssetGroupResponseExceptionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeleteAssetGroupResponseExceptionsInnerWithDefaults

`func NewDeleteAssetGroupResponseExceptionsInnerWithDefaults() *DeleteAssetGroupResponseExceptionsInner`

NewDeleteAssetGroupResponseExceptionsInnerWithDefaults instantiates a new DeleteAssetGroupResponseExceptionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *DeleteAssetGroupResponseExceptionsInner) GetCode() int32`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *DeleteAssetGroupResponseExceptionsInner) GetCodeOk() (*int32, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *DeleteAssetGroupResponseExceptionsInner) SetCode(v int32)`

SetCode sets Code field to given value.

### HasCode

`func (o *DeleteAssetGroupResponseExceptionsInner) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetMessage

`func (o *DeleteAssetGroupResponseExceptionsInner) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *DeleteAssetGroupResponseExceptionsInner) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *DeleteAssetGroupResponseExceptionsInner) SetMessage(v string)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *DeleteAssetGroupResponseExceptionsInner) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetAssetGroupId

`func (o *DeleteAssetGroupResponseExceptionsInner) GetAssetGroupId() string`

GetAssetGroupId returns the AssetGroupId field if non-nil, zero value otherwise.

### GetAssetGroupIdOk

`func (o *DeleteAssetGroupResponseExceptionsInner) GetAssetGroupIdOk() (*string, bool)`

GetAssetGroupIdOk returns a tuple with the AssetGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetGroupId

`func (o *DeleteAssetGroupResponseExceptionsInner) SetAssetGroupId(v string)`

SetAssetGroupId sets AssetGroupId field to given value.

### HasAssetGroupId

`func (o *DeleteAssetGroupResponseExceptionsInner) HasAssetGroupId() bool`

HasAssetGroupId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


