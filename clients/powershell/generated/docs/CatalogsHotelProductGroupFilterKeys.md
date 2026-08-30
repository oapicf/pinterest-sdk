# CatalogsHotelProductGroupFilterKeys
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PRICE** | [**PriceFilterPrice**](PriceFilterPrice.md) |  | 
**HOTELID** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**BRAND** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**CUSTOMLABEL0** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**CUSTOMLABEL1** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**CUSTOMLABEL2** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**CUSTOMLABEL3** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**CUSTOMLABEL4** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**COUNTRY** | [**CatalogsProductGroupMultipleCountriesCriteria**](CatalogsProductGroupMultipleCountriesCriteria.md) |  | 
**TITLEKEYWORDS** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsHotelProductGroupFilterKeys = Initialize-PSOpenAPIToolsCatalogsHotelProductGroupFilterKeys  -PRICE null `
 -HOTELID null `
 -BRAND null `
 -CUSTOMLABEL0 null `
 -CUSTOMLABEL1 null `
 -CUSTOMLABEL2 null `
 -CUSTOMLABEL3 null `
 -CUSTOMLABEL4 null `
 -COUNTRY null `
 -TITLEKEYWORDS null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelProductGroupFilterKeys | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

