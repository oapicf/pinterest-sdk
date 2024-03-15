# AdCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **string** | ID of the ad group that contains the ad. | 
**AndroidDeepLink** | Pointer to **NullableString** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**CarouselAndroidDeepLinks** | Pointer to **[]string** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**CarouselDestinationUrls** | Pointer to **[]string** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**CarouselIosDeepLinks** | Pointer to **[]string** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**ClickTrackingUrl** | Pointer to **NullableString** | Tracking url for the ad clicks. | [optional] 
**CreativeType** | [**CreativeType**](CreativeType.md) |  | 
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
**PinId** | **string** | Pin ID. | 

## Methods

### NewAdCreateRequest

`func NewAdCreateRequest(adGroupId string, creativeType CreativeType, pinId string, ) *AdCreateRequest`

NewAdCreateRequest instantiates a new AdCreateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdCreateRequestWithDefaults

`func NewAdCreateRequestWithDefaults() *AdCreateRequest`

NewAdCreateRequestWithDefaults instantiates a new AdCreateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdGroupId

`func (o *AdCreateRequest) GetAdGroupId() string`

GetAdGroupId returns the AdGroupId field if non-nil, zero value otherwise.

### GetAdGroupIdOk

`func (o *AdCreateRequest) GetAdGroupIdOk() (*string, bool)`

GetAdGroupIdOk returns a tuple with the AdGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupId

`func (o *AdCreateRequest) SetAdGroupId(v string)`

SetAdGroupId sets AdGroupId field to given value.


### GetAndroidDeepLink

`func (o *AdCreateRequest) GetAndroidDeepLink() string`

GetAndroidDeepLink returns the AndroidDeepLink field if non-nil, zero value otherwise.

### GetAndroidDeepLinkOk

`func (o *AdCreateRequest) GetAndroidDeepLinkOk() (*string, bool)`

GetAndroidDeepLinkOk returns a tuple with the AndroidDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAndroidDeepLink

`func (o *AdCreateRequest) SetAndroidDeepLink(v string)`

SetAndroidDeepLink sets AndroidDeepLink field to given value.

### HasAndroidDeepLink

`func (o *AdCreateRequest) HasAndroidDeepLink() bool`

HasAndroidDeepLink returns a boolean if a field has been set.

### SetAndroidDeepLinkNil

`func (o *AdCreateRequest) SetAndroidDeepLinkNil(b bool)`

 SetAndroidDeepLinkNil sets the value for AndroidDeepLink to be an explicit nil

### UnsetAndroidDeepLink
`func (o *AdCreateRequest) UnsetAndroidDeepLink()`

UnsetAndroidDeepLink ensures that no value is present for AndroidDeepLink, not even an explicit nil
### GetCarouselAndroidDeepLinks

`func (o *AdCreateRequest) GetCarouselAndroidDeepLinks() []string`

GetCarouselAndroidDeepLinks returns the CarouselAndroidDeepLinks field if non-nil, zero value otherwise.

### GetCarouselAndroidDeepLinksOk

`func (o *AdCreateRequest) GetCarouselAndroidDeepLinksOk() (*[]string, bool)`

GetCarouselAndroidDeepLinksOk returns a tuple with the CarouselAndroidDeepLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselAndroidDeepLinks

`func (o *AdCreateRequest) SetCarouselAndroidDeepLinks(v []string)`

SetCarouselAndroidDeepLinks sets CarouselAndroidDeepLinks field to given value.

### HasCarouselAndroidDeepLinks

`func (o *AdCreateRequest) HasCarouselAndroidDeepLinks() bool`

HasCarouselAndroidDeepLinks returns a boolean if a field has been set.

### SetCarouselAndroidDeepLinksNil

`func (o *AdCreateRequest) SetCarouselAndroidDeepLinksNil(b bool)`

 SetCarouselAndroidDeepLinksNil sets the value for CarouselAndroidDeepLinks to be an explicit nil

### UnsetCarouselAndroidDeepLinks
`func (o *AdCreateRequest) UnsetCarouselAndroidDeepLinks()`

UnsetCarouselAndroidDeepLinks ensures that no value is present for CarouselAndroidDeepLinks, not even an explicit nil
### GetCarouselDestinationUrls

`func (o *AdCreateRequest) GetCarouselDestinationUrls() []string`

GetCarouselDestinationUrls returns the CarouselDestinationUrls field if non-nil, zero value otherwise.

### GetCarouselDestinationUrlsOk

`func (o *AdCreateRequest) GetCarouselDestinationUrlsOk() (*[]string, bool)`

GetCarouselDestinationUrlsOk returns a tuple with the CarouselDestinationUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselDestinationUrls

