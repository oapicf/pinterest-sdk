# AdCommon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | Pointer to **string** | ID of the ad group that contains the ad. | [optional] 
**AndroidDeepLink** | Pointer to **NullableString** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**CarouselAndroidDeepLinks** | Pointer to **[]string** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**CarouselDestinationUrls** | Pointer to **[]string** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**CarouselIosDeepLinks** | Pointer to **[]string** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**ClickTrackingUrl** | Pointer to **NullableString** | Tracking url for the ad clicks. | [optional] 
**CreativeType** | Pointer to [**CreativeType**](CreativeType.md) |  | [optional] 
**DestinationUrl** | Pointer to **NullableString** | Destination URL. | [optional] 
**IosDeepLink** | Pointer to **NullableString** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**IsPinDeleted** | Pointer to **bool** | Is original pin deleted? | [optional] 
**IsRemovable** | Pointer to **bool** | Is pin repinnable? | [optional] 
**Name** | Pointer to **NullableString** | Name of the ad - 255 chars max. | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] 
**TrackingUrls** | Pointer to [**NullableAdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional] 
**ViewTrackingUrl** | Pointer to **NullableString** | Tracking URL for ad impressions. | [optional] 
**LeadFormId** | Pointer to **NullableString** | Lead form ID for lead ad generation. | [optional] 
**GridClickType** | Pointer to [**NullableGridClickType**](GridClickType.md) |  | [optional] 
**CustomizableCtaType** | Pointer to **NullableString** | Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only) | [optional] 
**QuizPinData** | Pointer to [**NullableAdCommonQuizPinData**](AdCommonQuizPinData.md) |  | [optional] 

## Methods

### NewAdCommon

`func NewAdCommon() *AdCommon`

NewAdCommon instantiates a new AdCommon object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdCommonWithDefaults

`func NewAdCommonWithDefaults() *AdCommon`

NewAdCommonWithDefaults instantiates a new AdCommon object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdGroupId

`func (o *AdCommon) GetAdGroupId() string`

GetAdGroupId returns the AdGroupId field if non-nil, zero value otherwise.

### GetAdGroupIdOk

`func (o *AdCommon) GetAdGroupIdOk() (*string, bool)`

GetAdGroupIdOk returns a tuple with the AdGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupId

`func (o *AdCommon) SetAdGroupId(v string)`

SetAdGroupId sets AdGroupId field to given value.

### HasAdGroupId

`func (o *AdCommon) HasAdGroupId() bool`

HasAdGroupId returns a boolean if a field has been set.

### GetAndroidDeepLink

`func (o *AdCommon) GetAndroidDeepLink() string`

GetAndroidDeepLink returns the AndroidDeepLink field if non-nil, zero value otherwise.

### GetAndroidDeepLinkOk

`func (o *AdCommon) GetAndroidDeepLinkOk() (*string, bool)`

GetAndroidDeepLinkOk returns a tuple with the AndroidDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAndroidDeepLink

`func (o *AdCommon) SetAndroidDeepLink(v string)`

SetAndroidDeepLink sets AndroidDeepLink field to given value.

### HasAndroidDeepLink

`func (o *AdCommon) HasAndroidDeepLink() bool`

HasAndroidDeepLink returns a boolean if a field has been set.

### SetAndroidDeepLinkNil

`func (o *AdCommon) SetAndroidDeepLinkNil(b bool)`

 SetAndroidDeepLinkNil sets the value for AndroidDeepLink to be an explicit nil

### UnsetAndroidDeepLink
`func (o *AdCommon) UnsetAndroidDeepLink()`

UnsetAndroidDeepLink ensures that no value is present for AndroidDeepLink, not even an explicit nil
### GetCarouselAndroidDeepLinks

`func (o *AdCommon) GetCarouselAndroidDeepLinks() []string`

GetCarouselAndroidDeepLinks returns the CarouselAndroidDeepLinks field if non-nil, zero value otherwise.

### GetCarouselAndroidDeepLinksOk

`func (o *AdCommon) GetCarouselAndroidDeepLinksOk() (*[]string, bool)`

GetCarouselAndroidDeepLinksOk returns a tuple with the CarouselAndroidDeepLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselAndroidDeepLinks

`func (o *AdCommon) SetCarouselAndroidDeepLinks(v []string)`

SetCarouselAndroidDeepLinks sets CarouselAndroidDeepLinks field to given value.

### HasCarouselAndroidDeepLinks

`func (o *AdCommon) HasCarouselAndroidDeepLinks() bool`

HasCarouselAndroidDeepLinks returns a boolean if a field has been set.

### SetCarouselAndroidDeepLinksNil

