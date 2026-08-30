# Ad

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **string** | The ID of the advertiser that this ad belongs to. | [readonly] 
**AdGroupId** | **string** | ID of the ad group that contains the ad. | 
**AndroidDeepLink** | Pointer to **NullableString** | Deep link URL for Android devices. | [optional] 
**CampaignId** | **string** | ID of the ad campaign that contains this ad. | [readonly] 
**CarouselAndroidDeepLinks** | Pointer to **[]string** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**CarouselDestinationUrls** | Pointer to **[]string** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**CarouselIosDeepLinks** | Pointer to **[]string** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**CartingPlatformType** | Pointer to **int32** | The vendor platform type of the carting/WTB ad. | [optional] [readonly] 
**CartingProducts** | Pointer to [**[]CartingProduct**](CartingProduct.md) | Array of carting/WTB products for the ad. | [optional] [readonly] 
**ClickTrackingUrl** | Pointer to **NullableString** | Tracking url for the ad clicks. | [optional] 
**CollectionItemsDestinationUrlTemplate** | Pointer to **NullableString** | Destination URL template for all items within a collections drawer. | [optional] 
**CollectionsHeaderType** | Pointer to [**NullableAdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  | [optional] 
**CreatedTime** | Pointer to **int32** | Pin creation time. Unix timestamp in seconds. | [optional] [readonly] 
**CreativeType** | [**CreativeType**](CreativeType.md) |  | 
**CustomizableCtaType** | Pointer to [**NullableCustomizableCTAType**](CustomizableCTAType.md) |  | [optional] 
**DestinationUrl** | Pointer to **NullableString** | Destination URL. | [optional] 
**DisclosureType** | Pointer to [**NullableDisclosureType**](DisclosureType.md) |  | [optional] 
**DisclosureUrl** | Pointer to **NullableString** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**GridClickType** | Pointer to [**NullableGridClickType**](GridClickType.md) |  | [optional] 
**Id** | **string** | The ID of this ad. | 
**IosDeepLink** | Pointer to **NullableString** | Deep link URL for iOS devices. | [optional] 
**IsCarting** | Pointer to **bool** | Is the ad a carting/WTB ad? | [optional] 
**IsCollageAcceptedTerms** | Pointer to **bool** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] 
**IsCollageSingleDestination** | Pointer to **bool** | Whether the collage ad has a single destination url override. | [optional] 
**IsPinDeleted** | Pointer to **bool** | Is original pin deleted? | [optional] 
**IsRemovable** | Pointer to **bool** | Is pin repinnable? | [optional] 
**LeadFormId** | Pointer to **NullableString** | Lead form ID for lead ad generation. | [optional] 
**Name** | Pointer to **NullableString** | Name of the ad - 255 chars max. | [optional] 
**PinId** | **string** | Pin ID. This field may only be updated for draft ads. | 
**QuizPinData** | Pointer to [**NullableQuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**RejectedReasons** | [**[]AdDisapprovalReasons**](AdDisapprovalReasons.md) | Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] 
**RejectionLabels** | **[]string** | Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] 
**ReviewStatus** | [**AdReviewStatus**](AdReviewStatus.md) | Ad review status | [readonly] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] 
**SummaryStatus** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [readonly] 
**TrackingUrls** | Pointer to [**NullableTrackingUrls**](TrackingUrls.md) |  | [optional] 
**Type** | **string** | Always \&quot;ad\&quot;. | [readonly] 
**UpdatedTime** | Pointer to **int32** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 
**ViewTrackingUrl** | Pointer to **NullableString** | Tracking URL for ad impressions. | [optional] 

## Methods

### NewAd

`func NewAd(adAccountId string, adGroupId string, campaignId string, creativeType CreativeType, id string, pinId string, rejectedReasons []AdDisapprovalReasons, rejectionLabels []string, reviewStatus AdReviewStatus, summaryStatus PinPromotionSummaryStatus, type_ string, ) *Ad`

NewAd instantiates a new Ad object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdWithDefaults

`func NewAdWithDefaults() *Ad`

NewAdWithDefaults instantiates a new Ad object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdAccountId

`func (o *Ad) GetAdAccountId() string`

