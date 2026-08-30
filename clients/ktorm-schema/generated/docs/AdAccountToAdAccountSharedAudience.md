
# Table `AdAccountToAdAccountSharedAudience`
(mapped from: AdAccountToAdAccountSharedAudience)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**audienceId** | audience_id | text NOT NULL |  | **kotlin.String** | Unique identifier of an audience | 
**recipientAccountIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Ad account IDs to share with or revoke from (request) / that received the audience (response). | 
**permissions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Role&gt;**](Role.md) | Permissions granted to the recipients. |  [optional] [readonly]



# **Table `AdAccountToAdAccountSharedAudienceRecipientAccountIds`**
(mapped from: AdAccountToAdAccountSharedAudienceRecipientAccountIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adAccountToAdAccountSharedAudience | adAccountToAdAccountSharedAudience | long | | kotlin.Long | Primary Key | *one*
recipientAccountIds | recipientAccountIds | text | | kotlin.String | Foreign Key | *many*



# **Table `AdAccountToAdAccountSharedAudienceRole`**
(mapped from: AdAccountToAdAccountSharedAudienceRole)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adAccountToAdAccountSharedAudience | adAccountToAdAccountSharedAudience | long | | kotlin.Long | Primary Key | *one*
role | role | long | | kotlin.Long | Foreign Key | *many*



