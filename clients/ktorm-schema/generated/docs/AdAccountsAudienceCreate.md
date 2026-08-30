
# Table `AdAccountsAudienceCreate`
(mapped from: AdAccountsAudienceCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Ad account ID. |  [optional]
**audienceType** | audience_type | long |  | [**AudienceType**](AudienceType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR |  [optional] [foreignkey]
**description** | description | text |  | **kotlin.String** | Audience description. |  [optional]
**name** | name | text |  | **kotlin.String** | Audience name. |  [optional]
**rule** | rule | long |  | [**AdAccountsAudienceRule**](AdAccountsAudienceRule.md) |  |  [optional] [foreignkey]







