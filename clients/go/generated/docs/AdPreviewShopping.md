# AdPreviewShopping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogProductGroupId** | **string** | Catalog Product Group Id. | 
**CreativeType** | **string** | Ad format of the shopping ad preview. | 
**CustomizableCtaType** | Pointer to [**NullableCustomizableCTAType**](CustomizableCTAType.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; | [optional] 
**HeroImageTitle** | Pointer to **string** | Title displayed below ad. | [optional] 
**HeroImageUrl** | Pointer to **string** | Hero image URL. | [optional] 
**HeroPinId** | Pointer to **string** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional] 
**ImageTag** | Pointer to **string** | Multi image template tag. | [optional] 
**ItemId** | Pointer to **string** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional] 
**PreferredMediaType** | Pointer to **string** | Preferred media type. | [optional] 
**VideoTag** | Pointer to **string** | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional] 

## Methods

### NewAdPreviewShopping

`func NewAdPreviewShopping(catalogProductGroupId string, creativeType string, ) *AdPreviewShopping`

NewAdPreviewShopping instantiates a new AdPreviewShopping object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdPreviewShoppingWithDefaults

`func NewAdPreviewShoppingWithDefaults() *AdPreviewShopping`

NewAdPreviewShoppingWithDefaults instantiates a new AdPreviewShopping object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCatalogProductGroupId

`func (o *AdPreviewShopping) GetCatalogProductGroupId() string`

GetCatalogProductGroupId returns the CatalogProductGroupId field if non-nil, zero value otherwise.

### GetCatalogProductGroupIdOk

`func (o *AdPreviewShopping) GetCatalogProductGroupIdOk() (*string, bool)`

GetCatalogProductGroupIdOk returns a tuple with the CatalogProductGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogProductGroupId

`func (o *AdPreviewShopping) SetCatalogProductGroupId(v string)`

SetCatalogProductGroupId sets CatalogProductGroupId field to given value.


### GetCreativeType

`func (o *AdPreviewShopping) GetCreativeType() string`

GetCreativeType returns the CreativeType field if non-nil, zero value otherwise.

### GetCreativeTypeOk

`func (o *AdPreviewShopping) GetCreativeTypeOk() (*string, bool)`

GetCreativeTypeOk returns a tuple with the CreativeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeType

`func (o *AdPreviewShopping) SetCreativeType(v string)`

SetCreativeType sets CreativeType field to given value.


### GetCustomizableCtaType

`func (o *AdPreviewShopping) GetCustomizableCtaType() CustomizableCTAType`

GetCustomizableCtaType returns the CustomizableCtaType field if non-nil, zero value otherwise.

### GetCustomizableCtaTypeOk

`func (o *AdPreviewShopping) GetCustomizableCtaTypeOk() (*CustomizableCTAType, bool)`

GetCustomizableCtaTypeOk returns a tuple with the CustomizableCtaType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomizableCtaType

`func (o *AdPreviewShopping) SetCustomizableCtaType(v CustomizableCTAType)`

SetCustomizableCtaType sets CustomizableCtaType field to given value.

### HasCustomizableCtaType

`func (o *AdPreviewShopping) HasCustomizableCtaType() bool`

HasCustomizableCtaType returns a boolean if a field has been set.

### SetCustomizableCtaTypeNil

`func (o *AdPreviewShopping) SetCustomizableCtaTypeNil(b bool)`

 SetCustomizableCtaTypeNil sets the value for CustomizableCtaType to be an explicit nil

### UnsetCustomizableCtaType
`func (o *AdPreviewShopping) UnsetCustomizableCtaType()`

UnsetCustomizableCtaType ensures that no value is present for CustomizableCtaType, not even an explicit nil
### GetHeroImageTitle

`func (o *AdPreviewShopping) GetHeroImageTitle() string`

GetHeroImageTitle returns the HeroImageTitle field if non-nil, zero value otherwise.

### GetHeroImageTitleOk

`func (o *AdPreviewShopping) GetHeroImageTitleOk() (*string, bool)`

