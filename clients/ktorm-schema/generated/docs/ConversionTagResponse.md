
# Table `ConversionTagResponse`
(mapped from: ConversionTagResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Ad account ID. |  [optional]
**codeSnippet** | code_snippet | text |  | **kotlin.String** | Tag code snippet. |  [optional]
**enhancedMatchStatus** | enhanced_match_status | long |  | [**EnhancedMatchStatusType**](EnhancedMatchStatusType.md) |  |  [optional] [foreignkey]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Tag ID. |  [optional]
**lastFiredTimeMs** | last_fired_time_ms | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Time for the last event fired. |  [optional]
**name** | name | text |  | **kotlin.String** | Conversion tag name. |  [optional]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) |  |  [optional] [foreignkey]
**version** | version | text |  | **kotlin.String** | Version number. |  [optional]
**configs** | configs | long |  | [**ConversionTagConfigs**](ConversionTagConfigs.md) |  |  [optional] [foreignkey]











