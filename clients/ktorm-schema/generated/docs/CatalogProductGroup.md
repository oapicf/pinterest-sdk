
# Table `CatalogProductGroup`
(mapped from: CatalogProductGroup)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | ID of the catalog product group. |  [optional]
**merchantId** | merchant_id | text |  | **kotlin.String** | Merchant ID pertaining to the owner of the catalog product group. |  [optional]
**name** | name | text |  | **kotlin.String** | Name of catalog product group |  [optional]
**filters** | filters | blob |  | [**kotlin.Any**](.md) | Object holding a list of filters |  [optional]
**filterV2** | filter_v2 | blob |  | [**kotlin.Any**](.md) | Object holding a list of filters |  [optional]
**type** | type | long |  | [**Board**](Board.md) |  |  [optional] [foreignkey]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) |  |  [optional] [foreignkey]
**feedProfileId** | feed_profile_id | text |  | **kotlin.String** | id of the feed profile belonging to this catalog product group |  [optional]
**createdAt** | created_at | int |  | **kotlin.Int** | Unix timestamp in seconds of when catalog product group was created. |  [optional]
**lastUpdate** | last_update | int |  | **kotlin.Int** | Unix timestamp in seconds of last time catalog product group was updated. |  [optional]
**productCount** | product_count | int |  | **kotlin.Int** | Amount of products in the catalog product group |  [optional]
**featuredPosition** | featured_position | int |  | **kotlin.Int** | index of the featured position of the catalog product group |  [optional]














