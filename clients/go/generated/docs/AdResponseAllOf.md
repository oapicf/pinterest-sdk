# AdResponseAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | Pointer to **string** | ID of the ad group that contains the ad. | [optional] 
**AndroidDeepLink** | Pointer to **NullableString** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**CarouselAndroidDeepLinks** | Pointer to **[]string** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**CarouselDestinationUrls** | Pointer to **[]string** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**CarouselIosDeepLinks** | Pointer to **[]string** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**ClickTrackingUrl** | Pointer to **NullableString** | Tracking url for the ad clicks. | [optional] 
**CreativeType** | Pointer to **string** | Ad creative type enum | [optional] 
**DestinationUrl** | Pointer to **NullableString** | Destination URL. | [optional] 
**IosDeepLink** | Pointer to **NullableString** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**IsPinDeleted** | Pointer to **bool** | Is original pin deleted? | [optional] 
**IsRemovable** | Pointer to **bool** | Is pin repinnable? | [optional] 
**Name** | Pointer to **NullableString** | Name of the ad - 255 chars max. | [optional] 
**PinId** | Pointer to **string** | Pin ID. | [optional] 
**Status** | Pointer to [**EntityStatus**](EntityStatus.md) |  | [optional] 
**TrackingUrls** | Pointer to [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**ViewTrackingUrl** | Pointer to **NullableString** | Tracking URL for ad impressions. | [optional] 

## Methods

### NewAdResponseAllOf

`func NewAdResponseAllOf() *AdResponseAllOf`

NewAdResponseAllOf instantiates a new AdResponseAllOf object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdResponseAllOfWithDefaults

`func NewAdResponseAllOfWithDefaults() *AdResponseAllOf`

NewAdResponseAllOfWithDefaults instantiates a new AdResponseAllOf object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAdGroupId

`func (o *AdResponseAllOf) GetAdGroupId() string`

GetAdGroupId returns the AdGroupId field if non-nil, zero value otherwise.

### GetAdGroupIdOk

`func (o *AdResponseAllOf) GetAdGroupIdOk() (*string, bool)`

GetAdGroupIdOk returns a tuple with the AdGroupId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdGroupId

`func (o *AdResponseAllOf) SetAdGroupId(v string)`

SetAdGroupId sets AdGroupId field to given value.

### HasAdGroupId

`func (o *AdResponseAllOf) HasAdGroupId() bool`

HasAdGroupId returns a boolean if a field has been set.

### GetAndroidDeepLink

`func (o *AdResponseAllOf) GetAndroidDeepLink() string`

GetAndroidDeepLink returns the AndroidDeepLink field if non-nil, zero value otherwise.

### GetAndroidDeepLinkOk

`func (o *AdResponseAllOf) GetAndroidDeepLinkOk() (*string, bool)`

GetAndroidDeepLinkOk returns a tuple with the AndroidDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAndroidDeepLink

`func (o *AdResponseAllOf) SetAndroidDeepLink(v string)`

SetAndroidDeepLink sets AndroidDeepLink field to given value.

### HasAndroidDeepLink

`func (o *AdResponseAllOf) HasAndroidDeepLink() bool`

HasAndroidDeepLink returns a boolean if a field has been set.

### SetAndroidDeepLinkNil

`func (o *AdResponseAllOf) SetAndroidDeepLinkNil(b bool)`

 SetAndroidDeepLinkNil sets the value for AndroidDeepLink to be an explicit nil

### UnsetAndroidDeepLink
`func (o *AdResponseAllOf) UnsetAndroidDeepLink()`

UnsetAndroidDeepLink ensures that no value is present for AndroidDeepLink, not even an explicit nil
### GetCarouselAndroidDeepLinks

`func (o *AdResponseAllOf) GetCarouselAndroidDeepLinks() []string`

GetCarouselAndroidDeepLinks returns the CarouselAndroidDeepLinks field if non-nil, zero value otherwise.

### GetCarouselAndroidDeepLinksOk

`func (o *AdResponseAllOf) GetCarouselAndroidDeepLinksOk() (*[]string, bool)`

GetCarouselAndroidDeepLinksOk returns a tuple with the CarouselAndroidDeepLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselAndroidDeepLinks

`func (o *AdResponseAllOf) SetCarouselAndroidDeepLinks(v []string)`

SetCarouselAndroidDeepLinks sets CarouselAndroidDeepLinks field to given value.

### HasCarouselAndroidDeepLinks

`func (o *AdResponseAllOf) HasCarouselAndroidDeepLinks() bool`

HasCarouselAndroidDeepLinks returns a boolean if a field has been set.

### SetCarouselAndroidDeepLinksNil

`func (o *AdResponseAllOf) SetCarouselAndroidDeepLinksNil(b bool)`

 SetCarouselAndroidDeepLinksNil sets the value for CarouselAndroidDeepLinks to be an explicit nil

### UnsetCarouselAndroidDeepLinks
`func (o *AdResponseAllOf) UnsetCarouselAndroidDeepLinks()`

UnsetCarouselAndroidDeepLinks ensures that no value is present for CarouselAndroidDeepLinks, not even an explicit nil
### GetCarouselDestinationUrls

`func (o *AdResponseAllOf) GetCarouselDestinationUrls() []string`

GetCarouselDestinationUrls returns the CarouselDestinationUrls field if non-nil, zero value otherwise.

### GetCarouselDestinationUrlsOk

`func (o *AdResponseAllOf) GetCarouselDestinationUrlsOk() (*[]string, bool)`

GetCarouselDestinationUrlsOk returns a tuple with the CarouselDestinationUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselDestinationUrls

`func (o *AdResponseAllOf) SetCarouselDestinationUrls(v []string)`

SetCarouselDestinationUrls sets CarouselDestinationUrls field to given value.

### HasCarouselDestinationUrls

`func (o *AdResponseAllOf) HasCarouselDestinationUrls() bool`

HasCarouselDestinationUrls returns a boolean if a field has been set.

### SetCarouselDestinationUrlsNil

`func (o *AdResponseAllOf) SetCarouselDestinationUrlsNil(b bool)`

 SetCarouselDestinationUrlsNil sets the value for CarouselDestinationUrls to be an explicit nil

### UnsetCarouselDestinationUrls
`func (o *AdResponseAllOf) UnsetCarouselDestinationUrls()`

UnsetCarouselDestinationUrls ensures that no value is present for CarouselDestinationUrls, not even an explicit nil
### GetCarouselIosDeepLinks

`func (o *AdResponseAllOf) GetCarouselIosDeepLinks() []string`

GetCarouselIosDeepLinks returns the CarouselIosDeepLinks field if non-nil, zero value otherwise.

### GetCarouselIosDeepLinksOk

`func (o *AdResponseAllOf) GetCarouselIosDeepLinksOk() (*[]string, bool)`

GetCarouselIosDeepLinksOk returns a tuple with the CarouselIosDeepLinks field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCarouselIosDeepLinks

`func (o *AdResponseAllOf) SetCarouselIosDeepLinks(v []string)`

SetCarouselIosDeepLinks sets CarouselIosDeepLinks field to given value.

### HasCarouselIosDeepLinks

`func (o *AdResponseAllOf) HasCarouselIosDeepLinks() bool`

HasCarouselIosDeepLinks returns a boolean if a field has been set.

### SetCarouselIosDeepLinksNil

`func (o *AdResponseAllOf) SetCarouselIosDeepLinksNil(b bool)`

 SetCarouselIosDeepLinksNil sets the value for CarouselIosDeepLinks to be an explicit nil

### UnsetCarouselIosDeepLinks
`func (o *AdResponseAllOf) UnsetCarouselIosDeepLinks()`

UnsetCarouselIosDeepLinks ensures that no value is present for CarouselIosDeepLinks, not even an explicit nil
### GetClickTrackingUrl

`func (o *AdResponseAllOf) GetClickTrackingUrl() string`

GetClickTrackingUrl returns the ClickTrackingUrl field if non-nil, zero value otherwise.

### GetClickTrackingUrlOk

`func (o *AdResponseAllOf) GetClickTrackingUrlOk() (*string, bool)`

GetClickTrackingUrlOk returns a tuple with the ClickTrackingUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClickTrackingUrl

`func (o *AdResponseAllOf) SetClickTrackingUrl(v string)`

SetClickTrackingUrl sets ClickTrackingUrl field to given value.

### HasClickTrackingUrl

`func (o *AdResponseAllOf) HasClickTrackingUrl() bool`

HasClickTrackingUrl returns a boolean if a field has been set.

### SetClickTrackingUrlNil

`func (o *AdResponseAllOf) SetClickTrackingUrlNil(b bool)`

 SetClickTrackingUrlNil sets the value for ClickTrackingUrl to be an explicit nil

### UnsetClickTrackingUrl
`func (o *AdResponseAllOf) UnsetClickTrackingUrl()`

UnsetClickTrackingUrl ensures that no value is present for ClickTrackingUrl, not even an explicit nil
### GetCreativeType

`func (o *AdResponseAllOf) GetCreativeType() string`

GetCreativeType returns the CreativeType field if non-nil, zero value otherwise.

### GetCreativeTypeOk

`func (o *AdResponseAllOf) GetCreativeTypeOk() (*string, bool)`

GetCreativeTypeOk returns a tuple with the CreativeType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreativeType

`func (o *AdResponseAllOf) SetCreativeType(v string)`

SetCreativeType sets CreativeType field to given value.

### HasCreativeType

`func (o *AdResponseAllOf) HasCreativeType() bool`

HasCreativeType returns a boolean if a field has been set.

### GetDestinationUrl

`func (o *AdResponseAllOf) GetDestinationUrl() string`

GetDestinationUrl returns the DestinationUrl field if non-nil, zero value otherwise.

### GetDestinationUrlOk

`func (o *AdResponseAllOf) GetDestinationUrlOk() (*string, bool)`

GetDestinationUrlOk returns a tuple with the DestinationUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDestinationUrl

`func (o *AdResponseAllOf) SetDestinationUrl(v string)`

SetDestinationUrl sets DestinationUrl field to given value.

### HasDestinationUrl

`func (o *AdResponseAllOf) HasDestinationUrl() bool`

HasDestinationUrl returns a boolean if a field has been set.

### SetDestinationUrlNil

`func (o *AdResponseAllOf) SetDestinationUrlNil(b bool)`

 SetDestinationUrlNil sets the value for DestinationUrl to be an explicit nil

### UnsetDestinationUrl
`func (o *AdResponseAllOf) UnsetDestinationUrl()`

UnsetDestinationUrl ensures that no value is present for DestinationUrl, not even an explicit nil
### GetIosDeepLink

`func (o *AdResponseAllOf) GetIosDeepLink() string`

GetIosDeepLink returns the IosDeepLink field if non-nil, zero value otherwise.

### GetIosDeepLinkOk

`func (o *AdResponseAllOf) GetIosDeepLinkOk() (*string, bool)`

GetIosDeepLinkOk returns a tuple with the IosDeepLink field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIosDeepLink

`func (o *AdResponseAllOf) SetIosDeepLink(v string)`

SetIosDeepLink sets IosDeepLink field to given value.

### HasIosDeepLink

`func (o *AdResponseAllOf) HasIosDeepLink() bool`

HasIosDeepLink returns a boolean if a field has been set.

### SetIosDeepLinkNil

`func (o *AdResponseAllOf) SetIosDeepLinkNil(b bool)`

 SetIosDeepLinkNil sets the value for IosDeepLink to be an explicit nil

### UnsetIosDeepLink
`func (o *AdResponseAllOf) UnsetIosDeepLink()`

UnsetIosDeepLink ensures that no value is present for IosDeepLink, not even an explicit nil
### GetIsPinDeleted

`func (o *AdResponseAllOf) GetIsPinDeleted() bool`

GetIsPinDeleted returns the IsPinDeleted field if non-nil, zero value otherwise.

### GetIsPinDeletedOk

`func (o *AdResponseAllOf) GetIsPinDeletedOk() (*bool, bool)`

GetIsPinDeletedOk returns a tuple with the IsPinDeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPinDeleted

`func (o *AdResponseAllOf) SetIsPinDeleted(v bool)`

SetIsPinDeleted sets IsPinDeleted field to given value.

### HasIsPinDeleted

`func (o *AdResponseAllOf) HasIsPinDeleted() bool`

HasIsPinDeleted returns a boolean if a field has been set.

### GetIsRemovable

`func (o *AdResponseAllOf) GetIsRemovable() bool`

GetIsRemovable returns the IsRemovable field if non-nil, zero value otherwise.

### GetIsRemovableOk

`func (o *AdResponseAllOf) GetIsRemovableOk() (*bool, bool)`

GetIsRemovableOk returns a tuple with the IsRemovable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsRemovable

`func (o *AdResponseAllOf) SetIsRemovable(v bool)`

SetIsRemovable sets IsRemovable field to given value.

### HasIsRemovable

`func (o *AdResponseAllOf) HasIsRemovable() bool`

HasIsRemovable returns a boolean if a field has been set.

### GetName

`func (o *AdResponseAllOf) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *AdResponseAllOf) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *AdResponseAllOf) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *AdResponseAllOf) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *AdResponseAllOf) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *AdResponseAllOf) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetPinId

`func (o *AdResponseAllOf) GetPinId() string`

GetPinId returns the PinId field if non-nil, zero value otherwise.

### GetPinIdOk

`func (o *AdResponseAllOf) GetPinIdOk() (*string, bool)`

GetPinIdOk returns a tuple with the PinId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinId

`func (o *AdResponseAllOf) SetPinId(v string)`

SetPinId sets PinId field to given value.

### HasPinId

`func (o *AdResponseAllOf) HasPinId() bool`

HasPinId returns a boolean if a field has been set.

### GetStatus

`func (o *AdResponseAllOf) GetStatus() EntityStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *AdResponseAllOf) GetStatusOk() (*EntityStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *AdResponseAllOf) SetStatus(v EntityStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *AdResponseAllOf) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetTrackingUrls

