# Keyword

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | **bool** |  | [optional]
**bid** | **int** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional]
**id** | **string** | Keyword ID . |
**match_type** | [**\OpenAPI\Client\Model\MatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) |
**parent_id** | **string** | Keyword parent entity ID (advertiser, campaign, ad group). | [readonly]
**parent_type** | **string** | Parent entity type (advertiser, campaign, ad group). | [optional] [readonly]
**type** | **string** | Always keyword | [optional] [readonly]
**value** | **string** | Keyword value (120 chars max). |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
