# CatalogsItemsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | [**Country**](Country.md) |  | 
**Language** | [**CatalogsItemsRequestLanguage**](CatalogsItemsRequestLanguage.md) |  | 
**Filters** | [**CatalogsItemsPostFilters**](CatalogsItemsPostFilters.md) |  | 

## Methods

### NewCatalogsItemsRequest

`func NewCatalogsItemsRequest(country Country, language CatalogsItemsRequestLanguage, filters CatalogsItemsPostFilters, ) *CatalogsItemsRequest`

NewCatalogsItemsRequest instantiates a new CatalogsItemsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsItemsRequestWithDefaults

`func NewCatalogsItemsRequestWithDefaults() *CatalogsItemsRequest`

NewCatalogsItemsRequestWithDefaults instantiates a new CatalogsItemsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCountry

`func (o *CatalogsItemsRequest) GetCountry() Country`

GetCountry returns the Country field if non-nil, zero value otherwise.

### GetCountryOk

`func (o *CatalogsItemsRequest) GetCountryOk() (*Country, bool)`

GetCountryOk returns a tuple with the Country field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCountry

`func (o *CatalogsItemsRequest) SetCountry(v Country)`

SetCountry sets Country field to given value.


### GetLanguage

`func (o *CatalogsItemsRequest) GetLanguage() CatalogsItemsRequestLanguage`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *CatalogsItemsRequest) GetLanguageOk() (*CatalogsItemsRequestLanguage, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *CatalogsItemsRequest) SetLanguage(v CatalogsItemsRequestLanguage)`

SetLanguage sets Language field to given value.


### GetFilters

`func (o *CatalogsItemsRequest) GetFilters() CatalogsItemsPostFilters`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CatalogsItemsRequest) GetFiltersOk() (*CatalogsItemsPostFilters, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CatalogsItemsRequest) SetFilters(v CatalogsItemsPostFilters)`

SetFilters sets Filters field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


