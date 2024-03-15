# CatalogsUpdateRetailItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **string** | The catalog item id in the merchant namespace | 
**Operation** | **string** |  | 
**Attributes** | [**UpdatableItemAttributes**](UpdatableItemAttributes.md) |  | 
**UpdateMask** | Pointer to [**[]UpdateMaskFieldType**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 

## Methods

### NewCatalogsUpdateRetailItem

`func NewCatalogsUpdateRetailItem(itemId string, operation string, attributes UpdatableItemAttributes, ) *CatalogsUpdateRetailItem`

NewCatalogsUpdateRetailItem instantiates a new CatalogsUpdateRetailItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsUpdateRetailItemWithDefaults

`func NewCatalogsUpdateRetailItemWithDefaults() *CatalogsUpdateRetailItem`

NewCatalogsUpdateRetailItemWithDefaults instantiates a new CatalogsUpdateRetailItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemId

`func (o *CatalogsUpdateRetailItem) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *CatalogsUpdateRetailItem) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *CatalogsUpdateRetailItem) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetOperation

`func (o *CatalogsUpdateRetailItem) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsUpdateRetailItem) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsUpdateRetailItem) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetAttributes

`func (o *CatalogsUpdateRetailItem) GetAttributes() UpdatableItemAttributes`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *CatalogsUpdateRetailItem) GetAttributesOk() (*UpdatableItemAttributes, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *CatalogsUpdateRetailItem) SetAttributes(v UpdatableItemAttributes)`

SetAttributes sets Attributes field to given value.


### GetUpdateMask

`func (o *CatalogsUpdateRetailItem) GetUpdateMask() []UpdateMaskFieldType`

GetUpdateMask returns the UpdateMask field if non-nil, zero value otherwise.

### GetUpdateMaskOk

`func (o *CatalogsUpdateRetailItem) GetUpdateMaskOk() (*[]UpdateMaskFieldType, bool)`

GetUpdateMaskOk returns a tuple with the UpdateMask field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdateMask

`func (o *CatalogsUpdateRetailItem) SetUpdateMask(v []UpdateMaskFieldType)`

SetUpdateMask sets UpdateMask field to given value.

### HasUpdateMask

`func (o *CatalogsUpdateRetailItem) HasUpdateMask() bool`

HasUpdateMask returns a boolean if a field has been set.

### SetUpdateMaskNil

`func (o *CatalogsUpdateRetailItem) SetUpdateMaskNil(b bool)`

 SetUpdateMaskNil sets the value for UpdateMask to be an explicit nil

### UnsetUpdateMask
`func (o *CatalogsUpdateRetailItem) UnsetUpdateMask()`

UnsetUpdateMask ensures that no value is present for UpdateMask, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


