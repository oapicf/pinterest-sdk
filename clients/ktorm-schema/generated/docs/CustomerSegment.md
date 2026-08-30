
# Table `CustomerSegment`
(mapped from: CustomerSegment)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**audienceIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Audience IDs included in the customer segment. | 
**name** | name | text NOT NULL |  | **kotlin.String** | Customer segment name. | 
**adAccountId** | ad_account_id | text |  | **kotlin.String** | The ID of the ad account that this customer segment belongs to. |  [optional] [readonly]
**createdTime** | created_time | int |  | **kotlin.Int** | Customer segment created time. Unix timestamp in seconds. |  [optional] [readonly]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Customer segment ID. |  [optional] [readonly]
**status** | status | long |  | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicates whether the customer segment is active or deleted. |  [optional] [readonly] [foreignkey]
**updatedTime** | updated_time | int |  | **kotlin.Int** | Customer segment updated time. Unix timestamp in seconds. |  [optional] [readonly]


# **Table `CustomerSegmentAudienceIds`**
(mapped from: CustomerSegmentAudienceIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
customerSegment | customerSegment | long | | kotlin.Long | Primary Key | *one*
audienceIds | audienceIds | text | | kotlin.String | Foreign Key | *many*









