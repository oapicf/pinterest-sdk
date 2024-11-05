
# Table `DeletePartnersResponse`
(mapped from: DeletePartnersResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**deletedPartners** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of partners whose business partnership have been terminated. |  [optional]


# **Table `DeletePartnersResponseDeletedPartners`**
(mapped from: DeletePartnersResponseDeletedPartners)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deletePartnersResponse | deletePartnersResponse | long | | kotlin.Long | Primary Key | *one*
deletedPartners | deletedPartners | text | | kotlin.String | Foreign Key | *many*



