# Keyword


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`archived`** | **`Bool`** |  | [optional] [default to nothing]
**`bid`** | **`Int64`** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] [default to nothing]
**`id`** | **`String`** | Keyword ID . | [default to nothing]
**`match_type`** | [**`*MatchType`**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) | [default to nothing]
**`parent_id`** | **`String`** | Keyword parent entity ID (advertiser, campaign, ad group). | [readonly] [default to nothing]
**`parent_type`** | **`String`** | Parent entity type (advertiser, campaign, ad group). | [optional] [readonly] [default to nothing]
**`type`** | **`String`** | Always keyword | [optional] [readonly] [default to nothing]
**`value`** | **`String`** | Keyword value (120 chars max). | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


