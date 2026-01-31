
# Table `promotions_list_200_response`
(mapped from: PromotionsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PromotionResponse&gt;**](PromotionResponse.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `PromotionsList200ResponsePromotionResponse`**
(mapped from: PromotionsList200ResponsePromotionResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
promotionsList200Response | promotionsList200Response | long | | kotlin.Long | Primary Key | *one*
promotionResponse | promotionResponse | long | | kotlin.Long | Foreign Key | *many*




