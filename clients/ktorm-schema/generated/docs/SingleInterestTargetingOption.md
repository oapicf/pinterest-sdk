
# Table `SingleInterestTargetingOption`
(mapped from: SingleInterestTargetingOption)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**childInterests** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**level** | level | int NOT NULL |  | **kotlin.Int** |  | 
**name** | name | text NOT NULL |  | **kotlin.String** |  | 


# **Table `SingleInterestTargetingOptionChildInterests`**
(mapped from: SingleInterestTargetingOptionChildInterests)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
singleInterestTargetingOption | singleInterestTargetingOption | long | | kotlin.Long | Primary Key | *one*
childInterests | childInterests | text | | kotlin.String | Foreign Key | *many*






