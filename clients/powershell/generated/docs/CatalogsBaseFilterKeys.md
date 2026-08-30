# CatalogsBaseFilterKeys
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MINPRICE** | [**CatalogsProductGroupPricingCriteria**](CatalogsProductGroupPricingCriteria.md) |  | 
**MAXPRICE** | [**CatalogsProductGroupPricingCriteria**](CatalogsProductGroupPricingCriteria.md) |  | 
**CURRENCY** | [**CatalogsProductGroupCurrencyCriteria**](CatalogsProductGroupCurrencyCriteria.md) |  | 
**ITEMID** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**AVAILABILITY** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**BRAND** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**CONDITION** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**CUSTOMLABEL0** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**CUSTOMLABEL1** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**CUSTOMLABEL2** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**CUSTOMLABEL3** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**CUSTOMLABEL4** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**ITEMGROUPID** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**GENDER** | [**CatalogsProductGroupMultipleGenderCriteria**](CatalogsProductGroupMultipleGenderCriteria.md) |  | 
**MEDIATYPE** | [**CatalogsProductGroupMultipleMediaTypesCriteria**](CatalogsProductGroupMultipleMediaTypesCriteria.md) |  | 
**PRODUCTTYPE4** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**PRODUCTTYPE3** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**PRODUCTTYPE2** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**PRODUCTTYPE1** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**PRODUCTTYPE0** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**GOOGLEPRODUCTCATEGORY6** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**GOOGLEPRODUCTCATEGORY5** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**GOOGLEPRODUCTCATEGORY4** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**GOOGLEPRODUCTCATEGORY3** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**GOOGLEPRODUCTCATEGORY2** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**GOOGLEPRODUCTCATEGORY1** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**GOOGLEPRODUCTCATEGORY0** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**CUSTOMNUMBER0** | [**CatalogsProductGroupUint32Criteria**](CatalogsProductGroupUint32Criteria.md) |  | 
**CUSTOMNUMBER1** | [**CatalogsProductGroupUint32Criteria**](CatalogsProductGroupUint32Criteria.md) |  | 
**CUSTOMNUMBER2** | [**CatalogsProductGroupUint32Criteria**](CatalogsProductGroupUint32Criteria.md) |  | 
**CUSTOMNUMBER3** | [**CatalogsProductGroupUint32Criteria**](CatalogsProductGroupUint32Criteria.md) |  | 
**CUSTOMNUMBER4** | [**CatalogsProductGroupUint32Criteria**](CatalogsProductGroupUint32Criteria.md) |  | 
**TITLEKEYWORDS** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**PINTERESTPRODUCTCATEGORIES** | [**CatalogsProductGroupMultiplePinterestProductCategoryCriteria**](CatalogsProductGroupMultiplePinterestProductCategoryCriteria.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsBaseFilterKeys = Initialize-PSOpenAPIToolsCatalogsBaseFilterKeys  -MINPRICE null `
 -MAXPRICE null `
 -CURRENCY null `
 -ITEMID null `
 -AVAILABILITY null `
 -BRAND null `
 -CONDITION null `
 -CUSTOMLABEL0 null `
 -CUSTOMLABEL1 null `
 -CUSTOMLABEL2 null `
 -CUSTOMLABEL3 null `
 -CUSTOMLABEL4 null `
 -ITEMGROUPID null `
 -GENDER null `
 -MEDIATYPE null `
 -PRODUCTTYPE4 null `
 -PRODUCTTYPE3 null `
 -PRODUCTTYPE2 null `
 -PRODUCTTYPE1 null `
 -PRODUCTTYPE0 null `
 -GOOGLEPRODUCTCATEGORY6 null `
 -GOOGLEPRODUCTCATEGORY5 null `
 -GOOGLEPRODUCTCATEGORY4 null `
 -GOOGLEPRODUCTCATEGORY3 null `
 -GOOGLEPRODUCTCATEGORY2 null `
 -GOOGLEPRODUCTCATEGORY1 null `
 -GOOGLEPRODUCTCATEGORY0 null `
 -CUSTOMNUMBER0 null `
 -CUSTOMNUMBER1 null `
 -CUSTOMNUMBER2 null `
 -CUSTOMNUMBER3 null `
 -CUSTOMNUMBER4 null `
 -TITLEKEYWORDS null `
 -PINTERESTPRODUCTCATEGORIES null
```

- Convert the resource to JSON
```powershell
$CatalogsBaseFilterKeys | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

