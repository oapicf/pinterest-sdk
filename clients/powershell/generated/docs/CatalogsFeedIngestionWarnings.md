# CatalogsFeedIngestionWarnings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ADDITIONALIMAGELEVELINTERNALERROR** | **Int32** | We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. | [optional] 
**ADDITIONALIMAGEFILENOTACCESSIBLE** | **Int32** | Additional image files are unreadable. Please upload new files to continue. | [optional] 
**ADDITIONALIMAGEMALFORMEDURL** | **Int32** | Additional image files are unreadable. Please check your link and upload new files to continue. | [optional] 
**ADDITIONALIMAGEFILENOTFOUND** | **Int32** | Additional image files are unreadable. Please upload new files to continue. | [optional] 
**ADDITIONALIMAGEINVALIDFILE** | **Int32** | Additional image files are unreadable. Please upload new files to continue. | [optional] 
**HOTELPRICEHEADERISPRESENT** | **Int32** | price is not a supported column. Use base_price and sale_price instead. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedIngestionWarnings = Initialize-PSOpenAPIToolsCatalogsFeedIngestionWarnings  -ADDITIONALIMAGELEVELINTERNALERROR null `
 -ADDITIONALIMAGEFILENOTACCESSIBLE null `
 -ADDITIONALIMAGEMALFORMEDURL null `
 -ADDITIONALIMAGEFILENOTFOUND null `
 -ADDITIONALIMAGEINVALIDFILE null `
 -HOTELPRICEHEADERISPRESENT null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedIngestionWarnings | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

