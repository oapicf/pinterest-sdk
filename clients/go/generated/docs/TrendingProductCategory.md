# TrendingProductCategory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EngagementType** | [**ProductCategoriesEngagementType**](ProductCategoriesEngagementType.md) | Engagement type | 
**PctChangeMom** | **int32** | Month-over-month change percentage | 
**PercentRelativeVolume** | **int32** | Relative volume percentage | 
**PinterestProductCategoryId** | **int32** | Pinterest Product Category Id | 
**ProductCategory** | **string** | Product Category Name | 
**Verticals** | Pointer to **[]string** | Vertical name associated with the product category | [optional] 

## Methods

### NewTrendingProductCategory

`func NewTrendingProductCategory(engagementType ProductCategoriesEngagementType, pctChangeMom int32, percentRelativeVolume int32, pinterestProductCategoryId int32, productCategory string, ) *TrendingProductCategory`

NewTrendingProductCategory instantiates a new TrendingProductCategory object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTrendingProductCategoryWithDefaults

`func NewTrendingProductCategoryWithDefaults() *TrendingProductCategory`

NewTrendingProductCategoryWithDefaults instantiates a new TrendingProductCategory object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEngagementType

`func (o *TrendingProductCategory) GetEngagementType() ProductCategoriesEngagementType`

GetEngagementType returns the EngagementType field if non-nil, zero value otherwise.

### GetEngagementTypeOk

`func (o *TrendingProductCategory) GetEngagementTypeOk() (*ProductCategoriesEngagementType, bool)`

GetEngagementTypeOk returns a tuple with the EngagementType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEngagementType

`func (o *TrendingProductCategory) SetEngagementType(v ProductCategoriesEngagementType)`

SetEngagementType sets EngagementType field to given value.


### GetPctChangeMom

`func (o *TrendingProductCategory) GetPctChangeMom() int32`

GetPctChangeMom returns the PctChangeMom field if non-nil, zero value otherwise.

### GetPctChangeMomOk

`func (o *TrendingProductCategory) GetPctChangeMomOk() (*int32, bool)`

GetPctChangeMomOk returns a tuple with the PctChangeMom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPctChangeMom

`func (o *TrendingProductCategory) SetPctChangeMom(v int32)`

SetPctChangeMom sets PctChangeMom field to given value.


### GetPercentRelativeVolume

`func (o *TrendingProductCategory) GetPercentRelativeVolume() int32`

GetPercentRelativeVolume returns the PercentRelativeVolume field if non-nil, zero value otherwise.

### GetPercentRelativeVolumeOk

`func (o *TrendingProductCategory) GetPercentRelativeVolumeOk() (*int32, bool)`

GetPercentRelativeVolumeOk returns a tuple with the PercentRelativeVolume field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPercentRelativeVolume

`func (o *TrendingProductCategory) SetPercentRelativeVolume(v int32)`

SetPercentRelativeVolume sets PercentRelativeVolume field to given value.


### GetPinterestProductCategoryId

`func (o *TrendingProductCategory) GetPinterestProductCategoryId() int32`

GetPinterestProductCategoryId returns the PinterestProductCategoryId field if non-nil, zero value otherwise.

### GetPinterestProductCategoryIdOk

`func (o *TrendingProductCategory) GetPinterestProductCategoryIdOk() (*int32, bool)`

GetPinterestProductCategoryIdOk returns a tuple with the PinterestProductCategoryId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinterestProductCategoryId

`func (o *TrendingProductCategory) SetPinterestProductCategoryId(v int32)`

SetPinterestProductCategoryId sets PinterestProductCategoryId field to given value.


### GetProductCategory

`func (o *TrendingProductCategory) GetProductCategory() string`

GetProductCategory returns the ProductCategory field if non-nil, zero value otherwise.

### GetProductCategoryOk

`func (o *TrendingProductCategory) GetProductCategoryOk() (*string, bool)`

GetProductCategoryOk returns a tuple with the ProductCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductCategory

`func (o *TrendingProductCategory) SetProductCategory(v string)`

SetProductCategory sets ProductCategory field to given value.


### GetVerticals

`func (o *TrendingProductCategory) GetVerticals() []string`

GetVerticals returns the Verticals field if non-nil, zero value otherwise.

### GetVerticalsOk

`func (o *TrendingProductCategory) GetVerticalsOk() (*[]string, bool)`

GetVerticalsOk returns a tuple with the Verticals field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVerticals

`func (o *TrendingProductCategory) SetVerticals(v []string)`

SetVerticals sets Verticals field to given value.

### HasVerticals

`func (o *TrendingProductCategory) HasVerticals() bool`

HasVerticals returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


