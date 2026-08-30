# AdCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **string** | ID of the ad group that contains the ad. | 
**AndroidDeepLink** | Pointer to **NullableString** | Deep link URL for Android devices. | [optional] 
**CarouselAndroidDeepLinks** | Pointer to **[]string** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**CarouselDestinationUrls** | Pointer to **[]string** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**CarouselIosDeepLinks** | Pointer to **[]string** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**ClickTrackingUrl** | Pointer to **NullableString** | Tracking url for the ad clicks. | [optional] 
**CollectionItemsDestinationUrlTemplate** | Pointer to **NullableString** | Destination URL template for all items within a collections drawer. | [optional] 
**CollectionsHeaderType** | Pointer to [**NullableAdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  | [optional] 
**CreativeType** | [**CreativeType**](CreativeType.md) |  | 
**CustomizableCtaType** | Pointer to [**NullableCustomizableCTAType**](CustomizableCTAType.md) |  | [optional] 
**DestinationUrl** | Pointer to **NullableString** | Destination URL. | [optional] 
**DisclosureType** | Pointer to [**NullableDisclosureType**](DisclosureType.md) |  | [optional] 
**DisclosureUrl** | Pointer to **NullableString** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**GridClickType** | Pointer to [**NullableGridClickType**](GridClickType.md) |  | [optional] 
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
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] 
**TrackingUrls** | Pointer to [**NullableTrackingUrls**](TrackingUrls.md) |  | [optional] 
**ViewTrackingUrl** | Pointer to **NullableString** | Tracking URL for ad impressions. | [optional] 

## Methods

### NewAdCreate

`func NewAdCreate(adGroupId string, creativeType CreativeType, pinId string, ) *AdCreate`

NewAdCreate instantiates a new AdCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdCreateWithDefaults

`func NewAdCreateWithDefaults() *AdCreate`

NewAdCreateWithDefaults instantiates a new AdCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdGroupId

`func (o *AdCreate) GetAdGroupId() string`

GetAdGroupId returns the AdGroupId field if non-nil, zero value otherwise.

### GetAdGroupIdOk

`func (o *AdCreate) GetAdGroupIdOk() (*string, bool)`

GetAdGroupIdOk returns a tuple with the AdGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupId

`func (o *AdCreate) SetAdGroupId(v string)`

SetAdGroupId sets AdGroupId field to given value.


### GetAndroidDeepLink

`func (o *AdCreate) GetAndroidDeepLink() string`

GetAndroidDeepLink returns the AndroidDeepLink field if non-nil, zero value otherwise.

### GetAndroidDeepLinkOk

`func (o *AdCreate) GetAndroidDeepLinkOk() (*string, bool)`

GetAndroidDeepLinkOk returns a tuple with the AndroidDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAndroidDeepLink

`func (o *AdCreate) SetAndroidDeepLink(v string)`

SetAndroidDeepLink sets AndroidDeepLink field to given value.

### HasAndroidDeepLink

`func (o *AdCreate) HasAndroidDeepLink() bool`

HasAndroidDeepLink returns a boolean if a field has been set.

### SetAndroidDeepLinkNil

`func (o *AdCreate) SetAndroidDeepLinkNil(b bool)`

 SetAndroidDeepLinkNil sets the value for AndroidDeepLink to be an explicit nil

### UnsetAndroidDeepLink
`func (o *AdCreate) UnsetAndroidDeepLink()`

UnsetAndroidDeepLink ensures that no value is present for AndroidDeepLink, not even an explicit nil
### GetCarouselAndroidDeepLinks

`func (o *AdCreate) GetCarouselAndroidDeepLinks() []string`

GetCarouselAndroidDeepLinks returns the CarouselAndroidDeepLinks field if non-nil, zero value otherwise.

### GetCarouselAndroidDeepLinksOk

`func (o *AdCreate) GetCarouselAndroidDeepLinksOk() (*[]string, bool)`

GetCarouselAndroidDeepLinksOk returns a tuple with the CarouselAndroidDeepLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselAndroidDeepLinks

`func (o *AdCreate) SetCarouselAndroidDeepLinks(v []string)`

SetCarouselAndroidDeepLinks sets CarouselAndroidDeepLinks field to given value.

### HasCarouselAndroidDeepLinks

`func (o *AdCreate) HasCarouselAndroidDeepLinks() bool`

