# CatalogsFeedIngestionErrors
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LINELEVELINTERNALERROR** | **Int32** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. | [optional] 
**LARGEPRODUCTCOUNTDECREASE** | **Int32** | The product count has decreased by more than 99% compared to the last successful ingestion. | [optional] 
**ACCOUNTFLAGGED** | **Int32** | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. | [optional] 
**IMAGELEVELINTERNALERROR** | **Int32** | We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. | [optional] 
**IMAGEFILENOTACCESSIBLE** | **Int32** | Image files are unreadable. Please upload new files to continue. | [optional] 
**IMAGEMALFORMEDURL** | **Int32** | Image files are unreadable. Please check your link and upload new files to continue. | [optional] 
**IMAGEFILENOTFOUND** | **Int32** | Image files are unreadable. Please upload new files to continue. | [optional] 
**IMAGEINVALIDFILE** | **Int32** | Image files are unreadable. Please upload new files to continue. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedIngestionErrors = Initialize-PSOpenAPIToolsCatalogsFeedIngestionErrors  -LINELEVELINTERNALERROR null `
 -LARGEPRODUCTCOUNTDECREASE null `
 -ACCOUNTFLAGGED null `
 -IMAGELEVELINTERNALERROR null `
 -IMAGEFILENOTACCESSIBLE null `
 -IMAGEMALFORMEDURL null `
 -IMAGEFILENOTFOUND null `
 -IMAGEINVALIDFILE null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedIngestionErrors | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

