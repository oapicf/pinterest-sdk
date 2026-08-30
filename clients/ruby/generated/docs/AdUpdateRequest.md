# PinterestSdkClient::AdUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The ID of this ad. |  |
| **pin_id** | **String** | Pin ID. This field may only be updated for draft ads. | [optional] |
| **ad_group_id** | **String** | ID of the ad group that contains the ad. | [optional] |
| **android_deep_link** | **String** | Deep link URL for Android devices. | [optional] |
| **carousel_android_deep_links** | **Array&lt;String&gt;** | Comma-separated deep links for the carousel pin on Android. | [optional] |
| **carousel_destination_urls** | **Array&lt;String&gt;** | Comma-separated destination URLs for the carousel pin to promote. | [optional] |
| **carousel_ios_deep_links** | **Array&lt;String&gt;** | Comma-separated deep links for the carousel pin on iOS. | [optional] |
| **click_tracking_url** | **String** | Tracking url for the ad clicks. | [optional] |
| **creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] |
| **customizable_cta_type** | [**CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] |
| **destination_url** | **String** | Destination URL. | [optional] |
| **disclosure_type** | [**DisclosureType**](DisclosureType.md) |  | [optional] |
| **disclosure_url** | **String** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] |
| **grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] |
| **ios_deep_link** | **String** | Deep link URL for iOS devices. | [optional] |
| **is_carting** | **Boolean** | Is the ad a carting/WTB ad? | [optional] |
| **is_pin_deleted** | **Boolean** | Is original pin deleted? | [optional] |
| **is_removable** | **Boolean** | Is pin repinnable? | [optional] |
| **lead_form_id** | **String** | Lead form ID for lead ad generation. | [optional] |
| **name** | **String** | Name of the ad - 255 chars max. | [optional] |
| **quiz_pin_data** | **Object** | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] |
| **tracking_urls** | **Object** |  | [optional] |
| **view_tracking_url** | **String** | Tracking URL for ad impressions. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdUpdateRequest.new(
  id: null,
  pin_id: null,
  ad_group_id: null,
  android_deep_link: null,
  carousel_android_deep_links: null,
  carousel_destination_urls: null,
  carousel_ios_deep_links: null,
  click_tracking_url: null,
  creative_type: null,
  customizable_cta_type: null,
  destination_url: null,
  disclosure_type: null,
  disclosure_url: null,
  grid_click_type: null,
  ios_deep_link: null,
  is_carting: null,
  is_pin_deleted: false,
  is_removable: false,
  lead_form_id: null,
  name: null,
  quiz_pin_data: null,
  status: null,
  tracking_urls: null,
  view_tracking_url: null
)
```