GetHeroImageTitleOk returns a tuple with the HeroImageTitle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeroImageTitle

`func (o *AdPreviewShopping) SetHeroImageTitle(v string)`

SetHeroImageTitle sets HeroImageTitle field to given value.

### HasHeroImageTitle

`func (o *AdPreviewShopping) HasHeroImageTitle() bool`

HasHeroImageTitle returns a boolean if a field has been set.

### GetHeroImageUrl

`func (o *AdPreviewShopping) GetHeroImageUrl() string`

GetHeroImageUrl returns the HeroImageUrl field if non-nil, zero value otherwise.

### GetHeroImageUrlOk

`func (o *AdPreviewShopping) GetHeroImageUrlOk() (*string, bool)`

GetHeroImageUrlOk returns a tuple with the HeroImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeroImageUrl

`func (o *AdPreviewShopping) SetHeroImageUrl(v string)`

SetHeroImageUrl sets HeroImageUrl field to given value.

### HasHeroImageUrl

`func (o *AdPreviewShopping) HasHeroImageUrl() bool`

HasHeroImageUrl returns a boolean if a field has been set.

### GetHeroPinId

`func (o *AdPreviewShopping) GetHeroPinId() string`

GetHeroPinId returns the HeroPinId field if non-nil, zero value otherwise.

### GetHeroPinIdOk

`func (o *AdPreviewShopping) GetHeroPinIdOk() (*string, bool)`

GetHeroPinIdOk returns a tuple with the HeroPinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeroPinId

`func (o *AdPreviewShopping) SetHeroPinId(v string)`

SetHeroPinId sets HeroPinId field to given value.

### HasHeroPinId

`func (o *AdPreviewShopping) HasHeroPinId() bool`

HasHeroPinId returns a boolean if a field has been set.

### GetImageTag

`func (o *AdPreviewShopping) GetImageTag() string`

GetImageTag returns the ImageTag field if non-nil, zero value otherwise.

### GetImageTagOk

`func (o *AdPreviewShopping) GetImageTagOk() (*string, bool)`

GetImageTagOk returns a tuple with the ImageTag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageTag

`func (o *AdPreviewShopping) SetImageTag(v string)`

SetImageTag sets ImageTag field to given value.

### HasImageTag

`func (o *AdPreviewShopping) HasImageTag() bool`

HasImageTag returns a boolean if a field has been set.

### GetItemId

`func (o *AdPreviewShopping) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *AdPreviewShopping) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *AdPreviewShopping) SetItemId(v string)`

SetItemId sets ItemId field to given value.

### HasItemId

`func (o *AdPreviewShopping) HasItemId() bool`

HasItemId returns a boolean if a field has been set.

### GetPreferredMediaType

`func (o *AdPreviewShopping) GetPreferredMediaType() string`

GetPreferredMediaType returns the PreferredMediaType field if non-nil, zero value otherwise.

### GetPreferredMediaTypeOk

`func (o *AdPreviewShopping) GetPreferredMediaTypeOk() (*string, bool)`

GetPreferredMediaTypeOk returns a tuple with the PreferredMediaType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferredMediaType

`func (o *AdPreviewShopping) SetPreferredMediaType(v string)`

SetPreferredMediaType sets PreferredMediaType field to given value.

### HasPreferredMediaType

`func (o *AdPreviewShopping) HasPreferredMediaType() bool`

HasPreferredMediaType returns a boolean if a field has been set.

### GetVideoTag

`func (o *AdPreviewShopping) GetVideoTag() string`

GetVideoTag returns the VideoTag field if non-nil, zero value otherwise.

### GetVideoTagOk

`func (o *AdPreviewShopping) GetVideoTagOk() (*string, bool)`

GetVideoTagOk returns a tuple with the VideoTag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVideoTag

`func (o *AdPreviewShopping) SetVideoTag(v string)`

SetVideoTag sets VideoTag field to given value.

### HasVideoTag

`func (o *AdPreviewShopping) HasVideoTag() bool`

HasVideoTag returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


