# ConversionEventsDataItemsCustomDataContentsItems
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] 
**ItemBrand** | **String** | The brand of a product. | [optional] 
**ItemBrandId** | **String** | The brand ID of a product. | [optional] 
**ItemCategory** | **String** | The category of a product. | [optional] 
**ItemName** | **String** | The name of a product. | [optional] 
**ItemPrice** | **String** | The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] 
**Quantity** | **Int64** | The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionEventsDataItemsCustomDataContentsItems = Initialize-PSOpenAPIToolsConversionEventsDataItemsCustomDataContentsItems  -Id null `
 -ItemBrand null `
 -ItemBrandId null `
 -ItemCategory null `
 -ItemName null `
 -ItemPrice null `
 -Quantity null
```

- Convert the resource to JSON
```powershell
$ConversionEventsDataItemsCustomDataContentsItems | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

