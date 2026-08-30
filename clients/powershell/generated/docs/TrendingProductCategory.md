# TrendingProductCategory
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EngagementType** | [**ProductCategoriesEngagementType**](ProductCategoriesEngagementType.md) | Engagement type | 
**PctChangeMom** | **Int32** | Month-over-month change percentage | 
**PercentRelativeVolume** | **Int32** | Relative volume percentage | 
**PinterestProductCategoryId** | **Int32** | Pinterest Product Category Id | 
**ProductCategory** | **String** | Product Category Name | 
**Verticals** | **String[]** | Vertical name associated with the product category | [optional] 

## Examples

- Prepare the resource
```powershell
$TrendingProductCategory = Initialize-PSOpenAPIToolsTrendingProductCategory  -EngagementType null `
 -PctChangeMom null `
 -PercentRelativeVolume null `
 -PinterestProductCategoryId null `
 -ProductCategory null `
 -Verticals null
```

- Convert the resource to JSON
```powershell
$TrendingProductCategory | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

