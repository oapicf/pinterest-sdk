# EventData

    Optional for VISITOR `audience_type`.     With the Pinterest tag, you can use event data to capture event details from your website.     This object lists all the available predefined event data fields in the Pinterest tag.     You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated.     Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs.     However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.     Examples per `event` type:     `pagevisit`     \"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }     `signup`     \"event_data\": { \"lead_type\": \"New release promotion\" }     `checkout`     \"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }     `addtocart`     \"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}     `watchvideo`     \"event_data\": { \"video_title\" : \"My Product Video 01\" }     `lead`     \"event_data\": { \"lead_type\": \"Newsletter\" }

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | [**Currency**](Currency.md) | Currency. For example, &#39;USD&#39;. | [optional] 
**lead_type** | **str** | Promotion code. For example, &#39;Newsletter&#39;. | [optional] 
**line_items** | [**LineItem**](LineItem.md) |  | [optional] 
**order_id** | **str** | Order ID. For example, &#39;X-151481&#39;. | [optional] 
**order_quantity** | **int** | Order quantity. For example, 1. | [optional] 
**page_name** | **str** | Page name. For example, &#39;Our Favorite Pins on Pinterest&#39;. | [optional] 
**promo_code** | **str** | Promotion code. For example, &#39;WINTER10&#39;. | [optional] 
**var_property** | **str** | Property. For example, &#39;Athleta&#39;. | [optional] 
**search_query** | **str** | Search query string. For example, &#39;boots&#39;. | [optional] 
**value** | **str** | Product value. For example, &#39;199.98&#39;. | [optional] 
**video_title** | **str** | Video title. For example, &#39;How to style your Parker Boots&#39;. | [optional] 

## Example

```python
from pinterestsdk.models.event_data import EventData

# TODO update the JSON string below
json = "{}"
# create an instance of EventData from a JSON string
event_data_instance = EventData.from_json(json)
# print the JSON string representation of the object
print(EventData.to_json())

# convert the object into a dict
event_data_dict = event_data_instance.to_dict()
# create an instance of EventData from a dict
event_data_from_dict = EventData.from_dict(event_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


