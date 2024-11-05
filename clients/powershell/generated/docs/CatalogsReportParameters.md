# CatalogsReportParameters
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogType** | [**CatalogsType**](CatalogsType.md) |  | 
**Report** | [**CatalogsHotelReportParametersReport**](CatalogsHotelReportParametersReport.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsReportParameters = Initialize-PSOpenAPIToolsCatalogsReportParameters  -CatalogType null `
 -Report null
```

- Convert the resource to JSON
```powershell
$CatalogsReportParameters | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

