# QualityComponents
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdvertiserExternalId** | [**System.Collections.Hashtable**](QualityComponentDetails.md) |  | [optional] 
**ClickIdEpik** | [**System.Collections.Hashtable**](QualityComponentDetails.md) |  | [optional] 
**ExternalEventId** | [**System.Collections.Hashtable**](QualityComponentDetails.md) | Dedup components. | [optional] 
**HashedEmail** | [**System.Collections.Hashtable**](QualityComponentDetails.md) | User matching identifiers. | [optional] 
**HashedMaid** | [**System.Collections.Hashtable**](QualityComponentDetails.md) |  | [optional] 
**IpAddress** | [**System.Collections.Hashtable**](QualityComponentDetails.md) |  | [optional] 
**OrderId** | [**System.Collections.Hashtable**](QualityComponentDetails.md) |  | [optional] 
**OrderValue** | [**System.Collections.Hashtable**](QualityComponentDetails.md) |  | [optional] 
**ProductId** | [**System.Collections.Hashtable**](QualityComponentDetails.md) | Product/event metadata. | [optional] 
**SourceUrl** | [**System.Collections.Hashtable**](QualityComponentDetails.md) |  | [optional] 
**UserAgent** | [**System.Collections.Hashtable**](QualityComponentDetails.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$QualityComponents = Initialize-PSOpenAPIToolsQualityComponents  -AdvertiserExternalId null `
 -ClickIdEpik null `
 -ExternalEventId null `
 -HashedEmail null `
 -HashedMaid null `
 -IpAddress null `
 -OrderId null `
 -OrderValue null `
 -ProductId null `
 -SourceUrl null `
 -UserAgent null
```

- Convert the resource to JSON
```powershell
$QualityComponents | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

