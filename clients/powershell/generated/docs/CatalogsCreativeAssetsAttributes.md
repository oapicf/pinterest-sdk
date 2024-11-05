# CatalogsCreativeAssetsAttributes
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Title** | **String** | The name of the creative assets. | [optional] 
**Description** | **String** | Brief description of the creative assets. | [optional] 
**Link** | **String** | Link to the creative assets page. | [optional] 
**IosDeepLink** | **String** | IOS deep link to the creative assets page. | [optional] 
**AndroidDeepLink** | **String** | Link to the creative assets page. | [optional] 
**GoogleProductCategory** | **String** | The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. | [optional] 
**CustomLabel0** | **String** | Custom grouping of creative assets. | [optional] 
**CustomLabel1** | **String** | Custom grouping of creative assets. | [optional] 
**CustomLabel2** | **String** | Custom grouping of creative assets. | [optional] 
**CustomLabel3** | **String** | Custom grouping of creative assets. | [optional] 
**CustomLabel4** | **String** | Custom grouping of creative assets. | [optional] 
**Visibility** | **String** | Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’. | [optional] 
**ImageLink** | **String** | The creative assets image. | [optional] 
**VideoLink** | **String** | The creative assets video. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsCreativeAssetsAttributes = Initialize-PSOpenAPIToolsCatalogsCreativeAssetsAttributes  -Title null `
 -Description null `
 -Link null `
 -IosDeepLink null `
 -AndroidDeepLink null `
 -GoogleProductCategory null `
 -CustomLabel0 null `
 -CustomLabel1 null `
 -CustomLabel2 null `
 -CustomLabel3 null `
 -CustomLabel4 null `
 -Visibility null `
 -ImageLink https://scene.example.com/image/image_v2.jpg `
 -VideoLink https://scene.example.com/image/image_v2.mp4
```

- Convert the resource to JSON
```powershell
$CatalogsCreativeAssetsAttributes | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

