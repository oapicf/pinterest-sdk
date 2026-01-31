# CatalogsProductGroupFilterKeys
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MINPRICE** | [**CatalogsProductGroupPricingCriteria**](.md) |  | 
**MAXPRICE** | [**CatalogsProductGroupPricingCriteria**](.md) |  | 
**CURRENCY** | [**CatalogsProductGroupCurrencyCriteria**](.md) |  | 
**ITEMID** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**AVAILABILITY** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**BRAND** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**CONDITION** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**CUSTOMLABEL0** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  | 
**CUSTOMLABEL1** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  | 
**CUSTOMLABEL2** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  | 
**CUSTOMLABEL3** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  | 
**CUSTOMLABEL4** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  | 
**ITEMGROUPID** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**GENDER** | [**CatalogsProductGroupMultipleGenderCriteria**](.md) |  | 
**MEDIATYPE** | [**CatalogsProductGroupMultipleMediaTypesCriteria**](.md) |  | 
**PRODUCTTYPE4** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**PRODUCTTYPE3** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**PRODUCTTYPE2** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**PRODUCTTYPE1** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**PRODUCTTYPE0** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**GOOGLEPRODUCTCATEGORY6** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**GOOGLEPRODUCTCATEGORY5** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**GOOGLEPRODUCTCATEGORY4** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**GOOGLEPRODUCTCATEGORY3** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**GOOGLEPRODUCTCATEGORY2** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**GOOGLEPRODUCTCATEGORY1** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**GOOGLEPRODUCTCATEGORY0** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**PRODUCTGROUP** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**CUSTOMNUMBER0** | [**CatalogsProductGroupUint32Criteria**](.md) |  | 
**CUSTOMNUMBER1** | [**CatalogsProductGroupUint32Criteria**](.md) |  | 
**CUSTOMNUMBER2** | [**CatalogsProductGroupUint32Criteria**](.md) |  | 
**CUSTOMNUMBER3** | [**CatalogsProductGroupUint32Criteria**](.md) |  | 
**CUSTOMNUMBER4** | [**CatalogsProductGroupUint32Criteria**](.md) |  | 
**TITLEKEYWORDS** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupFilterKeys = Initialize-PSOpenAPIToolsCatalogsProductGroupFilterKeys  -MINPRICE null `
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
 -PRODUCTGROUP null `
 -CUSTOMNUMBER0 null `
 -CUSTOMNUMBER1 null `
 -CUSTOMNUMBER2 null `
 -CUSTOMNUMBER3 null `
 -CUSTOMNUMBER4 null `
 -TITLEKEYWORDS null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupFilterKeys | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