HasCarouselAndroidDeepLinks returns a boolean if a field has been set.

### SetCarouselAndroidDeepLinksNil

`func (o *AdCreate) SetCarouselAndroidDeepLinksNil(b bool)`

 SetCarouselAndroidDeepLinksNil sets the value for CarouselAndroidDeepLinks to be an explicit nil

### UnsetCarouselAndroidDeepLinks
`func (o *AdCreate) UnsetCarouselAndroidDeepLinks()`

UnsetCarouselAndroidDeepLinks ensures that no value is present for CarouselAndroidDeepLinks, not even an explicit nil
### GetCarouselDestinationUrls

`func (o *AdCreate) GetCarouselDestinationUrls() []string`

GetCarouselDestinationUrls returns the CarouselDestinationUrls field if non-nil, zero value otherwise.

### GetCarouselDestinationUrlsOk

`func (o *AdCreate) GetCarouselDestinationUrlsOk() (*[]string, bool)`

GetCarouselDestinationUrlsOk returns a tuple with the CarouselDestinationUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselDestinationUrls

`func (o *AdCreate) SetCarouselDestinationUrls(v []string)`

SetCarouselDestinationUrls sets CarouselDestinationUrls field to given value.

### HasCarouselDestinationUrls

`func (o *AdCreate) HasCarouselDestinationUrls() bool`

HasCarouselDestinationUrls returns a boolean if a field has been set.

### SetCarouselDestinationUrlsNil

`func (o *AdCreate) SetCarouselDestinationUrlsNil(b bool)`

 SetCarouselDestinationUrlsNil sets the value for CarouselDestinationUrls to be an explicit nil

### UnsetCarouselDestinationUrls
`func (o *AdCreate) UnsetCarouselDestinationUrls()`

UnsetCarouselDestinationUrls ensures that no value is present for CarouselDestinationUrls, not even an explicit nil
### GetCarouselIosDeepLinks

`func (o *AdCreate) GetCarouselIosDeepLinks() []string`

GetCarouselIosDeepLinks returns the CarouselIosDeepLinks field if non-nil, zero value otherwise.

### GetCarouselIosDeepLinksOk

`func (o *AdCreate) GetCarouselIosDeepLinksOk() (*[]string, bool)`

GetCarouselIosDeepLinksOk returns a tuple with the CarouselIosDeepLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselIosDeepLinks

`func (o *AdCreate) SetCarouselIosDeepLinks(v []string)`

SetCarouselIosDeepLinks sets CarouselIosDeepLinks field to given value.

### HasCarouselIosDeepLinks

`func (o *AdCreate) HasCarouselIosDeepLinks() bool`

HasCarouselIosDeepLinks returns a boolean if a field has been set.

### SetCarouselIosDeepLinksNil

`func (o *AdCreate) SetCarouselIosDeepLinksNil(b bool)`

 SetCarouselIosDeepLinksNil sets the value for CarouselIosDeepLinks to be an explicit nil

### UnsetCarouselIosDeepLinks
`func (o *AdCreate) UnsetCarouselIosDeepLinks()`

UnsetCarouselIosDeepLinks ensures that no value is present for CarouselIosDeepLinks, not even an explicit nil
### GetClickTrackingUrl

`func (o *AdCreate) GetClickTrackingUrl() string`

GetClickTrackingUrl returns the ClickTrackingUrl field if non-nil, zero value otherwise.

### GetClickTrackingUrlOk

`func (o *AdCreate) GetClickTrackingUrlOk() (*string, bool)`

GetClickTrackingUrlOk returns a tuple with the ClickTrackingUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickTrackingUrl

`func (o *AdCreate) SetClickTrackingUrl(v string)`

SetClickTrackingUrl sets ClickTrackingUrl field to given value.

### HasClickTrackingUrl

`func (o *AdCreate) HasClickTrackingUrl() bool`

HasClickTrackingUrl returns a boolean if a field has been set.

### SetClickTrackingUrlNil

`func (o *AdCreate) SetClickTrackingUrlNil(b bool)`

 SetClickTrackingUrlNil sets the value for ClickTrackingUrl to be an explicit nil

### UnsetClickTrackingUrl
`func (o *AdCreate) UnsetClickTrackingUrl()`

UnsetClickTrackingUrl ensures that no value is present for ClickTrackingUrl, not even an explicit nil
### GetCollectionItemsDestinationUrlTemplate

