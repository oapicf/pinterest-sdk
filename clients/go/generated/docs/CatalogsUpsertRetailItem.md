# CatalogsUpsertRetailItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **string** | The catalog item id in the merchant namespace | 
**Operation** | **string** |  | 
**Attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | 

## Methods

### NewCatalogsUpsertRetailItem

`func NewCatalogsUpsertRetailItem(itemId string, operation string, attributes ItemAttributesRequest, ) *CatalogsUpsertRetailItem`

NewCatalogsUpsertRetailItem instantiates a new CatalogsUpsertRetailItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsUpsertRetailItemWithDefaults

`func NewCatalogsUpsertRetailItemWithDefaults() *CatalogsUpsertRetailItem`

NewCatalogsUpsertRetailItemWithDefaults instantiates a new CatalogsUpsertRetailItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemId

`func (o *CatalogsUpsertRetailItem) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *CatalogsUpsertRetailItem) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *CatalogsUpsertRetailItem) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetOperation

`func (o *CatalogsUpsertRetailItem) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsUpsertRetailItem) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsUpsertRetailItem) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetAttributes

`func (o *CatalogsUpsertRetailItem) GetAttributes() ItemAttributesRequest`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CatalogsUpsertRetailItem) GetAttributesOk() (*ItemAttributesRequest, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CatalogsUpsertRetailItem) SetAttributes(v ItemAttributesRequest)`

SetAttributes sets Attributes field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


