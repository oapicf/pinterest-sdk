
# Table `UserSingleAssetBinding`
(mapped from: UserSingleAssetBinding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**permissions** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Permission levels member or partner has on an asset. |  [optional]
**user** | user | long |  | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) |  |  [optional] [foreignkey]


# **Table `UserSingleAssetBindingPermissions`**
(mapped from: UserSingleAssetBindingPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
userSingleAssetBinding | userSingleAssetBinding | long | | kotlin.Long | Primary Key | *one*
permissions | permissions | text | | kotlin.String | Foreign Key | *many*




