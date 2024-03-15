
# Table `search_partner_pins_200_response`
(mapped from: SearchPartnerPins200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SummaryPin&gt;**](SummaryPin.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `SearchPartnerPins200ResponseSummaryPin`**
(mapped from: SearchPartnerPins200ResponseSummaryPin)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
searchPartnerPins200Response | searchPartnerPins200Response | long | | kotlin.Long | Primary Key | *one*
summaryPin | summaryPin | long | | kotlin.Long | Foreign Key | *many*




