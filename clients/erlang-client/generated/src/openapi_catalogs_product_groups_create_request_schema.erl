-module(openapi_catalogs_product_groups_create_request_schema).

-export([encode/1]).

-export_type([openapi_catalogs_product_groups_create_request_schema/0]).

-type openapi_catalogs_product_groups_create_request_schema() ::
    #{ 'description' => binary(),
       'feed_id' := binary(),
       'filters' := openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters(),
       'is_featured' => boolean(),
       'name' := binary(),
       'catalog_id' := binary(),
       'catalog_type' := binary(),
       'country' => openapi_country:openapi_country(),
       'locale' => openapi_catalogs_locale:openapi_catalogs_locale()
     }.

encode(#{ 'description' := Description,
          'feed_id' := FeedId,
          'filters' := Filters,
          'is_featured' := IsFeatured,
          'name' := Name,
          'catalog_id' := CatalogId,
          'catalog_type' := CatalogType,
          'country' := Country,
          'locale' := Locale
        }) ->
    #{ 'description' => Description,
       'feed_id' => FeedId,
       'filters' => Filters,
       'is_featured' => IsFeatured,
       'name' => Name,
       'catalog_id' => CatalogId,
       'catalog_type' => CatalogType,
       'country' => Country,
       'locale' => Locale
     }.
