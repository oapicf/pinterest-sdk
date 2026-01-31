# LineItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ProductBrand** | **String** | Product brand. For example, &#39;Parker&#39;. | [optional] 
**ProductCategory** | **String** | Product category. For example, &#39;Shoes&#39;. | [optional] 
**ProductId** | **Int32** | Product ID. For example, 1414. | [optional] 
**ProductName** | **String** | Product name. For example, &#39;Parker Boots&#39;. | [optional] 
**ProductPrice** | **String** | Product price. For example, &#39;99.99&#39;. | [optional] 
**ProductQuantity** | **Int32** | Product quantity. For example, 2. | [optional] 
**ProductVariant** | **String** | Product variant. For example, &#39;Red&#39;. | [optional] 
**ProductVariantId** | **String** | Product variant ID. For example, &#39;1414-34832&#39;. | [optional] 

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

