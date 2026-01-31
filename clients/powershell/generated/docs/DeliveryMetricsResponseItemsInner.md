# DeliveryMetricsResponseItemsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Category** | **String** | Category name | [optional] 
**Definition** | **String** | How the metric is defined. | [optional] 
**DisplayName** | **String** | Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager. | [optional] 
**Name** | **String** | Metric&#39;s name. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeliveryMetricsResponseItemsInner = Initialize-PSOpenAPIToolsDeliveryMetricsResponseItemsInner  -Category ADS `
 -Definition Unique ID for your ad group `
 -DisplayName Ad group ID `
 -Name AD_GROUP_ID
```

- Convert the resource to JSON
```powershell
$DeliveryMetricsResponseItemsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