`func (o *AdCommon) SetCarouselAndroidDeepLinksNil(b bool)`

 SetCarouselAndroidDeepLinksNil sets the value for CarouselAndroidDeepLinks to be an explicit nil

### UnsetCarouselAndroidDeepLinks
`func (o *AdCommon) UnsetCarouselAndroidDeepLinks()`

UnsetCarouselAndroidDeepLinks ensures that no value is present for CarouselAndroidDeepLinks, not even an explicit nil
### GetCarouselDestinationUrls

`func (o *AdCommon) GetCarouselDestinationUrls() []string`

GetCarouselDestinationUrls returns the CarouselDestinationUrls field if non-nil, zero value otherwise.

### GetCarouselDestinationUrlsOk

`func (o *AdCommon) GetCarouselDestinationUrlsOk() (*[]string, bool)`

GetCarouselDestinationUrlsOk returns a tuple with the CarouselDestinationUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselDestinationUrls

`func (o *AdCommon) SetCarouselDestinationUrls(v []string)`

SetCarouselDestinationUrls sets CarouselDestinationUrls field to given value.

### HasCarouselDestinationUrls

`func (o *AdCommon) HasCarouselDestinationUrls() bool`

HasCarouselDestinationUrls returns a boolean if a field has been set.

### SetCarouselDestinationUrlsNil

`func (o *AdCommon) SetCarouselDestinationUrlsNil(b bool)`

 SetCarouselDestinationUrlsNil sets the value for CarouselDestinationUrls to be an explicit nil

### UnsetCarouselDestinationUrls
`func (o *AdCommon) UnsetCarouselDestinationUrls()`

UnsetCarouselDestinationUrls ensures that no value is present for CarouselDestinationUrls, not even an explicit nil
### GetCarouselIosDeepLinks

`func (o *AdCommon) GetCarouselIosDeepLinks() []string`

GetCarouselIosDeepLinks returns the CarouselIosDeepLinks field if non-nil, zero value otherwise.

### GetCarouselIosDeepLinksOk

`func (o *AdCommon) GetCarouselIosDeepLinksOk() (*[]string, bool)`

GetCarouselIosDeepLinksOk returns a tuple with the CarouselIosDeepLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselIosDeepLinks

`func (o *AdCommon) SetCarouselIosDeepLinks(v []string)`

SetCarouselIosDeepLinks sets CarouselIosDeepLinks field to given value.

### HasCarouselIosDeepLinks

`func (o *AdCommon) HasCarouselIosDeepLinks() bool`

HasCarouselIosDeepLinks returns a boolean if a field has been set.

### SetCarouselIosDeepLinksNil

`func (o *AdCommon) SetCarouselIosDeepLinksNil(b bool)`

 SetCarouselIosDeepLinksNil sets the value for CarouselIosDeepLinks to be an explicit nil

### UnsetCarouselIosDeepLinks
`func (o *AdCommon) UnsetCarouselIosDeepLinks()`

UnsetCarouselIosDeepLinks ensures that no value is present for CarouselIosDeepLinks, not even an explicit nil
### GetClickTrackingUrl

`func (o *AdCommon) GetClickTrackingUrl() string`

GetClickTrackingUrl returns the ClickTrackingUrl field if non-nil, zero value otherwise.

### GetClickTrackingUrlOk

`func (o *AdCommon) GetClickTrackingUrlOk() (*string, bool)`

GetClickTrackingUrlOk returns a tuple with the ClickTrackingUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickTrackingUrl

`func (o *AdCommon) SetClickTrackingUrl(v string)`

SetClickTrackingUrl sets ClickTrackingUrl field to given value.

### HasClickTrackingUrl

`func (o *AdCommon) HasClickTrackingUrl() bool`

HasClickTrackingUrl returns a boolean if a field has been set.

### SetClickTrackingUrlNil

`func (o *AdCommon) SetClickTrackingUrlNil(b bool)`

 SetClickTrackingUrlNil sets the value for ClickTrackingUrl to be an explicit nil

### UnsetClickTrackingUrl
`func (o *AdCommon) UnsetClickTrackingUrl()`

UnsetClickTrackingUrl ensures that no value is present for ClickTrackingUrl, not even an explicit nil
### GetCreativeType

`func (o *AdCommon) GetCreativeType() CreativeType`

GetCreativeType returns the CreativeType field if non-nil, zero value otherwise.

### GetCreativeTypeOk

`func (o *AdCommon) GetCreativeTypeOk() (*CreativeType, bool)`

GetCreativeTypeOk returns a tuple with the CreativeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeType

`func (o *AdCommon) SetCreativeType(v CreativeType)`

SetCreativeType sets CreativeType field to given value.