GetAdAccountId returns the AdAccountId field if non-nil, zero value otherwise.

### GetAdAccountIdOk

`func (o *Ad) GetAdAccountIdOk() (*string, bool)`

GetAdAccountIdOk returns a tuple with the AdAccountId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdAccountId

`func (o *Ad) SetAdAccountId(v string)`

SetAdAccountId sets AdAccountId field to given value.


### GetAdGroupId

`func (o *Ad) GetAdGroupId() string`

GetAdGroupId returns the AdGroupId field if non-nil, zero value otherwise.

### GetAdGroupIdOk

`func (o *Ad) GetAdGroupIdOk() (*string, bool)`

GetAdGroupIdOk returns a tuple with the AdGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupId

`func (o *Ad) SetAdGroupId(v string)`

SetAdGroupId sets AdGroupId field to given value.


### GetAndroidDeepLink

`func (o *Ad) GetAndroidDeepLink() string`

GetAndroidDeepLink returns the AndroidDeepLink field if non-nil, zero value otherwise.

### GetAndroidDeepLinkOk

`func (o *Ad) GetAndroidDeepLinkOk() (*string, bool)`

GetAndroidDeepLinkOk returns a tuple with the AndroidDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAndroidDeepLink

`func (o *Ad) SetAndroidDeepLink(v string)`

SetAndroidDeepLink sets AndroidDeepLink field to given value.

### HasAndroidDeepLink

`func (o *Ad) HasAndroidDeepLink() bool`

HasAndroidDeepLink returns a boolean if a field has been set.

### SetAndroidDeepLinkNil

`func (o *Ad) SetAndroidDeepLinkNil(b bool)`

 SetAndroidDeepLinkNil sets the value for AndroidDeepLink to be an explicit nil

### UnsetAndroidDeepLink
`func (o *Ad) UnsetAndroidDeepLink()`

UnsetAndroidDeepLink ensures that no value is present for AndroidDeepLink, not even an explicit nil
### GetCampaignId

`func (o *Ad) GetCampaignId() string`

GetCampaignId returns the CampaignId field if non-nil, zero value otherwise.

### GetCampaignIdOk

`func (o *Ad) GetCampaignIdOk() (*string, bool)`

GetCampaignIdOk returns a tuple with the CampaignId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCampaignId

`func (o *Ad) SetCampaignId(v string)`

SetCampaignId sets CampaignId field to given value.


### GetCarouselAndroidDeepLinks

`func (o *Ad) GetCarouselAndroidDeepLinks() []string`

GetCarouselAndroidDeepLinks returns the CarouselAndroidDeepLinks field if non-nil, zero value otherwise.

### GetCarouselAndroidDeepLinksOk

`func (o *Ad) GetCarouselAndroidDeepLinksOk() (*[]string, bool)`

GetCarouselAndroidDeepLinksOk returns a tuple with the CarouselAndroidDeepLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselAndroidDeepLinks

`func (o *Ad) SetCarouselAndroidDeepLinks(v []string)`

SetCarouselAndroidDeepLinks sets CarouselAndroidDeepLinks field to given value.

### HasCarouselAndroidDeepLinks

`func (o *Ad) HasCarouselAndroidDeepLinks() bool`

HasCarouselAndroidDeepLinks returns a boolean if a field has been set.

### SetCarouselAndroidDeepLinksNil

`func (o *Ad) SetCarouselAndroidDeepLinksNil(b bool)`

 SetCarouselAndroidDeepLinksNil sets the value for CarouselAndroidDeepLinks to be an explicit nil

### UnsetCarouselAndroidDeepLinks
`func (o *Ad) UnsetCarouselAndroidDeepLinks()`

UnsetCarouselAndroidDeepLinks ensures that no value is present for CarouselAndroidDeepLinks, not even an explicit nil
### GetCarouselDestinationUrls

`func (o *Ad) GetCarouselDestinationUrls() []string`

GetCarouselDestinationUrls returns the CarouselDestinationUrls field if non-nil, zero value otherwise.

### GetCarouselDestinationUrlsOk

`func (o *Ad) GetCarouselDestinationUrlsOk() (*[]string, bool)`

GetCarouselDestinationUrlsOk returns a tuple with the CarouselDestinationUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselDestinationUrls

