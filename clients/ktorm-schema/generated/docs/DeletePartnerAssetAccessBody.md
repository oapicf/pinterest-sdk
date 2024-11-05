
# Table `DeletePartnerAssetAccessBody`
(mapped from: DeletePartnerAssetAccessBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**accesses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;DeletePartnerAssetAccessBodyAccessesInner&gt;**](DeletePartnerAssetAccessBodyAccessesInner.md) |  | 


# **Table `DeletePartnerAssetAccessBodyDeletePartnerAssetAccessBodyAccessesInner`**
(mapped from: DeletePartnerAssetAccessBodyDeletePartnerAssetAccessBodyAccessesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deletePartnerAssetAccessBody | deletePartnerAssetAccessBody | long | | kotlin.Long | Primary Key | *one*
deletePartnerAssetAccessBodyAccessesInner | deletePartnerAssetAccessBodyAccessesInner | long | | kotlin.Long | Foreign Key | *many*



