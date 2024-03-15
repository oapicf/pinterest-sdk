
# Table `AdAccount`
(mapped from: AdAccount)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** |  |  [optional]
**name** | name | text |  | **kotlin.String** |  |  [optional]
**owner** | owner | long |  | [**AdAccountOwner**](AdAccountOwner.md) |  |  [optional] [foreignkey]
**country** | country | long |  | [**Country**](Country.md) |  |  [optional] [foreignkey]
**currency** | currency | long |  | [**Currency**](Currency.md) |  |  [optional] [foreignkey]
**permissions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BusinessAccessRole&gt;**](BusinessAccessRole.md) |  |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** | Creation time. Unix timestamp in seconds. |  [optional]
**updatedTime** | updated_time | int |  | **kotlin.Int** | Last update time. Unix timestamp in seconds. |  [optional]







# **Table `AdAccountBusinessAccessRole`**
(mapped from: AdAccountBusinessAccessRole)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adAccount | adAccount | long | | kotlin.Long | Primary Key | *one*
businessAccessRole | businessAccessRole | long | | kotlin.Long | Foreign Key | *many*





