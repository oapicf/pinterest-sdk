
# Table `UpdatePartnerAssetAccessBody`
(mapped from: UpdatePartnerAssetAccessBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**accesses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdatePartnerAssetAccessBodyAccessesInner&gt;**](UpdatePartnerAssetAccessBodyAccessesInner.md) |  | 


# **Table `UpdatePartnerAssetAccessBodyUpdatePartnerAssetAccessBodyAccessesInner`**
(mapped from: UpdatePartnerAssetAccessBodyUpdatePartnerAssetAccessBodyAccessesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updatePartnerAssetAccessBody | updatePartnerAssetAccessBody | long | | kotlin.Long | Primary Key | *one*
updatePartnerAssetAccessBodyAccessesInner | updatePartnerAssetAccessBodyAccessesInner | long | | kotlin.Long | Foreign Key | *many*