`func (o *Ad) SetCarouselDestinationUrls(v []string)`

SetCarouselDestinationUrls sets CarouselDestinationUrls field to given value.

### HasCarouselDestinationUrls

`func (o *Ad) HasCarouselDestinationUrls() bool`

HasCarouselDestinationUrls returns a boolean if a field has been set.

### SetCarouselDestinationUrlsNil

`func (o *Ad) SetCarouselDestinationUrlsNil(b bool)`

 SetCarouselDestinationUrlsNil sets the value for CarouselDestinationUrls to be an explicit nil

### UnsetCarouselDestinationUrls
`func (o *Ad) UnsetCarouselDestinationUrls()`

UnsetCarouselDestinationUrls ensures that no value is present for CarouselDestinationUrls, not even an explicit nil
### GetCarouselIosDeepLinks

`func (o *Ad) GetCarouselIosDeepLinks() []string`

GetCarouselIosDeepLinks returns the CarouselIosDeepLinks field if non-nil, zero value otherwise.

### GetCarouselIosDeepLinksOk

`func (o *Ad) GetCarouselIosDeepLinksOk() (*[]string, bool)`

GetCarouselIosDeepLinksOk returns a tuple with the CarouselIosDeepLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselIosDeepLinks

`func (o *Ad) SetCarouselIosDeepLinks(v []string)`

SetCarouselIosDeepLinks sets CarouselIosDeepLinks field to given value.

### HasCarouselIosDeepLinks

`func (o *Ad) HasCarouselIosDeepLinks() bool`

HasCarouselIosDeepLinks returns a boolean if a field has been set.

### SetCarouselIosDeepLinksNil

`func (o *Ad) SetCarouselIosDeepLinksNil(b bool)`

 SetCarouselIosDeepLinksNil sets the value for CarouselIosDeepLinks to be an explicit nil

### UnsetCarouselIosDeepLinks
`func (o *Ad) UnsetCarouselIosDeepLinks()`

UnsetCarouselIosDeepLinks ensures that no value is present for CarouselIosDeepLinks, not even an explicit nil
### GetCartingPlatformType

`func (o *Ad) GetCartingPlatformType() int32`

GetCartingPlatformType returns the CartingPlatformType field if non-nil, zero value otherwise.

### GetCartingPlatformTypeOk

`func (o *Ad) GetCartingPlatformTypeOk() (*int32, bool)`

GetCartingPlatformTypeOk returns a tuple with the CartingPlatformType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCartingPlatformType

`func (o *Ad) SetCartingPlatformType(v int32)`

SetCartingPlatformType sets CartingPlatformType field to given value.

### HasCartingPlatformType

`func (o *Ad) HasCartingPlatformType() bool`

HasCartingPlatformType returns a boolean if a field has been set.

### GetCartingProducts

`func (o *Ad) GetCartingProducts() []CartingProduct`

GetCartingProducts returns the CartingProducts field if non-nil, zero value otherwise.

### GetCartingProductsOk

`func (o *Ad) GetCartingProductsOk() (*[]CartingProduct, bool)`

GetCartingProductsOk returns a tuple with the CartingProducts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCartingProducts

`func (o *Ad) SetCartingProducts(v []CartingProduct)`

SetCartingProducts sets CartingProducts field to given value.

### HasCartingProducts

`func (o *Ad) HasCartingProducts() bool`

HasCartingProducts returns a boolean if a field has been set.

### GetClickTrackingUrl

`func (o *Ad) GetClickTrackingUrl() string`

GetClickTrackingUrl returns the ClickTrackingUrl field if non-nil, zero value otherwise.

### GetClickTrackingUrlOk

`func (o *Ad) GetClickTrackingUrlOk() (*string, bool)`

GetClickTrackingUrlOk returns a tuple with the ClickTrackingUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickTrackingUrl

`func (o *Ad) SetClickTrackingUrl(v string)`

SetClickTrackingUrl sets ClickTrackingUrl field to given value.

### HasClickTrackingUrl

`func (o *Ad) HasClickTrackingUrl() bool`

HasClickTrackingUrl returns a boolean if a field has been set.

### SetClickTrackingUrlNil

