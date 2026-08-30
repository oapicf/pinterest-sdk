
# Table `DeleteBusinessPartners`
(mapped from: DeleteBusinessPartners)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**deletedPartners** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional] [readonly]


# **Table `DeleteBusinessPartnersDeletedPartners`**
(mapped from: DeleteBusinessPartnersDeletedPartners)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteBusinessPartners | deleteBusinessPartners | long | | kotlin.Long | Primary Key | *one*
deletedPartners | deletedPartners | text | | kotlin.String | Foreign Key | *many*



