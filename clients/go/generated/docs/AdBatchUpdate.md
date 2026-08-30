# AdBatchUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | Pointer to **string** | ID of the ad group that contains the ad. | [optional] 
**AndroidDeepLink** | Pointer to **NullableString** | Deep link URL for Android devices. | [optional] 
**CarouselAndroidDeepLinks** | Pointer to **[]string** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**CarouselDestinationUrls** | Pointer to **[]string** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**CarouselIosDeepLinks** | Pointer to **[]string** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**ClickTrackingUrl** | Pointer to **NullableString** | Tracking url for the ad clicks. | [optional] 
**CollectionItemsDestinationUrlTemplate** | Pointer to **NullableString** | Destination URL template for all items within a collections drawer. | [optional] 
**CollectionsHeaderType** | Pointer to [**NullableAdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  | [optional] 
**CreativeType** | Pointer to [**CreativeType**](CreativeType.md) |  | [optional] 
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
**PinId** | Pointer to **string** | Pin ID. This field may only be updated for draft ads. | [optional] 
**QuizPinData** | Pointer to [**NullableQuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] 
**TrackingUrls** | Pointer to [**NullableTrackingUrls**](TrackingUrls.md) |  | [optional] 
**ViewTrackingUrl** | Pointer to **NullableString** | Tracking URL for ad impressions. | [optional] 

## Methods

### NewAdBatchUpdate

`func NewAdBatchUpdate(id string, ) *AdBatchUpdate`

NewAdBatchUpdate instantiates a new AdBatchUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdBatchUpdateWithDefaults

`func NewAdBatchUpdateWithDefaults() *AdBatchUpdate`

NewAdBatchUpdateWithDefaults instantiates a new AdBatchUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdGroupId

`func (o *AdBatchUpdate) GetAdGroupId() string`

GetAdGroupId returns the AdGroupId field if non-nil, zero value otherwise.

### GetAdGroupIdOk

`func (o *AdBatchUpdate) GetAdGroupIdOk() (*string, bool)`

GetAdGroupIdOk returns a tuple with the AdGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupId

`func (o *AdBatchUpdate) SetAdGroupId(v string)`

SetAdGroupId sets AdGroupId field to given value.

### HasAdGroupId

`func (o *AdBatchUpdate) HasAdGroupId() bool`

HasAdGroupId returns a boolean if a field has been set.

### GetAndroidDeepLink

`func (o *AdBatchUpdate) GetAndroidDeepLink() string`

GetAndroidDeepLink returns the AndroidDeepLink field if non-nil, zero value otherwise.

### GetAndroidDeepLinkOk

`func (o *AdBatchUpdate) GetAndroidDeepLinkOk() (*string, bool)`

GetAndroidDeepLinkOk returns a tuple with the AndroidDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAndroidDeepLink

`func (o *AdBatchUpdate) SetAndroidDeepLink(v string)`

SetAndroidDeepLink sets AndroidDeepLink field to given value.

### HasAndroidDeepLink

`func (o *AdBatchUpdate) HasAndroidDeepLink() bool`

HasAndroidDeepLink returns a boolean if a field has been set.

### SetAndroidDeepLinkNil

`func (o *AdBatchUpdate) SetAndroidDeepLinkNil(b bool)`

 SetAndroidDeepLinkNil sets the value for AndroidDeepLink to be an explicit nil

### UnsetAndroidDeepLink
`func (o *AdBatchUpdate) UnsetAndroidDeepLink()`

UnsetAndroidDeepLink ensures that no value is present for AndroidDeepLink, not even an explicit nil
### GetCarouselAndroidDeepLinks

`func (o *AdBatchUpdate) GetCarouselAndroidDeepLinks() []string`

GetCarouselAndroidDeepLinks returns the CarouselAndroidDeepLinks field if non-nil, zero value otherwise.

### GetCarouselAndroidDeepLinksOk

`func (o *AdBatchUpdate) GetCarouselAndroidDeepLinksOk() (*[]string, bool)`

GetCarouselAndroidDeepLinksOk returns a tuple with the CarouselAndroidDeepLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselAndroidDeepLinks

`func (o *AdBatchUpdate) SetCarouselAndroidDeepLinks(v []string)`

SetCarouselAndroidDeepLinks sets CarouselAndroidDeepLinks field to given value.

### HasCarouselAndroidDeepLinks

`func (o *AdBatchUpdate) HasCarouselAndroidDeepLinks() bool`

HasCarouselAndroidDeepLinks returns a boolean if a field has been set.

### SetCarouselAndroidDeepLinksNil

`func (o *AdBatchUpdate) SetCarouselAndroidDeepLinksNil(b bool)`

 SetCarouselAndroidDeepLinksNil sets the value for CarouselAndroidDeepLinks to be an explicit nil

### UnsetCarouselAndroidDeepLinks
`func (o *AdBatchUpdate) UnsetCarouselAndroidDeepLinks()`

UnsetCarouselAndroidDeepLinks ensures that no value is present for CarouselAndroidDeepLinks, not even an explicit nil
### GetCarouselDestinationUrls

`func (o *AdBatchUpdate) GetCarouselDestinationUrls() []string`

GetCarouselDestinationUrls returns the CarouselDestinationUrls field if non-nil, zero value otherwise.

### GetCarouselDestinationUrlsOk

`func (o *AdBatchUpdate) GetCarouselDestinationUrlsOk() (*[]string, bool)`

GetCarouselDestinationUrlsOk returns a tuple with the CarouselDestinationUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselDestinationUrls

`func (o *AdBatchUpdate) SetCarouselDestinationUrls(v []string)`

SetCarouselDestinationUrls sets CarouselDestinationUrls field to given value.

### HasCarouselDestinationUrls

`func (o *AdBatchUpdate) HasCarouselDestinationUrls() bool`

HasCarouselDestinationUrls returns a boolean if a field has been set.

### SetCarouselDestinationUrlsNil

`func (o *AdBatchUpdate) SetCarouselDestinationUrlsNil(b bool)`

 SetCarouselDestinationUrlsNil sets the value for CarouselDestinationUrls to be an explicit nil

### UnsetCarouselDestinationUrls
`func (o *AdBatchUpdate) UnsetCarouselDestinationUrls()`

UnsetCarouselDestinationUrls ensures that no value is present for CarouselDestinationUrls, not even an explicit nil
### GetCarouselIosDeepLinks

`func (o *AdBatchUpdate) GetCarouselIosDeepLinks() []string`

GetCarouselIosDeepLinks returns the CarouselIosDeepLinks field if non-nil, zero value otherwise.

### GetCarouselIosDeepLinksOk

`func (o *AdBatchUpdate) GetCarouselIosDeepLinksOk() (*[]string, bool)`

GetCarouselIosDeepLinksOk returns a tuple with the CarouselIosDeepLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselIosDeepLinks

`func (o *AdBatchUpdate) SetCarouselIosDeepLinks(v []string)`

SetCarouselIosDeepLinks sets CarouselIosDeepLinks field to given value.

### HasCarouselIosDeepLinks

`func (o *AdBatchUpdate) HasCarouselIosDeepLinks() bool`

HasCarouselIosDeepLinks returns a boolean if a field has been set.

### SetCarouselIosDeepLinksNil

`func (o *AdBatchUpdate) SetCarouselIosDeepLinksNil(b bool)`

 SetCarouselIosDeepLinksNil sets the value for CarouselIosDeepLinks to be an explicit nil

### UnsetCarouselIosDeepLinks
`func (o *AdBatchUpdate) UnsetCarouselIosDeepLinks()`

UnsetCarouselIosDeepLinks ensures that no value is present for CarouselIosDeepLinks, not even an explicit nil
### GetClickTrackingUrl

`func (o *AdBatchUpdate) GetClickTrackingUrl() string`

GetClickTrackingUrl returns the ClickTrackingUrl field if non-nil, zero value otherwise.

### GetClickTrackingUrlOk

`func (o *AdBatchUpdate) GetClickTrackingUrlOk() (*string, bool)`

GetClickTrackingUrlOk returns a tuple with the ClickTrackingUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickTrackingUrl

`func (o *AdBatchUpdate) SetClickTrackingUrl(v string)`

SetClickTrackingUrl sets ClickTrackingUrl field to given value.

### HasClickTrackingUrl

`func (o *AdBatchUpdate) HasClickTrackingUrl() bool`

HasClickTrackingUrl returns a boolean if a field has been set.

### SetClickTrackingUrlNil

`func (o *AdBatchUpdate) SetClickTrackingUrlNil(b bool)`

 SetClickTrackingUrlNil sets the value for ClickTrackingUrl to be an explicit nil

### UnsetClickTrackingUrl
`func (o *AdBatchUpdate) UnsetClickTrackingUrl()`

UnsetClickTrackingUrl ensures that no value is present for ClickTrackingUrl, not even an explicit nil
### GetCollectionItemsDestinationUrlTemplate

`func (o *AdBatchUpdate) GetCollectionItemsDestinationUrlTemplate() string`

GetCollectionItemsDestinationUrlTemplate returns the CollectionItemsDestinationUrlTemplate field if non-nil, zero value otherwise.

### GetCollectionItemsDestinationUrlTemplateOk

`func (o *AdBatchUpdate) GetCollectionItemsDestinationUrlTemplateOk() (*string, bool)`

GetCollectionItemsDestinationUrlTemplateOk returns a tuple with the CollectionItemsDestinationUrlTemplate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollectionItemsDestinationUrlTemplate

`func (o *AdBatchUpdate) SetCollectionItemsDestinationUrlTemplate(v string)`

SetCollectionItemsDestinationUrlTemplate sets CollectionItemsDestinationUrlTemplate field to given value.

### HasCollectionItemsDestinationUrlTemplate

`func (o *AdBatchUpdate) HasCollectionItemsDestinationUrlTemplate() bool`

HasCollectionItemsDestinationUrlTemplate returns a boolean if a field has been set.

### SetCollectionItemsDestinationUrlTemplateNil

`func (o *AdBatchUpdate) SetCollectionItemsDestinationUrlTemplateNil(b bool)`

 SetCollectionItemsDestinationUrlTemplateNil sets the value for CollectionItemsDestinationUrlTemplate to be an explicit nil

### UnsetCollectionItemsDestinationUrlTemplate
`func (o *AdBatchUpdate) UnsetCollectionItemsDestinationUrlTemplate()`

UnsetCollectionItemsDestinationUrlTemplate ensures that no value is present for CollectionItemsDestinationUrlTemplate, not even an explicit nil
### GetCollectionsHeaderType

`func (o *AdBatchUpdate) GetCollectionsHeaderType() AdCollectionsHeaderType`

GetCollectionsHeaderType returns the CollectionsHeaderType field if non-nil, zero value otherwise.

### GetCollectionsHeaderTypeOk

`func (o *AdBatchUpdate) GetCollectionsHeaderTypeOk() (*AdCollectionsHeaderType, bool)`

GetCollectionsHeaderTypeOk returns a tuple with the CollectionsHeaderType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollectionsHeaderType

`func (o *AdBatchUpdate) SetCollectionsHeaderType(v AdCollectionsHeaderType)`

SetCollectionsHeaderType sets CollectionsHeaderType field to given value.

### HasCollectionsHeaderType

`func (o *AdBatchUpdate) HasCollectionsHeaderType() bool`

HasCollectionsHeaderType returns a boolean if a field has been set.

### SetCollectionsHeaderTypeNil

`func (o *AdBatchUpdate) SetCollectionsHeaderTypeNil(b bool)`

 SetCollectionsHeaderTypeNil sets the value for CollectionsHeaderType to be an explicit nil

### UnsetCollectionsHeaderType
`func (o *AdBatchUpdate) UnsetCollectionsHeaderType()`

UnsetCollectionsHeaderType ensures that no value is present for CollectionsHeaderType, not even an explicit nil
### GetCreativeType

`func (o *AdBatchUpdate) GetCreativeType() CreativeType`

GetCreativeType returns the CreativeType field if non-nil, zero value otherwise.

### GetCreativeTypeOk

`func (o *AdBatchUpdate) GetCreativeTypeOk() (*CreativeType, bool)`

GetCreativeTypeOk returns a tuple with the CreativeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeType

`func (o *AdBatchUpdate) SetCreativeType(v CreativeType)`

SetCreativeType sets CreativeType field to given value.

### HasCreativeType

`func (o *AdBatchUpdate) HasCreativeType() bool`

HasCreativeType returns a boolean if a field has been set.

### GetCustomizableCtaType

`func (o *AdBatchUpdate) GetCustomizableCtaType() CustomizableCTAType`

GetCustomizableCtaType returns the CustomizableCtaType field if non-nil, zero value otherwise.

### GetCustomizableCtaTypeOk

`func (o *AdBatchUpdate) GetCustomizableCtaTypeOk() (*CustomizableCTAType, bool)`

GetCustomizableCtaTypeOk returns a tuple with the CustomizableCtaType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomizableCtaType

`func (o *AdBatchUpdate) SetCustomizableCtaType(v CustomizableCTAType)`

SetCustomizableCtaType sets CustomizableCtaType field to given value.

### HasCustomizableCtaType

`func (o *AdBatchUpdate) HasCustomizableCtaType() bool`

HasCustomizableCtaType returns a boolean if a field has been set.

### SetCustomizableCtaTypeNil

`func (o *AdBatchUpdate) SetCustomizableCtaTypeNil(b bool)`

 SetCustomizableCtaTypeNil sets the value for CustomizableCtaType to be an explicit nil

### UnsetCustomizableCtaType
`func (o *AdBatchUpdate) UnsetCustomizableCtaType()`

UnsetCustomizableCtaType ensures that no value is present for CustomizableCtaType, not even an explicit nil
### GetDestinationUrl

`func (o *AdBatchUpdate) GetDestinationUrl() string`

GetDestinationUrl returns the DestinationUrl field if non-nil, zero value otherwise.

### GetDestinationUrlOk

`func (o *AdBatchUpdate) GetDestinationUrlOk() (*string, bool)`

GetDestinationUrlOk returns a tuple with the DestinationUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationUrl

`func (o *AdBatchUpdate) SetDestinationUrl(v string)`

SetDestinationUrl sets DestinationUrl field to given value.

### HasDestinationUrl

`func (o *AdBatchUpdate) HasDestinationUrl() bool`

HasDestinationUrl returns a boolean if a field has been set.

### SetDestinationUrlNil

`func (o *AdBatchUpdate) SetDestinationUrlNil(b bool)`

 SetDestinationUrlNil sets the value for DestinationUrl to be an explicit nil

### UnsetDestinationUrl
`func (o *AdBatchUpdate) UnsetDestinationUrl()`

UnsetDestinationUrl ensures that no value is present for DestinationUrl, not even an explicit nil
### GetDisclosureType

`func (o *AdBatchUpdate) GetDisclosureType() DisclosureType`

GetDisclosureType returns the DisclosureType field if non-nil, zero value otherwise.

### GetDisclosureTypeOk

`func (o *AdBatchUpdate) GetDisclosureTypeOk() (*DisclosureType, bool)`

GetDisclosureTypeOk returns a tuple with the DisclosureType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisclosureType

`func (o *AdBatchUpdate) SetDisclosureType(v DisclosureType)`

SetDisclosureType sets DisclosureType field to given value.

### HasDisclosureType

`func (o *AdBatchUpdate) HasDisclosureType() bool`

HasDisclosureType returns a boolean if a field has been set.

### SetDisclosureTypeNil

`func (o *AdBatchUpdate) SetDisclosureTypeNil(b bool)`

 SetDisclosureTypeNil sets the value for DisclosureType to be an explicit nil

### UnsetDisclosureType
`func (o *AdBatchUpdate) UnsetDisclosureType()`

UnsetDisclosureType ensures that no value is present for DisclosureType, not even an explicit nil
### GetDisclosureUrl

`func (o *AdBatchUpdate) GetDisclosureUrl() string`

GetDisclosureUrl returns the DisclosureUrl field if non-nil, zero value otherwise.

### GetDisclosureUrlOk

`func (o *AdBatchUpdate) GetDisclosureUrlOk() (*string, bool)`

GetDisclosureUrlOk returns a tuple with the DisclosureUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisclosureUrl

`func (o *AdBatchUpdate) SetDisclosureUrl(v string)`

SetDisclosureUrl sets DisclosureUrl field to given value.

### HasDisclosureUrl

`func (o *AdBatchUpdate) HasDisclosureUrl() bool`

HasDisclosureUrl returns a boolean if a field has been set.

### SetDisclosureUrlNil

`func (o *AdBatchUpdate) SetDisclosureUrlNil(b bool)`

 SetDisclosureUrlNil sets the value for DisclosureUrl to be an explicit nil

### UnsetDisclosureUrl
`func (o *AdBatchUpdate) UnsetDisclosureUrl()`

UnsetDisclosureUrl ensures that no value is present for DisclosureUrl, not even an explicit nil
### GetGridClickType

`func (o *AdBatchUpdate) GetGridClickType() GridClickType`

GetGridClickType returns the GridClickType field if non-nil, zero value otherwise.

### GetGridClickTypeOk

`func (o *AdBatchUpdate) GetGridClickTypeOk() (*GridClickType, bool)`

GetGridClickTypeOk returns a tuple with the GridClickType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGridClickType

`func (o *AdBatchUpdate) SetGridClickType(v GridClickType)`

SetGridClickType sets GridClickType field to given value.

### HasGridClickType

`func (o *AdBatchUpdate) HasGridClickType() bool`

HasGridClickType returns a boolean if a field has been set.

### SetGridClickTypeNil

`func (o *AdBatchUpdate) SetGridClickTypeNil(b bool)`

 SetGridClickTypeNil sets the value for GridClickType to be an explicit nil

### UnsetGridClickType
`func (o *AdBatchUpdate) UnsetGridClickType()`

UnsetGridClickType ensures that no value is present for GridClickType, not even an explicit nil
### GetId

`func (o *AdBatchUpdate) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *AdBatchUpdate) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *AdBatchUpdate) SetId(v string)`

SetId sets Id field to given value.


### GetIosDeepLink

`func (o *AdBatchUpdate) GetIosDeepLink() string`

GetIosDeepLink returns the IosDeepLink field if non-nil, zero value otherwise.

### GetIosDeepLinkOk

`func (o *AdBatchUpdate) GetIosDeepLinkOk() (*string, bool)`

GetIosDeepLinkOk returns a tuple with the IosDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIosDeepLink

`func (o *AdBatchUpdate) SetIosDeepLink(v string)`

SetIosDeepLink sets IosDeepLink field to given value.

### HasIosDeepLink

`func (o *AdBatchUpdate) HasIosDeepLink() bool`

HasIosDeepLink returns a boolean if a field has been set.

### SetIosDeepLinkNil

`func (o *AdBatchUpdate) SetIosDeepLinkNil(b bool)`

 SetIosDeepLinkNil sets the value for IosDeepLink to be an explicit nil

### UnsetIosDeepLink
`func (o *AdBatchUpdate) UnsetIosDeepLink()`

UnsetIosDeepLink ensures that no value is present for IosDeepLink, not even an explicit nil
### GetIsCarting

`func (o *AdBatchUpdate) GetIsCarting() bool`

GetIsCarting returns the IsCarting field if non-nil, zero value otherwise.

### GetIsCartingOk

`func (o *AdBatchUpdate) GetIsCartingOk() (*bool, bool)`

GetIsCartingOk returns a tuple with the IsCarting field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCarting

`func (o *AdBatchUpdate) SetIsCarting(v bool)`

SetIsCarting sets IsCarting field to given value.

### HasIsCarting

`func (o *AdBatchUpdate) HasIsCarting() bool`

HasIsCarting returns a boolean if a field has been set.

### GetIsCollageAcceptedTerms

`func (o *AdBatchUpdate) GetIsCollageAcceptedTerms() bool`

GetIsCollageAcceptedTerms returns the IsCollageAcceptedTerms field if non-nil, zero value otherwise.

### GetIsCollageAcceptedTermsOk

`func (o *AdBatchUpdate) GetIsCollageAcceptedTermsOk() (*bool, bool)`

GetIsCollageAcceptedTermsOk returns a tuple with the IsCollageAcceptedTerms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCollageAcceptedTerms

`func (o *AdBatchUpdate) SetIsCollageAcceptedTerms(v bool)`

SetIsCollageAcceptedTerms sets IsCollageAcceptedTerms field to given value.

### HasIsCollageAcceptedTerms

`func (o *AdBatchUpdate) HasIsCollageAcceptedTerms() bool`

HasIsCollageAcceptedTerms returns a boolean if a field has been set.

### GetIsCollageSingleDestination

`func (o *AdBatchUpdate) GetIsCollageSingleDestination() bool`

GetIsCollageSingleDestination returns the IsCollageSingleDestination field if non-nil, zero value otherwise.

### GetIsCollageSingleDestinationOk

`func (o *AdBatchUpdate) GetIsCollageSingleDestinationOk() (*bool, bool)`

GetIsCollageSingleDestinationOk returns a tuple with the IsCollageSingleDestination field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCollageSingleDestination

`func (o *AdBatchUpdate) SetIsCollageSingleDestination(v bool)`

SetIsCollageSingleDestination sets IsCollageSingleDestination field to given value.

### HasIsCollageSingleDestination

`func (o *AdBatchUpdate) HasIsCollageSingleDestination() bool`

HasIsCollageSingleDestination returns a boolean if a field has been set.

### GetIsPinDeleted

`func (o *AdBatchUpdate) GetIsPinDeleted() bool`

GetIsPinDeleted returns the IsPinDeleted field if non-nil, zero value otherwise.

### GetIsPinDeletedOk

`func (o *AdBatchUpdate) GetIsPinDeletedOk() (*bool, bool)`

GetIsPinDeletedOk returns a tuple with the IsPinDeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPinDeleted

`func (o *AdBatchUpdate) SetIsPinDeleted(v bool)`

SetIsPinDeleted sets IsPinDeleted field to given value.

### HasIsPinDeleted

`func (o *AdBatchUpdate) HasIsPinDeleted() bool`

HasIsPinDeleted returns a boolean if a field has been set.

### GetIsRemovable

`func (o *AdBatchUpdate) GetIsRemovable() bool`

GetIsRemovable returns the IsRemovable field if non-nil, zero value otherwise.

### GetIsRemovableOk

`func (o *AdBatchUpdate) GetIsRemovableOk() (*bool, bool)`

GetIsRemovableOk returns a tuple with the IsRemovable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsRemovable

`func (o *AdBatchUpdate) SetIsRemovable(v bool)`

SetIsRemovable sets IsRemovable field to given value.

### HasIsRemovable

`func (o *AdBatchUpdate) HasIsRemovable() bool`

HasIsRemovable returns a boolean if a field has been set.

### GetLeadFormId

`func (o *AdBatchUpdate) GetLeadFormId() string`

GetLeadFormId returns the LeadFormId field if non-nil, zero value otherwise.

### GetLeadFormIdOk

`func (o *AdBatchUpdate) GetLeadFormIdOk() (*string, bool)`

GetLeadFormIdOk returns a tuple with the LeadFormId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeadFormId

`func (o *AdBatchUpdate) SetLeadFormId(v string)`

SetLeadFormId sets LeadFormId field to given value.

### HasLeadFormId

`func (o *AdBatchUpdate) HasLeadFormId() bool`

HasLeadFormId returns a boolean if a field has been set.

### SetLeadFormIdNil

`func (o *AdBatchUpdate) SetLeadFormIdNil(b bool)`

 SetLeadFormIdNil sets the value for LeadFormId to be an explicit nil

### UnsetLeadFormId
`func (o *AdBatchUpdate) UnsetLeadFormId()`

UnsetLeadFormId ensures that no value is present for LeadFormId, not even an explicit nil
### GetName

`func (o *AdBatchUpdate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdBatchUpdate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdBatchUpdate) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AdBatchUpdate) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *AdBatchUpdate) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *AdBatchUpdate) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetPinId

`func (o *AdBatchUpdate) GetPinId() string`

GetPinId returns the PinId field if non-nil, zero value otherwise.

### GetPinIdOk

`func (o *AdBatchUpdate) GetPinIdOk() (*string, bool)`

GetPinIdOk returns a tuple with the PinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinId

`func (o *AdBatchUpdate) SetPinId(v string)`

SetPinId sets PinId field to given value.

### HasPinId

`func (o *AdBatchUpdate) HasPinId() bool`

HasPinId returns a boolean if a field has been set.

### GetQuizPinData

`func (o *AdBatchUpdate) GetQuizPinData() QuizPinData`

GetQuizPinData returns the QuizPinData field if non-nil, zero value otherwise.

### GetQuizPinDataOk

`func (o *AdBatchUpdate) GetQuizPinDataOk() (*QuizPinData, bool)`

GetQuizPinDataOk returns a tuple with the QuizPinData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuizPinData

`func (o *AdBatchUpdate) SetQuizPinData(v QuizPinData)`

SetQuizPinData sets QuizPinData field to given value.

### HasQuizPinData

`func (o *AdBatchUpdate) HasQuizPinData() bool`

HasQuizPinData returns a boolean if a field has been set.

### SetQuizPinDataNil

`func (o *AdBatchUpdate) SetQuizPinDataNil(b bool)`

 SetQuizPinDataNil sets the value for QuizPinData to be an explicit nil

### UnsetQuizPinData
`func (o *AdBatchUpdate) UnsetQuizPinData()`

UnsetQuizPinData ensures that no value is present for QuizPinData, not even an explicit nil
### GetStatus

`func (o *AdBatchUpdate) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *AdBatchUpdate) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *AdBatchUpdate) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *AdBatchUpdate) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTrackingUrls

