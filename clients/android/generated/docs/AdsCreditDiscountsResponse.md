

# AdsCreditDiscountsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | True if the offer code is currently active. |  [optional]
**advertiserId** | **String** | Advertiser ID the offer was applied to. |  [optional]
**discountCurrency** | **String** | Currency value for the discount. |  [optional]
**discountInMicroCurrency** | [**BigDecimal**](BigDecimal.md) | The discount applied in the offer’s currency value. |  [optional]
**discountType** | [**DiscountTypeEnum**](#DiscountTypeEnum) | The type of discount of this credit |  [optional]
**remainingDiscountInMicroCurrency** | [**BigDecimal**](BigDecimal.md) | The credits left to spend. |  [optional]
**title** | **String** | Human readable title of the offer code. |  [optional]


## Enum: DiscountTypeEnum

Name | Value
---- | -----