`func (o *AdCreate) GetCollectionItemsDestinationUrlTemplate() string`

GetCollectionItemsDestinationUrlTemplate returns the CollectionItemsDestinationUrlTemplate field if non-nil, zero value otherwise.

### GetCollectionItemsDestinationUrlTemplateOk

`func (o *AdCreate) GetCollectionItemsDestinationUrlTemplateOk() (*string, bool)`

GetCollectionItemsDestinationUrlTemplateOk returns a tuple with the CollectionItemsDestinationUrlTemplate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollectionItemsDestinationUrlTemplate

`func (o *AdCreate) SetCollectionItemsDestinationUrlTemplate(v string)`

SetCollectionItemsDestinationUrlTemplate sets CollectionItemsDestinationUrlTemplate field to given value.

### HasCollectionItemsDestinationUrlTemplate

`func (o *AdCreate) HasCollectionItemsDestinationUrlTemplate() bool`

HasCollectionItemsDestinationUrlTemplate returns a boolean if a field has been set.

### SetCollectionItemsDestinationUrlTemplateNil

`func (o *AdCreate) SetCollectionItemsDestinationUrlTemplateNil(b bool)`

 SetCollectionItemsDestinationUrlTemplateNil sets the value for CollectionItemsDestinationUrlTemplate to be an explicit nil

### UnsetCollectionItemsDestinationUrlTemplate
`func (o *AdCreate) UnsetCollectionItemsDestinationUrlTemplate()`

UnsetCollectionItemsDestinationUrlTemplate ensures that no value is present for CollectionItemsDestinationUrlTemplate, not even an explicit nil
### GetCollectionsHeaderType

`func (o *AdCreate) GetCollectionsHeaderType() AdCollectionsHeaderType`

GetCollectionsHeaderType returns the CollectionsHeaderType field if non-nil, zero value otherwise.

### GetCollectionsHeaderTypeOk

`func (o *AdCreate) GetCollectionsHeaderTypeOk() (*AdCollectionsHeaderType, bool)`

GetCollectionsHeaderTypeOk returns a tuple with the CollectionsHeaderType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollectionsHeaderType

`func (o *AdCreate) SetCollectionsHeaderType(v AdCollectionsHeaderType)`

SetCollectionsHeaderType sets CollectionsHeaderType field to given value.

### HasCollectionsHeaderType

`func (o *AdCreate) HasCollectionsHeaderType() bool`

HasCollectionsHeaderType returns a boolean if a field has been set.

### SetCollectionsHeaderTypeNil

`func (o *AdCreate) SetCollectionsHeaderTypeNil(b bool)`

 SetCollectionsHeaderTypeNil sets the value for CollectionsHeaderType to be an explicit nil

### UnsetCollectionsHeaderType
`func (o *AdCreate) UnsetCollectionsHeaderType()`

UnsetCollectionsHeaderType ensures that no value is present for CollectionsHeaderType, not even an explicit nil
### GetCreativeType

`func (o *AdCreate) GetCreativeType() CreativeType`

GetCreativeType returns the CreativeType field if non-nil, zero value otherwise.

### GetCreativeTypeOk

`func (o *AdCreate) GetCreativeTypeOk() (*CreativeType, bool)`

GetCreativeTypeOk returns a tuple with the CreativeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeType

`func (o *AdCreate) SetCreativeType(v CreativeType)`

SetCreativeType sets CreativeType field to given value.


### GetCustomizableCtaType

`func (o *AdCreate) GetCustomizableCtaType() CustomizableCTAType`

GetCustomizableCtaType returns the CustomizableCtaType field if non-nil, zero value otherwise.

### GetCustomizableCtaTypeOk

`func (o *AdCreate) GetCustomizableCtaTypeOk() (*CustomizableCTAType, bool)`

GetCustomizableCtaTypeOk returns a tuple with the CustomizableCtaType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomizableCtaType

`func (o *AdCreate) SetCustomizableCtaType(v CustomizableCTAType)`

SetCustomizableCtaType sets CustomizableCtaType field to given value.

### HasCustomizableCtaType

`func (o *AdCreate) HasCustomizableCtaType() bool`

HasCustomizableCtaType returns a boolean if a field has been set.

### SetCustomizableCtaTypeNil

