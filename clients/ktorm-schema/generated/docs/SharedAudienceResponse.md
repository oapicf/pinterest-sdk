
# Table `SharedAudienceResponse`
(mapped from: SharedAudienceResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**audienceId** | audience_id | text |  | **kotlin.String** | Audience ID that was shared |  [optional]
**permissions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Role&gt;**](Role.md) |  |  [optional]
**recipientAccountIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Account IDs that received the audience |  [optional]



# **Table `SharedAudienceResponseRole`**
(mapped from: SharedAudienceResponseRole)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
sharedAudienceResponse | sharedAudienceResponse | long | | kotlin.Long | Primary Key | *one*
role | role | long | | kotlin.Long | Foreign Key | *many*



# **Table `SharedAudienceResponseRecipientAccountIds`**
(mapped from: SharedAudienceResponseRecipientAccountIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
sharedAudienceResponse | sharedAudienceResponse | long | | kotlin.Long | Primary Key | *one*
recipientAccountIds | recipientAccountIds | text | | kotlin.String | Foreign Key | *many*



