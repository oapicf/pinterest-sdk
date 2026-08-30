# KEYWORD

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | **BOOLEAN** |  | [optional] [default to null]
**bid** | **INTEGER_32** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Keyword ID . | [default to null]
**match_type** | [**MATCH_TYPE**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) | [default to null]
**parent_id** | [**STRING_32**](STRING_32.md) | Keyword parent entity ID (advertiser, campaign, ad group). | [readonly] [default to null]
**parent_type** | [**STRING_32**](STRING_32.md) | Parent entity type (advertiser, campaign, ad group). | [optional] [readonly] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Always keyword | [optional] [readonly] [default to null]
**value** | [**STRING_32**](STRING_32.md) | Keyword value (120 chars max). | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


