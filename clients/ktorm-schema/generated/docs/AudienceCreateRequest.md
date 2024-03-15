
# Table `AudienceCreateRequest`
(mapped from: AudienceCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | Audience name. | 
**rule** | rule | long NOT NULL |  | [**AudienceRule**](AudienceRule.md) |  |  [foreignkey]
**audienceType** | audience_type | long NOT NULL |  | [**AudienceCreateRequest1AudienceType**](AudienceCreateRequest1AudienceType.md) |  |  [foreignkey]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Ad account ID. |  [optional]
**description** | description | text |  | **kotlin.String** | Audience description. |  [optional]







