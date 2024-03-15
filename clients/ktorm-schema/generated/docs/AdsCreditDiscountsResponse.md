
# Table `AdsCreditDiscountsResponse`
(mapped from: AdsCreditDiscountsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**active** | active | boolean |  | **kotlin.Boolean** | True if the offer code is currently active. |  [optional]
**advertiserId** | advertiser_id | text |  | **kotlin.String** | Advertiser ID the offer was applied to. |  [optional]
**discountType** | discountType | text |  | [**discountType**](#DiscountType) | The type of discount of this credit |  [optional]
**discountInMicroCurrency** | discountInMicroCurrency | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The discount applied in the offer’s currency value. |  [optional]
**discountCurrency** | discountCurrency | text |  | **kotlin.String** | Currency value for the discount. |  [optional]
**title** | title | text |  | **kotlin.String** | Human readable title of the offer code. |  [optional]
**remainingDiscountInMicroCurrency** | remainingDiscountInMicroCurrency | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The credits left to spend. |  [optional]









