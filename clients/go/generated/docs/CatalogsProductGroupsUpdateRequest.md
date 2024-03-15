# CatalogsProductGroupsUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** |  | [optional] 
**Description** | Pointer to **NullableString** |  | [optional] 
**IsFeatured** | Pointer to **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**Filters** | Pointer to [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] 

## Methods

### NewCatalogsProductGroupsUpdateRequest

`func NewCatalogsProductGroupsUpdateRequest() *CatalogsProductGroupsUpdateRequest`

NewCatalogsProductGroupsUpdateRequest instantiates a new CatalogsProductGroupsUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsProductGroupsUpdateRequestWithDefaults

`func NewCatalogsProductGroupsUpdateRequestWithDefaults() *CatalogsProductGroupsUpdateRequest`

NewCatalogsProductGroupsUpdateRequestWithDefaults instantiates a new CatalogsProductGroupsUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *CatalogsProductGroupsUpdateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsProductGroupsUpdateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsProductGroupsUpdateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogsProductGroupsUpdateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetDescription

`func (o *CatalogsProductGroupsUpdateRequest) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsProductGroupsUpdateRequest) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsProductGroupsUpdateRequest) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsProductGroupsUpdateRequest) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsProductGroupsUpdateRequest) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsProductGroupsUpdateRequest) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetIsFeatured

`func (o *CatalogsProductGroupsUpdateRequest) GetIsFeatured() bool`

GetIsFeatured returns the IsFeatured field if non-nil, zero value otherwise.

### GetIsFeaturedOk

`func (o *CatalogsProductGroupsUpdateRequest) GetIsFeaturedOk() (*bool, bool)`

GetIsFeaturedOk returns a tuple with the IsFeatured field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFeatured

`func (o *CatalogsProductGroupsUpdateRequest) SetIsFeatured(v bool)`

SetIsFeatured sets IsFeatured field to given value.

### HasIsFeatured

`func (o *CatalogsProductGroupsUpdateRequest) HasIsFeatured() bool`

HasIsFeatured returns a boolean if a field has been set.

### GetFilters

`func (o *CatalogsProductGroupsUpdateRequest) GetFilters() CatalogsProductGroupFiltersRequest`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsProductGroupsUpdateRequest) GetFiltersOk() (*CatalogsProductGroupFiltersRequest, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsProductGroupsUpdateRequest) SetFilters(v CatalogsProductGroupFiltersRequest)`

SetFilters sets Filters field to given value.

### HasFilters

`func (o *CatalogsProductGroupsUpdateRequest) HasFilters() bool`

HasFilters returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


