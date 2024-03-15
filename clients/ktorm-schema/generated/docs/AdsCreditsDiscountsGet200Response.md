
# Table `ads_credits_discounts_get_200_response`
(mapped from: AdsCreditsDiscountsGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdsCreditDiscountsResponse&gt;**](AdsCreditDiscountsResponse.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `AdsCreditsDiscountsGet200ResponseAdsCreditDiscountsResponse`**
(mapped from: AdsCreditsDiscountsGet200ResponseAdsCreditDiscountsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsCreditsDiscountsGet200Response | adsCreditsDiscountsGet200Response | long | | kotlin.Long | Primary Key | *one*
adsCreditDiscountsResponse | adsCreditDiscountsResponse | long | | kotlin.Long | Foreign Key | *many*




