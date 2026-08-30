# CatalogsItemValidationErrors

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aDULTINVALID** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has an invalid adult value. | [optional] 
**aDWORDSFORMATINVALID** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Adword link contains too many characters. | [optional] 
**aVAILABILITYINVALID** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing availability value in its product metadata, this item will not be published. | [optional] 
**bLOCKLISTEDIMAGESIGNATURE** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**dESCRIPTIONMISSING** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing description in its product metadata, this item will not be published. | [optional] 
**dUPLICATEPRODUCTS** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | This product is duplicated. The duplicate entry will not be published. | [optional] 
**iMAGELINKINVALID** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Image link is invalid. | [optional] 
**iMAGELINKLENGTHTOOLONG** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has image_link URL that contains too many characters, so the item will not be published. | [optional] 
**iMAGELINKMISSING** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing an image link URL in its product metadata, this item will not be published. | [optional] 
**iNVALIDDOMAIN** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product link value doesn&#39;t match the verified domain associated with this account. | [optional] 
**iTEMMAINIMAGEDOWNLOADFAILURE** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Main image can&#39;t be found. | [optional] 
**iTEMIDMISSING** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing item id in its product metadata, this item will not be published. | [optional] 
**lINKFORMATINVALID** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Link is invalid. | [optional] 
**lINKLENGTHTOOLONG** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product link contains too many characters, this item will not be published. | [optional] 
**lISTPRICEINVALID** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has a list price formatting error, this item will not be published. | [optional] 
**mAXITEMSPERITEMGROUPEXCEEDED** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item exceed the maximum number of items per item group, this item will not be published. | [optional] 
**pARSELINEERROR** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item contains formating errors. | [optional] 
**pINJOINCONTENTUNSAFE** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item will not be published because it doesn&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**pRICECANNOTBEDETERMINED** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item price cannot be determined because the price, list price, and sale price are all different. | [optional] 
**pRICEMISSING** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Product is missing a price, this item will not be published. | [optional] 
**pRODUCTLINKMISSING** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing a link URL in its product metadata, this item will not be published. | [optional] 
**pRODUCTPRICEINVALID** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item has a price formatting error in its product metadata, this item will not be published. | [optional] 
**tITLEMISSING** | [**OpenAPI\Server\Model\CatalogsItemValidationDetails**](CatalogsItemValidationDetails.md) | Item is missing title in its product metadata, this item will not be published. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


