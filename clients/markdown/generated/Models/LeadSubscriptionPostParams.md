# LeadSubscriptionPostParams
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String** | The Ad Account ID that this lead form belongs to. | [optional] [default to null] |
| **api\_version** | **String** | API version. | [optional] [default to null] |
| **created\_time** | **Integer** | Subscription creation time. Unix timestamp in milliseconds. | [optional] [default to null] |
| **cryptographic\_algorithm** | **String** | Lead data encryption algorithm. | [optional] [default to null] |
| **cryptographic\_key** | **String** | Base64 encoded key for client to decrypt lead data. | [optional] [default to null] |
| **id** | **String** | Subscription ID. | [optional] [default to null] |
| **lead\_form\_id** | **String** | Lead form ID. | [optional] [default to null] |
| **user\_account\_id** | **String** | User account used to subscribe lead data. | [optional] [default to null] |
| **webhook\_url** | **String** | Standard HTTPS webhook URL. | [optional] [default to null] |
| **partner\_access\_token** | **String** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to null] |
| **partner\_metadata** | [**PartnerMetadata**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] [default to null] |
| **partner\_refresh\_token** | **String** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

