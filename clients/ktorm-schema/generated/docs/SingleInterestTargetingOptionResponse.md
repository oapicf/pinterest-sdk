
# Table `SingleInterestTargetingOptionResponse`
(mapped from: SingleInterestTargetingOptionResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** |  |  [optional]
**name** | name | text |  | **kotlin.String** |  |  [optional]
**childInterests** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]
**level** | level | int |  | **kotlin.Int** |  |  [optional]




# **Table `SingleInterestTargetingOptionResponseChildInterests`**
(mapped from: SingleInterestTargetingOptionResponseChildInterests)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
singleInterestTargetingOptionResponse | singleInterestTargetingOptionResponse | long | | kotlin.Long | Primary Key | *one*
childInterests | childInterests | text | | kotlin.String | Foreign Key | *many*




