# Ad


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | The ID of the advertiser that this ad belongs to. | [readonly] 
**ad_group_id** | **str** | ID of the ad group that contains the ad. | 
**android_deep_link** | **str** | Deep link URL for Android devices. | [optional] 
**campaign_id** | **str** | ID of the ad campaign that contains this ad. | [readonly] 
**carousel_android_deep_links** | **List[str]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carousel_destination_urls** | **List[str]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carousel_ios_deep_links** | **List[str]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**carting_platform_type** | **int** | The vendor platform type of the carting/WTB ad. | [optional] [readonly] 
**carting_products** | [**List[CartingProduct]**](CartingProduct.md) | Array of carting/WTB products for the ad. | [optional] [readonly] 
**click_tracking_url** | **str** | Tracking url for the ad clicks. | [optional] 
**collection_items_destination_url_template** | **str** | Destination URL template for all items within a collections drawer. | [optional] 
**collections_header_type** | [**AdCollectionsHeaderType**](AdCollectionsHeaderType.md) |  | [optional] 
**created_time** | **int** | Pin creation time. Unix timestamp in seconds. | [optional] [readonly] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | 
**customizable_cta_type** | [**CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] 
**destination_url** | **str** | Destination URL. | [optional] 
**disclosure_type** | [**DisclosureType**](DisclosureType.md) |  | [optional] 
**disclosure_url** | **str** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] 
**id** | **str** | The ID of this ad. | 
**ios_deep_link** | **str** | Deep link URL for iOS devices. | [optional] 
**is_carting** | **bool** | Is the ad a carting/WTB ad? | [optional] 
**is_collage_accepted_terms** | **bool** | Whether the advertiser has accepted the terms and conditions for collage ad. | [optional] 
**is_collage_single_destination** | **bool** | Whether the collage ad has a single destination url override. | [optional] 
**is_pin_deleted** | **bool** | Is original pin deleted? | [optional] 
**is_removable** | **bool** | Is pin repinnable? | [optional] 
**lead_form_id** | **str** | Lead form ID for lead ad generation. | [optional] 
**name** | **str** | Name of the ad - 255 chars max. | [optional] 
**pin_id** | **str** | Pin ID. This field may only be updated for draft ads. | 
**quiz_pin_data** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**rejected_reasons** | [**List[AdDisapprovalReasons]**](AdDisapprovalReasons.md) | Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] 
**rejection_labels** | **List[str]** | Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;. | [readonly] 
**review_status** | [**AdReviewStatus**](AdReviewStatus.md) | Ad review status | [readonly] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**summary_status** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [readonly] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**type** | **str** | Always \&quot;ad\&quot;. | [readonly] 
**updated_time** | **int** | Last update time. Unix timestamp in seconds. | [optional] [readonly] 
**view_tracking_url** | **str** | Tracking URL for ad impressions. | [optional] 

## Example

```python
from pinterestsdk.models.ad import Ad

# TODO update the JSON string below
json = "{}"
# create an instance of Ad from a JSON string
ad_instance = Ad.from_json(json)
# print the JSON string representation of the object
print(Ad.to_json())

# convert the object into a dict
ad_dict = ad_instance.to_dict()
# create an instance of Ad from a dict
ad_from_dict = Ad.from_dict(ad_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


