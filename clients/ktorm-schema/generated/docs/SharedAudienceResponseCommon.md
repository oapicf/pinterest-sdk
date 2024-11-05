
# Table `SharedAudienceResponseCommon`
(mapped from: SharedAudienceResponseCommon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**audienceId** | audience_id | text |  | **kotlin.String** | Audience ID that was shared |  [optional]
**permissions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Role&gt;**](Role.md) |  |  [optional]



# **Table `SharedAudienceResponseCommonRole`**
(mapped from: SharedAudienceResponseCommonRole)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
sharedAudienceResponseCommon | sharedAudienceResponseCommon | long | | kotlin.Long | Primary Key | *one*
role | role | long | | kotlin.Long | Foreign Key | *many*



