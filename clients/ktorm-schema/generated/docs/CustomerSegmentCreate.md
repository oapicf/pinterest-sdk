
# Table `CustomerSegmentCreate`
(mapped from: CustomerSegmentCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**audienceIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Audience IDs included in the customer segment. | 
**name** | name | text NOT NULL |  | **kotlin.String** | Customer segment name. | 


# **Table `CustomerSegmentCreateAudienceIds`**
(mapped from: CustomerSegmentCreateAudienceIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
customerSegmentCreate | customerSegmentCreate | long | | kotlin.Long | Primary Key | *one*
audienceIds | audienceIds | text | | kotlin.String | Foreign Key | *many*