`func (o *AdCreate) SetCustomizableCtaTypeNil(b bool)`

 SetCustomizableCtaTypeNil sets the value for CustomizableCtaType to be an explicit nil

### UnsetCustomizableCtaType
`func (o *AdCreate) UnsetCustomizableCtaType()`

UnsetCustomizableCtaType ensures that no value is present for CustomizableCtaType, not even an explicit nil
### GetDestinationUrl

`func (o *AdCreate) GetDestinationUrl() string`

GetDestinationUrl returns the DestinationUrl field if non-nil, zero value otherwise.

### GetDestinationUrlOk

`func (o *AdCreate) GetDestinationUrlOk() (*string, bool)`

GetDestinationUrlOk returns a tuple with the DestinationUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationUrl

`func (o *AdCreate) SetDestinationUrl(v string)`

SetDestinationUrl sets DestinationUrl field to given value.

### HasDestinationUrl

`func (o *AdCreate) HasDestinationUrl() bool`

HasDestinationUrl returns a boolean if a field has been set.

### SetDestinationUrlNil

`func (o *AdCreate) SetDestinationUrlNil(b bool)`

 SetDestinationUrlNil sets the value for DestinationUrl to be an explicit nil

### UnsetDestinationUrl
`func (o *AdCreate) UnsetDestinationUrl()`

UnsetDestinationUrl ensures that no value is present for DestinationUrl, not even an explicit nil
### GetDisclosureType

`func (o *AdCreate) GetDisclosureType() DisclosureType`

GetDisclosureType returns the DisclosureType field if non-nil, zero value otherwise.

### GetDisclosureTypeOk

`func (o *AdCreate) GetDisclosureTypeOk() (*DisclosureType, bool)`

GetDisclosureTypeOk returns a tuple with the DisclosureType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisclosureType

`func (o *AdCreate) SetDisclosureType(v DisclosureType)`

SetDisclosureType sets DisclosureType field to given value.

### HasDisclosureType

`func (o *AdCreate) HasDisclosureType() bool`

HasDisclosureType returns a boolean if a field has been set.

### SetDisclosureTypeNil

`func (o *AdCreate) SetDisclosureTypeNil(b bool)`

 SetDisclosureTypeNil sets the value for DisclosureType to be an explicit nil

### UnsetDisclosureType
`func (o *AdCreate) UnsetDisclosureType()`

UnsetDisclosureType ensures that no value is present for DisclosureType, not even an explicit nil
### GetDisclosureUrl

`func (o *AdCreate) GetDisclosureUrl() string`

GetDisclosureUrl returns the DisclosureUrl field if non-nil, zero value otherwise.

### GetDisclosureUrlOk

`func (o *AdCreate) GetDisclosureUrlOk() (*string, bool)`

GetDisclosureUrlOk returns a tuple with the DisclosureUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisclosureUrl

`func (o *AdCreate) SetDisclosureUrl(v string)`

SetDisclosureUrl sets DisclosureUrl field to given value.

### HasDisclosureUrl

`func (o *AdCreate) HasDisclosureUrl() bool`

HasDisclosureUrl returns a boolean if a field has been set.

### SetDisclosureUrlNil

`func (o *AdCreate) SetDisclosureUrlNil(b bool)`

 SetDisclosureUrlNil sets the value for DisclosureUrl to be an explicit nil

### UnsetDisclosureUrl
`func (o *AdCreate) UnsetDisclosureUrl()`

UnsetDisclosureUrl ensures that no value is present for DisclosureUrl, not even an explicit nil
### GetGridClickType

`func (o *AdCreate) GetGridClickType() GridClickType`

GetGridClickType returns the GridClickType field if non-nil, zero value otherwise.

### GetGridClickTypeOk

`func (o *AdCreate) GetGridClickTypeOk() (*GridClickType, bool)`

GetGridClickTypeOk returns a tuple with the GridClickType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGridClickType

`func (o *AdCreate) SetGridClickType(v GridClickType)`

SetGridClickType sets GridClickType field to given value.

### HasGridClickType

`func (o *AdCreate) HasGridClickType() bool`

HasGridClickType returns a boolean if a field has been set.

### SetGridClickTypeNil

`func (o *AdCreate) SetGridClickTypeNil(b bool)`

 SetGridClickTypeNil sets the value for GridClickType to be an explicit nil

### UnsetGridClickType
`func (o *AdCreate) UnsetGridClickType()`