`func (o *AdResponseAllOf) GetTrackingUrls() TrackingUrls`

GetTrackingUrls returns the TrackingUrls field if non-nil, zero value otherwise.

### GetTrackingUrlsOk

`func (o *AdResponseAllOf) GetTrackingUrlsOk() (*TrackingUrls, bool)`

GetTrackingUrlsOk returns a tuple with the TrackingUrls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrackingUrls

`func (o *AdResponseAllOf) SetTrackingUrls(v TrackingUrls)`

SetTrackingUrls sets TrackingUrls field to given value.

### HasTrackingUrls

`func (o *AdResponseAllOf) HasTrackingUrls() bool`

HasTrackingUrls returns a boolean if a field has been set.

### SetTrackingUrlsNil

`func (o *AdResponseAllOf) SetTrackingUrlsNil(b bool)`

 SetTrackingUrlsNil sets the value for TrackingUrls to be an explicit nil

### UnsetTrackingUrls
`func (o *AdResponseAllOf) UnsetTrackingUrls()`

UnsetTrackingUrls ensures that no value is present for TrackingUrls, not even an explicit nil
### GetViewTrackingUrl

`func (o *AdResponseAllOf) GetViewTrackingUrl() string`

GetViewTrackingUrl returns the ViewTrackingUrl field if non-nil, zero value otherwise.

### GetViewTrackingUrlOk

`func (o *AdResponseAllOf) GetViewTrackingUrlOk() (*string, bool)`

GetViewTrackingUrlOk returns a tuple with the ViewTrackingUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetViewTrackingUrl

`func (o *AdResponseAllOf) SetViewTrackingUrl(v string)`

SetViewTrackingUrl sets ViewTrackingUrl field to given value.

### HasViewTrackingUrl

`func (o *AdResponseAllOf) HasViewTrackingUrl() bool`

HasViewTrackingUrl returns a boolean if a field has been set.

### SetViewTrackingUrlNil

`func (o *AdResponseAllOf) SetViewTrackingUrlNil(b bool)`

 SetViewTrackingUrlNil sets the value for ViewTrackingUrl to be an explicit nil

### UnsetViewTrackingUrl
`func (o *AdResponseAllOf) UnsetViewTrackingUrl()`

UnsetViewTrackingUrl ensures that no value is present for ViewTrackingUrl, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


