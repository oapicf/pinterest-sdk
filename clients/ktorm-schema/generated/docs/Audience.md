
# Table `Audience`
(mapped from: Audience)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Ad account ID. |  [optional]
**audienceType** | audience_type | text |  | **kotlin.String** | &lt;a href&#x3D;\&quot;/docs/reference/glossary/#Audience Types\&quot;&gt;Audience types&lt;/a&gt;: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR |  [optional]
**createdByCompanyName** | created_by_company_name | text |  | **kotlin.String** | The company that created this audience. |  [optional]
**createdTimestamp** | created_timestamp | int |  | **kotlin.Int** | Creation time. Unix timestamp in seconds. |  [optional]
**description** | description | text |  | **kotlin.String** | Audience description. |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Audience ID. |  [optional]
**name** | name | text |  | **kotlin.String** | Audience name. |  [optional]
**rule** | rule | long |  | [**AudienceRule**](AudienceRule.md) |  |  [optional] [foreignkey]
**propertySize** | size | int |  | **kotlin.Int** | Audience size. |  [optional]
**status** | status | text |  | **kotlin.String** | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. |  [optional]
**type** | type | text |  | **kotlin.String** | Always \&quot;audience\&quot;. |  [optional]
**updatedTimestamp** | updated_timestamp | int |  | **kotlin.Int** | Last update time. Unix timestamp in seconds. |  [optional]














