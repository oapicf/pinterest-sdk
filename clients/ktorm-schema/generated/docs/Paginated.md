
# Table `Paginated`
(mapped from: Paginated)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;kotlin.Any&gt;**](kotlin.Any.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `PaginatedItems`**
(mapped from: PaginatedItems)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
paginated | paginated | long | | kotlin.Long | Primary Key | *one*
items | items | blob | | kotlin.Any | Foreign Key | *many*




