

# ConversionEventsDataInnerCustomData

Object containing other custom data.

The class is defined in **[ConversionEventsDataInnerCustomData.java](../../src/main/java/org/openapitools/model/ConversionEventsDataInnerCustomData.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contentBrand** | `String` | The brand of the content associated with the event. |  [optional property]
**contentCategory** | `String` | The category of the content associated with the event. |  [optional property]
**contentIds** | `List&lt;String&gt;` | List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). |  [optional property]
**contentName** | `String` | The name of the page or product associated with the event. |  [optional property]
**contents** | [`List&lt;ConversionEventsDataInnerCustomDataContentsInner&gt;`](ConversionEventsDataInnerCustomDataContentsInner.md) | A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). |  [optional property]
**currency** | `String` | The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. |  [optional property]
**externalMeasurementId** | `String` | Only use when instructed. |  [optional property]
**externalMeasurementVendorId** | `Integer` | Only use when instructed. |  [optional property]
**np** | `String` | Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. |  [optional property]
**numItems** | `Long` | Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). |  [optional property]
**optOutType** | `String` | Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/limited-data-processing\&quot; target&#x3D;\&quot;_blank\&quot;&gt;limited data processing&lt;/a&gt; and the developer&#39;s guide for &lt;a href&#x3D;\&quot;/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\&quot; target&#x3D;\&quot;_blank\&quot;&gt;tracking conversion events&lt;/a&gt; for help with using this parameter. |  [optional property]
**orderId** | `String` | The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. |  [optional property]
**predictedLtv** | `String` | Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double. |  [optional property]
**searchString** | `String` | The search string related to the user conversion event. |  [optional property]
**value** | `String` | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. |  [optional property]

















