
# Table `CreateAssetAccessRequestBody_asset_requests_inner`
(mapped from: CreateAssetAccessRequestBodyAssetRequestsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**partnerId** | partner_id | text NOT NULL |  | **kotlin.String** | Unique identifier of a business partner to request asset access to. | 
**assetIdToPermissions** | asset_id_to_permissions | blob NOT NULL |  | **kotlin.collections.Map&lt;kotlin.String, kotlin.Array&lt;Permissions&gt;&gt;** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | 




