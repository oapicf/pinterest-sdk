
# Table `SharedAudience`
(mapped from: SharedAudience)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**audienceId** | audience_id | text NOT NULL |  | **kotlin.String** | Unique identifier of an audience | 
**operationType** | operation_type | long NOT NULL |  | [**OperationType**](OperationType.md) |  |  [foreignkey]
**recipientAccountIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of ad account IDs to share with or revoke from. | 




# **Table `SharedAudienceRecipientAccountIds`**
(mapped from: SharedAudienceRecipientAccountIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
sharedAudience | sharedAudience | long | | kotlin.Long | Primary Key | *one*
recipientAccountIds | recipientAccountIds | text | | kotlin.String | Foreign Key | *many*



