# CatalogProductGroup
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | ID of the catalog product group. | [optional] 
**MerchantId** | **String** | Merchant ID pertaining to the owner of the catalog product group. | [optional] 
**Name** | **String** | Name of catalog product group | [optional] 
**Filters** | [**SystemCollectionsHashtable**](.md) | Object holding a list of filters | [optional] 
**FilterV2** | [**SystemCollectionsHashtable**](.md) | Object holding a list of filters | [optional] 
**Type** | [**Board**](Board.md) |  | [optional] 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**FeedProfileId** | **String** | id of the feed profile belonging to this catalog product group | [optional] 
**CreatedAt** | **Int32** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**LastUpdate** | **Int32** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**ProductCount** | **Int32** | Amount of products in the catalog product group | [optional] 
**FeaturedPosition** | **Int32** | index of the featured position of the catalog product group | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogProductGroup = Initialize-PSOpenAPIToolsCatalogProductGroup  -Id 2680059592705 `
 -MerchantId 2680059592705 `
 -Name Most Popular `
 -Filters {&quot;1&quot;:[&quot;123chars_title&quot;]} `
 -FilterV2 {&quot;1&quot;:[&quot;123chars_title&quot;]} `
 -Type null `
 -Status null `
 -FeedProfileId null `
 -CreatedAt 1621350033000 `
 -LastUpdate 1622742155000 `
 -ProductCount 6 `
 -FeaturedPosition 2
```

- Convert the resource to JSON
```powershell
$CatalogProductGroup | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