`func (o *AdCreateRequest) SetCarouselDestinationUrls(v []string)`

SetCarouselDestinationUrls sets CarouselDestinationUrls field to given value.

### HasCarouselDestinationUrls

`func (o *AdCreateRequest) HasCarouselDestinationUrls() bool`

HasCarouselDestinationUrls returns a boolean if a field has been set.

### SetCarouselDestinationUrlsNil

`func (o *AdCreateRequest) SetCarouselDestinationUrlsNil(b bool)`

 SetCarouselDestinationUrlsNil sets the value for CarouselDestinationUrls to be an explicit nil

### UnsetCarouselDestinationUrls
`func (o *AdCreateRequest) UnsetCarouselDestinationUrls()`

UnsetCarouselDestinationUrls ensures that no value is present for CarouselDestinationUrls, not even an explicit nil
### GetCarouselIosDeepLinks

`func (o *AdCreateRequest) GetCarouselIosDeepLinks() []string`

GetCarouselIosDeepLinks returns the CarouselIosDeepLinks field if non-nil, zero value otherwise.

### GetCarouselIosDeepLinksOk

`func (o *AdCreateRequest) GetCarouselIosDeepLinksOk() (*[]string, bool)`

GetCarouselIosDeepLinksOk returns a tuple with the CarouselIosDeepLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselIosDeepLinks

`func (o *AdCreateRequest) SetCarouselIosDeepLinks(v []string)`

SetCarouselIosDeepLinks sets CarouselIosDeepLinks field to given value.

### HasCarouselIosDeepLinks

`func (o *AdCreateRequest) HasCarouselIosDeepLinks() bool`

HasCarouselIosDeepLinks returns a boolean if a field has been set.

### SetCarouselIosDeepLinksNil

`func (o *AdCreateRequest) SetCarouselIosDeepLinksNil(b bool)`

 SetCarouselIosDeepLinksNil sets the value for CarouselIosDeepLinks to be an explicit nil

### UnsetCarouselIosDeepLinks
`func (o *AdCreateRequest) UnsetCarouselIosDeepLinks()`

UnsetCarouselIosDeepLinks ensures that no value is present for CarouselIosDeepLinks, not even an explicit nil
### GetClickTrackingUrl

`func (o *AdCreateRequest) GetClickTrackingUrl() string`

GetClickTrackingUrl returns the ClickTrackingUrl field if non-nil, zero value otherwise.

### GetClickTrackingUrlOk

`func (o *AdCreateRequest) GetClickTrackingUrlOk() (*string, bool)`

GetClickTrackingUrlOk returns a tuple with the ClickTrackingUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickTrackingUrl

`func (o *AdCreateRequest) SetClickTrackingUrl(v string)`

SetClickTrackingUrl sets ClickTrackingUrl field to given value.

### HasClickTrackingUrl

`func (o *AdCreateRequest) HasClickTrackingUrl() bool`

HasClickTrackingUrl returns a boolean if a field has been set.

### SetClickTrackingUrlNil

`func (o *AdCreateRequest) SetClickTrackingUrlNil(b bool)`

 SetClickTrackingUrlNil sets the value for ClickTrackingUrl to be an explicit nil

### UnsetClickTrackingUrl
`func (o *AdCreateRequest) UnsetClickTrackingUrl()`

UnsetClickTrackingUrl ensures that no value is present for ClickTrackingUrl, not even an explicit nil
### GetCreativeType

`func (o *AdCreateRequest) GetCreativeType() CreativeType`

GetCreativeType returns the CreativeType field if non-nil, zero value otherwise.

### GetCreativeTypeOk

`func (o *AdCreateRequest) GetCreativeTypeOk() (*CreativeType, bool)`

GetCreativeTypeOk returns a tuple with the CreativeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeType

`func (o *AdCreateRequest) SetCreativeType(v CreativeType)`

SetCreativeType sets CreativeType field to given value.


### GetDestinationUrl

`func (o *AdCreateRequest) GetDestinationUrl() string`

GetDestinationUrl returns the DestinationUrl field if non-nil, zero value otherwise.

### GetDestinationUrlOk

`func (o *AdCreateRequest) GetDestinationUrlOk() (*string, bool)`

GetDestinationUrlOk returns a tuple with the DestinationUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationUrl

`func (o *AdCreateRequest) SetDestinationUrl(v string)`

SetDestinationUrl sets DestinationUrl field to given value.

### HasDestinationUrl

`func (o *AdCreateRequest) HasDestinationUrl() bool`

HasDestinationUrl returns a boolean if a field has been set.

### SetDestinationUrlNil

