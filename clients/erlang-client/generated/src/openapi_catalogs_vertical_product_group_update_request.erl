-module(openapi_catalogs_vertical_product_group_update_request).

-export([encode/1]).

-export_type([openapi_catalogs_vertical_product_group_update_request/0]).

-type openapi_catalogs_vertical_product_group_update_request() ::
    #{ 'catalog_type' => binary(),
       'name' => binary(),
       'description' => binary(),
       'filters' => openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters(),
       'country' => openapi_country:openapi_country(),
       'locale' => openapi_catalogs_locale:openapi_catalogs_locale()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'name' := Name,
          'description' := Description,
          'filters' := Filters,
          'country' := Country,
          'locale' := Locale
        }) ->
    #{ 'catalog_type' => CatalogType,
       'name' => Name,
       'description' => Description,
       'filters' => Filters,
       'country' => Country,
       'locale' => Locale
     }.
