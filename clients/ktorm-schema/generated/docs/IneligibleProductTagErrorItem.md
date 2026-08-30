
# Table `IneligibleProductTagErrorItem`
(mapped from: IneligibleProductTagErrorItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**errorMessage** | error_message | long NOT NULL |  | [**IneligibleProductTagReason**](IneligibleProductTagReason.md) | Reason why the pin is ineligible for tagging. |  [foreignkey]
**pinId** | pin_id | text NOT NULL |  | **kotlin.String** | Pin ID that failed eligibility check. | 




