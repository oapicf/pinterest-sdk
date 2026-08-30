# AdBatchUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **string** | ID of the ad group that contains the ad. | [optional]
**android_deep_link** | **string** | Deep link URL for Android devices. | [optional]
**carousel_android_deep_links** | **string[]** | Comma-separated deep links for the carousel pin on Android. | [optional]
**carousel_destination_urls** | **string[]** | Comma-separated destination URLs for the carousel pin to promote. | [optional]
**carousel_ios_deep_links** | **string[]** | Comma-separated deep links for the carousel pin on iOS. | [optional]
**click_tracking_url** | **string** | Tracking url for the ad clicks. | [optional]
**collection_items_destination_url_template** | **string** | Destination URL template for all items within a collections drawer. | [optional]
**collections_header_type** | [**\OpenAPI\Client\Model\AdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  | [optional]
**creative_type** | [**\OpenAPI\Client\Model\CreativeType**](CreativeType.md) |  | [optional]
**customizable_cta_type** | [**\OpenAPI\Client\Model\CustomizableCTAType**](CustomizableCTAType.md) |  | [optional]
**destination_url** | **string** | Destination URL. | [optional]
**disclosure_type** | [**\OpenAPI\Client\Model\DisclosureType**](DisclosureType.md) |  | [optional]
**disclosure_url** | **string** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional]
**grid_click_type** | [**\OpenAPI\Client\Model\GridClickType**](GridClickType.md) |  | [optional]
**id** | **string** | The ID of this ad. |
**ios_deep_link** | **string** | Deep link URL for iOS devices. | [optional]
**is_carting** | **bool** | Is the ad a carting/WTB ad? | [optional]
**is_collage_accepted_terms** | **bool** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional]
**is_collage_single_destination** | **bool** | Whether the collage ad has a single destination url override. | [optional]
**is_pin_deleted** | **bool** | Is original pin deleted? | [optional]
**is_removable** | **bool** | Is pin repinnable? | [optional]
**lead_form_id** | **string** | Lead form ID for lead ad generation. | [optional]
**name** | **string** | Name of the ad - 255 chars max. | [optional]
**pin_id** | **string** | Pin ID. This field may only be updated for draft ads. | [optional]
**quiz_pin_data** | [**\OpenAPI\Client\Model\QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional]
**status** | [**\OpenAPI\Client\Model\EntityStatus**](EntityStatus.md) |  | [optional]
**tracking_urls** | [**\OpenAPI\Client\Model\TrackingUrls**](TrackingUrls.md) |  | [optional]
**view_tracking_url** | **string** | Tracking URL for ad impressions. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
