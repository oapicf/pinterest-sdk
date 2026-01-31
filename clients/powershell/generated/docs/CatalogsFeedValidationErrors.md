# CatalogsFeedValidationErrors
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ADULTINVALID** | **Int32** | Some items have invalid adult values. | [optional] 
**ADWORDSFORMATINVALID** | **Int32** | Some adwords links contain too many characters. | [optional] 
**AVAILABILITYINVALID** | **Int32** | Some items are missing an availability value in their product metadata, those items will not be published. | [optional] 
**BLOCKLISTEDIMAGESIGNATURE** | **Int32** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**DELIMITERERROR** | **Int32** | Your feed includes data with formatting errors. | [optional] 
**DESCRIPTIONMISSING** | **Int32** | Some items are missing a description in their product metadata, those items will not be published. | [optional] 
**DUPLICATEPRODUCTS** | **Int32** | Some products are duplicated. | [optional] 
**ENCODINGERROR** | **Int32** | Your feed includes data with an unsupported encoding format. | [optional] 
**FEEDLENGTHTOOLONG** | **Int32** | Your feed contains too many items, some items will not be published. | [optional] 
**FEEDTOOSMALL** | **Int32** | Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required. | [optional] 
**FETCHERROR** | **Int32** | Pinterest couldn&#39;t download your feed. | [optional] 
**FETCHINACTIVEFEEDERROR** | **Int32** | Your feed wasn&#39;t ingested because it hasn’t changed in the previous 90 days. | [optional] 
**IMAGELINKINVALID** | **Int32** | Some image links are formatted incorrectly. | [optional] 
**IMAGELINKLENGTHTOOLONG** | **Int32** | Some items have image_link URLs that contain too many characters, so those items will not be published. | [optional] 
**IMAGELINKMISSING** | **Int32** | Some items are missing an image link URL in their product metadata, those items will not be published. | [optional] 
**INTERNALSERVICEERROR** | **Int32** | We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. | [optional] 
**INVALIDDOMAIN** | **Int32** | Some of your product link values don&#39;t match the verified domain associated with this account. | [optional] 
**ITEMMAINIMAGEDOWNLOADFAILURE** | **Int32** | Some items&#39; main images can&#39;t be found. | [optional] 
**ITEMIDMISSING** | **Int32** | Some items are missing an item id in their product metadata, those items will not be published. | [optional] 
**LINKFORMATINVALID** | **Int32** | Some link values are formatted incorrectly. | [optional] 
**LINKLENGTHTOOLONG** | **Int32** | Some product links contain too many characters, those items will not be published. | [optional] 
**LISTPRICEINVALID** | **Int32** | Some items have list price formatting errors in their product metadata, those items will not be published. | [optional] 
**MALFORMEDXML** | **Int32** | Your feed couldn&#39;t be validated because the xml file is formatted incorrectly. | [optional] 
**MAXITEMSPERITEMGROUPEXCEEDED** | **Int32** | Some items exceed the maximum number of items per item group, those items will not be published. | [optional] 
**NOVERIFIEDDOMAIN** | **Int32** | Your merchant domain needs to be claimed. | [optional] 
**PARSELINEERROR** | **Int32** | Your feed contains formatting errors for some items. | [optional] 
**PINJOINCONTENTUNSAFE** | **Int32** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**PRICECANNOTBEDETERMINED** | **Int32** | Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. | [optional] 
**PRICEMISSING** | **Int32** | Some products are missing a price, those items will not be published. | [optional] 
**PRODUCTLINKMISSING** | **Int32** | Some items are missing a link URL in their product metadata, those items will not be published. | [optional] 
**PRODUCTPRICEINVALID** | **Int32** | Some items have price formatting errors in their product metadata, those items will not be published. | [optional] 
**REQUIREDCOLUMNSMISSING** | **Int32** | Your feed is missing some required column headers. | [optional] 
**TITLEMISSING** | **Int32** | Some items are missing a title in their product metadata, those items will not be published. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedValidationErrors = Initialize-PSOpenAPIToolsCatalogsFeedValidationErrors  -ADULTINVALID null `
 -ADWORDSFORMATINVALID null `
 -AVAILABILITYINVALID null `
 -BLOCKLISTEDIMAGESIGNATURE null `
 -DELIMITERERROR null `
 -DESCRIPTIONMISSING null `
 -DUPLICATEPRODUCTS null `
 -ENCODINGERROR null `
 -FEEDLENGTHTOOLONG null `
 -FEEDTOOSMALL null `
 -FETCHERROR null `
 -FETCHINACTIVEFEEDERROR null `
 -IMAGELINKINVALID null `
 -IMAGELINKLENGTHTOOLONG null `
 -IMAGELINKMISSING null `
 -INTERNALSERVICEERROR null `
 -INVALIDDOMAIN null `
 -ITEMMAINIMAGEDOWNLOADFAILURE null `
 -ITEMIDMISSING null `
 -LINKFORMATINVALID null `
 -LINKLENGTHTOOLONG null `
 -LISTPRICEINVALID null `
 -MALFORMEDXML null `
 -MAXITEMSPERITEMGROUPEXCEEDED null `
 -NOVERIFIEDDOMAIN null `
 -PARSELINEERROR null `
 -PINJOINCONTENTUNSAFE null `
 -PRICECANNOTBEDETERMINED null `
 -PRICEMISSING null `
 -PRODUCTLINKMISSING null `
 -PRODUCTPRICEINVALID null `
 -REQUIREDCOLUMNSMISSING null `
 -TITLEMISSING null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedValidationErrors | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

