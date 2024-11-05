
# Table `ProductGroupPromotion`
(mapped from: ProductGroupPromotion)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | ID of the product group promotion. |  [optional]
**adGroupId** | ad_group_id | text |  | **kotlin.String** | ID of the ad group the product group belongs to. |  [optional]
**bidInMicroCurrency** | bid_in_micro_currency | int |  | **kotlin.Int** | The bid in micro currency. |  [optional]
**included** | included | boolean |  | **kotlin.Boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. |  [optional]
**definition** | definition | text |  | **kotlin.String** | The full product group definition path |  [optional]
**relativeDefinition** | relative_definition | text |  | **kotlin.String** | The definition of the product group, relative to its parent - an attribute name/value pair |  [optional]
**parentId** | parent_id | text |  | **kotlin.String** | The parent Product Group ID of this Product Group |  [optional]
**slideshowCollectionsTitle** | slideshow_collections_title | text |  | **kotlin.String** | Slideshow Collections Title |  [optional]
**slideshowCollectionsDescription** | slideshow_collections_description | text |  | **kotlin.String** | Slideshow Collections Description |  [optional]
**isMdl** | is_mdl | boolean |  | **kotlin.Boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog |  [optional]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) |  |  [optional] [foreignkey]
**trackingUrl** | tracking_url | text |  | **kotlin.String** | Tracking template for proudct group promotions. 4000 limit |  [optional]
**catalogProductGroupId** | catalog_product_group_id | text |  | **kotlin.String** | ID of the catalogs product group that this product group promotion references |  [optional]
**catalogProductGroupName** | catalog_product_group_name | text |  | **kotlin.String** | Catalogs product group name |  [optional]
**collectionsHeroPinId** | collections_hero_pin_id | text |  | **kotlin.String** | Hero Pin ID if this PG is promoted as a Collection |  [optional]
**collectionsHeroDestinationUrl** | collections_hero_destination_url | text |  | **kotlin.String** | Collections Hero Destination Url |  [optional]
**gridClickType** | grid_click_type | long |  | [**GridClickType**](GridClickType.md) |  |  [optional] [foreignkey]



















