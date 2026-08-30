
# Table `AssetGroupBinding`
(mapped from: AssetGroupBinding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountsIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of ad account IDs under the asset group | 
**assetGroupDescription** | asset_group_description | text NOT NULL |  | **kotlin.String** | Asset group description | 
**assetGroupName** | asset_group_name | text NOT NULL |  | **kotlin.String** | Asset Group name | 
**assetGroupTypes** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Asset group types | 
**catalogsIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of catalog IDs under asset group | 
**createdBy** | created_by | long NOT NULL |  | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the user that created the asset group. |  [foreignkey]
**createdTime** | created_time | int NOT NULL |  | **kotlin.Int** | The creation time of the asset group | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Asset Group ID. | 
**owner** | owner | long NOT NULL |  | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the business that owns the asset group. |  [foreignkey]
**profilesIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of profile IDs under asset group | 
**updatedTime** | updated_time | int NOT NULL |  | **kotlin.Int** | The last update time of the asset group | 


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




