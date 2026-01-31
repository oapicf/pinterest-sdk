
# Table `AudienceCreateRequest`
(mapped from: AudienceCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text NOT NULL |  | **kotlin.String** | Audience name. | 
**rule** | rule | long NOT NULL |  | [**AudienceRule**](AudienceRule.md) |  |  [foreignkey]
**audienceType** | audience_type | long NOT NULL |  | [**AudienceType**](AudienceType.md) | &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive. |  [foreignkey]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Ad account ID. |  [optional]
**description** | description | text |  | **kotlin.String** | Audience description. |  [optional]







