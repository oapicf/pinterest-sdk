# EventData

    Optional for VISITOR `audience_type`.     With the Pinterest tag, you can use event data to capture event details from your website.     This object lists all the available predefined event data fields in the Pinterest tag.     You can include these event data fields as part of a VISITOR audience’s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated.     Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs.     However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields\' data.     Examples per `event` type:     `pagevisit`     \"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }     `signup`     \"event_data\": { \"lead_type\": \"New release promotion\" }     `checkout`     \"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }     `addtocart`     \"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\", \"product_brand\": \"My brand\" }]}     `watchvideo`     \"event_data\": { \"video_title\": \"My Product Video 01\" }     `lead`     \"event_data\": { \"lead_type\": \"Newsletter\" }

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | [**Currency**](Currency.md) | Currency. For example, \&#39;USD\&#39;. | [optional] [default to undefined]
**lead_type** | **string** | Promotion code. For example, \&#39;Newsletter\&#39;. | [optional] [default to undefined]
**line_items** | [**LineItem**](LineItem.md) |  | [optional] [default to undefined]
**order_id** | **string** | Order ID. For example, \&#39;X-151481\&#39;. | [optional] [default to undefined]
**order_quantity** | **number** | Order quantity. For example, 1. | [optional] [default to undefined]
**page_name** | **string** | Page name. For example, \&#39;Our Favorite Pins on Pinterest\&#39;. | [optional] [default to undefined]
**promo_code** | **string** | Promotion code. For example, \&#39;WINTER10\&#39;. | [optional] [default to undefined]
**property** | **string** | Property. For example, \&#39;Athleta\&#39;. | [optional] [default to undefined]
**search_query** | **string** | Search query string. For example, \&#39;boots\&#39;. | [optional] [default to undefined]
**value** | **string** | Product value. For example, \&#39;199.98\&#39;. | [optional] [default to undefined]
**video_title** | **string** | Video title. For example, \&#39;How to style your Parker Boots\&#39;. | [optional] [default to undefined]

## Example

```typescript
import { EventData } from './api';

const instance: EventData = {
    currency,
    lead_type,
    line_items,
    order_id,
    order_quantity,
    page_name,
    promo_code,
    property,
    search_query,
    value,
    video_title,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
