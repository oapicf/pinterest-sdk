# AdPreviewRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ImageUrl** | **string** | Image URL. | 
**PromotionId** | Pointer to **string** | Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. | [optional] 
**Title** | **string** | Title displayed below ad. | 
**CreativeType** | [**AdShoppingPreviewCreativeType**](AdShoppingPreviewCreativeType.md) | Ad format of the shopping ad preview. | 
**PinId** | **string** | Pin ID. | 
**CatalogProductGroupId** | **string** | Catalog Product Group Id. | 
**CustomizableCtaType** | Pointer to [**NullableCustomizableCTAType**](CustomizableCTAType.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; | [optional] 
**HeroImageTitle** | Pointer to **string** | Title displayed below ad. | [optional] 
**HeroImageUrl** | Pointer to **string** | Hero image URL. | [optional] 
**HeroPinId** | Pointer to **string** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional] 
**ImageTag** | Pointer to **string** | Multi image template tag. | [optional] 
**ItemId** | Pointer to **string** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional] 
**PreferredMediaType** | Pointer to [**BasePreferredMediaType**](BasePreferredMediaType.md) | Preferred media type. | [optional] 
**ShowPromotion** | Pointer to **bool** | Include promotion data in preview when available on catalog item. Defaults to false. | [optional] 
**VideoTag** | Pointer to **string** | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional] 

## Methods

### NewAdPreviewRequest

`func NewAdPreviewRequest(imageUrl string, title string, creativeType AdShoppingPreviewCreativeType, pinId string, catalogProductGroupId string, ) *AdPreviewRequest`

NewAdPreviewRequest instantiates a new AdPreviewRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdPreviewRequestWithDefaults

`func NewAdPreviewRequestWithDefaults() *AdPreviewRequest`

NewAdPreviewRequestWithDefaults instantiates a new AdPreviewRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetImageUrl

`func (o *AdPreviewRequest) GetImageUrl() string`

GetImageUrl returns the ImageUrl field if non-nil, zero value otherwise.

### GetImageUrlOk

`func (o *AdPreviewRequest) GetImageUrlOk() (*string, bool)`

GetImageUrlOk returns a tuple with the ImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageUrl

`func (o *AdPreviewRequest) SetImageUrl(v string)`

SetImageUrl sets ImageUrl field to given value.


### GetPromotionId

`func (o *AdPreviewRequest) GetPromotionId() string`

GetPromotionId returns the PromotionId field if non-nil, zero value otherwise.

### GetPromotionIdOk

`func (o *AdPreviewRequest) GetPromotionIdOk() (*string, bool)`

GetPromotionIdOk returns a tuple with the PromotionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPromotionId

`func (o *AdPreviewRequest) SetPromotionId(v string)`

SetPromotionId sets PromotionId field to given value.

### HasPromotionId

`func (o *AdPreviewRequest) HasPromotionId() bool`

HasPromotionId returns a boolean if a field has been set.

### GetTitle

`func (o *AdPreviewRequest) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *AdPreviewRequest) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *AdPreviewRequest) SetTitle(v string)`

SetTitle sets Title field to given value.


### GetCreativeType

`func (o *AdPreviewRequest) GetCreativeType() AdShoppingPreviewCreativeType`

GetCreativeType returns the CreativeType field if non-nil, zero value otherwise.

### GetCreativeTypeOk

`func (o *AdPreviewRequest) GetCreativeTypeOk() (*AdShoppingPreviewCreativeType, bool)`

GetCreativeTypeOk returns a tuple with the CreativeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeType

`func (o *AdPreviewRequest) SetCreativeType(v AdShoppingPreviewCreativeType)`

SetCreativeType sets CreativeType field to given value.


### GetPinId

`func (o *AdPreviewRequest) GetPinId() string`

GetPinId returns the PinId field if non-nil, zero value otherwise.

### GetPinIdOk

`func (o *AdPreviewRequest) GetPinIdOk() (*string, bool)`

GetPinIdOk returns a tuple with the PinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinId

`func (o *AdPreviewRequest) SetPinId(v string)`

SetPinId sets PinId field to given value.


### GetCatalogProductGroupId

`func (o *AdPreviewRequest) GetCatalogProductGroupId() string`

GetCatalogProductGroupId returns the CatalogProductGroupId field if non-nil, zero value otherwise.

### GetCatalogProductGroupIdOk

`func (o *AdPreviewRequest) GetCatalogProductGroupIdOk() (*string, bool)`

GetCatalogProductGroupIdOk returns a tuple with the CatalogProductGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCatalogProductGroupId

`func (o *AdPreviewRequest) SetCatalogProductGroupId(v string)`

SetCatalogProductGroupId sets CatalogProductGroupId field to given value.


### GetCustomizableCtaType

`func (o *AdPreviewRequest) GetCustomizableCtaType() CustomizableCTAType`

GetCustomizableCtaType returns the CustomizableCtaType field if non-nil, zero value otherwise.

### GetCustomizableCtaTypeOk

`func (o *AdPreviewRequest) GetCustomizableCtaTypeOk() (*CustomizableCTAType, bool)`

GetCustomizableCtaTypeOk returns a tuple with the CustomizableCtaType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomizableCtaType

`func (o *AdPreviewRequest) SetCustomizableCtaType(v CustomizableCTAType)`

SetCustomizableCtaType sets CustomizableCtaType field to given value.

### HasCustomizableCtaType

`func (o *AdPreviewRequest) HasCustomizableCtaType() bool`

HasCustomizableCtaType returns a boolean if a field has been set.

### SetCustomizableCtaTypeNil

