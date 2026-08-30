
# Table `CustomerSegmentUpdateRequestUpdateWithRequiredBody`
(mapped from: CustomerSegmentUpdateRequestUpdateWithRequiredBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Customer segment ID. | 
**operationType** | operation_type | long NOT NULL |  | [**AudienceUpdateOperationType**](AudienceUpdateOperationType.md) |  |  [foreignkey]
**audienceIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Audience IDs to update the customer segment to. Only applicable for UPDATE operations. |  [optional]




# **Table `CustomerSegmentUpdateRequestUpdateWithRequiredBodyAudienceIds`**
(mapped from: CustomerSegmentUpdateRequestUpdateWithRequiredBodyAudienceIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
customerSegmentUpdateRequestUpdateWithRequiredBody | customerSegmentUpdateRequestUpdateWithRequiredBody | long | | kotlin.Long | Primary Key | *one*
audienceIds | audienceIds | text | | kotlin.String | Foreign Key | *many*