`func (o *Ad) SetClickTrackingUrlNil(b bool)`

 SetClickTrackingUrlNil sets the value for ClickTrackingUrl to be an explicit nil

### UnsetClickTrackingUrl
`func (o *Ad) UnsetClickTrackingUrl()`

UnsetClickTrackingUrl ensures that no value is present for ClickTrackingUrl, not even an explicit nil
### GetCollectionItemsDestinationUrlTemplate

`func (o *Ad) GetCollectionItemsDestinationUrlTemplate() string`

GetCollectionItemsDestinationUrlTemplate returns the CollectionItemsDestinationUrlTemplate field if non-nil, zero value otherwise.

### GetCollectionItemsDestinationUrlTemplateOk

`func (o *Ad) GetCollectionItemsDestinationUrlTemplateOk() (*string, bool)`

GetCollectionItemsDestinationUrlTemplateOk returns a tuple with the CollectionItemsDestinationUrlTemplate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollectionItemsDestinationUrlTemplate

`func (o *Ad) SetCollectionItemsDestinationUrlTemplate(v string)`

SetCollectionItemsDestinationUrlTemplate sets CollectionItemsDestinationUrlTemplate field to given value.

### HasCollectionItemsDestinationUrlTemplate

`func (o *Ad) HasCollectionItemsDestinationUrlTemplate() bool`

HasCollectionItemsDestinationUrlTemplate returns a boolean if a field has been set.

### SetCollectionItemsDestinationUrlTemplateNil

`func (o *Ad) SetCollectionItemsDestinationUrlTemplateNil(b bool)`

 SetCollectionItemsDestinationUrlTemplateNil sets the value for CollectionItemsDestinationUrlTemplate to be an explicit nil

### UnsetCollectionItemsDestinationUrlTemplate
`func (o *Ad) UnsetCollectionItemsDestinationUrlTemplate()`

UnsetCollectionItemsDestinationUrlTemplate ensures that no value is present for CollectionItemsDestinationUrlTemplate, not even an explicit nil
### GetCollectionsHeaderType

`func (o *Ad) GetCollectionsHeaderType() AdCollectionsHeaderType`

GetCollectionsHeaderType returns the CollectionsHeaderType field if non-nil, zero value otherwise.

### GetCollectionsHeaderTypeOk

`func (o *Ad) GetCollectionsHeaderTypeOk() (*AdCollectionsHeaderType, bool)`

GetCollectionsHeaderTypeOk returns a tuple with the CollectionsHeaderType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollectionsHeaderType

`func (o *Ad) SetCollectionsHeaderType(v AdCollectionsHeaderType)`

SetCollectionsHeaderType sets CollectionsHeaderType field to given value.

### HasCollectionsHeaderType

`func (o *Ad) HasCollectionsHeaderType() bool`

HasCollectionsHeaderType returns a boolean if a field has been set.

### SetCollectionsHeaderTypeNil

`func (o *Ad) SetCollectionsHeaderTypeNil(b bool)`

 SetCollectionsHeaderTypeNil sets the value for CollectionsHeaderType to be an explicit nil

### UnsetCollectionsHeaderType
`func (o *Ad) UnsetCollectionsHeaderType()`

UnsetCollectionsHeaderType ensures that no value is present for CollectionsHeaderType, not even an explicit nil
### GetCreatedTime

`func (o *Ad) GetCreatedTime() int32`

GetCreatedTime returns the CreatedTime field if non-nil, zero value otherwise.

### GetCreatedTimeOk

`func (o *Ad) GetCreatedTimeOk() (*int32, bool)`

GetCreatedTimeOk returns a tuple with the CreatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedTime

`func (o *Ad) SetCreatedTime(v int32)`

SetCreatedTime sets CreatedTime field to given value.

### HasCreatedTime

`func (o *Ad) HasCreatedTime() bool`

HasCreatedTime returns a boolean if a field has been set.

### GetCreativeType

`func (o *Ad) GetCreativeType() CreativeType`

GetCreativeType returns the CreativeType field if non-nil, zero value otherwise.

### GetCreativeTypeOk

`func (o *Ad) GetCreativeTypeOk() (*CreativeType, bool)`

