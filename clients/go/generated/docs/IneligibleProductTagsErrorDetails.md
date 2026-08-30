# IneligibleProductTagsErrorDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ProductTags** | [**[]IneligibleProductTagErrorItem**](IneligibleProductTagErrorItem.md) | List of product tags that failed eligibility check. | 

## Methods

### NewIneligibleProductTagsErrorDetails

`func NewIneligibleProductTagsErrorDetails(productTags []IneligibleProductTagErrorItem, ) *IneligibleProductTagsErrorDetails`

NewIneligibleProductTagsErrorDetails instantiates a new IneligibleProductTagsErrorDetails object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIneligibleProductTagsErrorDetailsWithDefaults

`func NewIneligibleProductTagsErrorDetailsWithDefaults() *IneligibleProductTagsErrorDetails`

NewIneligibleProductTagsErrorDetailsWithDefaults instantiates a new IneligibleProductTagsErrorDetails object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetProductTags

`func (o *IneligibleProductTagsErrorDetails) GetProductTags() []IneligibleProductTagErrorItem`

GetProductTags returns the ProductTags field if non-nil, zero value otherwise.

### GetProductTagsOk

`func (o *IneligibleProductTagsErrorDetails) GetProductTagsOk() (*[]IneligibleProductTagErrorItem, bool)`

GetProductTagsOk returns a tuple with the ProductTags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductTags

`func (o *IneligibleProductTagsErrorDetails) SetProductTags(v []IneligibleProductTagErrorItem)`

SetProductTags sets ProductTags field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


