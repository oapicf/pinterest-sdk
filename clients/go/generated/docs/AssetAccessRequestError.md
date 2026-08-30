# AssetAccessRequestError

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | Pointer to **int32** | Error code associated with the error in requesting asset access. | [optional] 
**Messages** | Pointer to **[]string** |  | [optional] 

## Methods

### NewAssetAccessRequestError

`func NewAssetAccessRequestError() *AssetAccessRequestError`

NewAssetAccessRequestError instantiates a new AssetAccessRequestError object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssetAccessRequestErrorWithDefaults

`func NewAssetAccessRequestErrorWithDefaults() *AssetAccessRequestError`

NewAssetAccessRequestErrorWithDefaults instantiates a new AssetAccessRequestError object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCode

`func (o *AssetAccessRequestError) GetCode() int32`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *AssetAccessRequestError) GetCodeOk() (*int32, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *AssetAccessRequestError) SetCode(v int32)`

SetCode sets Code field to given value.

### HasCode

`func (o *AssetAccessRequestError) HasCode() bool`

HasCode returns a boolean if a field has been set.

### GetMessages

`func (o *AssetAccessRequestError) GetMessages() []string`

GetMessages returns the Messages field if non-nil, zero value otherwise.

### GetMessagesOk

`func (o *AssetAccessRequestError) GetMessagesOk() (*[]string, bool)`

GetMessagesOk returns a tuple with the Messages field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessages

`func (o *AssetAccessRequestError) SetMessages(v []string)`

SetMessages sets Messages field to given value.

### HasMessages

`func (o *AssetAccessRequestError) HasMessages() bool`

HasMessages returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


