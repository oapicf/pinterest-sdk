# PinterestSdkClient::Ad

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | The ID of the advertiser that this ad belongs to. | [readonly] |
| **ad_group_id** | **String** | ID of the ad group that contains the ad. |  |
| **android_deep_link** | **String** | Deep link URL for Android devices. | [optional] |
| **campaign_id** | **String** | ID of the ad campaign that contains this ad. | [readonly] |
| **carousel_android_deep_links** | **Array&lt;String&gt;** | Comma-separated deep links for the carousel pin on Android. | [optional] |
| **carousel_destination_urls** | **Array&lt;String&gt;** | Comma-separated destination URLs for the carousel pin to promote. | [optional] |
| **carousel_ios_deep_links** | **Array&lt;String&gt;** | Comma-separated deep links for the carousel pin on iOS. | [optional] |
| **carting_platform_type** | **Integer** | The vendor platform type of the carting/WTB ad. | [optional][readonly] |
| **carting_products** | [**Array&lt;CartingProduct&gt;**](CartingProduct.md) | Array of carting/WTB products for the ad. | [optional][readonly] |
| **click_tracking_url** | **String** | Tracking url for the ad clicks. | [optional] |
| **collection_items_destination_url_template** | **String** | Destination URL template for all items within a collections drawer. | [optional] |
| **collections_header_type** | [**AdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  | [optional] |
| **created_time** | **Integer** | Pin creation time. Unix timestamp in seconds. | [optional][readonly] |
| **creative_type** | [**CreativeType**](CreativeType.md) |  |  |
| **customizable_cta_type** | [**CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] |
| **destination_url** | **String** | Destination URL. | [optional] |
| **disclosure_type** | [**DisclosureType**](DisclosureType.md) |  | [optional] |
| **disclosure_url** | **String** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] |
| **grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] |
| **id** | **String** | The ID of this ad. |  |
| **ios_deep_link** | **String** | Deep link URL for iOS devices. | [optional] |
| **is_carting** | **Boolean** | Is the ad a carting/WTB ad? | [optional] |
| **is_collage_accepted_terms** | **Boolean** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] |
| **is_collage_single_destination** | **Boolean** | Whether the collage ad has a single destination url override. | [optional] |
| **is_pin_deleted** | **Boolean** | Is original pin deleted? | [optional] |
| **is_removable** | **Boolean** | Is pin repinnable? | [optional] |
| **lead_form_id** | **String** | Lead form ID for lead ad generation. | [optional] |
| **name** | **String** | Name of the ad - 255 chars max. | [optional] |
| **pin_id** | **String** | Pin ID. This field may only be updated for draft ads. |  |
| **quiz_pin_data** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] |
| **rejected_reasons** | [**Array&lt;AdDisapprovalReasons&gt;**](AdDisapprovalReasons.md) | Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] |
| **rejection_labels** | **Array&lt;String&gt;** | Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] |
| **review_status** | [**AdReviewStatus**](AdReviewStatus.md) | Ad review status | [readonly] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] |
| **summary_status** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [readonly] |
| **tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] |
| **type** | **String** | Always \&quot;ad\&quot;. | [readonly] |
| **updated_time** | **Integer** | Last update time. Unix timestamp in seconds. | [optional][readonly] |
| **view_tracking_url** | **String** | Tracking URL for ad impressions. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::Ad.new(
  ad_account_id: null,
  ad_group_id: null,
  android_deep_link: null,
  campaign_id: null,
  carousel_android_deep_links: null,
  carousel_destination_urls: null,
  carousel_ios_deep_links: null,
  carting_platform_type: null,
  carting_products: null,
  click_tracking_url: null,
  collection_items_destination_url_template: null,
  collections_header_type: null,
  created_time: null,
  creative_type: null,
  customizable_cta_type: null,
  destination_url: null,
  disclosure_type: null,
  disclosure_url: null,
  grid_click_type: null,
  id: null,
  ios_deep_link: null,
  is_carting: null,
  is_collage_accepted_terms: null,
  is_collage_single_destination: null,
  is_pin_deleted: null,
  is_removable: null,
  lead_form_id: null,
  name: null,
  pin_id: null,
  quiz_pin_data: null,
  rejected_reasons: null,
  rejection_labels: null,
  review_status: null,
  status: null,
  summary_status: null,
  tracking_urls: null,
  type: null,
  updated_time: null,
  view_tracking_url: null
)
```

