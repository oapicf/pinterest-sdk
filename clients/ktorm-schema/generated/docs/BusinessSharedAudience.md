
# Table `BusinessSharedAudience`
(mapped from: BusinessSharedAudience)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**audienceId** | audience_id | text NOT NULL |  | **kotlin.String** | Unique identifier of an audience | 
**operationType** | operation_type | long NOT NULL |  | [**OperationType**](OperationType.md) |  |  [foreignkey]
**recipientBusinessIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of business IDs to share with or revoke from. | 




# **Table `BusinessSharedAudienceRecipientBusinessIds`**
(mapped from: BusinessSharedAudienceRecipientBusinessIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessSharedAudience | businessSharedAudience | long | | kotlin.Long | Primary Key | *one*
recipientBusinessIds | recipientBusinessIds | text | | kotlin.String | Foreign Key | *many*



