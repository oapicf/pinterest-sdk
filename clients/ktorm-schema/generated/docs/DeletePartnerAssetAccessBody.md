
# Table `DeletePartnerAssetAccessBody`
(mapped from: DeletePartnerAssetAccessBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**accesses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;DeletePartnerAssetAccessItem&gt;**](DeletePartnerAssetAccessItem.md) | List of partner asset accesses to delete. | 


# **Table `DeletePartnerAssetAccessBodyDeletePartnerAssetAccessItem`**
(mapped from: DeletePartnerAssetAccessBodyDeletePartnerAssetAccessItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deletePartnerAssetAccessBody | deletePartnerAssetAccessBody | long | | kotlin.Long | Primary Key | *one*
deletePartnerAssetAccessItem | deletePartnerAssetAccessItem | long | | kotlin.Long | Foreign Key | *many*



