# CatalogsCreativeAssetsAttributes

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
**ImageLink** | Pointer to **string** | The creative assets image. | [optional] 
**VideoLink** | Pointer to **string** | The creative assets video. | [optional] 

## Methods

### NewCatalogsCreativeAssetsAttributes

`func NewCatalogsCreativeAssetsAttributes() *CatalogsCreativeAssetsAttributes`

NewCatalogsCreativeAssetsAttributes instantiates a new CatalogsCreativeAssetsAttributes object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCatalogsCreativeAssetsAttributesWithDefaults

`func NewCatalogsCreativeAssetsAttributesWithDefaults() *CatalogsCreativeAssetsAttributes`

NewCatalogsCreativeAssetsAttributesWithDefaults instantiates a new CatalogsCreativeAssetsAttributes object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTitle

`func (o *CatalogsCreativeAssetsAttributes) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *CatalogsCreativeAssetsAttributes) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *CatalogsCreativeAssetsAttributes) SetTitle(v string)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *CatalogsCreativeAssetsAttributes) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetDescription

`func (o *CatalogsCreativeAssetsAttributes) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CatalogsCreativeAssetsAttributes) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CatalogsCreativeAssetsAttributes) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CatalogsCreativeAssetsAttributes) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetLink

`func (o *CatalogsCreativeAssetsAttributes) GetLink() string`

GetLink returns the Link field if non-nil, zero value otherwise.

### GetLinkOk

`func (o *CatalogsCreativeAssetsAttributes) GetLinkOk() (*string, bool)`

GetLinkOk returns a tuple with the Link field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLink

`func (o *CatalogsCreativeAssetsAttributes) SetLink(v string)`

SetLink sets Link field to given value.

### HasLink

`func (o *CatalogsCreativeAssetsAttributes) HasLink() bool`

HasLink returns a boolean if a field has been set.

### GetIosDeepLink

`func (o *CatalogsCreativeAssetsAttributes) GetIosDeepLink() string`

GetIosDeepLink returns the IosDeepLink field if non-nil, zero value otherwise.

### GetIosDeepLinkOk

`func (o *CatalogsCreativeAssetsAttributes) GetIosDeepLinkOk() (*string, bool)`

GetIosDeepLinkOk returns a tuple with the IosDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIosDeepLink

`func (o *CatalogsCreativeAssetsAttributes) SetIosDeepLink(v string)`

SetIosDeepLink sets IosDeepLink field to given value.

### HasIosDeepLink

`func (o *CatalogsCreativeAssetsAttributes) HasIosDeepLink() bool`

HasIosDeepLink returns a boolean if a field has been set.

### SetIosDeepLinkNil

`func (o *CatalogsCreativeAssetsAttributes) SetIosDeepLinkNil(b bool)`

 SetIosDeepLinkNil sets the value for IosDeepLink to be an explicit nil

### UnsetIosDeepLink
`func (o *CatalogsCreativeAssetsAttributes) UnsetIosDeepLink()`

UnsetIosDeepLink ensures that no value is present for IosDeepLink, not even an explicit nil
### GetAndroidDeepLink

`func (o *CatalogsCreativeAssetsAttributes) GetAndroidDeepLink() string`

GetAndroidDeepLink returns the AndroidDeepLink field if non-nil, zero value otherwise.

### GetAndroidDeepLinkOk

`func (o *CatalogsCreativeAssetsAttributes) GetAndroidDeepLinkOk() (*string, bool)`

GetAndroidDeepLinkOk returns a tuple with the AndroidDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAndroidDeepLink

`func (o *CatalogsCreativeAssetsAttributes) SetAndroidDeepLink(v string)`

SetAndroidDeepLink sets AndroidDeepLink field to given value.

### HasAndroidDeepLink

`func (o *CatalogsCreativeAssetsAttributes) HasAndroidDeepLink() bool`

HasAndroidDeepLink returns a boolean if a field has been set.

### SetAndroidDeepLinkNil

`func (o *CatalogsCreativeAssetsAttributes) SetAndroidDeepLinkNil(b bool)`

 SetAndroidDeepLinkNil sets the value for AndroidDeepLink to be an explicit nil

### UnsetAndroidDeepLink
`func (o *CatalogsCreativeAssetsAttributes) UnsetAndroidDeepLink()`

UnsetAndroidDeepLink ensures that no value is present for AndroidDeepLink, not even an explicit nil
### GetGoogleProductCategory

`func (o *CatalogsCreativeAssetsAttributes) GetGoogleProductCategory() string`

GetGoogleProductCategory returns the GoogleProductCategory field if non-nil, zero value otherwise.

### GetGoogleProductCategoryOk

`func (o *CatalogsCreativeAssetsAttributes) GetGoogleProductCategoryOk() (*string, bool)`

