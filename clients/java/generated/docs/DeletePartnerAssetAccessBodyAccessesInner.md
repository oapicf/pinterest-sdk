

# DeletePartnerAssetAccessBodyAccessesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**partnerId** | **String** | Unique identifier of a business partner to update asset access to. |  |
|**assetId** | **String** | Unique identifier of the business asset. |  |
|**partnerType** | [**PartnerTypeEnum**](#PartnerTypeEnum) | If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset. |  [optional] |



## Enum: PartnerTypeEnum

| Name | Value |
|---- | -----|
| INTERNAL | &quot;INTERNAL&quot; |
| EXTERNAL | &quot;EXTERNAL&quot; |



