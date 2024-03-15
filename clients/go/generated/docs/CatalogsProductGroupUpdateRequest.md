# CatalogsProductGroupUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** |  | [optional] 
**Description** | Pointer to **NullableString** |  | [optional] 
**IsFeatured** | Pointer to **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**Filters** | Pointer to [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] 

## Methods

### NewCatalogsProductGroupUpdateRequest

`func NewCatalogsProductGroupUpdateRequest() *CatalogsProductGroupUpdateRequest`

NewCatalogsProductGroupUpdateRequest instantiates a new CatalogsProductGroupUpdateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsProductGroupUpdateRequestWithDefaults

`func NewCatalogsProductGroupUpdateRequestWithDefaults() *CatalogsProductGroupUpdateRequest`

NewCatalogsProductGroupUpdateRequestWithDefaults instantiates a new CatalogsProductGroupUpdateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *CatalogsProductGroupUpdateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CatalogsProductGroupUpdateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CatalogsProductGroupUpdateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CatalogsProductGroupUpdateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### GetDescription

`func (o *CatalogsProductGroupUpdateRequest) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsProductGroupUpdateRequest) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsProductGroupUpdateRequest) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsProductGroupUpdateRequest) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *CatalogsProductGroupUpdateRequest) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *CatalogsProductGroupUpdateRequest) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetIsFeatured

`func (o *CatalogsProductGroupUpdateRequest) GetIsFeatured() bool`

GetIsFeatured returns the IsFeatured field if non-nil, zero value otherwise.

### GetIsFeaturedOk

`func (o *CatalogsProductGroupUpdateRequest) GetIsFeaturedOk() (*bool, bool)`

GetIsFeaturedOk returns a tuple with the IsFeatured field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFeatured

`func (o *CatalogsProductGroupUpdateRequest) SetIsFeatured(v bool)`

SetIsFeatured sets IsFeatured field to given value.

### HasIsFeatured

`func (o *CatalogsProductGroupUpdateRequest) HasIsFeatured() bool`

HasIsFeatured returns a boolean if a field has been set.

### GetFilters

`func (o *CatalogsProductGroupUpdateRequest) GetFilters() CatalogsProductGroupFiltersRequest`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsProductGroupUpdateRequest) GetFiltersOk() (*CatalogsProductGroupFiltersRequest, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsProductGroupUpdateRequest) SetFilters(v CatalogsProductGroupFiltersRequest)`

SetFilters sets Filters field to given value.

### HasFilters

`func (o *CatalogsProductGroupUpdateRequest) HasFilters() bool`

HasFilters returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


