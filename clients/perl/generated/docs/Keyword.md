# WWW::OpenAPIClient::Object::Keyword

## Load the model package
```perl
use WWW::OpenAPIClient::Object::Keyword;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | **boolean** |  | [optional] 
**id** | **string** | Keyword ID . | [optional] 
**parent_id** | **string** | Keyword parent entity ID (advertiser, campaign, ad group). | [optional] 
**parent_type** | **string** | Parent entity type | [optional] 
**type** | **string** | Always keyword | [optional] 
**bid** | **int** | Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**match_type** | [**MatchTypeResponse**](MatchTypeResponse.md) |  | 
**value** | **string** | Keyword value (120 chars max). | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