GetCreativeTypeOk returns a tuple with the CreativeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeType

`func (o *Ad) SetCreativeType(v CreativeType)`

SetCreativeType sets CreativeType field to given value.


### GetCustomizableCtaType

`func (o *Ad) GetCustomizableCtaType() CustomizableCTAType`

GetCustomizableCtaType returns the CustomizableCtaType field if non-nil, zero value otherwise.

### GetCustomizableCtaTypeOk

`func (o *Ad) GetCustomizableCtaTypeOk() (*CustomizableCTAType, bool)`

GetCustomizableCtaTypeOk returns a tuple with the CustomizableCtaType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomizableCtaType

`func (o *Ad) SetCustomizableCtaType(v CustomizableCTAType)`

SetCustomizableCtaType sets CustomizableCtaType field to given value.

### HasCustomizableCtaType

`func (o *Ad) HasCustomizableCtaType() bool`

HasCustomizableCtaType returns a boolean if a field has been set.

### SetCustomizableCtaTypeNil

`func (o *Ad) SetCustomizableCtaTypeNil(b bool)`

 SetCustomizableCtaTypeNil sets the value for CustomizableCtaType to be an explicit nil

### UnsetCustomizableCtaType
`func (o *Ad) UnsetCustomizableCtaType()`

UnsetCustomizableCtaType ensures that no value is present for CustomizableCtaType, not even an explicit nil
### GetDestinationUrl

`func (o *Ad) GetDestinationUrl() string`

GetDestinationUrl returns the DestinationUrl field if non-nil, zero value otherwise.

### GetDestinationUrlOk

`func (o *Ad) GetDestinationUrlOk() (*string, bool)`

GetDestinationUrlOk returns a tuple with the DestinationUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationUrl

`func (o *Ad) SetDestinationUrl(v string)`

SetDestinationUrl sets DestinationUrl field to given value.

### HasDestinationUrl

`func (o *Ad) HasDestinationUrl() bool`

HasDestinationUrl returns a boolean if a field has been set.

### SetDestinationUrlNil

`func (o *Ad) SetDestinationUrlNil(b bool)`

 SetDestinationUrlNil sets the value for DestinationUrl to be an explicit nil

### UnsetDestinationUrl
`func (o *Ad) UnsetDestinationUrl()`

UnsetDestinationUrl ensures that no value is present for DestinationUrl, not even an explicit nil
### GetDisclosureType

`func (o *Ad) GetDisclosureType() DisclosureType`

GetDisclosureType returns the DisclosureType field if non-nil, zero value otherwise.

### GetDisclosureTypeOk

`func (o *Ad) GetDisclosureTypeOk() (*DisclosureType, bool)`

GetDisclosureTypeOk returns a tuple with the DisclosureType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisclosureType

`func (o *Ad) SetDisclosureType(v DisclosureType)`

SetDisclosureType sets DisclosureType field to given value.

### HasDisclosureType

`func (o *Ad) HasDisclosureType() bool`

HasDisclosureType returns a boolean if a field has been set.

### SetDisclosureTypeNil

`func (o *Ad) SetDisclosureTypeNil(b bool)`

 SetDisclosureTypeNil sets the value for DisclosureType to be an explicit nil

### UnsetDisclosureType
`func (o *Ad) UnsetDisclosureType()`

UnsetDisclosureType ensures that no value is present for DisclosureType, not even an explicit nil
### GetDisclosureUrl

`func (o *Ad) GetDisclosureUrl() string`

GetDisclosureUrl returns the DisclosureUrl field if non-nil, zero value otherwise.

### GetDisclosureUrlOk

`func (o *Ad) GetDisclosureUrlOk() (*string, bool)`

GetDisclosureUrlOk returns a tuple with the DisclosureUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisclosureUrl

`func (o *Ad) SetDisclosureUrl(v string)`

SetDisclosureUrl sets DisclosureUrl field to given value.

### HasDisclosureUrl

`func (o *Ad) HasDisclosureUrl() bool`

HasDisclosureUrl returns a boolean if a field has been set.

### SetDisclosureUrlNil

`func (o *Ad) SetDisclosureUrlNil(b bool)`

 SetDisclosureUrlNil sets the value for DisclosureUrl to be an explicit nil

