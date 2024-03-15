# CatalogProductGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **string** | ID of the catalog product group. | [optional] 
**MerchantId** | Pointer to **string** | Merchant ID pertaining to the owner of the catalog product group. | [optional] 
**Name** | Pointer to **string** | Name of catalog product group | [optional] 
**Filters** | Pointer to **map[string]interface{}** | Object holding a list of filters | [optional] 
**FilterV2** | Pointer to **map[string]interface{}** | Object holding a list of filters | [optional] 
**Type** | Pointer to [**Board**](Board.md) |  | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] 
**FeedProfileId** | Pointer to **string** | id of the feed profile belonging to this catalog product group | [optional] 
**CreatedAt** | Pointer to **int32** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**LastUpdate** | Pointer to **int32** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**ProductCount** | Pointer to **int32** | Amount of products in the catalog product group | [optional] 
**FeaturedPosition** | Pointer to **int32** | index of the featured position of the catalog product group | [optional] 

## Methods

### NewCatalogProductGroup

`func NewCatalogProductGroup() *CatalogProductGroup`

NewCatalogProductGroup instantiates a new CatalogProductGroup object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogProductGroupWithDefaults

`func NewCatalogProductGroupWithDefaults() *CatalogProductGroup`

NewCatalogProductGroupWithDefaults instantiates a new CatalogProductGroup object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CatalogProductGroup) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CatalogProductGroup) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CatalogProductGroup) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *CatalogProductGroup) HasId() bool`

HasId returns a boolean if a field has been set.

### GetMerchantId

`func (o *CatalogProductGroup) GetMerchantId() string`

GetMerchantId returns the MerchantId field if non-nil, zero value otherwise.

### GetMerchantIdOk

`func (o *CatalogProductGroup) GetMerchantIdOk() (*string, bool)`

GetMerchantIdOk returns a tuple with the MerchantId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMerchantId

`func (o *CatalogProductGroup) SetMerchantId(v string)`

SetMerchantId sets MerchantId field to given value.

### HasMerchantId

`func (o *CatalogProductGroup) HasMerchantId() bool`

HasMerchantId returns a boolean if a field has been set.

### GetName

`func (o *CatalogProductGroup) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogProductGroup) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogProductGroup) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogProductGroup) HasName() bool`

HasName returns a boolean if a field has been set.

### GetFilters

`func (o *CatalogProductGroup) GetFilters() map[string]interface{}`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogProductGroup) GetFiltersOk() (*map[string]interface{}, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogProductGroup) SetFilters(v map[string]interface{})`

SetFilters sets Filters field to given value.

### HasFilters

`func (o *CatalogProductGroup) HasFilters() bool`

HasFilters returns a boolean if a field has been set.

### GetFilterV2

`func (o *CatalogProductGroup) GetFilterV2() map[string]interface{}`

GetFilterV2 returns the FilterV2 field if non-nil, zero value otherwise.

### GetFilterV2Ok

`func (o *CatalogProductGroup) GetFilterV2Ok() (*map[string]interface{}, bool)`

GetFilterV2Ok returns a tuple with the FilterV2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterV2

`func (o *CatalogProductGroup) SetFilterV2(v map[string]interface{})`

SetFilterV2 sets FilterV2 field to given value.

### HasFilterV2

`func (o *CatalogProductGroup) HasFilterV2() bool`

HasFilterV2 returns a boolean if a field has been set.

### GetType

`func (o *CatalogProductGroup) GetType() Board`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CatalogProductGroup) GetTypeOk() (*Board, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CatalogProductGroup) SetType(v Board)`

SetType sets Type field to given value.

### HasType

`func (o *CatalogProductGroup) HasType() bool`

HasType returns a boolean if a field has been set.

### GetStatus

`func (o *CatalogProductGroup) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CatalogProductGroup) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CatalogProductGroup) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CatalogProductGroup) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetFeedProfileId

`func (o *CatalogProductGroup) GetFeedProfileId() string`

GetFeedProfileId returns the FeedProfileId field if non-nil, zero value otherwise.

### GetFeedProfileIdOk

`func (o *CatalogProductGroup) GetFeedProfileIdOk() (*string, bool)`

GetFeedProfileIdOk returns a tuple with the FeedProfileId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedProfileId

`func (o *CatalogProductGroup) SetFeedProfileId(v string)`

SetFeedProfileId sets FeedProfileId field to given value.

### HasFeedProfileId

`func (o *CatalogProductGroup) HasFeedProfileId() bool`

HasFeedProfileId returns a boolean if a field has been set.

### GetCreatedAt

`func (o *CatalogProductGroup) GetCreatedAt() int32`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *CatalogProductGroup) GetCreatedAtOk() (*int32, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *CatalogProductGroup) SetCreatedAt(v int32)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *CatalogProductGroup) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetLastUpdate

`func (o *CatalogProductGroup) GetLastUpdate() int32`

GetLastUpdate returns the LastUpdate field if non-nil, zero value otherwise.

### GetLastUpdateOk

`func (o *CatalogProductGroup) GetLastUpdateOk() (*int32, bool)`

GetLastUpdateOk returns a tuple with the LastUpdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastUpdate

`func (o *CatalogProductGroup) SetLastUpdate(v int32)`

SetLastUpdate sets LastUpdate field to given value.

### HasLastUpdate

`func (o *CatalogProductGroup) HasLastUpdate() bool`

HasLastUpdate returns a boolean if a field has been set.

### GetProductCount

`func (o *CatalogProductGroup) GetProductCount() int32`

GetProductCount returns the ProductCount field if non-nil, zero value otherwise.

### GetProductCountOk

`func (o *CatalogProductGroup) GetProductCountOk() (*int32, bool)`

GetProductCountOk returns a tuple with the ProductCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductCount

`func (o *CatalogProductGroup) SetProductCount(v int32)`

SetProductCount sets ProductCount field to given value.

### HasProductCount

`func (o *CatalogProductGroup) HasProductCount() bool`

HasProductCount returns a boolean if a field has been set.

### GetFeaturedPosition

`func (o *CatalogProductGroup) GetFeaturedPosition() int32`

GetFeaturedPosition returns the FeaturedPosition field if non-nil, zero value otherwise.

### GetFeaturedPositionOk

`func (o *CatalogProductGroup) GetFeaturedPositionOk() (*int32, bool)`

GetFeaturedPositionOk returns a tuple with the FeaturedPosition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeaturedPosition

`func (o *CatalogProductGroup) SetFeaturedPosition(v int32)`

SetFeaturedPosition sets FeaturedPosition field to given value.

### HasFeaturedPosition

`func (o *CatalogProductGroup) HasFeaturedPosition() bool`

HasFeaturedPosition returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


