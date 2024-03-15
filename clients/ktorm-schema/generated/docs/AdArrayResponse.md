
# Table `AdArrayResponse`
(mapped from: AdArrayResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdArrayResponseElement&gt;**](AdArrayResponseElement.md) |  |  [optional]


# **Table `AdArrayResponseAdArrayResponseElement`**
(mapped from: AdArrayResponseAdArrayResponseElement)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adArrayResponse | adArrayResponse | long | | kotlin.Long | Primary Key | *one*
adArrayResponseElement | adArrayResponseElement | long | | kotlin.Long | Foreign Key | *many*



