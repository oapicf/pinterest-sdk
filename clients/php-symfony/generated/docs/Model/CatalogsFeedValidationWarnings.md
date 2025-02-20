# CatalogsFeedValidationWarnings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aDLINKFORMATWARNING** | **int** | Some items have ad links that are formatted incorrectly. | [optional] 
**aDLINKSAMEASLINK** | **int** | Some items have ad link URLs that are duplicates of the link URLs for those items. | [optional] 
**tITLELENGTHTOOLONG** | **int** | The title for some items were truncated because they contain too many characters. | [optional] 
**dESCRIPTIONLENGTHTOOLONG** | **int** | The description for some items were truncated because they contain too many characters. | [optional] 
**gENDERINVALID** | **int** | Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**aGEGROUPINVALID** | **int** | Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**sIZETYPEINVALID** | **int** | Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**sIZESYSTEMINVALID** | **int** | Some items have size system values which are not one of the supported size systems. | [optional] 
**lINKFORMATWARNING** | **int** | Some items have an invalid product link which contains invalid UTM tracking paramaters. | [optional] 
**sALESPRICEINVALID** | **int** | Some items have sale price values that are higher than the original price of the item. | [optional] 
**pRODUCTCATEGORYDEPTHWARNING** | **int** | Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**aDWORDSFORMATWARNING** | **int** | Some items have adwords_redirect links that are formatted incorrectly. | [optional] 
**aDWORDSSAMEASLINK** | **int** | Some items have adwords_redirect URLs that are duplicates of the link URLs for those items. | [optional] 
**dUPLICATEHEADERS** | **int** | Your feed contains duplicate headers. | [optional] 
**fETCHSAMESIGNATURE** | **int** | Ingestion completed early because there are no changes to your feed since the last successful update. | [optional] 
**aDDITIONALIMAGELINKLENGTHTOOLONG** | **int** | Some items have additional_image_link URLs that contain too many characters, so those items will not be published. | [optional] 
**aDDITIONALIMAGELINKWARNING** | **int** | Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items. | [optional] 
**iMAGELINKWARNING** | **int** | Some items have image_link URLs that are formatted incorrectly and will not be published with those items. | [optional] 
**sHIPPINGINVALID** | **int** | Some items have shipping values that are formatted incorrectly. | [optional] 
**tAXINVALID** | **int** | Some items have tax values that are formatted incorrectly. | [optional] 
**sHIPPINGWEIGHTINVALID** | **int** | Some items have invalid shipping_weight values. | [optional] 
**eXPIRATIONDATEINVALID** | **int** | Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date. | [optional] 
**aVAILABILITYDATEINVALID** | **int** | Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date. | [optional] 
**sALEDATEINVALID** | **int** | Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date. | [optional] 
**wEIGHTUNITINVALID** | **int** | Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit. | [optional] 
**iSBUNDLEINVALID** | **int** | Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products. | [optional] 
**uPDATEDTIMEINVALID** | **int** | Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time. | [optional] 
**cUSTOMLABELLENGTHTOOLONG** | **int** | Some items have custom_label values that are too long, those items will be published without that custom label. | [optional] 
**pRODUCTTYPELENGTHTOOLONG** | **int** | Some items have product_type values that are too long, those items will be published without that product type. | [optional] 
**tOOMANYADDITIONALIMAGELINKS** | **int** | Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images. | [optional] 
**mULTIPACKINVALID** | **int** | Some items have invalid multipack values. | [optional] 
**iNDEXEDPRODUCTCOUNTLARGEDELTA** | **int** | The product count has increased or decreased significantly compared to the last successful ingestion. | [optional] 
**iTEMADDITIONALIMAGEDOWNLOADFAILURE** | **int** | Some items include additional_image_links that can&#39;t be found. | [optional] 
**oPTIONALPRODUCTCATEGORYMISSING** | **int** | Some items are missing a google_product_category. | [optional] 
**oPTIONALPRODUCTCATEGORYINVALID** | **int** | Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy. | [optional] 
**oPTIONALCONDITIONMISSING** | **int** | Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**oPTIONALCONDITIONINVALID** | **int** | Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences. | [optional] 
**iOSDEEPLINKINVALID** | **int** | Some items include invalid ios_deep_link values. | [optional] 
**aNDROIDDEEPLINKINVALID** | **int** | Some items include invalid android_deep_link. | [optional] 
**uTMSOURCEAUTOCORRECTED** | **int** | Some items include utm_source values that are formatted incorrectly and have been automatically corrected. | [optional] 
**cOUNTRYDOESNOTMAPTOCURRENCY** | **int** | Some items include a currency that doesn&#39;t match the usual currency for the location where that product is sold or shipped. | [optional] 
**mINADPRICEINVALID** | **int** | Some items include min_ad_price values that are formatted incorrectly. | [optional] 
**gTININVALID** | **int** | Some items include incorrectly formatted GTINs. | [optional] 
**iNCONSISTENTCURRENCYVALUES** | **int** | Some items include inconsistent currencies in price fields. | [optional] 
**sALESPRICETOOLOW** | **int** | Some items include sales price that is much lower than the list price. | [optional] 
**sHIPPINGWIDTHINVALID** | **int** | Some items include incorrectly formatted shipping_width. | [optional] 
**sHIPPINGHEIGHTINVALID** | **int** | Some items include incorrectly formatted shipping_height. | [optional] 
**sALESPRICETOOHIGH** | **int** | Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price. | [optional] 
**mPNINVALID** | **int** | Some items include incorrectly formatted MPNs. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