`func (o *AdBatchUpdate) GetTrackingUrls() TrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *AdBatchUpdate) GetTrackingUrlsOk() (*TrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *AdBatchUpdate) SetTrackingUrls(v TrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *AdBatchUpdate) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *AdBatchUpdate) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *AdBatchUpdate) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetViewTrackingUrl

`func (o *AdBatchUpdate) GetViewTrackingUrl() string`

GetViewTrackingUrl returns the ViewTrackingUrl field if non-nil, zero value otherwise.

### GetViewTrackingUrlOk

`func (o *AdBatchUpdate) GetViewTrackingUrlOk() (*string, bool)`

GetViewTrackingUrlOk returns a tuple with the ViewTrackingUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewTrackingUrl

`func (o *AdBatchUpdate) SetViewTrackingUrl(v string)`

SetViewTrackingUrl sets ViewTrackingUrl field to given value.

### HasViewTrackingUrl

`func (o *AdBatchUpdate) HasViewTrackingUrl() bool`

HasViewTrackingUrl returns a boolean if a field has been set.

### SetViewTrackingUrlNil

`func (o *AdBatchUpdate) SetViewTrackingUrlNil(b bool)`

 SetViewTrackingUrlNil sets the value for ViewTrackingUrl to be an explicit nil

### UnsetViewTrackingUrl
`func (o *AdBatchUpdate) UnsetViewTrackingUrl()`

UnsetViewTrackingUrl ensures that no value is present for ViewTrackingUrl, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


