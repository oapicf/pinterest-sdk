
# Table `AdAccountsAudience`
(mapped from: AdAccountsAudience)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Audience ID. | 
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Ad account ID. |  [optional]
**audienceType** | audience_type | long |  | [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR |  [optional] [foreignkey]
**createdByCompanyName** | created_by_company_name | text |  | **kotlin.String** | The company that created this audience. |  [optional] [readonly]
**createdTimestamp** | created_timestamp | int |  | **kotlin.Int** | Creation time. Unix timestamp in seconds. |  [optional] [readonly]
**description** | description | text |  | **kotlin.String** | Audience description. |  [optional]
**isNca** | is_nca | boolean |  | **kotlin.Boolean** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. |  [optional] [readonly]
**name** | name | text |  | **kotlin.String** | Audience name. |  [optional]
**rule** | rule | long |  | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  |  [optional] [foreignkey]
**propertySize** | size | int |  | **kotlin.Int** | Audience size. |  [optional] [readonly]
**status** | status | long |  | [**AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. |  [optional] [readonly] [foreignkey]
**type** | type | text |  | **kotlin.String** | Always \&quot;audience\&quot;. |  [optional] [readonly]
**updatedTimestamp** | updated_timestamp | int |  | **kotlin.Int** | Last update time. Unix timestamp in seconds. |  [optional] [readonly]















