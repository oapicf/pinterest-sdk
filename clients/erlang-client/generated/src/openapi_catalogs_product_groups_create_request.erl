-module(openapi_catalogs_product_groups_create_request).

-export([encode/1]).

-export_type([openapi_catalogs_product_groups_create_request/0]).

-type openapi_catalogs_product_groups_create_request() ::
    #{ 'name' := binary(),
       'description' => binary(),
       'is_featured' => boolean(),
       'filters' := openapi_catalogs_hotel_product_group_filters:openapi_catalogs_hotel_product_group_filters(),
       'feed_id' := binary(),
       'catalog_type' := binary(),
       'catalog_id' := binary()
     }.

encode(#{ 'name' := Name,
          'description' := Description,
          'is_featured' := IsFeatured,
          'filters' := Filters,
          'feed_id' := FeedId,
          'catalog_type' := CatalogType,
          'catalog_id' := CatalogId
        }) ->
    #{ 'name' => Name,
       'description' => Description,
       'is_featured' => IsFeatured,
       'filters' => Filters,
       'feed_id' => FeedId,
       'catalog_type' => CatalogType,
       'catalog_id' => CatalogId
     }.
