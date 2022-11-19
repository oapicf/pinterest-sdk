# CatalogsFeedIngestionErrors
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **IMAGE\_DOWNLOAD\_ERROR** | **Integer** | Some items include images that can&#39;t be found. | [optional] [default to null] |
| **LINE\_LEVEL\_INTERNAL\_ERROR** | **Integer** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. | [optional] [default to null] |
| **LARGE\_PRODUCT\_COUNT\_DECREASE** | **Integer** | The product count has decreased by more than 99% compared to the last successful ingestion. | [optional] [default to null] |
| **ACCOUNT\_FLAGGED** | **Integer** | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

