# ConversionEventsDataInnerCustomDataContentsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**item_brand** | **str** | The brand of a product. | [optional] 
**item_category** | **str** | The category of a product. | [optional] 
**item_name** | **str** | The name of a product. | [optional] 
**item_price** | **str** | The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**quantity** | **int** | The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 

## Example

```python
from pinterestsdk.models.conversion_events_data_inner_custom_data_contents_inner import ConversionEventsDataInnerCustomDataContentsInner

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionEventsDataInnerCustomDataContentsInner from a JSON string
conversion_events_data_inner_custom_data_contents_inner_instance = ConversionEventsDataInnerCustomDataContentsInner.from_json(json)
# print the JSON string representation of the object
print(ConversionEventsDataInnerCustomDataContentsInner.to_json())

# convert the object into a dict
conversion_events_data_inner_custom_data_contents_inner_dict = conversion_events_data_inner_custom_data_contents_inner_instance.to_dict()
# create an instance of ConversionEventsDataInnerCustomDataContentsInner from a dict
conversion_events_data_inner_custom_data_contents_inner_from_dict = ConversionEventsDataInnerCustomDataContentsInner.from_dict(conversion_events_data_inner_custom_data_contents_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


