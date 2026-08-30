# CatalogsFeedValidationErrors

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aDULTINVALID** | **int** | Some items have invalid adult values. | [optional] 
**aDWORDSFORMATINVALID** | **int** | Some adwords links contain too many characters. | [optional] 
**aVAILABILITYINVALID** | **int** | Some items are missing an availability value in their product metadata, those items will not be published. | [optional] 
**bLOCKLISTEDIMAGESIGNATURE** | **int** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**dELIMITERERROR** | **int** | Your feed includes data with formatting errors. | [optional] 
**dESCRIPTIONMISSING** | **int** | Some items are missing a description in their product metadata, those items will not be published. | [optional] 
**dUPLICATEPRODUCTS** | **int** | Some products are duplicated. | [optional] 
**eNCODINGERROR** | **int** | Your feed includes data with an unsupported encoding format. | [optional] 
**fEEDLENGTHTOOLONG** | **int** | Your feed contains too many items, some items will not be published. | [optional] 
**fEEDTOOSMALL** | **int** | Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required. | [optional] 
**fETCHERROR** | **int** | Pinterest couldn&#39;t download your feed. | [optional] 
**fETCHINACTIVEFEEDERROR** | **int** | Your feed wasn&#39;t ingested because it hasn&#39;t changed in the previous 90 days. | [optional] 
**iMAGELINKINVALID** | **int** | Some image links are formatted incorrectly. | [optional] 
**iMAGELINKLENGTHTOOLONG** | **int** | Some items have image_link URLs that contain too many characters, so those items will not be published. | [optional] 
**iMAGELINKMISSING** | **int** | Some items are missing an image link URL in their product metadata, those items will not be published. | [optional] 
**iNTERNALSERVICEERROR** | **int** | We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. | [optional] 
**iNVALIDDOMAIN** | **int** | Some of your product link values don&#39;t match the verified domain associated with this account. | [optional] 
**iTEMMAINIMAGEDOWNLOADFAILURE** | **int** | Some items&#39; main images can&#39;t be found. | [optional] 
**iTEMIDMISSING** | **int** | Some items are missing an item id in their product metadata, those items will not be published. | [optional] 
**lINKFORMATINVALID** | **int** | Some link values are formatted incorrectly. | [optional] 
**lINKLENGTHTOOLONG** | **int** | Some product links contain too many characters, those items will not be published. | [optional] 
**lISTPRICEINVALID** | **int** | Some items have list price formatting errors in their product metadata, those items will not be published. | [optional] 
**mALFORMEDXML** | **int** | Your feed couldn&#39;t be validated because the xml file is formatted incorrectly. | [optional] 
**mAXITEMSPERITEMGROUPEXCEEDED** | **int** | Some items exceed the maximum number of items per item group, those items will not be published. | [optional] 
**nOVERIFIEDDOMAIN** | **int** | Your merchant domain needs to be claimed. | [optional] 
**pARSELINEERROR** | **int** | Your feed contains formatting errors for some items. | [optional] 
**pINJOINCONTENTUNSAFE** | **int** | Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. | [optional] 
**pRICECANNOTBEDETERMINED** | **int** | Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. | [optional] 
**pRICEMISSING** | **int** | Some products are missing a price, those items will not be published. | [optional] 
**pRODUCTLINKMISSING** | **int** | Some items are missing a link URL in their product metadata, those items will not be published. | [optional] 
**pRODUCTPRICEINVALID** | **int** | Some items have price formatting errors in their product metadata, those items will not be published. | [optional] 
**rEQUIREDCOLUMNSMISSING** | **int** | Your feed is missing some required column headers. | [optional] 
**tITLEMISSING** | **int** | Some items are missing a title in their product metadata, those items will not be published. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


