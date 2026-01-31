
# Table `CreateAssetGroupBody`
(mapped from: CreateAssetGroupBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetGroupDescription** | asset_group_description | text NOT NULL |  | **kotlin.String** | Asset group description | 
**assetGroupName** | asset_group_name | text NOT NULL |  | **kotlin.String** | Asset Group name | 
**assetGroupTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetGroupType&gt;**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | 




# **Table `CreateAssetGroupBodyAssetGroupType`**
(mapped from: CreateAssetGroupBodyAssetGroupType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createAssetGroupBody | createAssetGroupBody | long | | kotlin.Long | Primary Key | *one*
assetGroupType | assetGroupType | long | | kotlin.Long | Foreign Key | *many*