GetGoogleProductCategoryOk returns a tuple with the GoogleProductCategory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGoogleProductCategory

`func (o *CatalogsCreativeAssetsAttributes) SetGoogleProductCategory(v string)`

SetGoogleProductCategory sets GoogleProductCategory field to given value.

### HasGoogleProductCategory

`func (o *CatalogsCreativeAssetsAttributes) HasGoogleProductCategory() bool`

HasGoogleProductCategory returns a boolean if a field has been set.

### SetGoogleProductCategoryNil

`func (o *CatalogsCreativeAssetsAttributes) SetGoogleProductCategoryNil(b bool)`

 SetGoogleProductCategoryNil sets the value for GoogleProductCategory to be an explicit nil

### UnsetGoogleProductCategory
`func (o *CatalogsCreativeAssetsAttributes) UnsetGoogleProductCategory()`

UnsetGoogleProductCategory ensures that no value is present for GoogleProductCategory, not even an explicit nil
### GetCustomLabel0

`func (o *CatalogsCreativeAssetsAttributes) GetCustomLabel0() string`

GetCustomLabel0 returns the CustomLabel0 field if non-nil, zero value otherwise.

### GetCustomLabel0Ok

`func (o *CatalogsCreativeAssetsAttributes) GetCustomLabel0Ok() (*string, bool)`

GetCustomLabel0Ok returns a tuple with the CustomLabel0 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel0

`func (o *CatalogsCreativeAssetsAttributes) SetCustomLabel0(v string)`

SetCustomLabel0 sets CustomLabel0 field to given value.

### HasCustomLabel0

`func (o *CatalogsCreativeAssetsAttributes) HasCustomLabel0() bool`

HasCustomLabel0 returns a boolean if a field has been set.

### SetCustomLabel0Nil

`func (o *CatalogsCreativeAssetsAttributes) SetCustomLabel0Nil(b bool)`

 SetCustomLabel0Nil sets the value for CustomLabel0 to be an explicit nil

### UnsetCustomLabel0
`func (o *CatalogsCreativeAssetsAttributes) UnsetCustomLabel0()`

UnsetCustomLabel0 ensures that no value is present for CustomLabel0, not even an explicit nil
### GetCustomLabel1

`func (o *CatalogsCreativeAssetsAttributes) GetCustomLabel1() string`

GetCustomLabel1 returns the CustomLabel1 field if non-nil, zero value otherwise.

### GetCustomLabel1Ok

`func (o *CatalogsCreativeAssetsAttributes) GetCustomLabel1Ok() (*string, bool)`

GetCustomLabel1Ok returns a tuple with the CustomLabel1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel1

`func (o *CatalogsCreativeAssetsAttributes) SetCustomLabel1(v string)`

SetCustomLabel1 sets CustomLabel1 field to given value.

### HasCustomLabel1

`func (o *CatalogsCreativeAssetsAttributes) HasCustomLabel1() bool`

HasCustomLabel1 returns a boolean if a field has been set.

### SetCustomLabel1Nil

`func (o *CatalogsCreativeAssetsAttributes) SetCustomLabel1Nil(b bool)`

 SetCustomLabel1Nil sets the value for CustomLabel1 to be an explicit nil

### UnsetCustomLabel1
`func (o *CatalogsCreativeAssetsAttributes) UnsetCustomLabel1()`

UnsetCustomLabel1 ensures that no value is present for CustomLabel1, not even an explicit nil
### GetCustomLabel2

`func (o *CatalogsCreativeAssetsAttributes) GetCustomLabel2() string`

GetCustomLabel2 returns the CustomLabel2 field if non-nil, zero value otherwise.

### GetCustomLabel2Ok

`func (o *CatalogsCreativeAssetsAttributes) GetCustomLabel2Ok() (*string, bool)`

GetCustomLabel2Ok returns a tuple with the CustomLabel2 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel2

`func (o *CatalogsCreativeAssetsAttributes) SetCustomLabel2(v string)`

SetCustomLabel2 sets CustomLabel2 field to given value.

### HasCustomLabel2

`func (o *CatalogsCreativeAssetsAttributes) HasCustomLabel2() bool`

HasCustomLabel2 returns a boolean if a field has been set.

### SetCustomLabel2Nil

`func (o *CatalogsCreativeAssetsAttributes) SetCustomLabel2Nil(b bool)`

 SetCustomLabel2Nil sets the value for CustomLabel2 to be an explicit nil

### UnsetCustomLabel2
`func (o *CatalogsCreativeAssetsAttributes) UnsetCustomLabel2()`

UnsetCustomLabel2 ensures that no value is present for CustomLabel2, not even an explicit nil
### GetCustomLabel3

`func (o *CatalogsCreativeAssetsAttributes) GetCustomLabel3() string`

