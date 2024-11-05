-module(openapi_catalogs_vertical_product_group_create_request).

-export([encode/1]).

-export_type([openapi_catalogs_vertical_product_group_create_request/0]).

-type openapi_catalogs_vertical_product_group_create_request() ::
    #{ 'catalog_type' := binary(),
       'name' := binary(),
       'description' => binary(),
       'filters' := openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters(),
       'catalog_id' := binary(),
       'country' := openapi_country:openapi_country(),
       'locale' := openapi_catalogs_locale:openapi_catalogs_locale()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'name' := Name,
          'description' := Description,
          'filters' := Filters,
          'catalog_id' := CatalogId,
          'country' := Country,
          'locale' := Locale
        }) ->
    #{ 'catalog_type' => CatalogType,
       'name' => Name,
       'description' => Description,
       'filters' => Filters,
       'catalog_id' => CatalogId,
       'country' => Country,
       'locale' => Locale
     }.
