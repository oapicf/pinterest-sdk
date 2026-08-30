# CONVERSION_EVENTS_DATA_ITEMS_CUSTOM_DATA

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_brand** | [**STRING_32**](STRING_32.md) | The brand of the content associated with the event. | [optional] [default to null]
**content_category** | [**STRING_32**](STRING_32.md) | The category of the content associated with the event. | [optional] [default to null]
**content_ids** | [**LIST [STRING_32]**](STRING_32.md) | List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] [default to null]
**content_name** | [**STRING_32**](STRING_32.md) | The name of the page or product associated with the event. | [optional] [default to null]
**contents** | [**LIST [CONVERSION_EVENTS_DATA_ITEMS_CUSTOM_DATA_CONTENTS_ITEMS]**](ConversionEventsDataItemsCustomDataContentsItems.md) | A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] [default to null]
**currency** | [**STRING_32**](STRING_32.md) | The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. | [optional] [default to null]
**external_measurement_id** | [**STRING_32**](STRING_32.md) | Only use when instructed. | [optional] [default to null]
**external_measurement_vendor_id** | **INTEGER_32** | Only use when instructed. | [optional] [default to null]
**np** | [**STRING_32**](STRING_32.md) | Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. | [optional] [default to null]
**num_items** | **INTEGER_64** | Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] [default to null]
**opt_out_type** | [**STRING_32**](STRING_32.md) | Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer&#39;s guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter. | [optional] [default to null]
**order_id** | [**STRING_32**](STRING_32.md) | The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. | [optional] [default to null]
**predicted_ltv** | [**STRING_32**](STRING_32.md) | Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double. | [optional] [default to null]
**search_string** | [**STRING_32**](STRING_32.md) | The search string related to the user conversion event. | [optional] [default to null]
**value** | [**STRING_32**](STRING_32.md) | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


