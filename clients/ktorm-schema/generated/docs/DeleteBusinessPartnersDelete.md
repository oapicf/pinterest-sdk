
# Table `DeleteBusinessPartnersDelete`
(mapped from: DeleteBusinessPartnersDelete)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**partnerIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of partner ids to be deleted | 
**partnerType** | partner_type | long |  | [**NullablePartnerType**](NullablePartnerType.md) |  |  [optional] [foreignkey]


# **Table `DeleteBusinessPartnersDeletePartnerIds`**
(mapped from: DeleteBusinessPartnersDeletePartnerIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteBusinessPartnersDelete | deleteBusinessPartnersDelete | long | | kotlin.Long | Primary Key | *one*
partnerIds | partnerIds | text | | kotlin.String | Foreign Key | *many*




