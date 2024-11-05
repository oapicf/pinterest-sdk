# CatalogsUpdatableCreativeAssetsAttributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Title** | Pointer to **string** | The name of the creative assets. | [optional] 
**Description** | Pointer to **string** | Brief description of the creative assets. | [optional] 
**Link** | Pointer to **string** | Link to the creative assets page. | [optional] 
**IosDeepLink** | Pointer to **NullableString** | IOS deep link to the creative assets page. | [optional] 
**AndroidDeepLink** | Pointer to **NullableString** | Link to the creative assets page. | [optional] 
**GoogleProductCategory** | Pointer to **NullableString** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. | [optional] 
**CustomLabel0** | Pointer to **NullableString** | Custom grouping of creative assets. | [optional] 
**CustomLabel1** | Pointer to **NullableString** | Custom grouping of creative assets. | [optional] 
**CustomLabel2** | Pointer to **NullableString** | Custom grouping of creative assets. | [optional] 
**CustomLabel3** | Pointer to **NullableString** | Custom grouping of creative assets. | [optional] 
**CustomLabel4** | Pointer to **NullableString** | Custom grouping of creative assets. | [optional] 
**Visibility** | Pointer to **NullableString** | Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’. | [optional] 

## Methods

### NewCatalogsUpdatableCreativeAssetsAttributes

`func NewCatalogsUpdatableCreativeAssetsAttributes() *CatalogsUpdatableCreativeAssetsAttributes`

NewCatalogsUpdatableCreativeAssetsAttributes instantiates a new CatalogsUpdatableCreativeAssetsAttributes object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsUpdatableCreativeAssetsAttributesWithDefaults

`func NewCatalogsUpdatableCreativeAssetsAttributesWithDefaults() *CatalogsUpdatableCreativeAssetsAttributes`

NewCatalogsUpdatableCreativeAssetsAttributesWithDefaults instantiates a new CatalogsUpdatableCreativeAssetsAttributes object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTitle

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *CatalogsUpdatableCreativeAssetsAttributes) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetDescription

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsUpdatableCreativeAssetsAttributes) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetLink

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetLink(v string)`

SetLink sets Link field to given value.

### HasLink

`func (o *CatalogsUpdatableCreativeAssetsAttributes) HasLink() bool`

HasLink returns a boolean if a field has been set.

### GetIosDeepLink

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetIosDeepLink() string`

GetIosDeepLink returns the IosDeepLink field if non-nil, zero value otherwise.

### GetIosDeepLinkOk

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetIosDeepLinkOk() (*string, bool)`

GetIosDeepLinkOk returns a tuple with the IosDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIosDeepLink

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetIosDeepLink(v string)`

SetIosDeepLink sets IosDeepLink field to given value.

### HasIosDeepLink

`func (o *CatalogsUpdatableCreativeAssetsAttributes) HasIosDeepLink() bool`

HasIosDeepLink returns a boolean if a field has been set.

### SetIosDeepLinkNil

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetIosDeepLinkNil(b bool)`

 SetIosDeepLinkNil sets the value for IosDeepLink to be an explicit nil

### UnsetIosDeepLink
`func (o *CatalogsUpdatableCreativeAssetsAttributes) UnsetIosDeepLink()`

UnsetIosDeepLink ensures that no value is present for IosDeepLink, not even an explicit nil
### GetAndroidDeepLink

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetAndroidDeepLink() string`

GetAndroidDeepLink returns the AndroidDeepLink field if non-nil, zero value otherwise.

### GetAndroidDeepLinkOk

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetAndroidDeepLinkOk() (*string, bool)`

GetAndroidDeepLinkOk returns a tuple with the AndroidDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAndroidDeepLink

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetAndroidDeepLink(v string)`

SetAndroidDeepLink sets AndroidDeepLink field to given value.

### HasAndroidDeepLink

`func (o *CatalogsUpdatableCreativeAssetsAttributes) HasAndroidDeepLink() bool`

