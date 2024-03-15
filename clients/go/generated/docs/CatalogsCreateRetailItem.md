# CatalogsCreateRetailItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **string** | The catalog item id in the merchant namespace | 
**Operation** | **string** |  | 
**Attributes** | [**ItemAttributes**](ItemAttributes.md) |  | 

## Methods

### NewCatalogsCreateRetailItem

`func NewCatalogsCreateRetailItem(itemId string, operation string, attributes ItemAttributes, ) *CatalogsCreateRetailItem`

NewCatalogsCreateRetailItem instantiates a new CatalogsCreateRetailItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsCreateRetailItemWithDefaults

`func NewCatalogsCreateRetailItemWithDefaults() *CatalogsCreateRetailItem`

NewCatalogsCreateRetailItemWithDefaults instantiates a new CatalogsCreateRetailItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemId

`func (o *CatalogsCreateRetailItem) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *CatalogsCreateRetailItem) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *CatalogsCreateRetailItem) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetOperation

`func (o *CatalogsCreateRetailItem) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsCreateRetailItem) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsCreateRetailItem) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetAttributes

`func (o *CatalogsCreateRetailItem) GetAttributes() ItemAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CatalogsCreateRetailItem) GetAttributesOk() (*ItemAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CatalogsCreateRetailItem) SetAttributes(v ItemAttributes)`

SetAttributes sets Attributes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


