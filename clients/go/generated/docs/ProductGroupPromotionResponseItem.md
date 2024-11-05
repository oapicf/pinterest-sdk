# ProductGroupPromotionResponseItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**ProductGroupPromotionResponseElement**](ProductGroupPromotionResponseElement.md) |  | [optional] 
**Exceptions** | Pointer to [**[]Exception**](Exception.md) |  | [optional] 

## Methods

### NewProductGroupPromotionResponseItem

`func NewProductGroupPromotionResponseItem() *ProductGroupPromotionResponseItem`

NewProductGroupPromotionResponseItem instantiates a new ProductGroupPromotionResponseItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProductGroupPromotionResponseItemWithDefaults

`func NewProductGroupPromotionResponseItemWithDefaults() *ProductGroupPromotionResponseItem`

NewProductGroupPromotionResponseItemWithDefaults instantiates a new ProductGroupPromotionResponseItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ProductGroupPromotionResponseItem) GetData() ProductGroupPromotionResponseElement`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ProductGroupPromotionResponseItem) GetDataOk() (*ProductGroupPromotionResponseElement, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ProductGroupPromotionResponseItem) SetData(v ProductGroupPromotionResponseElement)`

SetData sets Data field to given value.

### HasData

`func (o *ProductGroupPromotionResponseItem) HasData() bool`

HasData returns a boolean if a field has been set.

### GetExceptions

`func (o *ProductGroupPromotionResponseItem) GetExceptions() []Exception`

GetExceptions returns the Exceptions field if non-nil, zero value otherwise.

### GetExceptionsOk

`func (o *ProductGroupPromotionResponseItem) GetExceptionsOk() (*[]Exception, bool)`

GetExceptionsOk returns a tuple with the Exceptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExceptions

`func (o *ProductGroupPromotionResponseItem) SetExceptions(v []Exception)`

SetExceptions sets Exceptions field to given value.

### HasExceptions

`func (o *ProductGroupPromotionResponseItem) HasExceptions() bool`

HasExceptions returns a boolean if a field has been set.

### SetExceptionsNil

`func (o *ProductGroupPromotionResponseItem) SetExceptionsNil(b bool)`

 SetExceptionsNil sets the value for Exceptions to be an explicit nil

### UnsetExceptions
`func (o *ProductGroupPromotionResponseItem) UnsetExceptions()`

UnsetExceptions ensures that no value is present for Exceptions, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