HasAndroidDeepLink returns a boolean if a field has been set.

### SetAndroidDeepLinkNil

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetAndroidDeepLinkNil(b bool)`

 SetAndroidDeepLinkNil sets the value for AndroidDeepLink to be an explicit nil

### UnsetAndroidDeepLink
`func (o *CatalogsUpdatableCreativeAssetsAttributes) UnsetAndroidDeepLink()`

UnsetAndroidDeepLink ensures that no value is present for AndroidDeepLink, not even an explicit nil
### GetGoogleProductCategory

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetGoogleProductCategory() string`

GetGoogleProductCategory returns the GoogleProductCategory field if non-nil, zero value otherwise.

### GetGoogleProductCategoryOk

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetGoogleProductCategoryOk() (*string, bool)`

GetGoogleProductCategoryOk returns a tuple with the GoogleProductCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGoogleProductCategory

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetGoogleProductCategory(v string)`

SetGoogleProductCategory sets GoogleProductCategory field to given value.

### HasGoogleProductCategory

`func (o *CatalogsUpdatableCreativeAssetsAttributes) HasGoogleProductCategory() bool`

HasGoogleProductCategory returns a boolean if a field has been set.

### SetGoogleProductCategoryNil

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetGoogleProductCategoryNil(b bool)`

 SetGoogleProductCategoryNil sets the value for GoogleProductCategory to be an explicit nil

### UnsetGoogleProductCategory
`func (o *CatalogsUpdatableCreativeAssetsAttributes) UnsetGoogleProductCategory()`

UnsetGoogleProductCategory ensures that no value is present for GoogleProductCategory, not even an explicit nil
### GetCustomLabel0

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetCustomLabel0() string`

GetCustomLabel0 returns the CustomLabel0 field if non-nil, zero value otherwise.

### GetCustomLabel0Ok

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetCustomLabel0Ok() (*string, bool)`

GetCustomLabel0Ok returns a tuple with the CustomLabel0 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel0

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetCustomLabel0(v string)`

SetCustomLabel0 sets CustomLabel0 field to given value.

### HasCustomLabel0

`func (o *CatalogsUpdatableCreativeAssetsAttributes) HasCustomLabel0() bool`

HasCustomLabel0 returns a boolean if a field has been set.

### SetCustomLabel0Nil

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetCustomLabel0Nil(b bool)`

 SetCustomLabel0Nil sets the value for CustomLabel0 to be an explicit nil

### UnsetCustomLabel0
`func (o *CatalogsUpdatableCreativeAssetsAttributes) UnsetCustomLabel0()`

UnsetCustomLabel0 ensures that no value is present for CustomLabel0, not even an explicit nil
### GetCustomLabel1

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetCustomLabel1() string`

GetCustomLabel1 returns the CustomLabel1 field if non-nil, zero value otherwise.

### GetCustomLabel1Ok

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetCustomLabel1Ok() (*string, bool)`

GetCustomLabel1Ok returns a tuple with the CustomLabel1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel1

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetCustomLabel1(v string)`

SetCustomLabel1 sets CustomLabel1 field to given value.

### HasCustomLabel1

`func (o *CatalogsUpdatableCreativeAssetsAttributes) HasCustomLabel1() bool`

HasCustomLabel1 returns a boolean if a field has been set.

### SetCustomLabel1Nil

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetCustomLabel1Nil(b bool)`

 SetCustomLabel1Nil sets the value for CustomLabel1 to be an explicit nil

### UnsetCustomLabel1
`func (o *CatalogsUpdatableCreativeAssetsAttributes) UnsetCustomLabel1()`

UnsetCustomLabel1 ensures that no value is present for CustomLabel1, not even an explicit nil
### GetCustomLabel2

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetCustomLabel2() string`

GetCustomLabel2 returns the CustomLabel2 field if non-nil, zero value otherwise.

