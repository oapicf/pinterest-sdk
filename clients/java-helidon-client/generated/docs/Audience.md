

# Audience


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adAccountId** | **String** | Ad account ID. |  [optional] |
|**audienceType** | **PinnerListType** | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR |  [optional] |
|**createdByCompanyName** | **String** | The company that created this audience. |  [optional] |
|**createdTimestamp** | **Integer** | Creation time. Unix timestamp in seconds. |  [optional] |
|**description** | **String** | Audience description. |  [optional] |
|**id** | **String** | Audience ID. |  [optional] |
|**isNca** | **Boolean** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. |  [optional] |
|**name** | **String** | Audience name. |  [optional] |
|**rule** | [**AudienceRule**](AudienceRule.md) |  |  [optional] |
|**size** | **Integer** | Audience size. |  [optional] |
|**status** | **AudienceStatus** | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. |  [optional] |
|**type** | **String** | Always \&quot;audience\&quot;. |  [optional] |
|**updatedTimestamp** | **Integer** | Last update time. Unix timestamp in seconds. |  [optional] |



