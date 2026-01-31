

# AppTypeMultipliers

This represents a mapping from app type targeting criteria to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified app type in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**APP_TYPE** | [**APPTYPEEnum**](#APPTYPEEnum) |  |  [optional] |



## Enum: APPTYPEEnum

| Name | Value |
|---- | -----|
| ANDROID_MOBILE | &quot;android_mobile&quot; |
| ANDROID_TABLET | &quot;android_tablet&quot; |
| IPAD | &quot;ipad&quot; |
| IPHONE | &quot;iphone&quot; |
| WEB | &quot;web&quot; |
| WEB_MOBILE | &quot;web_mobile&quot; |



