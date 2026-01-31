# ConversionHealthSelectionItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConversionType** | [**SystemCollectionsHashtable**](.md) | Status for conversion types | [optional] 
**Criteria** | [**SystemCollectionsHashtable**](.md) | Status for criteria | [optional] 
**IngestionSource** | [**SystemCollectionsHashtable**](.md) | Status for ingestion sources | [optional] 
**Status** | [**AnyType**](.md) | Overall status for this selection item | 

## Examples

- Prepare the resource
```powershell
$ConversionHealthSelectionItem = Initialize-PSOpenAPIToolsConversionHealthSelectionItem  -ConversionType null `
 -Criteria null `
 -IngestionSource null `
 -Status null
```

- Convert the resource to JSON
```powershell
$ConversionHealthSelectionItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

