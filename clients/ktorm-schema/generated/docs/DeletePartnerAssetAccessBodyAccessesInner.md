
# Table `DeletePartnerAssetAccessBody_accesses_inner`
(mapped from: DeletePartnerAssetAccessBodyAccessesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**partnerId** | partner_id | text NOT NULL |  | **kotlin.String** | Unique identifier of a business partner to update asset access to. | 
**assetId** | asset_id | text NOT NULL |  | **kotlin.String** | Unique identifier of the business asset. | 
**partnerType** | partner_type | text |  | [**partner_type**](#PartnerType) | If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset. |  [optional]





