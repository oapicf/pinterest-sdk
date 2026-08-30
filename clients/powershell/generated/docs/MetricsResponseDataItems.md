# MetricsResponseDataItems
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Metrics** | [**SystemCollectionsHashtable**](.md) | Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers). | 
**TargetingType** | **String** | The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER) | 
**TargetingValue** | **String** | The targeting value for this data item (e.g., &#39;christmas decor ideas&#39;, &#39;iphone&#39;, &#39;female&#39;) | 

## Examples

- Prepare the resource
```powershell
$MetricsResponseDataItems = Initialize-PSOpenAPIToolsMetricsResponseDataItems  -Metrics null `
 -TargetingType null `
 -TargetingValue null
```

- Convert the resource to JSON
```powershell
$MetricsResponseDataItems | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