### UnsetDisclosureUrl
`func (o *Ad) UnsetDisclosureUrl()`

UnsetDisclosureUrl ensures that no value is present for DisclosureUrl, not even an explicit nil
### GetGridClickType

`func (o *Ad) GetGridClickType() GridClickType`

GetGridClickType returns the GridClickType field if non-nil, zero value otherwise.

### GetGridClickTypeOk

`func (o *Ad) GetGridClickTypeOk() (*GridClickType, bool)`

GetGridClickTypeOk returns a tuple with the GridClickType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGridClickType

`func (o *Ad) SetGridClickType(v GridClickType)`

SetGridClickType sets GridClickType field to given value.

### HasGridClickType

`func (o *Ad) HasGridClickType() bool`

HasGridClickType returns a boolean if a field has been set.

### SetGridClickTypeNil

`func (o *Ad) SetGridClickTypeNil(b bool)`

 SetGridClickTypeNil sets the value for GridClickType to be an explicit nil

### UnsetGridClickType
`func (o *Ad) UnsetGridClickType()`

UnsetGridClickType ensures that no value is present for GridClickType, not even an explicit nil
### GetId

`func (o *Ad) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Ad) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Ad) SetId(v string)`

SetId sets Id field to given value.


### GetIosDeepLink

`func (o *Ad) GetIosDeepLink() string`

GetIosDeepLink returns the IosDeepLink field if non-nil, zero value otherwise.

### GetIosDeepLinkOk

`func (o *Ad) GetIosDeepLinkOk() (*string, bool)`

GetIosDeepLinkOk returns a tuple with the IosDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIosDeepLink

`func (o *Ad) SetIosDeepLink(v string)`

SetIosDeepLink sets IosDeepLink field to given value.

### HasIosDeepLink

`func (o *Ad) HasIosDeepLink() bool`

HasIosDeepLink returns a boolean if a field has been set.

### SetIosDeepLinkNil

`func (o *Ad) SetIosDeepLinkNil(b bool)`

 SetIosDeepLinkNil sets the value for IosDeepLink to be an explicit nil

### UnsetIosDeepLink
`func (o *Ad) UnsetIosDeepLink()`

UnsetIosDeepLink ensures that no value is present for IosDeepLink, not even an explicit nil
### GetIsCarting

`func (o *Ad) GetIsCarting() bool`

GetIsCarting returns the IsCarting field if non-nil, zero value otherwise.

### GetIsCartingOk

`func (o *Ad) GetIsCartingOk() (*bool, bool)`

GetIsCartingOk returns a tuple with the IsCarting field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCarting

`func (o *Ad) SetIsCarting(v bool)`

SetIsCarting sets IsCarting field to given value.

### HasIsCarting

`func (o *Ad) HasIsCarting() bool`

HasIsCarting returns a boolean if a field has been set.

### GetIsCollageAcceptedTerms

`func (o *Ad) GetIsCollageAcceptedTerms() bool`

GetIsCollageAcceptedTerms returns the IsCollageAcceptedTerms field if non-nil, zero value otherwise.

### GetIsCollageAcceptedTermsOk

`func (o *Ad) GetIsCollageAcceptedTermsOk() (*bool, bool)`

GetIsCollageAcceptedTermsOk returns a tuple with the IsCollageAcceptedTerms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCollageAcceptedTerms

`func (o *Ad) SetIsCollageAcceptedTerms(v bool)`

SetIsCollageAcceptedTerms sets IsCollageAcceptedTerms field to given value.

### HasIsCollageAcceptedTerms

`func (o *Ad) HasIsCollageAcceptedTerms() bool`

HasIsCollageAcceptedTerms returns a boolean if a field has been set.

### GetIsCollageSingleDestination

`func (o *Ad) GetIsCollageSingleDestination() bool`

GetIsCollageSingleDestination returns the IsCollageSingleDestination field if non-nil, zero value otherwise.

### GetIsCollageSingleDestinationOk

`func (o *Ad) GetIsCollageSingleDestinationOk() (*bool, bool)`

GetIsCollageSingleDestinationOk returns a tuple with the IsCollageSingleDestination field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCollageSingleDestination

