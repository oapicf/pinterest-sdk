# CatalogsProductGroupsCreateRequestSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **NullableString** |  | [optional] 
**FeedId** | **string** | Catalog Feed id pertaining to the catalog product group. | 
**Filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**IsFeatured** | Pointer to **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**Name** | **string** |  | 

## Methods

### NewCatalogsProductGroupsCreateRequestSchema

`func NewCatalogsProductGroupsCreateRequestSchema(feedId string, filters CatalogsProductGroupFiltersRequest, name string, ) *CatalogsProductGroupsCreateRequestSchema`

NewCatalogsProductGroupsCreateRequestSchema instantiates a new CatalogsProductGroupsCreateRequestSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsProductGroupsCreateRequestSchemaWithDefaults

`func NewCatalogsProductGroupsCreateRequestSchemaWithDefaults() *CatalogsProductGroupsCreateRequestSchema`

NewCatalogsProductGroupsCreateRequestSchemaWithDefaults instantiates a new CatalogsProductGroupsCreateRequestSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *CatalogsProductGroupsCreateRequestSchema) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsProductGroupsCreateRequestSchema) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsProductGroupsCreateRequestSchema) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsProductGroupsCreateRequestSchema) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsProductGroupsCreateRequestSchema) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsProductGroupsCreateRequestSchema) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFeedId

`func (o *CatalogsProductGroupsCreateRequestSchema) GetFeedId() string`

GetFeedId returns the FeedId field if non-nil, zero value otherwise.

### GetFeedIdOk

`func (o *CatalogsProductGroupsCreateRequestSchema) GetFeedIdOk() (*string, bool)`

GetFeedIdOk returns a tuple with the FeedId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeedId

`func (o *CatalogsProductGroupsCreateRequestSchema) SetFeedId(v string)`

SetFeedId sets FeedId field to given value.


### GetFilters

`func (o *CatalogsProductGroupsCreateRequestSchema) GetFilters() CatalogsProductGroupFiltersRequest`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsProductGroupsCreateRequestSchema) GetFiltersOk() (*CatalogsProductGroupFiltersRequest, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsProductGroupsCreateRequestSchema) SetFilters(v CatalogsProductGroupFiltersRequest)`

SetFilters sets Filters field to given value.


### GetIsFeatured

`func (o *CatalogsProductGroupsCreateRequestSchema) GetIsFeatured() bool`

GetIsFeatured returns the IsFeatured field if non-nil, zero value otherwise.

### GetIsFeaturedOk

`func (o *CatalogsProductGroupsCreateRequestSchema) GetIsFeaturedOk() (*bool, bool)`

GetIsFeaturedOk returns a tuple with the IsFeatured field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFeatured

`func (o *CatalogsProductGroupsCreateRequestSchema) SetIsFeatured(v bool)`

SetIsFeatured sets IsFeatured field to given value.

### HasIsFeatured

`func (o *CatalogsProductGroupsCreateRequestSchema) HasIsFeatured() bool`

HasIsFeatured returns a boolean if a field has been set.

### GetName

`func (o *CatalogsProductGroupsCreateRequestSchema) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsProductGroupsCreateRequestSchema) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsProductGroupsCreateRequestSchema) SetName(v string)`

SetName sets Name field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


