# AdGroupArrayResponseElement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**AdGroupResponse**](AdGroupResponse.md) |  | [optional] 
**Exceptions** | Pointer to [**[]Exception**](Exception.md) |  | [optional] 

## Methods

### NewAdGroupArrayResponseElement

`func NewAdGroupArrayResponseElement() *AdGroupArrayResponseElement`

NewAdGroupArrayResponseElement instantiates a new AdGroupArrayResponseElement object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdGroupArrayResponseElementWithDefaults

`func NewAdGroupArrayResponseElementWithDefaults() *AdGroupArrayResponseElement`

NewAdGroupArrayResponseElementWithDefaults instantiates a new AdGroupArrayResponseElement object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *AdGroupArrayResponseElement) GetData() AdGroupResponse`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *AdGroupArrayResponseElement) GetDataOk() (*AdGroupResponse, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *AdGroupArrayResponseElement) SetData(v AdGroupResponse)`

SetData sets Data field to given value.

### HasData

`func (o *AdGroupArrayResponseElement) HasData() bool`

HasData returns a boolean if a field has been set.

### GetExceptions

`func (o *AdGroupArrayResponseElement) GetExceptions() []Exception`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *AdGroupArrayResponseElement) GetExceptionsOk() (*[]Exception, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *AdGroupArrayResponseElement) SetExceptions(v []Exception)`

SetExceptions sets Exceptions field to given value.

### HasExceptions

`func (o *AdGroupArrayResponseElement) HasExceptions() bool`

HasExceptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


