
# Table `UpdatePartnerAssetAccessBody`
(mapped from: UpdatePartnerAssetAccessBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**accesses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdatePartnerAssetAccessItem&gt;**](UpdatePartnerAssetAccessItem.md) | List of partner asset accesses to assign or update. | 


# **Table `UpdatePartnerAssetAccessBodyUpdatePartnerAssetAccessItem`**
(mapped from: UpdatePartnerAssetAccessBodyUpdatePartnerAssetAccessItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updatePartnerAssetAccessBody | updatePartnerAssetAccessBody | long | | kotlin.Long | Primary Key | *one*
updatePartnerAssetAccessItem | updatePartnerAssetAccessItem | long | | kotlin.Long | Foreign Key | *many*



