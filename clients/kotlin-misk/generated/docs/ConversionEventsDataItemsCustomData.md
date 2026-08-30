
# ConversionEventsDataItemsCustomData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentBrand** | **kotlin.String** | The brand of the content associated with the event. |  [optional]
**contentCategory** | **kotlin.String** | The category of the content associated with the event. |  [optional]
**contentIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). |  [optional]
**contentName** | **kotlin.String** | The name of the page or product associated with the event. |  [optional]
**contents** | [**kotlin.collections.List&lt;ConversionEventsDataItemsCustomDataContentsItems&gt;**](ConversionEventsDataItemsCustomDataContentsItems.md) | A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). |  [optional]
**currency** | **kotlin.String** | The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. |  [optional]
**externalMeasurementId** | **kotlin.String** | Only use when instructed. |  [optional]
**externalMeasurementVendorId** | **kotlin.Int** | Only use when instructed. |  [optional]
**np** | **kotlin.String** | Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. |  [optional]
**numItems** | **kotlin.Long** | Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). |  [optional]
**optOutType** | **kotlin.String** | Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer&#39;s guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter. |  [optional]
**orderId** | **kotlin.String** | The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. |  [optional]
**predictedLtv** | **kotlin.String** | Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double. |  [optional]
**searchString** | **kotlin.String** | The search string related to the user conversion event. |  [optional]
**&#x60;value&#x60;** | **kotlin.String** | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. |  [optional]