### HasCreativeType

`func (o *AdCommon) HasCreativeType() bool`

HasCreativeType returns a boolean if a field has been set.

### GetDestinationUrl

`func (o *AdCommon) GetDestinationUrl() string`

GetDestinationUrl returns the DestinationUrl field if non-nil, zero value otherwise.

### GetDestinationUrlOk

`func (o *AdCommon) GetDestinationUrlOk() (*string, bool)`

GetDestinationUrlOk returns a tuple with the DestinationUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationUrl

`func (o *AdCommon) SetDestinationUrl(v string)`

SetDestinationUrl sets DestinationUrl field to given value.

### HasDestinationUrl

`func (o *AdCommon) HasDestinationUrl() bool`

HasDestinationUrl returns a boolean if a field has been set.

### SetDestinationUrlNil

`func (o *AdCommon) SetDestinationUrlNil(b bool)`

 SetDestinationUrlNil sets the value for DestinationUrl to be an explicit nil

### UnsetDestinationUrl
`func (o *AdCommon) UnsetDestinationUrl()`

UnsetDestinationUrl ensures that no value is present for DestinationUrl, not even an explicit nil
### GetIosDeepLink

`func (o *AdCommon) GetIosDeepLink() string`

GetIosDeepLink returns the IosDeepLink field if non-nil, zero value otherwise.

### GetIosDeepLinkOk

`func (o *AdCommon) GetIosDeepLinkOk() (*string, bool)`

GetIosDeepLinkOk returns a tuple with the IosDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIosDeepLink

`func (o *AdCommon) SetIosDeepLink(v string)`

SetIosDeepLink sets IosDeepLink field to given value.

### HasIosDeepLink

`func (o *AdCommon) HasIosDeepLink() bool`

HasIosDeepLink returns a boolean if a field has been set.

### SetIosDeepLinkNil

`func (o *AdCommon) SetIosDeepLinkNil(b bool)`

 SetIosDeepLinkNil sets the value for IosDeepLink to be an explicit nil

### UnsetIosDeepLink
`func (o *AdCommon) UnsetIosDeepLink()`

UnsetIosDeepLink ensures that no value is present for IosDeepLink, not even an explicit nil
### GetIsPinDeleted

`func (o *AdCommon) GetIsPinDeleted() bool`

GetIsPinDeleted returns the IsPinDeleted field if non-nil, zero value otherwise.

### GetIsPinDeletedOk

`func (o *AdCommon) GetIsPinDeletedOk() (*bool, bool)`

GetIsPinDeletedOk returns a tuple with the IsPinDeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPinDeleted

`func (o *AdCommon) SetIsPinDeleted(v bool)`

SetIsPinDeleted sets IsPinDeleted field to given value.

### HasIsPinDeleted

`func (o *AdCommon) HasIsPinDeleted() bool`

HasIsPinDeleted returns a boolean if a field has been set.

### GetIsRemovable

`func (o *AdCommon) GetIsRemovable() bool`

GetIsRemovable returns the IsRemovable field if non-nil, zero value otherwise.

### GetIsRemovableOk

`func (o *AdCommon) GetIsRemovableOk() (*bool, bool)`

GetIsRemovableOk returns a tuple with the IsRemovable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsRemovable

`func (o *AdCommon) SetIsRemovable(v bool)`

SetIsRemovable sets IsRemovable field to given value.

### HasIsRemovable

`func (o *AdCommon) HasIsRemovable() bool`

HasIsRemovable returns a boolean if a field has been set.

### GetName

`func (o *AdCommon) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdCommon) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdCommon) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AdCommon) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *AdCommon) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *AdCommon) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetStatus

`func (o *AdCommon) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *AdCommon) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *AdCommon) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *AdCommon) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTrackingUrls

