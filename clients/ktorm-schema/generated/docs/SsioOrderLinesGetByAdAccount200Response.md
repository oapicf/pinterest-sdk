
# Table `ssio_order_lines_get_by_ad_account_200_response`
(mapped from: SsioOrderLinesGetByAdAccount200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;SSIOOrderLine&gt;**](SSIOOrderLine.md) | SSIO order lines by ad acount id | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `SsioOrderLinesGetByAdAccount200ResponseSSIOOrderLine`**
(mapped from: SsioOrderLinesGetByAdAccount200ResponseSSIOOrderLine)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
ssioOrderLinesGetByAdAccount200Response | ssioOrderLinesGetByAdAccount200Response | long | | kotlin.Long | Primary Key | *one*
sSIOOrderLine | sSIOOrderLine | long | | kotlin.Long | Foreign Key | *many*




