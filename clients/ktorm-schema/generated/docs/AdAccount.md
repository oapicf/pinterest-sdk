
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







