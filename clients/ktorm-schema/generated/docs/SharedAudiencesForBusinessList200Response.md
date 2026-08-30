
# Table `shared_audiences_for_business_list_200_response`
(mapped from: SharedAudiencesForBusinessList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Audience&gt;**](Audience.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `SharedAudiencesForBusinessList200ResponseAudience`**
(mapped from: SharedAudiencesForBusinessList200ResponseAudience)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
sharedAudiencesForBusinessList200Response | sharedAudiencesForBusinessList200Response | long | | kotlin.Long | Primary Key | *one*
audience | audience | long | | kotlin.Long | Foreign Key | *many*




