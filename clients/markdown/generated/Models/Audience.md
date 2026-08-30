# Audience
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String** | Ad account ID. | [optional] [default to null] |
| **audience\_type** | [**PinnerListType**](PinnerListType.md) | [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR | [optional] [default to null] |
| **created\_by\_company\_name** | **String** | The company that created this audience. | [optional] [default to null] |
| **created\_timestamp** | **Integer** | Creation time. Unix timestamp in seconds. | [optional] [default to null] |
| **description** | **String** | Audience description. | [optional] [default to null] |
| **id** | **String** | Audience ID. | [optional] [default to null] |
| **is\_nca** | **Boolean** | Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. | [optional] [default to null] |
| **name** | **String** | Audience name. | [optional] [default to null] |
| **rule** | [**AudienceRule**](AudienceRule.md) |  | [optional] [default to null] |
| **size** | **Integer** | Audience size. | [optional] [default to null] |
| **status** | [**AudienceStatus**](AudienceStatus.md) | Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. | [optional] [default to null] |
| **type** | **String** | Always \&quot;audience\&quot;. | [optional] [default to null] |
| **updated\_timestamp** | **Integer** | Last update time. Unix timestamp in seconds. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

