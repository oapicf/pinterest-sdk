
# Table `audiences_list_200_response`
(mapped from: AudiencesList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Audience&gt;**](Audience.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `AudiencesList200ResponseAudience`**
(mapped from: AudiencesList200ResponseAudience)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
audiencesList200Response | audiencesList200Response | long | | kotlin.Long | Primary Key | *one*
audience | audience | long | | kotlin.Long | Foreign Key | *many*