`func (o *Ad) SetIsCollageSingleDestination(v bool)`

SetIsCollageSingleDestination sets IsCollageSingleDestination field to given value.

### HasIsCollageSingleDestination

`func (o *Ad) HasIsCollageSingleDestination() bool`

HasIsCollageSingleDestination returns a boolean if a field has been set.

### GetIsPinDeleted

`func (o *Ad) GetIsPinDeleted() bool`

GetIsPinDeleted returns the IsPinDeleted field if non-nil, zero value otherwise.

### GetIsPinDeletedOk

`func (o *Ad) GetIsPinDeletedOk() (*bool, bool)`

GetIsPinDeletedOk returns a tuple with the IsPinDeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPinDeleted

`func (o *Ad) SetIsPinDeleted(v bool)`

SetIsPinDeleted sets IsPinDeleted field to given value.

### HasIsPinDeleted

`func (o *Ad) HasIsPinDeleted() bool`

HasIsPinDeleted returns a boolean if a field has been set.

### GetIsRemovable

`func (o *Ad) GetIsRemovable() bool`

GetIsRemovable returns the IsRemovable field if non-nil, zero value otherwise.

### GetIsRemovableOk

`func (o *Ad) GetIsRemovableOk() (*bool, bool)`

GetIsRemovableOk returns a tuple with the IsRemovable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsRemovable

`func (o *Ad) SetIsRemovable(v bool)`

SetIsRemovable sets IsRemovable field to given value.

### HasIsRemovable

`func (o *Ad) HasIsRemovable() bool`

HasIsRemovable returns a boolean if a field has been set.

### GetLeadFormId

`func (o *Ad) GetLeadFormId() string`

GetLeadFormId returns the LeadFormId field if non-nil, zero value otherwise.

### GetLeadFormIdOk

`func (o *Ad) GetLeadFormIdOk() (*string, bool)`

GetLeadFormIdOk returns a tuple with the LeadFormId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeadFormId

`func (o *Ad) SetLeadFormId(v string)`

SetLeadFormId sets LeadFormId field to given value.

### HasLeadFormId

`func (o *Ad) HasLeadFormId() bool`

HasLeadFormId returns a boolean if a field has been set.

### SetLeadFormIdNil

`func (o *Ad) SetLeadFormIdNil(b bool)`

 SetLeadFormIdNil sets the value for LeadFormId to be an explicit nil

### UnsetLeadFormId
`func (o *Ad) UnsetLeadFormId()`

UnsetLeadFormId ensures that no value is present for LeadFormId, not even an explicit nil
### GetName

`func (o *Ad) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Ad) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Ad) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Ad) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *Ad) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *Ad) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetPinId

`func (o *Ad) GetPinId() string`

GetPinId returns the PinId field if non-nil, zero value otherwise.

### GetPinIdOk

`func (o *Ad) GetPinIdOk() (*string, bool)`

GetPinIdOk returns a tuple with the PinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinId

`func (o *Ad) SetPinId(v string)`

SetPinId sets PinId field to given value.


### GetQuizPinData

`func (o *Ad) GetQuizPinData() QuizPinData`

GetQuizPinData returns the QuizPinData field if non-nil, zero value otherwise.

### GetQuizPinDataOk

`func (o *Ad) GetQuizPinDataOk() (*QuizPinData, bool)`

GetQuizPinDataOk returns a tuple with the QuizPinData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuizPinData

`func (o *Ad) SetQuizPinData(v QuizPinData)`

SetQuizPinData sets QuizPinData field to given value.

### HasQuizPinData

`func (o *Ad) HasQuizPinData() bool`

HasQuizPinData returns a boolean if a field has been set.

### SetQuizPinDataNil

`func (o *Ad) SetQuizPinDataNil(b bool)`

 SetQuizPinDataNil sets the value for QuizPinData to be an explicit nil

### UnsetQuizPinData
`func (o *Ad) UnsetQuizPinData()`

UnsetQuizPinData ensures that no value is present for QuizPinData, not even an explicit nil
### GetRejectedReasons

`func (o *Ad) GetRejectedReasons() []AdDisapprovalReasons`

GetRejectedReasons returns the RejectedReasons field if non-nil, zero value otherwise.

### GetRejectedReasonsOk

`func (o *Ad) GetRejectedReasonsOk() (*[]AdDisapprovalReasons, bool)`

GetRejectedReasonsOk returns a tuple with the RejectedReasons field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRejectedReasons

`func (o *Ad) SetRejectedReasons(v []AdDisapprovalReasons)`

SetRejectedReasons sets RejectedReasons field to given value.


### GetRejectionLabels

`func (o *Ad) GetRejectionLabels() []string`

GetRejectionLabels returns the RejectionLabels field if non-nil, zero value otherwise.

### GetRejectionLabelsOk

`func (o *Ad) GetRejectionLabelsOk() (*[]string, bool)`

GetRejectionLabelsOk returns a tuple with the RejectionLabels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRejectionLabels

`func (o *Ad) SetRejectionLabels(v []string)`

SetRejectionLabels sets RejectionLabels field to given value.


### GetReviewStatus

`func (o *Ad) GetReviewStatus() AdReviewStatus`

GetReviewStatus returns the ReviewStatus field if non-nil, zero value otherwise.

### GetReviewStatusOk

`func (o *Ad) GetReviewStatusOk() (*AdReviewStatus, bool)`

GetReviewStatusOk returns a tuple with the ReviewStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReviewStatus

`func (o *Ad) SetReviewStatus(v AdReviewStatus)`

SetReviewStatus sets ReviewStatus field to given value.


### GetStatus

`func (o *Ad) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Ad) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Ad) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *Ad) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetSummaryStatus

