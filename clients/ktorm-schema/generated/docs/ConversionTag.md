
# Table `ConversionTag`
(mapped from: ConversionTag)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | Conversion tag name. | 
**adAccountId** | ad_account_id | text NOT NULL |  | **kotlin.String** | Ad account ID. |  [readonly]
**codeSnippet** | code_snippet | text |  | **kotlin.String** | Tag code snippet. |  [optional] [readonly]
**configs** | configs | long |  | [**ConversionTagConfigs**](ConversionTagConfigs.md) |  |  [optional] [readonly] [foreignkey]
**enhancedMatchStatus** | enhanced_match_status | long |  | [**EnhancedMatchStatusType**](EnhancedMatchStatusType.md) | The enhanced match status of the tag |  [optional] [readonly] [foreignkey]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Tag ID. |  [optional] [readonly]
**lastFiredTimeMs** | last_fired_time_ms | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Time for the last event fired. |  [optional] [readonly]
**version** | version | text |  | **kotlin.String** | Version number. |  [optional] [readonly]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) |  |  [optional] [readonly] [foreignkey]











