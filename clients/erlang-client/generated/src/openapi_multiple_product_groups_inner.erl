-module(openapi_multiple_product_groups_inner).

-export([encode/1]).

-export_type([openapi_multiple_product_groups_inner/0]).

-type openapi_multiple_product_groups_inner() ::
    #{ 'name' := binary(),
       'description' => binary(),
       'is_featured' => boolean(),
       'filters' := openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters(),
       'feed_id' := binary(),
       'catalog_type' := binary(),
       'catalog_id' := binary(),
       'country' := openapi_country:openapi_country(),
       'locale' := openapi_catalogs_locale:openapi_catalogs_locale()
     }.

encode(#{ 'name' := Name,
          'description' := Description,
          'is_featured' := IsFeatured,
          'filters' := Filters,
          'feed_id' := FeedId,
          'catalog_type' := CatalogType,
          'catalog_id' := CatalogId,
          'country' := Country,
          'locale' := Locale
        }) ->
    #{ 'name' => Name,
       'description' => Description,
       'is_featured' => IsFeatured,
       'filters' => Filters,
       'feed_id' => FeedId,
       'catalog_type' => CatalogType,
       'catalog_id' => CatalogId,
       'country' => Country,
       'locale' => Locale
     }.
