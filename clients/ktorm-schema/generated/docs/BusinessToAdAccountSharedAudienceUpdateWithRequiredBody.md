
# Table `BusinessToAdAccountSharedAudienceUpdateWithRequiredBody`
(mapped from: BusinessToAdAccountSharedAudienceUpdateWithRequiredBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**audienceId** | audience_id | text NOT NULL |  | **kotlin.String** | Unique identifier of an audience | 
**operationType** | operation_type | long NOT NULL |  | [**OperationType**](OperationType.md) |  |  [foreignkey]
**recipientAccountIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Ad account IDs to share with or revoke from (request) / that received the audience (response). | 




# **Table `BusinessToAdAccountSharedAudienceUpdateWithRequiredBodyRecipientAccountIds`**
(mapped from: BusinessToAdAccountSharedAudienceUpdateWithRequiredBodyRecipientAccountIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessToAdAccountSharedAudienceUpdateWithRequiredBody | businessToAdAccountSharedAudienceUpdateWithRequiredBody | long | | kotlin.Long | Primary Key | *one*
recipientAccountIds | recipientAccountIds | text | | kotlin.String | Foreign Key | *many*



