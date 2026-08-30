
# Table `ProductTagsError`
(mapped from: ProductTagsError)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**code** | code | int NOT NULL |  | **kotlin.Int** |  | 
**message** | message | text NOT NULL |  | **kotlin.String** |  | 
**details** | details | long |  | [**IneligibleProductTagsErrorDetails**](IneligibleProductTagsErrorDetails.md) | Details about which product tags failed eligibility check. |  [optional] [foreignkey]





