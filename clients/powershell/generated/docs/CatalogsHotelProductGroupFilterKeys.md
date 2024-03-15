# CatalogsHotelProductGroupFilterKeys
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PRICE** | [**CatalogsProductGroupPricingCurrencyCriteria**](CatalogsProductGroupPricingCurrencyCriteria.md) |  | 
**HOTELID** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**BRAND** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**CUSTOMLABEL0** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**CUSTOMLABEL1** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**CUSTOMLABEL2** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**CUSTOMLABEL3** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**CUSTOMLABEL4** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**COUNTRY** | [**CatalogsProductGroupMultipleCountriesCriteria**](CatalogsProductGroupMultipleCountriesCriteria.md) |  | 

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
 -COUNTRY null
```

- Convert the resource to JSON
```powershell
$CatalogsHotelProductGroupFilterKeys | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

