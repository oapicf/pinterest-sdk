

# DeletePartnerAssetAccessItem

The class is defined in **[DeletePartnerAssetAccessItem.java](../../src/main/java/org/openapitools/model/DeletePartnerAssetAccessItem.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetId** | `String` | Unique identifier of the business asset. | 
**partnerId** | `String` | Unique identifier of a business partner to update asset access to. | 
**partnerType** | [**PartnerTypeEnum**](#PartnerTypeEnum) | If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset. |  [optional property]



## PartnerTypeEnum

Name | Value
---- | -----
INTERNAL | `"INTERNAL"`
EXTERNAL | `"EXTERNAL"`


