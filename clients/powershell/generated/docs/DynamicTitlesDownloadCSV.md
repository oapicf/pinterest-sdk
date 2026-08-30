# DynamicTitlesDownloadCSV
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DownloadUrl** | **String** | Pre-signed S3 URL to download the CSV file. | [optional] 

## Examples

- Prepare the resource
```powershell
$DynamicTitlesDownloadCSV = Initialize-PSOpenAPIToolsDynamicTitlesDownloadCSV  -DownloadUrl https://s3.amazonaws.com/bucket/dynamic_titles/review.csv?AWSAccessKeyId&#x3D;...
```

- Convert the resource to JSON
```powershell
$DynamicTitlesDownloadCSV | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