`func (o *Ad) GetSummaryStatus() PinPromotionSummaryStatus`

GetSummaryStatus returns the SummaryStatus field if non-nil, zero value otherwise.

### GetSummaryStatusOk

`func (o *Ad) GetSummaryStatusOk() (*PinPromotionSummaryStatus, bool)`

GetSummaryStatusOk returns a tuple with the SummaryStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSummaryStatus

`func (o *Ad) SetSummaryStatus(v PinPromotionSummaryStatus)`

SetSummaryStatus sets SummaryStatus field to given value.


### GetTrackingUrls

`func (o *Ad) GetTrackingUrls() TrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *Ad) GetTrackingUrlsOk() (*TrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *Ad) SetTrackingUrls(v TrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *Ad) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *Ad) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *Ad) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetType

`func (o *Ad) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Ad) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Ad) SetType(v string)`

SetType sets Type field to given value.


### GetUpdatedTime

`func (o *Ad) GetUpdatedTime() int32`

GetUpdatedTime returns the UpdatedTime field if non-nil, zero value otherwise.

### GetUpdatedTimeOk

`func (o *Ad) GetUpdatedTimeOk() (*int32, bool)`

GetUpdatedTimeOk returns a tuple with the UpdatedTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedTime

`func (o *Ad) SetUpdatedTime(v int32)`

SetUpdatedTime sets UpdatedTime field to given value.

### HasUpdatedTime

`func (o *Ad) HasUpdatedTime() bool`

HasUpdatedTime returns a boolean if a field has been set.

### GetViewTrackingUrl

`func (o *Ad) GetViewTrackingUrl() string`

GetViewTrackingUrl returns the ViewTrackingUrl field if non-nil, zero value otherwise.

### GetViewTrackingUrlOk

`func (o *Ad) GetViewTrackingUrlOk() (*string, bool)`

GetViewTrackingUrlOk returns a tuple with the ViewTrackingUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewTrackingUrl

`func (o *Ad) SetViewTrackingUrl(v string)`

SetViewTrackingUrl sets ViewTrackingUrl field to given value.

### HasViewTrackingUrl

`func (o *Ad) HasViewTrackingUrl() bool`

HasViewTrackingUrl returns a boolean if a field has been set.

### SetViewTrackingUrlNil

`func (o *Ad) SetViewTrackingUrlNil(b bool)`

 SetViewTrackingUrlNil sets the value for ViewTrackingUrl to be an explicit nil

### UnsetViewTrackingUrl
`func (o *Ad) UnsetViewTrackingUrl()`

UnsetViewTrackingUrl ensures that no value is present for ViewTrackingUrl, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