### GetCustomLabel2Ok

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetCustomLabel2Ok() (*string, bool)`

GetCustomLabel2Ok returns a tuple with the CustomLabel2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel2

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetCustomLabel2(v string)`

SetCustomLabel2 sets CustomLabel2 field to given value.

### HasCustomLabel2

`func (o *CatalogsUpdatableCreativeAssetsAttributes) HasCustomLabel2() bool`

HasCustomLabel2 returns a boolean if a field has been set.

### SetCustomLabel2Nil

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetCustomLabel2Nil(b bool)`

 SetCustomLabel2Nil sets the value for CustomLabel2 to be an explicit nil

### UnsetCustomLabel2
`func (o *CatalogsUpdatableCreativeAssetsAttributes) UnsetCustomLabel2()`

UnsetCustomLabel2 ensures that no value is present for CustomLabel2, not even an explicit nil
### GetCustomLabel3

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetCustomLabel3() string`

GetCustomLabel3 returns the CustomLabel3 field if non-nil, zero value otherwise.

### GetCustomLabel3Ok

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetCustomLabel3Ok() (*string, bool)`

GetCustomLabel3Ok returns a tuple with the CustomLabel3 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel3

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetCustomLabel3(v string)`

SetCustomLabel3 sets CustomLabel3 field to given value.

### HasCustomLabel3

`func (o *CatalogsUpdatableCreativeAssetsAttributes) HasCustomLabel3() bool`

HasCustomLabel3 returns a boolean if a field has been set.

### SetCustomLabel3Nil

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetCustomLabel3Nil(b bool)`

 SetCustomLabel3Nil sets the value for CustomLabel3 to be an explicit nil

### UnsetCustomLabel3
`func (o *CatalogsUpdatableCreativeAssetsAttributes) UnsetCustomLabel3()`

UnsetCustomLabel3 ensures that no value is present for CustomLabel3, not even an explicit nil
### GetCustomLabel4

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetCustomLabel4() string`

GetCustomLabel4 returns the CustomLabel4 field if non-nil, zero value otherwise.

### GetCustomLabel4Ok

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetCustomLabel4Ok() (*string, bool)`

GetCustomLabel4Ok returns a tuple with the CustomLabel4 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel4

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetCustomLabel4(v string)`

SetCustomLabel4 sets CustomLabel4 field to given value.

### HasCustomLabel4

`func (o *CatalogsUpdatableCreativeAssetsAttributes) HasCustomLabel4() bool`

HasCustomLabel4 returns a boolean if a field has been set.

### SetCustomLabel4Nil

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetCustomLabel4Nil(b bool)`

 SetCustomLabel4Nil sets the value for CustomLabel4 to be an explicit nil

### UnsetCustomLabel4
`func (o *CatalogsUpdatableCreativeAssetsAttributes) UnsetCustomLabel4()`

UnsetCustomLabel4 ensures that no value is present for CustomLabel4, not even an explicit nil
### GetVisibility

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetVisibility() string`

GetVisibility returns the Visibility field if non-nil, zero value otherwise.

### GetVisibilityOk

`func (o *CatalogsUpdatableCreativeAssetsAttributes) GetVisibilityOk() (*string, bool)`

GetVisibilityOk returns a tuple with the Visibility field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisibility

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetVisibility(v string)`

SetVisibility sets Visibility field to given value.

### HasVisibility

`func (o *CatalogsUpdatableCreativeAssetsAttributes) HasVisibility() bool`

HasVisibility returns a boolean if a field has been set.

### SetVisibilityNil

`func (o *CatalogsUpdatableCreativeAssetsAttributes) SetVisibilityNil(b bool)`

 SetVisibilityNil sets the value for Visibility to be an explicit nil

### UnsetVisibility
`func (o *CatalogsUpdatableCreativeAssetsAttributes) UnsetVisibility()`

UnsetVisibility ensures that no value is present for Visibility, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


