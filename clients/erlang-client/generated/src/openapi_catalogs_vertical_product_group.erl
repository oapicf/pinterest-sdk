-module(openapi_catalogs_vertical_product_group).

-export([encode/1]).

-export_type([openapi_catalogs_vertical_product_group/0]).

-type openapi_catalogs_vertical_product_group() ::
    #{ 'catalog_id' := binary(),
       'catalog_type' := binary(),
       'country' => binary(),
       'created_at' => integer(),
       'description' => binary(),
       'feed_id' := binary(),
       'filters' := openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters(),
       'id' := binary(),
       'is_featured' => boolean(),
       'locale' => binary(),
       'name' => binary(),
       'status' => openapi_catalogs_product_group_status:openapi_catalogs_product_group_status(),
       'type' := openapi_catalogs_hotel_product_group_type:openapi_catalogs_hotel_product_group_type(),
       'updated_at' => integer()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'catalog_type' := CatalogType,
          'country' := Country,
          'created_at' := CreatedAt,
          'description' := Description,
          'feed_id' := FeedId,
          'filters' := Filters,
          'id' := Id,
          'is_featured' := IsFeatured,
          'locale' := Locale,
          'name' := Name,
          'status' := Status,
          'type' := Type,
          'updated_at' := UpdatedAt
        }) ->
    #{ 'catalog_id' => CatalogId,
       'catalog_type' => CatalogType,
       'country' => Country,
       'created_at' => CreatedAt,
       'description' => Description,
       'feed_id' => FeedId,
       'filters' => Filters,
       'id' => Id,
       'is_featured' => IsFeatured,
       'locale' => Locale,
       'name' => Name,
       'status' => Status,
       'type' => Type,
       'updated_at' => UpdatedAt
     }.
