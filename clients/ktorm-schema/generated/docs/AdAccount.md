
# Table `AdAccount`
(mapped from: AdAccount)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**country** | country | long |  | [**Country**](Country.md) |  |  [optional] [foreignkey]
**createdTime** | created_time | int |  | **kotlin.Int** |  Creation time. Unix timestamp in seconds. |  [optional] [readonly]
**currency** | currency | long |  | [**Currency**](Currency.md) |  |  [optional] [foreignkey]
**name** | name | text |  | **kotlin.String** | Ad account name. |  [optional]
**owner** | owner | long |  | [**AdAccountOwner**](AdAccountOwner.md) | Ad account owner |  [optional] [readonly] [foreignkey]
**permissions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BusinessAccessRole&gt;**](BusinessAccessRole.md) |  |  [optional] [readonly]
**updatedTime** | updated_time | int |  | **kotlin.Int** |  |  [optional] [readonly]








# **Table `AdAccountBusinessAccessRole`**
(mapped from: AdAccountBusinessAccessRole)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adAccount | adAccount | long | | kotlin.Long | Primary Key | *one*
businessAccessRole | businessAccessRole | long | | kotlin.Long | Foreign Key | *many*




