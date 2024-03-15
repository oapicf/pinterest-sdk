# AudienceCategory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | Pointer to **string** | Interest unique key (same as ID). | [optional] 
**Name** | Pointer to **string** | Interest name. | [optional] 
**Ratio** | Pointer to **float32** | Interest&#39;s percent of category&#39;s total audience. | [optional] 
**Index** | Pointer to **float32** | Interest affinity index. | [optional] 
**Id** | Pointer to **string** | Interest ID. | [optional] 
**Subcategories** | Pointer to [**[]AudienceSubcategory**](AudienceSubcategory.md) | Subcategory interest distribution | [optional] 

## Methods

### NewAudienceCategory

`func NewAudienceCategory() *AudienceCategory`

NewAudienceCategory instantiates a new AudienceCategory object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAudienceCategoryWithDefaults

`func NewAudienceCategoryWithDefaults() *AudienceCategory`

NewAudienceCategoryWithDefaults instantiates a new AudienceCategory object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKey

`func (o *AudienceCategory) GetKey() string`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *AudienceCategory) GetKeyOk() (*string, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *AudienceCategory) SetKey(v string)`

SetKey sets Key field to given value.

### HasKey

`func (o *AudienceCategory) HasKey() bool`

HasKey returns a boolean if a field has been set.

### GetName

`func (o *AudienceCategory) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AudienceCategory) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AudienceCategory) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AudienceCategory) HasName() bool`

HasName returns a boolean if a field has been set.

### GetRatio

`func (o *AudienceCategory) GetRatio() float32`

GetRatio returns the Ratio field if non-nil, zero value otherwise.

### GetRatioOk

`func (o *AudienceCategory) GetRatioOk() (*float32, bool)`

GetRatioOk returns a tuple with the Ratio field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRatio

`func (o *AudienceCategory) SetRatio(v float32)`

SetRatio sets Ratio field to given value.

### HasRatio

`func (o *AudienceCategory) HasRatio() bool`

HasRatio returns a boolean if a field has been set.

### GetIndex

`func (o *AudienceCategory) GetIndex() float32`

GetIndex returns the Index field if non-nil, zero value otherwise.

### GetIndexOk

`func (o *AudienceCategory) GetIndexOk() (*float32, bool)`

GetIndexOk returns a tuple with the Index field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndex

`func (o *AudienceCategory) SetIndex(v float32)`

SetIndex sets Index field to given value.

### HasIndex

`func (o *AudienceCategory) HasIndex() bool`

HasIndex returns a boolean if a field has been set.

### GetId

`func (o *AudienceCategory) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AudienceCategory) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AudienceCategory) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *AudienceCategory) HasId() bool`

HasId returns a boolean if a field has been set.

### GetSubcategories

`func (o *AudienceCategory) GetSubcategories() []AudienceSubcategory`

GetSubcategories returns the Subcategories field if non-nil, zero value otherwise.

### GetSubcategoriesOk

`func (o *AudienceCategory) GetSubcategoriesOk() (*[]AudienceSubcategory, bool)`

GetSubcategoriesOk returns a tuple with the Subcategories field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubcategories

`func (o *AudienceCategory) SetSubcategories(v []AudienceSubcategory)`

SetSubcategories sets Subcategories field to given value.

### HasSubcategories

`func (o *AudienceCategory) HasSubcategories() bool`

HasSubcategories returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


