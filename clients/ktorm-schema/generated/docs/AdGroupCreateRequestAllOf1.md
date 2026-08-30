
# Table `AdGroupCreateRequestAllOf1`
(mapped from: AdGroupCreateRequestAllOf1)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**autoTargetingEnabled** | auto_targeting_enabled | boolean |  | **kotlin.Boolean** | Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;. |  [optional]
**bidMultiplier** | bid_multiplier | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;. |  [optional]
**budgetType** | budget_type | long |  | [**BudgetType**](BudgetType.md) |  |  [optional] [foreignkey]
**pacingDeliveryType** | pacing_delivery_type | long |  | [**PacingDeliveryType**](PacingDeliveryType.md) |  |  [optional] [foreignkey]






