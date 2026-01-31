# CatalogsFeedIngestionErrors
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ACCOUNTFLAGGED** | **Int32** | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. | [optional] 
**FETCHGOOGLESHEETNOTSHARED** | **Int32** | Update your Google Sheets sharing settings to &#39;Anyone with link&#39; as a Viewer so that Pinterest can access your file. | [optional] 
**IMAGEFILENOTACCESSIBLE** | **Int32** | Image files are unreadable. Please upload new files to continue. | [optional] 
**IMAGEFILENOTFOUND** | **Int32** | Image files are unreadable. Please upload new files to continue. | [optional] 
**IMAGEINVALIDFILE** | **Int32** | Image files are unreadable. Please upload new files to continue. | [optional] 
**IMAGELEVELINTERNALERROR** | **Int32** | We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. | [optional] 
**IMAGEMALFORMEDURL** | **Int32** | Image files are unreadable. Please check your link and upload new files to continue. | [optional] 
**LARGEPRODUCTCOUNTDECREASE** | **Int32** | The product count has decreased by more than 99% compared to the last successful ingestion. | [optional] 
**LINELEVELINTERNALERROR** | **Int32** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedIngestionErrors = Initialize-PSOpenAPIToolsCatalogsFeedIngestionErrors  -ACCOUNTFLAGGED null `
 -FETCHGOOGLESHEETNOTSHARED null `
 -IMAGEFILENOTACCESSIBLE null `
 -IMAGEFILENOTFOUND null `
 -IMAGEINVALIDFILE null `
 -IMAGELEVELINTERNALERROR null `
 -IMAGEMALFORMEDURL null `
 -LARGEPRODUCTCOUNTDECREASE null `
 -LINELEVELINTERNALERROR null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedIngestionErrors | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