GetCustomLabel3 returns the CustomLabel3 field if non-nil, zero value otherwise.

### GetCustomLabel3Ok

`func (o *CatalogsCreativeAssetsAttributes) GetCustomLabel3Ok() (*string, bool)`

GetCustomLabel3Ok returns a tuple with the CustomLabel3 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel3

`func (o *CatalogsCreativeAssetsAttributes) SetCustomLabel3(v string)`

SetCustomLabel3 sets CustomLabel3 field to given value.

### HasCustomLabel3

`func (o *CatalogsCreativeAssetsAttributes) HasCustomLabel3() bool`

HasCustomLabel3 returns a boolean if a field has been set.

### SetCustomLabel3Nil

`func (o *CatalogsCreativeAssetsAttributes) SetCustomLabel3Nil(b bool)`

 SetCustomLabel3Nil sets the value for CustomLabel3 to be an explicit nil

### UnsetCustomLabel3
`func (o *CatalogsCreativeAssetsAttributes) UnsetCustomLabel3()`

UnsetCustomLabel3 ensures that no value is present for CustomLabel3, not even an explicit nil
### GetCustomLabel4

`func (o *CatalogsCreativeAssetsAttributes) GetCustomLabel4() string`

GetCustomLabel4 returns the CustomLabel4 field if non-nil, zero value otherwise.

### GetCustomLabel4Ok

`func (o *CatalogsCreativeAssetsAttributes) GetCustomLabel4Ok() (*string, bool)`

GetCustomLabel4Ok returns a tuple with the CustomLabel4 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomLabel4

`func (o *CatalogsCreativeAssetsAttributes) SetCustomLabel4(v string)`

SetCustomLabel4 sets CustomLabel4 field to given value.

### HasCustomLabel4

`func (o *CatalogsCreativeAssetsAttributes) HasCustomLabel4() bool`

HasCustomLabel4 returns a boolean if a field has been set.

### SetCustomLabel4Nil

`func (o *CatalogsCreativeAssetsAttributes) SetCustomLabel4Nil(b bool)`

 SetCustomLabel4Nil sets the value for CustomLabel4 to be an explicit nil

### UnsetCustomLabel4
`func (o *CatalogsCreativeAssetsAttributes) UnsetCustomLabel4()`

UnsetCustomLabel4 ensures that no value is present for CustomLabel4, not even an explicit nil
### GetVisibility

`func (o *CatalogsCreativeAssetsAttributes) GetVisibility() string`

GetVisibility returns the Visibility field if non-nil, zero value otherwise.

### GetVisibilityOk

`func (o *CatalogsCreativeAssetsAttributes) GetVisibilityOk() (*string, bool)`

GetVisibilityOk returns a tuple with the Visibility field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVisibility

`func (o *CatalogsCreativeAssetsAttributes) SetVisibility(v string)`

SetVisibility sets Visibility field to given value.

### HasVisibility

`func (o *CatalogsCreativeAssetsAttributes) HasVisibility() bool`

HasVisibility returns a boolean if a field has been set.

### SetVisibilityNil

`func (o *CatalogsCreativeAssetsAttributes) SetVisibilityNil(b bool)`

 SetVisibilityNil sets the value for Visibility to be an explicit nil

### UnsetVisibility
`func (o *CatalogsCreativeAssetsAttributes) UnsetVisibility()`

UnsetVisibility ensures that no value is present for Visibility, not even an explicit nil
### GetImageLink

`func (o *CatalogsCreativeAssetsAttributes) GetImageLink() string`

GetImageLink returns the ImageLink field if non-nil, zero value otherwise.

### GetImageLinkOk

`func (o *CatalogsCreativeAssetsAttributes) GetImageLinkOk() (*string, bool)`

GetImageLinkOk returns a tuple with the ImageLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageLink

`func (o *CatalogsCreativeAssetsAttributes) SetImageLink(v string)`

SetImageLink sets ImageLink field to given value.

### HasImageLink

`func (o *CatalogsCreativeAssetsAttributes) HasImageLink() bool`

HasImageLink returns a boolean if a field has been set.

### GetVideoLink

`func (o *CatalogsCreativeAssetsAttributes) GetVideoLink() string`

GetVideoLink returns the VideoLink field if non-nil, zero value otherwise.

### GetVideoLinkOk

`func (o *CatalogsCreativeAssetsAttributes) GetVideoLinkOk() (*string, bool)`

GetVideoLinkOk returns a tuple with the VideoLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVideoLink

`func (o *CatalogsCreativeAssetsAttributes) SetVideoLink(v string)`

SetVideoLink sets VideoLink field to given value.

### HasVideoLink

`func (o *CatalogsCreativeAssetsAttributes) HasVideoLink() bool`

HasVideoLink returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


