-module(openapi_catalogs_creative_assets_product_group_update_request).

-export([encode/1]).

-export_type([openapi_catalogs_creative_assets_product_group_update_request/0]).

-type openapi_catalogs_creative_assets_product_group_update_request() ::
    #{ 'catalog_type' => binary(),
       'description' => binary(),
       'filters' => openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters(),
       'name' => binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'description' := Description,
          'filters' := Filters,
          'name' := Name
        }) ->
    #{ 'catalog_type' => CatalogType,
       'description' => Description,
       'filters' => Filters,
       'name' => Name
     }.
