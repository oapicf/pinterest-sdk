-module(openapi_product_group_promotion).

-export([encode/1]).

-export_type([openapi_product_group_promotion/0]).

-type openapi_product_group_promotion() ::
    #{ 'id' => binary(),
       'ad_group_id' => binary(),
       'bid_in_micro_currency' => integer(),
       'included' => boolean(),
       'definition' => binary(),
       'relative_definition' => binary(),
       'parent_id' => binary(),
       'slideshow_collections_title' => binary(),
       'slideshow_collections_description' => binary(),
       'is_mdl' => boolean(),
       'status' => openapi_entity_status:openapi_entity_status(),
       'tracking_url' => binary(),
       'catalog_product_group_id' => binary(),
       'catalog_product_group_name' => binary(),
       'creative_type' => openapi_creative_type:openapi_creative_type(),
       'collections_hero_pin_id' => binary(),
       'collections_hero_destination_url' => binary(),
       'grid_click_type' => openapi_grid_click_type:openapi_grid_click_type()
     }.

encode(#{ 'id' := Id,
          'ad_group_id' := AdGroupId,
          'bid_in_micro_currency' := BidInMicroCurrency,
          'included' := Included,
          'definition' := Definition,
          'relative_definition' := RelativeDefinition,
          'parent_id' := ParentId,
          'slideshow_collections_title' := SlideshowCollectionsTitle,
          'slideshow_collections_description' := SlideshowCollectionsDescription,
          'is_mdl' := IsMdl,
          'status' := Status,
          'tracking_url' := TrackingUrl,
          'catalog_product_group_id' := CatalogProductGroupId,
          'catalog_product_group_name' := CatalogProductGroupName,
          'creative_type' := CreativeType,
          'collections_hero_pin_id' := CollectionsHeroPinId,
          'collections_hero_destination_url' := CollectionsHeroDestinationUrl,
          'grid_click_type' := GridClickType
        }) ->
    #{ 'id' => Id,
       'ad_group_id' => AdGroupId,
       'bid_in_micro_currency' => BidInMicroCurrency,
       'included' => Included,
       'definition' => Definition,
       'relative_definition' => RelativeDefinition,
       'parent_id' => ParentId,
       'slideshow_collections_title' => SlideshowCollectionsTitle,
       'slideshow_collections_description' => SlideshowCollectionsDescription,
       'is_mdl' => IsMdl,
       'status' => Status,
       'tracking_url' => TrackingUrl,
       'catalog_product_group_id' => CatalogProductGroupId,
       'catalog_product_group_name' => CatalogProductGroupName,
       'creative_type' => CreativeType,
       'collections_hero_pin_id' => CollectionsHeroPinId,
       'collections_hero_destination_url' => CollectionsHeroDestinationUrl,
       'grid_click_type' => GridClickType
     }.
