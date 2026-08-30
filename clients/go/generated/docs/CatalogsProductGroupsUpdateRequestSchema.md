# CatalogsProductGroupsUpdateRequestSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **NullableString** |  | [optional] 
**Filters** | Pointer to [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] 
**IsFeatured** | Pointer to **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**Name** | Pointer to **string** |  | [optional] 

## Methods

### NewCatalogsProductGroupsUpdateRequestSchema

`func NewCatalogsProductGroupsUpdateRequestSchema() *CatalogsProductGroupsUpdateRequestSchema`

NewCatalogsProductGroupsUpdateRequestSchema instantiates a new CatalogsProductGroupsUpdateRequestSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsProductGroupsUpdateRequestSchemaWithDefaults

`func NewCatalogsProductGroupsUpdateRequestSchemaWithDefaults() *CatalogsProductGroupsUpdateRequestSchema`

NewCatalogsProductGroupsUpdateRequestSchemaWithDefaults instantiates a new CatalogsProductGroupsUpdateRequestSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *CatalogsProductGroupsUpdateRequestSchema) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsProductGroupsUpdateRequestSchema) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsProductGroupsUpdateRequestSchema) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsProductGroupsUpdateRequestSchema) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsProductGroupsUpdateRequestSchema) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsProductGroupsUpdateRequestSchema) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetFilters

`func (o *CatalogsProductGroupsUpdateRequestSchema) GetFilters() CatalogsProductGroupFiltersRequest`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsProductGroupsUpdateRequestSchema) GetFiltersOk() (*CatalogsProductGroupFiltersRequest, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsProductGroupsUpdateRequestSchema) SetFilters(v CatalogsProductGroupFiltersRequest)`

SetFilters sets Filters field to given value.

### HasFilters

`func (o *CatalogsProductGroupsUpdateRequestSchema) HasFilters() bool`

HasFilters returns a boolean if a field has been set.

### GetIsFeatured

`func (o *CatalogsProductGroupsUpdateRequestSchema) GetIsFeatured() bool`

GetIsFeatured returns the IsFeatured field if non-nil, zero value otherwise.

### GetIsFeaturedOk

`func (o *CatalogsProductGroupsUpdateRequestSchema) GetIsFeaturedOk() (*bool, bool)`

GetIsFeaturedOk returns a tuple with the IsFeatured field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFeatured

`func (o *CatalogsProductGroupsUpdateRequestSchema) SetIsFeatured(v bool)`

SetIsFeatured sets IsFeatured field to given value.

### HasIsFeatured

`func (o *CatalogsProductGroupsUpdateRequestSchema) HasIsFeatured() bool`

HasIsFeatured returns a boolean if a field has been set.

### GetName

`func (o *CatalogsProductGroupsUpdateRequestSchema) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsProductGroupsUpdateRequestSchema) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsProductGroupsUpdateRequestSchema) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogsProductGroupsUpdateRequestSchema) HasName() bool`

HasName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


