# openapi::DeletePartnerAssetAccessBodyAccessesInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**partner_id** | **character** | Unique identifier of a business partner to update asset access to. | [Pattern: ^\\d+$] [Max. length: 25] 
**asset_id** | **character** | Unique identifier of the business asset. | [Pattern: ^\\d+$] [Max. length: 25] 
**partner_type** | **character** | If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset. | [optional] [default to &quot;INTERNAL&quot;] [Enum: [INTERNAL, EXTERNAL]] 


