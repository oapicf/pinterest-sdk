
# Table `AssetGroupBinding`
(mapped from: AssetGroupBinding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountsIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of ad account IDs under the asset group |  [optional]
**assetGroupDescription** | asset_group_description | text |  | **kotlin.String** | Asset group description |  [optional]
**assetGroupName** | asset_group_name | text |  | **kotlin.String** | Asset Group name |  [optional]
**assetGroupTypes** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Asset group types |  [optional]
**catalogsIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of catalog IDs under asset group |  [optional]
**createdBy** | created_by | long |  | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the user that created the asset group. |  [optional] [foreignkey]
**createdTime** | created_time | int |  | **kotlin.Int** | The creation time of the asset group |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Asset Group ID. |  [optional]
**owner** | owner | long |  | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the business that owns the asset group. |  [optional] [foreignkey]
**profilesIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of profile IDs under asset group |  [optional]
**updatedTime** | updated_time | int |  | **kotlin.Int** | The last update time of the asset group |  [optional]


# **Table `AssetGroupBindingAdAccountsIds`**
(mapped from: AssetGroupBindingAdAccountsIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupBinding | assetGroupBinding | long | | kotlin.Long | Primary Key | *one*
adAccountsIds | adAccountsIds | text | | kotlin.String | Foreign Key | *many*





# **Table `AssetGroupBindingAssetGroupTypes`**
(mapped from: AssetGroupBindingAssetGroupTypes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupBinding | assetGroupBinding | long | | kotlin.Long | Primary Key | *one*
assetGroupTypes | assetGroupTypes | text | | kotlin.String | Foreign Key | *many*



# **Table `AssetGroupBindingCatalogsIds`**
(mapped from: AssetGroupBindingCatalogsIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupBinding | assetGroupBinding | long | | kotlin.Long | Primary Key | *one*
catalogsIds | catalogsIds | text | | kotlin.String | Foreign Key | *many*







# **Table `AssetGroupBindingProfilesIds`**
(mapped from: AssetGroupBindingProfilesIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
assetGroupBinding | assetGroupBinding | long | | kotlin.Long | Primary Key | *one*
profilesIds | profilesIds | text | | kotlin.String | Foreign Key | *many*




