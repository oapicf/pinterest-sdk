
# Table `ConversionEventsDataItemsCustomData`
(mapped from: ConversionEventsDataItemsCustomData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**contentBrand** | content_brand | text |  | **kotlin.String** | The brand of the content associated with the event. |  [optional]
**contentCategory** | content_category | text |  | **kotlin.String** | The category of the content associated with the event. |  [optional]
**contentIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). |  [optional]
**contentName** | content_name | text |  | **kotlin.String** | The name of the page or product associated with the event. |  [optional]
**contents** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionEventsDataItemsCustomDataContentsItems&gt;**](ConversionEventsDataItemsCustomDataContentsItems.md) | A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). |  [optional]
**currency** | currency | text |  | **kotlin.String** | The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. |  [optional]
**externalMeasurementId** | external_measurement_id | text |  | **kotlin.String** | Only use when instructed. |  [optional]
**externalMeasurementVendorId** | external_measurement_vendor_id | int |  | **kotlin.Int** | Only use when instructed. |  [optional]
**np** | np | text |  | **kotlin.String** | Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. |  [optional]
**numItems** | num_items | long |  | **kotlin.Long** | Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). |  [optional]
**optOutType** | opt_out_type | text |  | **kotlin.String** | Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer&#39;s guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter. |  [optional]
**orderId** | order_id | text |  | **kotlin.String** | The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. |  [optional]
**predictedLtv** | predicted_ltv | text |  | **kotlin.String** | Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double. |  [optional]
**searchString** | search_string | text |  | **kotlin.String** | The search string related to the user conversion event. |  [optional]
**value** | value | text |  | **kotlin.String** | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. |  [optional]




# **Table `ConversionEventsDataItemsCustomDataContentIds`**
(mapped from: ConversionEventsDataItemsCustomDataContentIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsDataItemsCustomData | conversionEventsDataItemsCustomData | long | | kotlin.Long | Primary Key | *one*
contentIds | contentIds | text | | kotlin.String | Foreign Key | *many*




# **Table `ConversionEventsDataItemsCustomDataConversionEventsDataItemsCustomDataContentsItems`**
(mapped from: ConversionEventsDataItemsCustomDataConversionEventsDataItemsCustomDataContentsItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsDataItemsCustomData | conversionEventsDataItemsCustomData | long | | kotlin.Long | Primary Key | *one*
conversionEventsDataItemsCustomDataContentsItems | conversionEventsDataItemsCustomDataContentsItems | long | | kotlin.Long | Foreign Key | *many*













