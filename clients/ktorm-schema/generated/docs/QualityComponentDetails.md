
# Table `QualityComponentDetails`
(mapped from: QualityComponentDetails)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**coverage** | coverage | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Coverage percentage for this event type. | 
**issues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;QualityComponentIssue&gt;**](QualityComponentIssue.md) | List of issues detected for this event type, if any. |  [optional]
**overlap** | overlap | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Overlap percentage for this event type. Only populated for external_event_id |  [optional]



# **Table `QualityComponentDetailsQualityComponentIssue`**
(mapped from: QualityComponentDetailsQualityComponentIssue)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
qualityComponentDetails | qualityComponentDetails | long | | kotlin.Long | Primary Key | *one*
qualityComponentIssue | qualityComponentIssue | long | | kotlin.Long | Foreign Key | *many*




