# LineItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ProductBrand** | **String** | Product brand. For example, &quot;&quot;Parker&quot;&quot;. | [optional] 
**ProductCategory** | **String** | Product category. For example, &quot;&quot;Shoes&quot;&quot;. | [optional] 
**ProductId** | **Int32** | Product ID. For example, 1414. | [optional] 
**ProductName** | **String** | Product name. For example, &quot;&quot;Parker Boots&quot;&quot;. | [optional] 
**ProductPrice** | **String** | Product price. For example, &quot;&quot;99.99&quot;&quot;. | [optional] 
**ProductQuantity** | **Int32** | Product quantity. For example, 2. | [optional] 
**ProductVariant** | **String** | Product variant. For example, &quot;&quot;Red&quot;&quot;. | [optional] 
**ProductVariantId** | **String** | Product variant ID. For example, &quot;&quot;1414-34832&quot;&quot;. | [optional] 

## Examples

- Prepare the resource
```powershell
$LineItem = Initialize-PSOpenAPIToolsLineItem  -ProductBrand Parker `
 -ProductCategory Shoes `
 -ProductId 1414 `
 -ProductName Parker Boots `
 -ProductPrice 99.99 `
 -ProductQuantity 2 `
 -ProductVariant Red `
 -ProductVariantId 1414-34832
```

- Convert the resource to JSON
```powershell
$LineItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

