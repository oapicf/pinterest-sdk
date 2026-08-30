
# Table `AdsCreditDiscountsResponse`
(mapped from: AdsCreditDiscountsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**active** | active | boolean |  | **kotlin.Boolean** | True if the offer code is currently active. |  [optional]
**advertiserId** | advertiser_id | text |  | **kotlin.String** | Advertiser ID the offer was applied to. |  [optional]
**discountCurrency** | discountCurrency | text |  | **kotlin.String** | Currency value for the discount. |  [optional]
**discountInMicroCurrency** | discountInMicroCurrency | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The discount applied in the offer&#39;s currency value. |  [optional]
**discountType** | discountType | long |  | [**AdsCreditDiscountType**](AdsCreditDiscountType.md) | The type of discount of this credit |  [optional] [foreignkey]
**remainingDiscountInMicroCurrency** | remainingDiscountInMicroCurrency | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The credits left to spend. |  [optional]
**title** | title | text |  | **kotlin.String** | Human readable title of the offer code. |  [optional]









