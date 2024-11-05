
# Table `AssetGroupBinding`
(mapped from: AssetGroupBinding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Asset Group ID. |  [optional]
**assetGroupName** | asset_group_name | text |  | **kotlin.String** | Asset Group name |  [optional]
**assetGroupDescription** | asset_group_description | text |  | **kotlin.String** | Asset group description |  [optional]
**assetGroupTypes** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Asset group types |  [optional]
**adAccountsIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of ad account IDs under the asset group |  [optional]
**profilesIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of profile IDs under asset group |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** | The creation time of the asset group |  [optional]
**updatedTime** | updated_time | int |  | **kotlin.Int** | The last update time of the asset group |  [optional]
**owner** | owner | long |  | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the business that owns the asset group. |  [optional] [foreignkey]
**createdBy** | created_by | long |  | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the user that created the asset group. |  [optional] [foreignkey]





# **Table `AssetGroupBindingAssetGroupTypes`**
(mapped from: AssetGroupBindingAssetGroupTypes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupBinding | assetGroupBinding | long | | kotlin.Long | Primary Key | *one*
assetGroupTypes | assetGroupTypes | text | | kotlin.String | Foreign Key | *many*



# **Table `AssetGroupBindingAdAccountsIds`**
(mapped from: AssetGroupBindingAdAccountsIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupBinding | assetGroupBinding | long | | kotlin.Long | Primary Key | *one*
adAccountsIds | adAccountsIds | text | | kotlin.String | Foreign Key | *many*



# **Table `AssetGroupBindingProfilesIds`**
(mapped from: AssetGroupBindingProfilesIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupBinding | assetGroupBinding | long | | kotlin.Long | Primary Key | *one*
profilesIds | profilesIds | text | | kotlin.String | Foreign Key | *many*







