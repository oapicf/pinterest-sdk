# Audience


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ad_account_id`** | **`String`** | Ad account ID. | [optional] [default to nothing]
**`audience_type`** | [**`*PinnerListType`**](PinnerListType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] [default to nothing]
**`created_by_company_name`** | **`String`** | The company that created this audience. | [optional] [default to nothing]
**`created_timestamp`** | **`Int64`** | Creation time. Unix timestamp in seconds. | [optional] [default to nothing]
**`description`** | **`String`** | Audience description. | [optional] [default to nothing]
**`id`** | **`String`** | Audience ID. | [optional] [default to nothing]
**`is_nca`** | **`Bool`** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] [default to nothing]
**`name`** | **`String`** | Audience name. | [optional] [default to nothing]
**`rule`** | [**`*AudienceRule`**](AudienceRule.md) |  | [optional] [default to nothing]
**`size`** | **`Int64`** | Audience size. | [optional] [default to nothing]
**`status`** | [**`*AudienceStatus`**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] [default to nothing]
**`type`** | **`String`** | Always \&quot;audience\&quot;. | [optional] [default to nothing]
**`updated_timestamp`** | **`Int64`** | Last update time. Unix timestamp in seconds. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


