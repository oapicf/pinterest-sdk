# CatalogsItemValidationErrors
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ADULTINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**ADWORDSFORMATINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**AVAILABILITYINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**BLOCKLISTEDIMAGESIGNATURE** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**DESCRIPTIONMISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**DUPLICATEPRODUCTS** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**IMAGELINKINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**IMAGELINKLENGTHTOOLONG** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**IMAGELINKMISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**INVALIDDOMAIN** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**ITEMIDMISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**ITEMMAINIMAGEDOWNLOADFAILURE** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**LINKFORMATINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**LINKLENGTHTOOLONG** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**LISTPRICEINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**MAXITEMSPERITEMGROUPEXCEEDED** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**PARSELINEERROR** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**PINJOINCONTENTUNSAFE** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**PRICECANNOTBEDETERMINED** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**PRICEMISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**PRODUCTLINKMISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**PRODUCTPRICEINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**TITLEMISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsItemValidationErrors = Initialize-PSOpenAPIToolsCatalogsItemValidationErrors  -ADULTINVALID null `
 -ADWORDSFORMATINVALID null `
 -AVAILABILITYINVALID null `
 -BLOCKLISTEDIMAGESIGNATURE null `
 -DESCRIPTIONMISSING null `
 -DUPLICATEPRODUCTS null `
 -IMAGELINKINVALID null `
 -IMAGELINKLENGTHTOOLONG null `
 -IMAGELINKMISSING null `
 -INVALIDDOMAIN null `
 -ITEMIDMISSING null `
 -ITEMMAINIMAGEDOWNLOADFAILURE null `
 -LINKFORMATINVALID null `
 -LINKLENGTHTOOLONG null `
 -LISTPRICEINVALID null `
 -MAXITEMSPERITEMGROUPEXCEEDED null `
 -PARSELINEERROR null `
 -PINJOINCONTENTUNSAFE null `
 -PRICECANNOTBEDETERMINED null `
 -PRICEMISSING null `
 -PRODUCTLINKMISSING null `
 -PRODUCTPRICEINVALID null `
 -TITLEMISSING null
```

- Convert the resource to JSON
```powershell
$CatalogsItemValidationErrors | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