UnsetGridClickType ensures that no value is present for GridClickType, not even an explicit nil
### GetIosDeepLink

`func (o *AdCreate) GetIosDeepLink() string`

GetIosDeepLink returns the IosDeepLink field if non-nil, zero value otherwise.

### GetIosDeepLinkOk

`func (o *AdCreate) GetIosDeepLinkOk() (*string, bool)`

GetIosDeepLinkOk returns a tuple with the IosDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIosDeepLink

`func (o *AdCreate) SetIosDeepLink(v string)`

SetIosDeepLink sets IosDeepLink field to given value.

### HasIosDeepLink

`func (o *AdCreate) HasIosDeepLink() bool`

HasIosDeepLink returns a boolean if a field has been set.

### SetIosDeepLinkNil

`func (o *AdCreate) SetIosDeepLinkNil(b bool)`

 SetIosDeepLinkNil sets the value for IosDeepLink to be an explicit nil

### UnsetIosDeepLink
`func (o *AdCreate) UnsetIosDeepLink()`

UnsetIosDeepLink ensures that no value is present for IosDeepLink, not even an explicit nil
### GetIsCarting

`func (o *AdCreate) GetIsCarting() bool`

GetIsCarting returns the IsCarting field if non-nil, zero value otherwise.

### GetIsCartingOk

`func (o *AdCreate) GetIsCartingOk() (*bool, bool)`

GetIsCartingOk returns a tuple with the IsCarting field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCarting

`func (o *AdCreate) SetIsCarting(v bool)`

SetIsCarting sets IsCarting field to given value.

### HasIsCarting

`func (o *AdCreate) HasIsCarting() bool`

HasIsCarting returns a boolean if a field has been set.

### GetIsCollageAcceptedTerms

`func (o *AdCreate) GetIsCollageAcceptedTerms() bool`

GetIsCollageAcceptedTerms returns the IsCollageAcceptedTerms field if non-nil, zero value otherwise.

### GetIsCollageAcceptedTermsOk

`func (o *AdCreate) GetIsCollageAcceptedTermsOk() (*bool, bool)`

GetIsCollageAcceptedTermsOk returns a tuple with the IsCollageAcceptedTerms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCollageAcceptedTerms

`func (o *AdCreate) SetIsCollageAcceptedTerms(v bool)`

SetIsCollageAcceptedTerms sets IsCollageAcceptedTerms field to given value.

### HasIsCollageAcceptedTerms

`func (o *AdCreate) HasIsCollageAcceptedTerms() bool`

HasIsCollageAcceptedTerms returns a boolean if a field has been set.

### GetIsCollageSingleDestination

`func (o *AdCreate) GetIsCollageSingleDestination() bool`

GetIsCollageSingleDestination returns the IsCollageSingleDestination field if non-nil, zero value otherwise.

### GetIsCollageSingleDestinationOk

`func (o *AdCreate) GetIsCollageSingleDestinationOk() (*bool, bool)`

GetIsCollageSingleDestinationOk returns a tuple with the IsCollageSingleDestination field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCollageSingleDestination

`func (o *AdCreate) SetIsCollageSingleDestination(v bool)`

SetIsCollageSingleDestination sets IsCollageSingleDestination field to given value.

### HasIsCollageSingleDestination

`func (o *AdCreate) HasIsCollageSingleDestination() bool`

HasIsCollageSingleDestination returns a boolean if a field has been set.

### GetIsPinDeleted

`func (o *AdCreate) GetIsPinDeleted() bool`

GetIsPinDeleted returns the IsPinDeleted field if non-nil, zero value otherwise.

### GetIsPinDeletedOk

`func (o *AdCreate) GetIsPinDeletedOk() (*bool, bool)`

GetIsPinDeletedOk returns a tuple with the IsPinDeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPinDeleted

`func (o *AdCreate) SetIsPinDeleted(v bool)`

SetIsPinDeleted sets IsPinDeleted field to given value.

### HasIsPinDeleted

`func (o *AdCreate) HasIsPinDeleted() bool`

HasIsPinDeleted returns a boolean if a field has been set.

### GetIsRemovable

`func (o *AdCreate) GetIsRemovable() bool`

GetIsRemovable returns the IsRemovable field if non-nil, zero value otherwise.

### GetIsRemovableOk

`func (o *AdCreate) GetIsRemovableOk() (*bool, bool)`