`func (o *AdCommon) GetTrackingUrls() AdCommonTrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *AdCommon) GetTrackingUrlsOk() (*AdCommonTrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *AdCommon) SetTrackingUrls(v AdCommonTrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *AdCommon) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *AdCommon) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *AdCommon) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetViewTrackingUrl

`func (o *AdCommon) GetViewTrackingUrl() string`

GetViewTrackingUrl returns the ViewTrackingUrl field if non-nil, zero value otherwise.

### GetViewTrackingUrlOk

`func (o *AdCommon) GetViewTrackingUrlOk() (*string, bool)`

GetViewTrackingUrlOk returns a tuple with the ViewTrackingUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewTrackingUrl

`func (o *AdCommon) SetViewTrackingUrl(v string)`

SetViewTrackingUrl sets ViewTrackingUrl field to given value.

### HasViewTrackingUrl

`func (o *AdCommon) HasViewTrackingUrl() bool`

HasViewTrackingUrl returns a boolean if a field has been set.

### SetViewTrackingUrlNil

`func (o *AdCommon) SetViewTrackingUrlNil(b bool)`

 SetViewTrackingUrlNil sets the value for ViewTrackingUrl to be an explicit nil

### UnsetViewTrackingUrl
`func (o *AdCommon) UnsetViewTrackingUrl()`

UnsetViewTrackingUrl ensures that no value is present for ViewTrackingUrl, not even an explicit nil
### GetLeadFormId

`func (o *AdCommon) GetLeadFormId() string`

GetLeadFormId returns the LeadFormId field if non-nil, zero value otherwise.

### GetLeadFormIdOk

`func (o *AdCommon) GetLeadFormIdOk() (*string, bool)`

GetLeadFormIdOk returns a tuple with the LeadFormId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeadFormId

`func (o *AdCommon) SetLeadFormId(v string)`

SetLeadFormId sets LeadFormId field to given value.

### HasLeadFormId

`func (o *AdCommon) HasLeadFormId() bool`

HasLeadFormId returns a boolean if a field has been set.

### SetLeadFormIdNil

`func (o *AdCommon) SetLeadFormIdNil(b bool)`

 SetLeadFormIdNil sets the value for LeadFormId to be an explicit nil

### UnsetLeadFormId
`func (o *AdCommon) UnsetLeadFormId()`

UnsetLeadFormId ensures that no value is present for LeadFormId, not even an explicit nil
### GetGridClickType

`func (o *AdCommon) GetGridClickType() GridClickType`

GetGridClickType returns the GridClickType field if non-nil, zero value otherwise.

### GetGridClickTypeOk

`func (o *AdCommon) GetGridClickTypeOk() (*GridClickType, bool)`

GetGridClickTypeOk returns a tuple with the GridClickType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGridClickType

`func (o *AdCommon) SetGridClickType(v GridClickType)`

SetGridClickType sets GridClickType field to given value.

### HasGridClickType

`func (o *AdCommon) HasGridClickType() bool`

HasGridClickType returns a boolean if a field has been set.

### SetGridClickTypeNil

`func (o *AdCommon) SetGridClickTypeNil(b bool)`

 SetGridClickTypeNil sets the value for GridClickType to be an explicit nil

### UnsetGridClickType
`func (o *AdCommon) UnsetGridClickType()`

UnsetGridClickType ensures that no value is present for GridClickType, not even an explicit nil
### GetCustomizableCtaType

`func (o *AdCommon) GetCustomizableCtaType() string`

GetCustomizableCtaType returns the CustomizableCtaType field if non-nil, zero value otherwise.

### GetCustomizableCtaTypeOk

`func (o *AdCommon) GetCustomizableCtaTypeOk() (*string, bool)`

GetCustomizableCtaTypeOk returns a tuple with the CustomizableCtaType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomizableCtaType

`func (o *AdCommon) SetCustomizableCtaType(v string)`

SetCustomizableCtaType sets CustomizableCtaType field to given value.

### HasCustomizableCtaType

`func (o *AdCommon) HasCustomizableCtaType() bool`

HasCustomizableCtaType returns a boolean if a field has been set.

### SetCustomizableCtaTypeNil

`func (o *AdCommon) SetCustomizableCtaTypeNil(b bool)`

 SetCustomizableCtaTypeNil sets the value for CustomizableCtaType to be an explicit nil

### UnsetCustomizableCtaType
`func (o *AdCommon) UnsetCustomizableCtaType()`

UnsetCustomizableCtaType ensures that no value is present for CustomizableCtaType, not even an explicit nil
### GetQuizPinData

`func (o *AdCommon) GetQuizPinData() AdCommonQuizPinData`

GetQuizPinData returns the QuizPinData field if non-nil, zero value otherwise.

### GetQuizPinDataOk

`func (o *AdCommon) GetQuizPinDataOk() (*AdCommonQuizPinData, bool)`

GetQuizPinDataOk returns a tuple with the QuizPinData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuizPinData

`func (o *AdCommon) SetQuizPinData(v AdCommonQuizPinData)`

SetQuizPinData sets QuizPinData field to given value.

### HasQuizPinData

`func (o *AdCommon) HasQuizPinData() bool`

HasQuizPinData returns a boolean if a field has been set.

### SetQuizPinDataNil

`func (o *AdCommon) SetQuizPinDataNil(b bool)`

 SetQuizPinDataNil sets the value for QuizPinData to be an explicit nil

### UnsetQuizPinData
`func (o *AdCommon) UnsetQuizPinData()`

UnsetQuizPinData ensures that no value is present for QuizPinData, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


