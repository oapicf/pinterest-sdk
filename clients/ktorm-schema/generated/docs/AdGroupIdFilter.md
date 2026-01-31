
# Table `AdGroupIdFilter`
(mapped from: AdGroupIdFilter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adGroupIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of ad group ids |  [optional]


# **Table `AdGroupIdFilterAdGroupIds`**
(mapped from: AdGroupIdFilterAdGroupIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroupIdFilter | adGroupIdFilter | long | | kotlin.Long | Primary Key | *one*
adGroupIds | adGroupIds | text | | kotlin.String | Foreign Key | *many*



