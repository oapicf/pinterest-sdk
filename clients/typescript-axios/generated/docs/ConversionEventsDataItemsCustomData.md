# ConversionEventsDataItemsCustomData

Object containing other custom data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_brand** | **string** | The brand of the content associated with the event. | [optional] [default to undefined]
**content_category** | **string** | The category of the content associated with the event. | [optional] [default to undefined]
**content_ids** | **Array&lt;string&gt;** | List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] [default to undefined]
**content_name** | **string** | The name of the page or product associated with the event. | [optional] [default to undefined]
**contents** | [**Array&lt;ConversionEventsDataItemsCustomDataContentsItems&gt;**](ConversionEventsDataItemsCustomDataContentsItems.md) | A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] [default to undefined]
**currency** | **string** | The ISO-4217 currency code. If not provided, we will default to the advertiser\&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. | [optional] [default to undefined]
**external_measurement_id** | **string** | Only use when instructed. | [optional] [default to undefined]
**external_measurement_vendor_id** | **number** | Only use when instructed. | [optional] [default to undefined]
**np** | **string** | Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. | [optional] [default to undefined]
**num_items** | **number** | Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] [default to undefined]
**opt_out_type** | **string** | Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer\&#39;s guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter. | [optional] [default to undefined]
**order_id** | **string** | The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. | [optional] [default to undefined]
**predicted_ltv** | **string** | Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double. | [optional] [default to undefined]
**search_string** | **string** | The search string related to the user conversion event. | [optional] [default to undefined]
**value** | **string** | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. | [optional] [default to undefined]

## Example

```typescript
import { ConversionEventsDataItemsCustomData } from './api';

const instance: ConversionEventsDataItemsCustomData = {
    content_brand,
    content_category,
    content_ids,
    content_name,
    contents,
    currency,
    external_measurement_id,
    external_measurement_vendor_id,
    np,
    num_items,
    opt_out_type,
    order_id,
    predicted_ltv,
    search_string,
    value,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