`func (o *AdCreateRequest) SetDestinationUrlNil(b bool)`

 SetDestinationUrlNil sets the value for DestinationUrl to be an explicit nil

### UnsetDestinationUrl
`func (o *AdCreateRequest) UnsetDestinationUrl()`

UnsetDestinationUrl ensures that no value is present for DestinationUrl, not even an explicit nil
### GetIosDeepLink

`func (o *AdCreateRequest) GetIosDeepLink() string`

GetIosDeepLink returns the IosDeepLink field if non-nil, zero value otherwise.

### GetIosDeepLinkOk

`func (o *AdCreateRequest) GetIosDeepLinkOk() (*string, bool)`

GetIosDeepLinkOk returns a tuple with the IosDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIosDeepLink

`func (o *AdCreateRequest) SetIosDeepLink(v string)`

SetIosDeepLink sets IosDeepLink field to given value.

### HasIosDeepLink

`func (o *AdCreateRequest) HasIosDeepLink() bool`

HasIosDeepLink returns a boolean if a field has been set.

### SetIosDeepLinkNil

`func (o *AdCreateRequest) SetIosDeepLinkNil(b bool)`

 SetIosDeepLinkNil sets the value for IosDeepLink to be an explicit nil

### UnsetIosDeepLink
`func (o *AdCreateRequest) UnsetIosDeepLink()`

UnsetIosDeepLink ensures that no value is present for IosDeepLink, not even an explicit nil
### GetIsPinDeleted

`func (o *AdCreateRequest) GetIsPinDeleted() bool`

GetIsPinDeleted returns the IsPinDeleted field if non-nil, zero value otherwise.

### GetIsPinDeletedOk

`func (o *AdCreateRequest) GetIsPinDeletedOk() (*bool, bool)`

GetIsPinDeletedOk returns a tuple with the IsPinDeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPinDeleted

`func (o *AdCreateRequest) SetIsPinDeleted(v bool)`

SetIsPinDeleted sets IsPinDeleted field to given value.

### HasIsPinDeleted

`func (o *AdCreateRequest) HasIsPinDeleted() bool`

HasIsPinDeleted returns a boolean if a field has been set.

### GetIsRemovable

`func (o *AdCreateRequest) GetIsRemovable() bool`

GetIsRemovable returns the IsRemovable field if non-nil, zero value otherwise.

### GetIsRemovableOk

`func (o *AdCreateRequest) GetIsRemovableOk() (*bool, bool)`

GetIsRemovableOk returns a tuple with the IsRemovable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsRemovable

`func (o *AdCreateRequest) SetIsRemovable(v bool)`

SetIsRemovable sets IsRemovable field to given value.

### HasIsRemovable

`func (o *AdCreateRequest) HasIsRemovable() bool`

HasIsRemovable returns a boolean if a field has been set.

### GetName

`func (o *AdCreateRequest) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdCreateRequest) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdCreateRequest) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AdCreateRequest) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *AdCreateRequest) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *AdCreateRequest) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetStatus

`func (o *AdCreateRequest) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *AdCreateRequest) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *AdCreateRequest) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *AdCreateRequest) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTrackingUrls

