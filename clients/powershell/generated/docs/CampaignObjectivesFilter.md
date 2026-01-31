# CampaignObjectivesFilter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignObjectiveTypes** | [**ObjectiveType[]**](ObjectiveType.md) | List of values for filtering. [&quot;&quot;WEB_SESSIONS&quot;&quot;] in BETA. | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignObjectivesFilter = Initialize-PSOpenAPIToolsCampaignObjectivesFilter  -CampaignObjectiveTypes [&quot;AWARENESS&quot;]
```

- Convert the resource to JSON
```powershell
$CampaignObjectivesFilter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

