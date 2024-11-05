
# Table `ConversionEvents_data_inner_custom_data`
(mapped from: ConversionEventsDataInnerCustomData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**currency** | currency | text |  | **kotlin.String** | The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. |  [optional]
**value** | value | text |  | **kotlin.String** | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. |  [optional]
**contentIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). |  [optional]
**contentName** | content_name | text |  | **kotlin.String** | The name of the page or product associated with the event. |  [optional]
**contentCategory** | content_category | text |  | **kotlin.String** | The category of the content associated with the event. |  [optional]
**contentBrand** | content_brand | text |  | **kotlin.String** | The brand of the content associated with the event. |  [optional]
**contents** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionEventsDataInnerCustomDataContentsInner&gt;**](ConversionEventsDataInnerCustomDataContentsInner.md) | A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). |  [optional]
**numItems** | num_items | long |  | **kotlin.Long** | Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). |  [optional]
**orderId** | order_id | text |  | **kotlin.String** | The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. |  [optional]
**searchString** | search_string | text |  | **kotlin.String** | The search string related to the user conversion event. |  [optional]
**optOutType** | opt_out_type | text |  | **kotlin.String** | Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/limited-data-processing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Help Center&lt;/a&gt; and &lt;a href&#x3D;\&quot;/docs/api-features/conversion-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;dev site&lt;/a&gt; for specific opt_out_type set up. |  [optional]
**np** | np | text |  | **kotlin.String** | Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. |  [optional]




# **Table `ConversionEventsDataInnerCustomDataContentIds`**
(mapped from: ConversionEventsDataInnerCustomDataContentIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsDataInnerCustomData | conversionEventsDataInnerCustomData | long | | kotlin.Long | Primary Key | *one*
contentIds | contentIds | text | | kotlin.String | Foreign Key | *many*






# **Table `ConversionEventsDataInnerCustomDataConversionEventsDataInnerCustomDataContentsInner`**
(mapped from: ConversionEventsDataInnerCustomDataConversionEventsDataInnerCustomDataContentsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionEventsDataInnerCustomData | conversionEventsDataInnerCustomData | long | | kotlin.Long | Primary Key | *one*
conversionEventsDataInnerCustomDataContentsInner | conversionEventsDataInnerCustomDataContentsInner | long | | kotlin.Long | Foreign Key | *many*








