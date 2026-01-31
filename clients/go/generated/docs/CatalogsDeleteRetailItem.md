# CatalogsDeleteRetailItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **string** | The catalog item id in the merchant namespace | 
**LastUpdatedTime** | Pointer to **int64** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] 
**Operation** | **string** |  | 

## Methods

### NewCatalogsDeleteRetailItem

`func NewCatalogsDeleteRetailItem(itemId string, operation string, ) *CatalogsDeleteRetailItem`

NewCatalogsDeleteRetailItem instantiates a new CatalogsDeleteRetailItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsDeleteRetailItemWithDefaults

`func NewCatalogsDeleteRetailItemWithDefaults() *CatalogsDeleteRetailItem`

NewCatalogsDeleteRetailItemWithDefaults instantiates a new CatalogsDeleteRetailItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItemId

`func (o *CatalogsDeleteRetailItem) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *CatalogsDeleteRetailItem) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *CatalogsDeleteRetailItem) SetItemId(v string)`

SetItemId sets ItemId field to given value.


### GetLastUpdatedTime

`func (o *CatalogsDeleteRetailItem) GetLastUpdatedTime() int64`

GetLastUpdatedTime returns the LastUpdatedTime field if non-nil, zero value otherwise.

### GetLastUpdatedTimeOk

`func (o *CatalogsDeleteRetailItem) GetLastUpdatedTimeOk() (*int64, bool)`

GetLastUpdatedTimeOk returns a tuple with the LastUpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastUpdatedTime

`func (o *CatalogsDeleteRetailItem) SetLastUpdatedTime(v int64)`

SetLastUpdatedTime sets LastUpdatedTime field to given value.

### HasLastUpdatedTime

`func (o *CatalogsDeleteRetailItem) HasLastUpdatedTime() bool`

HasLastUpdatedTime returns a boolean if a field has been set.

### GetOperation

`func (o *CatalogsDeleteRetailItem) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *CatalogsDeleteRetailItem) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *CatalogsDeleteRetailItem) SetOperation(v string)`

SetOperation sets Operation field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


