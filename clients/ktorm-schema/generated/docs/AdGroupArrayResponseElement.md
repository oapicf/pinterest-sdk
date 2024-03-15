
# Table `AdGroupArrayResponseElement`
(mapped from: AdGroupArrayResponseElement)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | data | long |  | [**AdGroupResponse**](AdGroupResponse.md) |  |  [optional] [foreignkey]
**exceptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Exception&gt;**](Exception.md) |  |  [optional]



# **Table `AdGroupArrayResponseElementException`**
(mapped from: AdGroupArrayResponseElementException)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupArrayResponseElement | adGroupArrayResponseElement | long | | kotlin.Long | Primary Key | *one*
exception | exception | long | | kotlin.Long | Foreign Key | *many*



