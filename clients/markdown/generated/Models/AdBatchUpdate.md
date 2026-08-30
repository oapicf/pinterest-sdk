# AdBatchUpdate
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_group\_id** | **String** | ID of the ad group that contains the ad. | [optional] [default to null] |
| **android\_deep\_link** | **String** | Deep link URL for Android devices. | [optional] [default to null] |
| **carousel\_android\_deep\_links** | **List** | Comma-separated deep links for the carousel pin on Android. | [optional] [default to null] |
| **carousel\_destination\_urls** | **List** | Comma-separated destination URLs for the carousel pin to promote. | [optional] [default to null] |
| **carousel\_ios\_deep\_links** | **List** | Comma-separated deep links for the carousel pin on iOS. | [optional] [default to null] |
| **click\_tracking\_url** | **String** | Tracking url for the ad clicks. | [optional] [default to null] |
| **collection\_items\_destination\_url\_template** | **String** | Destination URL template for all items within a collections drawer. | [optional] [default to null] |
| **collections\_header\_type** | [**AdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  | [optional] [default to null] |
| **creative\_type** | [**CreativeType**](CreativeType.md) |  | [optional] [default to null] |
| **customizable\_cta\_type** | [**CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] [default to null] |
| **destination\_url** | **String** | Destination URL. | [optional] [default to null] |
| **disclosure\_type** | [**DisclosureType**](DisclosureType.md) |  | [optional] [default to null] |
| **disclosure\_url** | **String** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] [default to null] |
| **grid\_click\_type** | [**GridClickType**](GridClickType.md) |  | [optional] [default to null] |
| **id** | **String** | The ID of this ad. | [default to null] |
| **ios\_deep\_link** | **String** | Deep link URL for iOS devices. | [optional] [default to null] |
| **is\_carting** | **Boolean** | Is the ad a carting/WTB ad? | [optional] [default to null] |
| **is\_collage\_accepted\_terms** | **Boolean** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] [default to null] |
| **is\_collage\_single\_destination** | **Boolean** | Whether the collage ad has a single destination url override. | [optional] [default to null] |
| **is\_pin\_deleted** | **Boolean** | Is original pin deleted? | [optional] [default to null] |
| **is\_removable** | **Boolean** | Is pin repinnable? | [optional] [default to null] |
| **lead\_form\_id** | **String** | Lead form ID for lead ad generation. | [optional] [default to null] |
| **name** | **String** | Name of the ad - 255 chars max. | [optional] [default to null] |
| **pin\_id** | **String** | Pin ID. This field may only be updated for draft ads. | [optional] [default to null] |
| **quiz\_pin\_data** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] [default to null] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to null] |
| **tracking\_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] [default to null] |
| **view\_tracking\_url** | **String** | Tracking URL for ad impressions. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