`func (o *AdCreateRequest) GetTrackingUrls() AdCommonTrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *AdCreateRequest) GetTrackingUrlsOk() (*AdCommonTrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *AdCreateRequest) SetTrackingUrls(v AdCommonTrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *AdCreateRequest) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *AdCreateRequest) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *AdCreateRequest) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetViewTrackingUrl

`func (o *AdCreateRequest) GetViewTrackingUrl() string`

GetViewTrackingUrl returns the ViewTrackingUrl field if non-nil, zero value otherwise.

### GetViewTrackingUrlOk

`func (o *AdCreateRequest) GetViewTrackingUrlOk() (*string, bool)`

GetViewTrackingUrlOk returns a tuple with the ViewTrackingUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewTrackingUrl

`func (o *AdCreateRequest) SetViewTrackingUrl(v string)`

SetViewTrackingUrl sets ViewTrackingUrl field to given value.

### HasViewTrackingUrl

`func (o *AdCreateRequest) HasViewTrackingUrl() bool`

HasViewTrackingUrl returns a boolean if a field has been set.

### SetViewTrackingUrlNil

`func (o *AdCreateRequest) SetViewTrackingUrlNil(b bool)`

 SetViewTrackingUrlNil sets the value for ViewTrackingUrl to be an explicit nil

### UnsetViewTrackingUrl
`func (o *AdCreateRequest) UnsetViewTrackingUrl()`

UnsetViewTrackingUrl ensures that no value is present for ViewTrackingUrl, not even an explicit nil
### GetLeadFormId

`func (o *AdCreateRequest) GetLeadFormId() string`

GetLeadFormId returns the LeadFormId field if non-nil, zero value otherwise.

### GetLeadFormIdOk

`func (o *AdCreateRequest) GetLeadFormIdOk() (*string, bool)`

GetLeadFormIdOk returns a tuple with the LeadFormId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeadFormId

`func (o *AdCreateRequest) SetLeadFormId(v string)`

SetLeadFormId sets LeadFormId field to given value.

### HasLeadFormId

`func (o *AdCreateRequest) HasLeadFormId() bool`

HasLeadFormId returns a boolean if a field has been set.

### SetLeadFormIdNil

`func (o *AdCreateRequest) SetLeadFormIdNil(b bool)`

 SetLeadFormIdNil sets the value for LeadFormId to be an explicit nil

### UnsetLeadFormId
`func (o *AdCreateRequest) UnsetLeadFormId()`

UnsetLeadFormId ensures that no value is present for LeadFormId, not even an explicit nil
### GetGridClickType

`func (o *AdCreateRequest) GetGridClickType() GridClickType`

GetGridClickType returns the GridClickType field if non-nil, zero value otherwise.

### GetGridClickTypeOk

`func (o *AdCreateRequest) GetGridClickTypeOk() (*GridClickType, bool)`

GetGridClickTypeOk returns a tuple with the GridClickType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGridClickType

`func (o *AdCreateRequest) SetGridClickType(v GridClickType)`

SetGridClickType sets GridClickType field to given value.

### HasGridClickType

`func (o *AdCreateRequest) HasGridClickType() bool`

HasGridClickType returns a boolean if a field has been set.

### SetGridClickTypeNil

`func (o *AdCreateRequest) SetGridClickTypeNil(b bool)`

 SetGridClickTypeNil sets the value for GridClickType to be an explicit nil

### UnsetGridClickType
`func (o *AdCreateRequest) UnsetGridClickType()`

UnsetGridClickType ensures that no value is present for GridClickType, not even an explicit nil
### GetCustomizableCtaType

`func (o *AdCreateRequest) GetCustomizableCtaType() string`

GetCustomizableCtaType returns the CustomizableCtaType field if non-nil, zero value otherwise.

### GetCustomizableCtaTypeOk

`func (o *AdCreateRequest) GetCustomizableCtaTypeOk() (*string, bool)`

GetCustomizableCtaTypeOk returns a tuple with the CustomizableCtaType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomizableCtaType

`func (o *AdCreateRequest) SetCustomizableCtaType(v string)`

SetCustomizableCtaType sets CustomizableCtaType field to given value.

### HasCustomizableCtaType

`func (o *AdCreateRequest) HasCustomizableCtaType() bool`

HasCustomizableCtaType returns a boolean if a field has been set.

### SetCustomizableCtaTypeNil

`func (o *AdCreateRequest) SetCustomizableCtaTypeNil(b bool)`

 SetCustomizableCtaTypeNil sets the value for CustomizableCtaType to be an explicit nil

### UnsetCustomizableCtaType
`func (o *AdCreateRequest) UnsetCustomizableCtaType()`

UnsetCustomizableCtaType ensures that no value is present for CustomizableCtaType, not even an explicit nil
### GetQuizPinData

`func (o *AdCreateRequest) GetQuizPinData() AdCommonQuizPinData`

GetQuizPinData returns the QuizPinData field if non-nil, zero value otherwise.

### GetQuizPinDataOk

`func (o *AdCreateRequest) GetQuizPinDataOk() (*AdCommonQuizPinData, bool)`

GetQuizPinDataOk returns a tuple with the QuizPinData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuizPinData

`func (o *AdCreateRequest) SetQuizPinData(v AdCommonQuizPinData)`

SetQuizPinData sets QuizPinData field to given value.

### HasQuizPinData

`func (o *AdCreateRequest) HasQuizPinData() bool`

HasQuizPinData returns a boolean if a field has been set.

### SetQuizPinDataNil

`func (o *AdCreateRequest) SetQuizPinDataNil(b bool)`

 SetQuizPinDataNil sets the value for QuizPinData to be an explicit nil

### UnsetQuizPinData
`func (o *AdCreateRequest) UnsetQuizPinData()`

UnsetQuizPinData ensures that no value is present for QuizPinData, not even an explicit nil
### GetPinId

`func (o *AdCreateRequest) GetPinId() string`

GetPinId returns the PinId field if non-nil, zero value otherwise.

### GetPinIdOk

`func (o *AdCreateRequest) GetPinIdOk() (*string, bool)`

GetPinIdOk returns a tuple with the PinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinId

`func (o *AdCreateRequest) SetPinId(v string)`

SetPinId sets PinId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


