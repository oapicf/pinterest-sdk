
# Table `BusinessSharedAudienceResponse`
(mapped from: BusinessSharedAudienceResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**audienceId** | audience_id | text |  | **kotlin.String** | Audience ID that was shared |  [optional]
**permissions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Role&gt;**](Role.md) |  |  [optional]
**recipientBusinessIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Business IDs that received the audience |  [optional]



# **Table `BusinessSharedAudienceResponseRole`**
(mapped from: BusinessSharedAudienceResponseRole)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessSharedAudienceResponse | businessSharedAudienceResponse | long | | kotlin.Long | Primary Key | *one*
role | role | long | | kotlin.Long | Foreign Key | *many*



# **Table `BusinessSharedAudienceResponseRecipientBusinessIds`**
(mapped from: BusinessSharedAudienceResponseRecipientBusinessIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessSharedAudienceResponse | businessSharedAudienceResponse | long | | kotlin.Long | Primary Key | *one*
recipientBusinessIds | recipientBusinessIds | text | | kotlin.String | Foreign Key | *many*



