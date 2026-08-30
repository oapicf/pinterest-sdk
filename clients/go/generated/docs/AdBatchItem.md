# AdBatchItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**Ad**](Ad.md) |  | [optional] 
**Exceptions** | Pointer to [**PinterestLibError**](PinterestLibError.md) |  | [optional] 

## Methods

### NewAdBatchItem

`func NewAdBatchItem() *AdBatchItem`

NewAdBatchItem instantiates a new AdBatchItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdBatchItemWithDefaults

`func NewAdBatchItemWithDefaults() *AdBatchItem`

NewAdBatchItemWithDefaults instantiates a new AdBatchItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *AdBatchItem) GetData() Ad`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *AdBatchItem) GetDataOk() (*Ad, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *AdBatchItem) SetData(v Ad)`

SetData sets Data field to given value.

### HasData

`func (o *AdBatchItem) HasData() bool`

HasData returns a boolean if a field has been set.

### GetExceptions

`func (o *AdBatchItem) GetExceptions() PinterestLibError`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *AdBatchItem) GetExceptionsOk() (*PinterestLibError, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *AdBatchItem) SetExceptions(v PinterestLibError)`

SetExceptions sets Exceptions field to given value.

### HasExceptions

`func (o *AdBatchItem) HasExceptions() bool`

HasExceptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