GetIsRemovableOk returns a tuple with the IsRemovable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsRemovable

`func (o *AdCreate) SetIsRemovable(v bool)`

SetIsRemovable sets IsRemovable field to given value.

### HasIsRemovable

`func (o *AdCreate) HasIsRemovable() bool`

HasIsRemovable returns a boolean if a field has been set.

### GetLeadFormId

`func (o *AdCreate) GetLeadFormId() string`

GetLeadFormId returns the LeadFormId field if non-nil, zero value otherwise.

### GetLeadFormIdOk

`func (o *AdCreate) GetLeadFormIdOk() (*string, bool)`

GetLeadFormIdOk returns a tuple with the LeadFormId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeadFormId

`func (o *AdCreate) SetLeadFormId(v string)`

SetLeadFormId sets LeadFormId field to given value.

### HasLeadFormId

`func (o *AdCreate) HasLeadFormId() bool`

HasLeadFormId returns a boolean if a field has been set.

### SetLeadFormIdNil

`func (o *AdCreate) SetLeadFormIdNil(b bool)`

 SetLeadFormIdNil sets the value for LeadFormId to be an explicit nil

### UnsetLeadFormId
`func (o *AdCreate) UnsetLeadFormId()`

UnsetLeadFormId ensures that no value is present for LeadFormId, not even an explicit nil
### GetName

`func (o *AdCreate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdCreate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdCreate) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AdCreate) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *AdCreate) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *AdCreate) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetPinId

`func (o *AdCreate) GetPinId() string`

GetPinId returns the PinId field if non-nil, zero value otherwise.

### GetPinIdOk

`func (o *AdCreate) GetPinIdOk() (*string, bool)`

GetPinIdOk returns a tuple with the PinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinId

`func (o *AdCreate) SetPinId(v string)`

SetPinId sets PinId field to given value.


### GetQuizPinData

`func (o *AdCreate) GetQuizPinData() QuizPinData`

GetQuizPinData returns the QuizPinData field if non-nil, zero value otherwise.

### GetQuizPinDataOk

`func (o *AdCreate) GetQuizPinDataOk() (*QuizPinData, bool)`

GetQuizPinDataOk returns a tuple with the QuizPinData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuizPinData

`func (o *AdCreate) SetQuizPinData(v QuizPinData)`

SetQuizPinData sets QuizPinData field to given value.

### HasQuizPinData

`func (o *AdCreate) HasQuizPinData() bool`

HasQuizPinData returns a boolean if a field has been set.

### SetQuizPinDataNil

`func (o *AdCreate) SetQuizPinDataNil(b bool)`

 SetQuizPinDataNil sets the value for QuizPinData to be an explicit nil

### UnsetQuizPinData
`func (o *AdCreate) UnsetQuizPinData()`

UnsetQuizPinData ensures that no value is present for QuizPinData, not even an explicit nil
### GetStatus

`func (o *AdCreate) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *AdCreate) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *AdCreate) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *AdCreate) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTrackingUrls

`func (o *AdCreate) GetTrackingUrls() TrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *AdCreate) GetTrackingUrlsOk() (*TrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *AdCreate) SetTrackingUrls(v TrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *AdCreate) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *AdCreate) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *AdCreate) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetViewTrackingUrl

`func (o *AdCreate) GetViewTrackingUrl() string`

GetViewTrackingUrl returns the ViewTrackingUrl field if non-nil, zero value otherwise.

### GetViewTrackingUrlOk

`func (o *AdCreate) GetViewTrackingUrlOk() (*string, bool)`

GetViewTrackingUrlOk returns a tuple with the ViewTrackingUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewTrackingUrl

`func (o *AdCreate) SetViewTrackingUrl(v string)`

SetViewTrackingUrl sets ViewTrackingUrl field to given value.

### HasViewTrackingUrl

`func (o *AdCreate) HasViewTrackingUrl() bool`

HasViewTrackingUrl returns a boolean if a field has been set.

### SetViewTrackingUrlNil

`func (o *AdCreate) SetViewTrackingUrlNil(b bool)`

 SetViewTrackingUrlNil sets the value for ViewTrackingUrl to be an explicit nil

### UnsetViewTrackingUrl
`func (o *AdCreate) UnsetViewTrackingUrl()`

UnsetViewTrackingUrl ensures that no value is present for ViewTrackingUrl, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


