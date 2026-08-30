
# Table `BusinessToBusinessSharedAudienceUpdateWithRequiredBody`
(mapped from: BusinessToBusinessSharedAudienceUpdateWithRequiredBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**audienceId** | audience_id | text NOT NULL |  | **kotlin.String** | Unique identifier of an audience | 
**operationType** | operation_type | long NOT NULL |  | [**OperationType**](OperationType.md) |  |  [foreignkey]
**recipientBusinessIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Business IDs to share with or revoke from (request) / that received the audience (response). | 




# **Table `BusinessToBusinessSharedAudienceUpdateWithRequiredBodyRecipientBusinessIds`**
(mapped from: BusinessToBusinessSharedAudienceUpdateWithRequiredBodyRecipientBusinessIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessToBusinessSharedAudienceUpdateWithRequiredBody | businessToBusinessSharedAudienceUpdateWithRequiredBody | long | | kotlin.Long | Primary Key | *one*
recipientBusinessIds | recipientBusinessIds | text | | kotlin.String | Foreign Key | *many*



