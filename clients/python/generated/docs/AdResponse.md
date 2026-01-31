# AdResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **str** | ID of the ad group that contains the ad. | [optional] 
**android_deep_link** | **str** | Deep link URL for Android devices. | [optional] 
**carousel_android_deep_links** | **List[str]** | Comma-separated deep links for the carousel pin on Android. | [optional] 
**carousel_destination_urls** | **List[str]** | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**carousel_ios_deep_links** | **List[str]** | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**click_tracking_url** | **str** | Tracking url for the ad clicks. | [optional] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] 
**customizable_cta_type** | [**CustomizableCTAType**](CustomizableCTAType.md) |  | [optional] 
**destination_url** | **str** | Destination URL. | [optional] 
**disclosure_type** | [**DisclosureType**](DisclosureType.md) |  | [optional] 
**disclosure_url** | **str** | URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. | [optional] 
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] 
**ios_deep_link** | **str** | Deep link URL for iOS devices. | [optional] 
**is_pin_deleted** | **bool** | Is original pin deleted? | [optional] 
**is_removable** | **bool** | Is pin repinnable? | [optional] 
**lead_form_id** | **str** | Lead form ID for lead ad generation. | [optional] 
**name** | **str** | Name of the ad - 255 chars max. | [optional] 
**quiz_pin_data** | [**QuizPinData**](QuizPinData.md) | Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**view_tracking_url** | **str** | Tracking URL for ad impressions. | [optional] 
**pin_id** | **str** | Pin ID. | [optional] 
**ad_account_id** | **str** | The ID of the advertiser that this ad belongs to. | [optional] 
**campaign_id** | **str** | ID of the ad campaign that contains this ad. | [optional] 
**collection_items_destination_url_template** | **str** | Destination URL template for all items within a collections drawer. | [optional] 
**created_time** | **int** | Pin creation time. Unix timestamp in seconds. | [optional] 
**id** | **str** | The ID of this ad. | [optional] 
**rejected_reasons** | **List[str]** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**rejection_labels** | **List[str]** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] 
**review_status** | **str** | Ad review status | [optional] 
**summary_status** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] 
**type** | **str** | Always \&quot;ad\&quot;. | [optional] 
**updated_time** | **int** | Last update time. Unix timestamp in seconds. | [optional] 

## Example

```python
from pinterestsdk.models.ad_response import AdResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AdResponse from a JSON string
ad_response_instance = AdResponse.from_json(json)
# print the JSON string representation of the object
print(AdResponse.to_json())

# convert the object into a dict
ad_response_dict = ad_response_instance.to_dict()
# create an instance of AdResponse from a dict
ad_response_from_dict = AdResponse.from_dict(ad_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


