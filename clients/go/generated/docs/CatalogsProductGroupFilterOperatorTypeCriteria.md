# CatalogsProductGroupFilterOperatorTypeCriteria

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FilterOperatorType** | Pointer to **string** |  | [optional] [default to "IS"]
**Negated** | Pointer to **bool** |  | [optional] [default to false]
**Values** | **[]string** |  | 

## Methods

### NewCatalogsProductGroupFilterOperatorTypeCriteria

`func NewCatalogsProductGroupFilterOperatorTypeCriteria(values []string, ) *CatalogsProductGroupFilterOperatorTypeCriteria`

NewCatalogsProductGroupFilterOperatorTypeCriteria instantiates a new CatalogsProductGroupFilterOperatorTypeCriteria object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsProductGroupFilterOperatorTypeCriteriaWithDefaults

`func NewCatalogsProductGroupFilterOperatorTypeCriteriaWithDefaults() *CatalogsProductGroupFilterOperatorTypeCriteria`

NewCatalogsProductGroupFilterOperatorTypeCriteriaWithDefaults instantiates a new CatalogsProductGroupFilterOperatorTypeCriteria object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFilterOperatorType

`func (o *CatalogsProductGroupFilterOperatorTypeCriteria) GetFilterOperatorType() string`

GetFilterOperatorType returns the FilterOperatorType field if non-nil, zero value otherwise.

### GetFilterOperatorTypeOk

`func (o *CatalogsProductGroupFilterOperatorTypeCriteria) GetFilterOperatorTypeOk() (*string, bool)`

GetFilterOperatorTypeOk returns a tuple with the FilterOperatorType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilterOperatorType

`func (o *CatalogsProductGroupFilterOperatorTypeCriteria) SetFilterOperatorType(v string)`

SetFilterOperatorType sets FilterOperatorType field to given value.

### HasFilterOperatorType

`func (o *CatalogsProductGroupFilterOperatorTypeCriteria) HasFilterOperatorType() bool`

HasFilterOperatorType returns a boolean if a field has been set.

### GetNegated

`func (o *CatalogsProductGroupFilterOperatorTypeCriteria) GetNegated() bool`

GetNegated returns the Negated field if non-nil, zero value otherwise.

### GetNegatedOk

`func (o *CatalogsProductGroupFilterOperatorTypeCriteria) GetNegatedOk() (*bool, bool)`

GetNegatedOk returns a tuple with the Negated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNegated

`func (o *CatalogsProductGroupFilterOperatorTypeCriteria) SetNegated(v bool)`

SetNegated sets Negated field to given value.

### HasNegated

`func (o *CatalogsProductGroupFilterOperatorTypeCriteria) HasNegated() bool`

HasNegated returns a boolean if a field has been set.

### GetValues

`func (o *CatalogsProductGroupFilterOperatorTypeCriteria) GetValues() []string`

GetValues returns the Values field if non-nil, zero value otherwise.

### GetValuesOk

`func (o *CatalogsProductGroupFilterOperatorTypeCriteria) GetValuesOk() (*[]string, bool)`

GetValuesOk returns a tuple with the Values field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValues

`func (o *CatalogsProductGroupFilterOperatorTypeCriteria) SetValues(v []string)`

SetValues sets Values field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


