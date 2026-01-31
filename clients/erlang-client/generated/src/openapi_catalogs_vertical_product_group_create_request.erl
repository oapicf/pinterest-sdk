-module(openapi_catalogs_vertical_product_group_create_request).

-export([encode/1]).

-export_type([openapi_catalogs_vertical_product_group_create_request/0]).

-type openapi_catalogs_vertical_product_group_create_request() ::
    #{ 'catalog_id' := binary(),
       'catalog_type' := binary(),
       'country' => openapi_country:openapi_country(),
       'description' => binary(),
       'filters' := openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters(),
       'locale' => openapi_catalogs_locale:openapi_catalogs_locale(),
       'name' := binary()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'catalog_type' := CatalogType,
          'country' := Country,
          'description' := Description,
          'filters' := Filters,
          'locale' := Locale,
          'name' := Name
        }) ->
    #{ 'catalog_id' => CatalogId,
       'catalog_type' => CatalogType,
       'country' => Country,
       'description' => Description,
       'filters' => Filters,
       'locale' => Locale,
       'name' => Name
     }.
