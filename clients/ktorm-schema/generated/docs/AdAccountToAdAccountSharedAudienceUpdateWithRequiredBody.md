
# Table `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody`
(mapped from: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**audienceId** | audience_id | text NOT NULL |  | **kotlin.String** | Unique identifier of an audience | 
**operationType** | operation_type | long NOT NULL |  | [**OperationType**](OperationType.md) |  |  [foreignkey]
**recipientAccountIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Ad account IDs to share with or revoke from (request) / that received the audience (response). | 




# **Table `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyRecipientAccountIds`**
(mapped from: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyRecipientAccountIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adAccountToAdAccountSharedAudienceUpdateWithRequiredBody | adAccountToAdAccountSharedAudienceUpdateWithRequiredBody | long | | kotlin.Long | Primary Key | *one*
recipientAccountIds | recipientAccountIds | text | | kotlin.String | Foreign Key | *many*



