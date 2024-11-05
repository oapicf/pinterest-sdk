
# Table `CreateAssetInvitesRequest`
(mapped from: CreateAssetInvitesRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**invites** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateAssetInvitesRequestItem&gt;**](CreateAssetInvitesRequestItem.md) |  | 


# **Table `CreateAssetInvitesRequestCreateAssetInvitesRequestItem`**
(mapped from: CreateAssetInvitesRequestCreateAssetInvitesRequestItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createAssetInvitesRequest | createAssetInvitesRequest | long | | kotlin.Long | Primary Key | *one*
createAssetInvitesRequestItem | createAssetInvitesRequestItem | long | | kotlin.Long | Foreign Key | *many*



