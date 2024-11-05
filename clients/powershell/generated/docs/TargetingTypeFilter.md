# TargetingTypeFilter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TargetingTypes** | [**AdsAnalyticsTargetingType[]**](AdsAnalyticsTargetingType.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [&quot;&quot;AGE_BUCKET_AND_GENDER&quot;&quot;] is in BETA and not yet available to all users. | [optional] 

## Examples

- Prepare the resource
```powershell
$TargetingTypeFilter = Initialize-PSOpenAPIToolsTargetingTypeFilter  -TargetingTypes null
```

- Convert the resource to JSON
```powershell
$TargetingTypeFilter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

