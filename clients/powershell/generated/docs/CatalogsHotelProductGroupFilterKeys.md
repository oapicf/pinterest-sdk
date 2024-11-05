# CatalogsHotelProductGroupFilterKeys
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PRICE** | [**CatalogsProductGroupPricingCurrencyCriteria**](CatalogsProductGroupPricingCurrencyCriteria.md) |  | 
**HOTELID** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**BRAND** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**CUSTOMLABEL0** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**CUSTOMLABEL1** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**CUSTOMLABEL2** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**CUSTOMLABEL3** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**CUSTOMLABEL4** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**COUNTRY** | [**CatalogsProductGroupMultipleCountriesCriteria**](.md) |  | 

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

