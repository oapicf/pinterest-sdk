# ConversionEventsDataInnerCustomDataContentsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**ItemPrice** | **String** | The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**Quantity** | **Int64** | The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;here&lt;/a&gt; (Install the Pinterest tag section). | [optional] 
**ItemName** | **String** | The name of a product. | [optional] 
**ItemCategory** | **String** | The category of a product. | [optional] 
**ItemBrand** | **String** | The brand of a product. | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionEventsDataInnerCustomDataContentsInner = Initialize-PSOpenAPIToolsConversionEventsDataInnerCustomDataContentsInner  -Id red-pinterest-shirt-logo-1 `
 -ItemPrice 1325.12 `
 -Quantity 5 `
 -ItemName pinterest-clothing-shirt `
 -ItemCategory pinterest-entertainment `
 -ItemBrand pinterest
```

- Convert the resource to JSON
```powershell
$ConversionEventsDataInnerCustomDataContentsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

