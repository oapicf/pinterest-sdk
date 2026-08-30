# DynamicTitlesUploadURL
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExistingFilename** | **String** | If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. | [optional] 
**RequestId** | **String** | Unique identifier for this upload session. Must be passed to the process endpoint. | 
**UploadUrl** | **String** | Pre-signed S3 PUT URL to upload the reviewed CSV file. | 

## Examples

- Prepare the resource
```powershell
$DynamicTitlesUploadURL = Initialize-PSOpenAPIToolsDynamicTitlesUploadURL  -ExistingFilename aid-549755814107/ad_group-1099511703602/validated_approvals.csv `
 -RequestId 549755814107-1099511703602-1714300000-abc123 `
 -UploadUrl https://s3.amazonaws.com/bucket/dynamic_titles/candidate.csv?AWSAccessKeyId&#x3D;...
```

- Convert the resource to JSON
```powershell
$DynamicTitlesUploadURL | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

