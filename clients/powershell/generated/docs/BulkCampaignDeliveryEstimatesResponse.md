# BulkCampaignDeliveryEstimatesResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**BulkCampaignDeliveryEstimatesItem[]**](BulkCampaignDeliveryEstimatesItem.md) | Per-campaign delivery estimate results, in the same order as the request. | 

## Examples

- Prepare the resource
```powershell
$BulkCampaignDeliveryEstimatesResponse = Initialize-PSOpenAPIToolsBulkCampaignDeliveryEstimatesResponse  -VarData null
```

- Convert the resource to JSON
```powershell
$BulkCampaignDeliveryEstimatesResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

