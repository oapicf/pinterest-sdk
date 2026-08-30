
# Table `AdAccountToBusinessSharedAudience`
(mapped from: AdAccountToBusinessSharedAudience)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**audienceId** | audience_id | text NOT NULL |  | **kotlin.String** | Unique identifier of an audience | 
**recipientBusinessIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Business IDs to share with or revoke from (request) / that received the audience (response). | 
**permissions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Role&gt;**](Role.md) | Permissions granted to the recipients. |  [optional] [readonly]



# **Table `AdAccountToBusinessSharedAudienceRecipientBusinessIds`**
(mapped from: AdAccountToBusinessSharedAudienceRecipientBusinessIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adAccountToBusinessSharedAudience | adAccountToBusinessSharedAudience | long | | kotlin.Long | Primary Key | *one*
recipientBusinessIds | recipientBusinessIds | text | | kotlin.String | Foreign Key | *many*



# **Table `AdAccountToBusinessSharedAudienceRole`**
(mapped from: AdAccountToBusinessSharedAudienceRole)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adAccountToBusinessSharedAudience | adAccountToBusinessSharedAudience | long | | kotlin.Long | Primary Key | *one*
role | role | long | | kotlin.Long | Foreign Key | *many*