`func (o *AdPreviewRequest) SetCustomizableCtaTypeNil(b bool)`

 SetCustomizableCtaTypeNil sets the value for CustomizableCtaType to be an explicit nil

### UnsetCustomizableCtaType
`func (o *AdPreviewRequest) UnsetCustomizableCtaType()`

UnsetCustomizableCtaType ensures that no value is present for CustomizableCtaType, not even an explicit nil
### GetHeroImageTitle

`func (o *AdPreviewRequest) GetHeroImageTitle() string`

GetHeroImageTitle returns the HeroImageTitle field if non-nil, zero value otherwise.

### GetHeroImageTitleOk

`func (o *AdPreviewRequest) GetHeroImageTitleOk() (*string, bool)`

GetHeroImageTitleOk returns a tuple with the HeroImageTitle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeroImageTitle

`func (o *AdPreviewRequest) SetHeroImageTitle(v string)`

SetHeroImageTitle sets HeroImageTitle field to given value.

### HasHeroImageTitle

`func (o *AdPreviewRequest) HasHeroImageTitle() bool`

HasHeroImageTitle returns a boolean if a field has been set.

### GetHeroImageUrl

`func (o *AdPreviewRequest) GetHeroImageUrl() string`

GetHeroImageUrl returns the HeroImageUrl field if non-nil, zero value otherwise.

### GetHeroImageUrlOk

`func (o *AdPreviewRequest) GetHeroImageUrlOk() (*string, bool)`

GetHeroImageUrlOk returns a tuple with the HeroImageUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeroImageUrl

`func (o *AdPreviewRequest) SetHeroImageUrl(v string)`

SetHeroImageUrl sets HeroImageUrl field to given value.

### HasHeroImageUrl

`func (o *AdPreviewRequest) HasHeroImageUrl() bool`

HasHeroImageUrl returns a boolean if a field has been set.

### GetHeroPinId

`func (o *AdPreviewRequest) GetHeroPinId() string`

GetHeroPinId returns the HeroPinId field if non-nil, zero value otherwise.

### GetHeroPinIdOk

`func (o *AdPreviewRequest) GetHeroPinIdOk() (*string, bool)`

GetHeroPinIdOk returns a tuple with the HeroPinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeroPinId

`func (o *AdPreviewRequest) SetHeroPinId(v string)`

SetHeroPinId sets HeroPinId field to given value.

### HasHeroPinId

`func (o *AdPreviewRequest) HasHeroPinId() bool`

HasHeroPinId returns a boolean if a field has been set.

### GetImageTag

`func (o *AdPreviewRequest) GetImageTag() string`

GetImageTag returns the ImageTag field if non-nil, zero value otherwise.

### GetImageTagOk

`func (o *AdPreviewRequest) GetImageTagOk() (*string, bool)`

GetImageTagOk returns a tuple with the ImageTag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageTag

`func (o *AdPreviewRequest) SetImageTag(v string)`

SetImageTag sets ImageTag field to given value.

### HasImageTag

`func (o *AdPreviewRequest) HasImageTag() bool`

HasImageTag returns a boolean if a field has been set.

### GetItemId

`func (o *AdPreviewRequest) GetItemId() string`

GetItemId returns the ItemId field if non-nil, zero value otherwise.

### GetItemIdOk

`func (o *AdPreviewRequest) GetItemIdOk() (*string, bool)`

GetItemIdOk returns a tuple with the ItemId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemId

`func (o *AdPreviewRequest) SetItemId(v string)`

SetItemId sets ItemId field to given value.

### HasItemId

`func (o *AdPreviewRequest) HasItemId() bool`

HasItemId returns a boolean if a field has been set.

### GetPreferredMediaType

`func (o *AdPreviewRequest) GetPreferredMediaType() BasePreferredMediaType`

GetPreferredMediaType returns the PreferredMediaType field if non-nil, zero value otherwise.

### GetPreferredMediaTypeOk

`func (o *AdPreviewRequest) GetPreferredMediaTypeOk() (*BasePreferredMediaType, bool)`

GetPreferredMediaTypeOk returns a tuple with the PreferredMediaType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreferredMediaType

`func (o *AdPreviewRequest) SetPreferredMediaType(v BasePreferredMediaType)`

SetPreferredMediaType sets PreferredMediaType field to given value.

### HasPreferredMediaType

`func (o *AdPreviewRequest) HasPreferredMediaType() bool`

HasPreferredMediaType returns a boolean if a field has been set.

### GetShowPromotion

`func (o *AdPreviewRequest) GetShowPromotion() bool`

GetShowPromotion returns the ShowPromotion field if non-nil, zero value otherwise.

### GetShowPromotionOk

`func (o *AdPreviewRequest) GetShowPromotionOk() (*bool, bool)`

GetShowPromotionOk returns a tuple with the ShowPromotion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShowPromotion

`func (o *AdPreviewRequest) SetShowPromotion(v bool)`

SetShowPromotion sets ShowPromotion field to given value.

### HasShowPromotion

`func (o *AdPreviewRequest) HasShowPromotion() bool`

HasShowPromotion returns a boolean if a field has been set.

### GetVideoTag

`func (o *AdPreviewRequest) GetVideoTag() string`

GetVideoTag returns the VideoTag field if non-nil, zero value otherwise.

### GetVideoTagOk

`func (o *AdPreviewRequest) GetVideoTagOk() (*string, bool)`

GetVideoTagOk returns a tuple with the VideoTag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVideoTag

`func (o *AdPreviewRequest) SetVideoTag(v string)`

SetVideoTag sets VideoTag field to given value.

### HasVideoTag

`func (o *AdPreviewRequest) HasVideoTag() bool`

HasVideoTag returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


