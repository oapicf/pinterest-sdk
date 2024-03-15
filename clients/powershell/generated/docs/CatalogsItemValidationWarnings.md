# CatalogsItemValidationWarnings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ADLINKFORMATWARNING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**ADLINKSAMEASLINK** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**ADDITIONALIMAGELINKLENGTHTOOLONG** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**ADDITIONALIMAGELINKWARNING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**ADWORDSFORMATWARNING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**ADWORDSSAMEASLINK** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**AGEGROUPINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**SIZESYSTEMINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**ANDROIDDEEPLINKINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**AVAILABILITYDATEINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**COUNTRYDOESNOTMAPTOCURRENCY** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**CUSTOMLABELLENGTHTOOLONG** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**DESCRIPTIONLENGTHTOOLONG** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**EXPIRATIONDATEINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**GENDERINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**GTININVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**IMAGELINKWARNING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**IOSDEEPLINKINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**ISBUNDLEINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**ITEMADDITIONALIMAGEDOWNLOADFAILURE** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**LINKFORMATWARNING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**MINADPRICEINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**MPNINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**MULTIPACKINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**OPTIONALCONDITIONINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**OPTIONALCONDITIONMISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**OPTIONALPRODUCTCATEGORYINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**OPTIONALPRODUCTCATEGORYMISSING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**PRODUCTCATEGORYDEPTHWARNING** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**PRODUCTTYPELENGTHTOOLONG** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**SALESPRICEINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**SALESPRICETOOLOW** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**SALESPRICETOOHIGH** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**SALEDATEINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**SHIPPINGINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**SHIPPINGHEIGHTINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**SHIPPINGWEIGHTINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**SHIPPINGWIDTHINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**SIZETYPEINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**TAXINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**TITLELENGTHTOOLONG** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**TOOMANYADDITIONALIMAGELINKS** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**UTMSOURCEAUTOCORRECTED** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 
**WEIGHTUNITINVALID** | [**CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsItemValidationWarnings = Initialize-PSOpenAPIToolsCatalogsItemValidationWarnings  -ADLINKFORMATWARNING null `
 -ADLINKSAMEASLINK null `
 -ADDITIONALIMAGELINKLENGTHTOOLONG null `
 -ADDITIONALIMAGELINKWARNING null `
 -ADWORDSFORMATWARNING null `
 -ADWORDSSAMEASLINK null `
 -AGEGROUPINVALID null `
 -SIZESYSTEMINVALID null `
 -ANDROIDDEEPLINKINVALID null `
 -AVAILABILITYDATEINVALID null `
 -COUNTRYDOESNOTMAPTOCURRENCY null `
 -CUSTOMLABELLENGTHTOOLONG null `
 -DESCRIPTIONLENGTHTOOLONG null `
 -EXPIRATIONDATEINVALID null `
 -GENDERINVALID null `
 -GTININVALID null `
 -IMAGELINKWARNING null `
 -IOSDEEPLINKINVALID null `
 -ISBUNDLEINVALID null `
 -ITEMADDITIONALIMAGEDOWNLOADFAILURE null `
 -LINKFORMATWARNING null `
 -MINADPRICEINVALID null `
 -MPNINVALID null `
 -MULTIPACKINVALID null `
 -OPTIONALCONDITIONINVALID null `
 -OPTIONALCONDITIONMISSING null `
 -OPTIONALPRODUCTCATEGORYINVALID null `
 -OPTIONALPRODUCTCATEGORYMISSING null `
 -PRODUCTCATEGORYDEPTHWARNING null `
 -PRODUCTTYPELENGTHTOOLONG null `
 -SALESPRICEINVALID null `
 -SALESPRICETOOLOW null `
 -SALESPRICETOOHIGH null `
 -SALEDATEINVALID null `
 -SHIPPINGINVALID null `
 -SHIPPINGHEIGHTINVALID null `
 -SHIPPINGWEIGHTINVALID null `
 -SHIPPINGWIDTHINVALID null `
 -SIZETYPEINVALID null `
 -TAXINVALID null `
 -TITLELENGTHTOOLONG null `
 -TOOMANYADDITIONALIMAGELINKS null `
 -UTMSOURCEAUTOCORRECTED null `
 -WEIGHTUNITINVALID null
```

- Convert the resource to JSON
```powershell
$CatalogsItemValidationWarnings | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

