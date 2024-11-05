# ConversionEventsDataInnerCustomData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Currency** | **String** | The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. | [optional] 
**Value** | **String** | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. | [optional] 
**ContentIds** | **String[]** | List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**ContentName** | **String** | The name of the page or product associated with the event. | [optional] 
**ContentCategory** | **String** | The category of the content associated with the event. | [optional] 
**ContentBrand** | **String** | The brand of the content associated with the event. | [optional] 
**Contents** | [**ConversionEventsDataInnerCustomDataContentsInner[]**](ConversionEventsDataInnerCustomDataContentsInner.md) | A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**NumItems** | **Int64** | Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**OrderId** | **String** | The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. | [optional] 
**SearchString** | **String** | The search string related to the user conversion event. | [optional] 
**OptOutType** | **String** | Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/limited-data-processing&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;Help Center&lt;/a&gt; and &lt;a href&#x3D;&quot;&quot;/docs/api-features/conversion-overview/&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;dev site&lt;/a&gt; for specific opt_out_type set up. | [optional] 
**Np** | **String** | Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionEventsDataInnerCustomData = Initialize-PSOpenAPIToolsConversionEventsDataInnerCustomData  -Currency USD `
 -Value 72.39 `
 -ContentIds [&quot;red-pinterest-shirt-logo-1&quot;,&quot;purple-pinterest-shirt-logo-3&quot;] `
 -ContentName pinterest-themed-clothing `
 -ContentCategory shirts `
 -ContentBrand pinterest-brand `
 -Contents null `
 -NumItems 2 `
 -OrderId my_order_id `
 -SearchString sample string `
 -OptOutType LDP `
 -Np ss-company
```

- Convert the resource to JSON
```powershell
$ConversionEventsDataInnerCustomData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

