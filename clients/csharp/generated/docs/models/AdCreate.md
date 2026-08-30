# Org.OpenAPITools.Model.AdCreate
Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **string** | ID of the ad group that contains the ad. | 
**CreativeType** | **CreativeType** |  | 
**PinId** | **string** | Pin ID. This field may only be updated for draft ads. | 
**AndroidDeepLink** | **string** | Deep link URL for Android devices. | [optional] 
**CarouselAndroidDeepLinks** | **List&lt;string&gt;** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**CarouselDestinationUrls** | **List&lt;string&gt;** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**CarouselIosDeepLinks** | **List&lt;string&gt;** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**ClickTrackingUrl** | **string** | Tracking url for the ad clicks. | [optional] 
**CollectionItemsDestinationUrlTemplate** | **string** | Destination URL template for all items within a collections drawer. | [optional] 
**CollectionsHeaderType** | **AdCollectionsHeaderType** |  | [optional] 
**CustomizableCtaType** | **CustomizableCTAType** |  | [optional] 
**DestinationUrl** | **string** | Destination URL. | [optional] 
**DisclosureType** | **DisclosureType** |  | [optional] 
**DisclosureUrl** | **string** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**GridClickType** | **GridClickType** |  | [optional] 
**IosDeepLink** | **string** | Deep link URL for iOS devices. | [optional] 
**IsCarting** | **bool** | Is the ad a carting/WTB ad? | [optional] 
**IsCollageAcceptedTerms** | **bool** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] 
**IsCollageSingleDestination** | **bool** | Whether the collage ad has a single destination url override. | [optional] 
**IsPinDeleted** | **bool** | Is original pin deleted? | [optional] 
**IsRemovable** | **bool** | Is pin repinnable? | [optional] 
**LeadFormId** | **string** | Lead form ID for lead ad generation. | [optional] 
**Name** | **string** | Name of the ad - 255 chars max. | [optional] 
**QuizPinData** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**Status** | **EntityStatus** |  | [optional] 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**ViewTrackingUrl** | **string** | Tracking URL for ad impressions. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

