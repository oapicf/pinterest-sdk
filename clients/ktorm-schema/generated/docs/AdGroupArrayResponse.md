
# Table `AdGroupArrayResponse`
(mapped from: AdGroupArrayResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroupArrayResponseElement&gt;**](AdGroupArrayResponseElement.md) |  |  [optional]


# **Table `AdGroupArrayResponseAdGroupArrayResponseElement`**
(mapped from: AdGroupArrayResponseAdGroupArrayResponseElement)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupArrayResponse | adGroupArrayResponse | long | | kotlin.Long | Primary Key | *one*
adGroupArrayResponseElement | adGroupArrayResponseElement | long | | kotlin.Long | Foreign Key | *many*



