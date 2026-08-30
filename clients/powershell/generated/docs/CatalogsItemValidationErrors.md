# CatalogsItemValidationErrors
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ADULTINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has an invalid adult value. | [optional] 
**ADWORDSFORMATINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Adword link contains too many characters. | [optional] 
**AVAILABILITYINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing availability value in its product metadata, this item will not be published. | [optional] 
**BLOCKLISTEDIMAGESIGNATURE** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**DESCRIPTIONMISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing description in its product metadata, this item will not be published. | [optional] 
**DUPLICATEPRODUCTS** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | This product is duplicated. The duplicate entry will not be published. | [optional] 
**IMAGELINKINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Image link is invalid. | [optional] 
**IMAGELINKLENGTHTOOLONG** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has image_link URL that contains too many characters, so the item will not be published. | [optional] 
**IMAGELINKMISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing an image link URL in its product metadata, this item will not be published. | [optional] 
**INVALIDDOMAIN** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product link value doesn&#39;t match the verified domain associated with this account. | [optional] 
**ITEMMAINIMAGEDOWNLOADFAILURE** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Main image can&#39;t be found. | [optional] 
**ITEMIDMISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing item id in its product metadata, this item will not be published. | [optional] 
**LINKFORMATINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Link is invalid. | [optional] 
**LINKLENGTHTOOLONG** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product link contains too many characters, this item will not be published. | [optional] 
**LISTPRICEINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has a list price formatting error, this item will not be published. | [optional] 
**MAXITEMSPERITEMGROUPEXCEEDED** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item exceed the maximum number of items per item group, this item will not be published. | [optional] 
**PARSELINEERROR** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item contains formating errors. | [optional] 
**PINJOINCONTENTUNSAFE** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**PRICECANNOTBEDETERMINED** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item price cannot be determined because the price, list price, and sale price are all different. | [optional] 
**PRICEMISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product is missing a price, this item will not be published. | [optional] 
**PRODUCTLINKMISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing a link URL in its product metadata, this item will not be published. | [optional] 
**PRODUCTPRICEINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has a price formatting error in its product metadata, this item will not be published. | [optional] 
**TITLEMISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing title in its product metadata, this item will not be published. | [optional] 

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
 -ITEMMAINIMAGEDOWNLOADFAILURE null `
 -ITEMIDMISSING null `
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

