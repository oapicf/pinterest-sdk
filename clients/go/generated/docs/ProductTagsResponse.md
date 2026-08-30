# ProductTagsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ProductTags** | [**[]ProductTagItem**](ProductTagItem.md) | List of product tags on the pin. | 

## Methods

### NewProductTagsResponse

`func NewProductTagsResponse(productTags []ProductTagItem, ) *ProductTagsResponse`

NewProductTagsResponse instantiates a new ProductTagsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProductTagsResponseWithDefaults

`func NewProductTagsResponseWithDefaults() *ProductTagsResponse`

NewProductTagsResponseWithDefaults instantiates a new ProductTagsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetProductTags

`func (o *ProductTagsResponse) GetProductTags() []ProductTagItem`

GetProductTags returns the ProductTags field if non-nil, zero value otherwise.

### GetProductTagsOk

`func (o *ProductTagsResponse) GetProductTagsOk() (*[]ProductTagItem, bool)`

GetProductTagsOk returns a tuple with the ProductTags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductTags

`func (o *ProductTagsResponse) SetProductTags(v []ProductTagItem)`

SetProductTags sets ProductTags field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


