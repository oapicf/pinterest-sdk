# ConversionEventsDataInnerCustomData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContentBrand** | **String** | The brand of the content associated with the event. | [optional] 
**ContentCategory** | **String** | The category of the content associated with the event. | [optional] 
**ContentIds** | **String[]** | List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**ContentName** | **String** | The name of the page or product associated with the event. | [optional] 
**Contents** | [**ConversionEventsDataInnerCustomDataContentsInner[]**](ConversionEventsDataInnerCustomDataContentsInner.md) | A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**Currency** | **String** | The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. | [optional] 
**ExternalMeasurementId** | **String** | Only use when instructed. | [optional] 
**ExternalMeasurementVendorId** | **Int32** | Only use when instructed. | [optional] 
**Np** | **String** | Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. | [optional] 
**NumItems** | **Int64** | Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**OptOutType** | **String** | Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/limited-data-processing&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;limited data processing&lt;/a&gt; and the developer&#39;s guide for &lt;a href&#x3D;&quot;&quot;/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;tracking conversion events&lt;/a&gt; for help with using this parameter. | [optional] 
**OrderId** | **String** | The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. | [optional] 
**PredictedLtv** | **String** | Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double. | [optional] 
**SearchString** | **String** | The search string related to the user conversion event. | [optional] 
**Value** | **String** | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionEventsDataInnerCustomData = Initialize-PSOpenAPIToolsConversionEventsDataInnerCustomData  -ContentBrand pinterest-brand `
 -ContentCategory shirts `
 -ContentIds [&quot;product-id-001&quot;,&quot;product-id-002&quot;] `
 -ContentName pinterest-themed-clothing `
 -Contents [{&quot;id&quot;:&quot;product-id-001&quot;,&quot;item_price&quot;:&quot;14.99&quot;,&quot;quantity&quot;:3,&quot;item_name&quot;:&quot;pinterest-shirt-girl&quot;,&quot;item_category&quot;:&quot;pinterest-clothing-shirts&quot;,&quot;item_brand&quot;:&quot;pinterest&quot;},{&quot;id&quot;:&quot;product-id-002&quot;,&quot;item_price&quot;:&quot;13.71&quot;,&quot;quantity&quot;:2,&quot;item_name&quot;:&quot;pinterest-shirt-men&quot;,&quot;item_category&quot;:&quot;pinterest-clothing-shirts&quot;,&quot;item_brand&quot;:&quot;pinterest&quot;}] `
 -Currency USD `
 -ExternalMeasurementId rbos-cb7a9e56-4988-4ca0-801b-05c79b29785f `
 -ExternalMeasurementVendorId 1 `
 -Np ss-company `
 -NumItems 5 `
 -OptOutType LDP `
 -OrderId my_order_id `
 -PredictedLtv 2794.82 `
 -SearchString sample string `
 -Value 72.39
```

- Convert the resource to JSON
```powershell
$ConversionEventsDataInnerCustomData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

