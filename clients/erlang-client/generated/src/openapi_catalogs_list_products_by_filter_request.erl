-module(openapi_catalogs_list_products_by_filter_request).

-export([encode/1]).

-export_type([openapi_catalogs_list_products_by_filter_request/0]).

-type openapi_catalogs_list_products_by_filter_request() ::
    #{ 'feed_id' := binary(),
       'filters' := openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters(),
       'catalog_type' := binary(),
       'catalog_id' := binary(),
       'country' := openapi_country:openapi_country(),
       'locale' := openapi_catalogs_locale:openapi_catalogs_locale()
     }.

encode(#{ 'feed_id' := FeedId,
          'filters' := Filters,
          'catalog_type' := CatalogType,
          'catalog_id' := CatalogId,
          'country' := Country,
          'locale' := Locale
        }) ->
    #{ 'feed_id' => FeedId,
       'filters' => Filters,
       'catalog_type' => CatalogType,
       'catalog_id' => CatalogId,
       'country' => Country,
       'locale' => Locale
     }.
