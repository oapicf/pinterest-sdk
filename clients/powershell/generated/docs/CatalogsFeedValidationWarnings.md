# CatalogsFeedValidationWarnings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ADLINKFORMATWARNING** | **Int32** | Some items have ad links that are formatted incorrectly. | [optional] 
**ADLINKSAMEASLINK** | **Int32** | Some items have ad link URLs that are duplicates of the link URLs for those items. | [optional] 
**TITLELENGTHTOOLONG** | **Int32** | The title for some items were truncated because they contain too many characters. | [optional] 
**DESCRIPTIONLENGTHTOOLONG** | **Int32** | The description for some items were truncated because they contain too many characters. | [optional] 
**GENDERINVALID** | **Int32** | Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**AGEGROUPINVALID** | **Int32** | Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**SIZETYPEINVALID** | **Int32** | Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**SIZESYSTEMINVALID** | **Int32** | Some items have size system values which are not one of the supported size systems. | [optional] 
**LINKFORMATWARNING** | **Int32** | Some items have an invalid product link which contains invalid UTM tracking paramaters. | [optional] 
**SALESPRICEINVALID** | **Int32** | Some items have sale price values that are higher than the original price of the item. | [optional] 
**PRODUCTCATEGORYDEPTHWARNING** | **Int32** | Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**ADWORDSFORMATWARNING** | **Int32** | Some items have adwords_redirect links that are formatted incorrectly. | [optional] 
**ADWORDSSAMEASLINK** | **Int32** | Some items have adwords_redirect URLs that are duplicates of the link URLs for those items. | [optional] 
**DUPLICATEHEADERS** | **Int32** | Your feed contains duplicate headers. | [optional] 
**FETCHSAMESIGNATURE** | **Int32** | Ingestion completed early because there are no changes to your feed since the last successful update. | [optional] 
**ADDITIONALIMAGELINKLENGTHTOOLONG** | **Int32** | Some items have additional_image_link URLs that contain too many characters, so those items will not be published. | [optional] 
**ADDITIONALIMAGELINKWARNING** | **Int32** | Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items. | [optional] 
**IMAGELINKWARNING** | **Int32** | Some items have image_link URLs that are formatted incorrectly and will not be published with those items. | [optional] 
**SHIPPINGINVALID** | **Int32** | Some items have shipping values that are formatted incorrectly. | [optional] 
**TAXINVALID** | **Int32** | Some items have tax values that are formatted incorrectly. | [optional] 
**SHIPPINGWEIGHTINVALID** | **Int32** | Some items have invalid shipping_weight values. | [optional] 
**EXPIRATIONDATEINVALID** | **Int32** | Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date. | [optional] 
**AVAILABILITYDATEINVALID** | **Int32** | Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date. | [optional] 
**SALEDATEINVALID** | **Int32** | Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date. | [optional] 
**WEIGHTUNITINVALID** | **Int32** | Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit. | [optional] 
**ISBUNDLEINVALID** | **Int32** | Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products. | [optional] 
**UPDATEDTIMEINVALID** | **Int32** | Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time. | [optional] 
**CUSTOMLABELLENGTHTOOLONG** | **Int32** | Some items have custom_label values that are too long, those items will be published without that custom label. | [optional] 
**PRODUCTTYPELENGTHTOOLONG** | **Int32** | Some items have product_type values that are too long, those items will be published without that product type. | [optional] 
**TOOMANYADDITIONALIMAGELINKS** | **Int32** | Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images. | [optional] 
**MULTIPACKINVALID** | **Int32** | Some items have invalid multipack values. | [optional] 
**INDEXEDPRODUCTCOUNTLARGEDELTA** | **Int32** | The product count has increased or decreased significantly compared to the last successful ingestion. | [optional] 
**ITEMADDITIONALIMAGEDOWNLOADFAILURE** | **Int32** | Some items include additional_image_links that can&#39;t be found. | [optional] 
**OPTIONALPRODUCTCATEGORYMISSING** | **Int32** | Some items are missing a google_product_category. | [optional] 
**OPTIONALPRODUCTCATEGORYINVALID** | **Int32** | Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy. | [optional] 
**OPTIONALCONDITIONMISSING** | **Int32** | Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**OPTIONALCONDITIONINVALID** | **Int32** | Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**IOSDEEPLINKINVALID** | **Int32** | Some items include invalid ios_deep_link values. | [optional] 
**ANDROIDDEEPLINKINVALID** | **Int32** | Some items include invalid android_deep_link. | [optional] 
**UTMSOURCEAUTOCORRECTED** | **Int32** | Some items include utm_source values that are formatted incorrectly and have been automatically corrected. | [optional] 
**COUNTRYDOESNOTMAPTOCURRENCY** | **Int32** | Some items include a currency that doesn&#39;t match the usual currency for the location where that product is sold or shipped. | [optional] 
**MINADPRICEINVALID** | **Int32** | Some items include min_ad_price values that are formatted incorrectly. | [optional] 
**GTININVALID** | **Int32** | Some items include incorrectly formatted GTINs. | [optional] 
**INCONSISTENTCURRENCYVALUES** | **Int32** | Some items include inconsistent currencies in price fields. | [optional] 
**SALESPRICETOOLOW** | **Int32** | Some items include sales price that is much lower than the list price. | [optional] 
**SHIPPINGWIDTHINVALID** | **Int32** | Some items include incorrectly formatted shipping_width. | [optional] 
**SHIPPINGHEIGHTINVALID** | **Int32** | Some items include incorrectly formatted shipping_height. | [optional] 
**SALESPRICETOOHIGH** | **Int32** | Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price. | [optional] 
**MPNINVALID** | **Int32** | Some items include incorrectly formatted MPNs. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsFeedValidationWarnings = Initialize-PSOpenAPIToolsCatalogsFeedValidationWarnings  -ADLINKFORMATWARNING null `
 -ADLINKSAMEASLINK null `
 -TITLELENGTHTOOLONG null `
 -DESCRIPTIONLENGTHTOOLONG null `
 -GENDERINVALID null `
 -AGEGROUPINVALID null `
 -SIZETYPEINVALID null `
 -SIZESYSTEMINVALID null `
 -LINKFORMATWARNING null `
 -SALESPRICEINVALID null `
 -PRODUCTCATEGORYDEPTHWARNING null `
 -ADWORDSFORMATWARNING null `
 -ADWORDSSAMEASLINK null `
 -DUPLICATEHEADERS null `
 -FETCHSAMESIGNATURE null `
 -ADDITIONALIMAGELINKLENGTHTOOLONG null `
 -ADDITIONALIMAGELINKWARNING null `
 -IMAGELINKWARNING null `
 -SHIPPINGINVALID null `
 -TAXINVALID null `
 -SHIPPINGWEIGHTINVALID null `
 -EXPIRATIONDATEINVALID null `
 -AVAILABILITYDATEINVALID null `
 -SALEDATEINVALID null `
 -WEIGHTUNITINVALID null `
 -ISBUNDLEINVALID null `
 -UPDATEDTIMEINVALID null `
 -CUSTOMLABELLENGTHTOOLONG null `
 -PRODUCTTYPELENGTHTOOLONG null `
 -TOOMANYADDITIONALIMAGELINKS null `
 -MULTIPACKINVALID null `
 -INDEXEDPRODUCTCOUNTLARGEDELTA null `
 -ITEMADDITIONALIMAGEDOWNLOADFAILURE null `
 -OPTIONALPRODUCTCATEGORYMISSING null `
 -OPTIONALPRODUCTCATEGORYINVALID null `
 -OPTIONALCONDITIONMISSING null `
 -OPTIONALCONDITIONINVALID null `
 -IOSDEEPLINKINVALID null `
 -ANDROIDDEEPLINKINVALID null `
 -UTMSOURCEAUTOCORRECTED null `
 -COUNTRYDOESNOTMAPTOCURRENCY null `
 -MINADPRICEINVALID null `
 -GTININVALID null `
 -INCONSISTENTCURRENCYVALUES null `
 -SALESPRICETOOLOW null `
 -SHIPPINGWIDTHINVALID null `
 -SHIPPINGHEIGHTINVALID null `
 -SALESPRICETOOHIGH null `
 -MPNINVALID null
```

- Convert the resource to JSON
```powershell
$CatalogsFeedValidationWarnings | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

