
# Table `DeletePartnersRequest`
(mapped from: DeletePartnersRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**partnerIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 
**partnerType** | partner_type | text |  | **kotlin.String** |  |  [optional]


# **Table `DeletePartnersRequestPartnerIds`**
(mapped from: DeletePartnersRequestPartnerIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deletePartnersRequest | deletePartnersRequest | long | | kotlin.Long | Primary Key | *one*
partnerIds | partnerIds | text | | kotlin.String | Foreign Key | *many*




