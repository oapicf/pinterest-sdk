# ConversionEventsDataInnerCustomData

Object containing other custom data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_brand** | **str** | The brand of the content associated with the event. | [optional] 
**content_category** | **str** | The category of the content associated with the event. | [optional] 
**content_ids** | **List[str]** | List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**content_name** | **str** | The name of the page or product associated with the event. | [optional] 
**contents** | [**List[ConversionEventsDataInnerCustomDataContentsInner]**](ConversionEventsDataInnerCustomDataContentsInner.md) | A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**currency** | **str** | The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. | [optional] 
**external_measurement_id** | **str** | Only use when instructed. | [optional] 
**external_measurement_vendor_id** | **int** | Only use when instructed. | [optional] 
**np** | **str** | Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. | [optional] 
**num_items** | **int** | Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**opt_out_type** | **str** | Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/limited-data-processing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;limited data processing&lt;/a&gt; and the developer&#39;s guide for &lt;a href&#x3D;\&quot;/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\&quot; target&#x3D;\&quot;_blank\&quot;&gt;tracking conversion events&lt;/a&gt; for help with using this parameter. | [optional] 
**order_id** | **str** | The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. | [optional] 
**predicted_ltv** | **str** | Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double. | [optional] 
**search_string** | **str** | The search string related to the user conversion event. | [optional] 
**value** | **str** | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. | [optional] 

## Example

```python
from pinterestsdk.models.conversion_events_data_inner_custom_data import ConversionEventsDataInnerCustomData

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionEventsDataInnerCustomData from a JSON string
conversion_events_data_inner_custom_data_instance = ConversionEventsDataInnerCustomData.from_json(json)
# print the JSON string representation of the object
print(ConversionEventsDataInnerCustomData.to_json())

# convert the object into a dict
conversion_events_data_inner_custom_data_dict = conversion_events_data_inner_custom_data_instance.to_dict()
# create an instance of ConversionEventsDataInnerCustomData from a dict
conversion_events_data_inner_custom_data_from_dict = ConversionEventsDataInnerCustomData.from_dict(conversion_events_data_inner_custom_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


