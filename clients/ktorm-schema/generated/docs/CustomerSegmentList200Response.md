
# Table `customer_segment_list_200_response`
(mapped from: CustomerSegmentList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CustomerSegment&gt;**](CustomerSegment.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `CustomerSegmentList200ResponseCustomerSegment`**
(mapped from: CustomerSegmentList200ResponseCustomerSegment)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
customerSegmentList200Response | customerSegmentList200Response | long | | kotlin.Long | Primary Key | *one*
customerSegment | customerSegment | long | | kotlin.Long | Foreign Key | *many*




