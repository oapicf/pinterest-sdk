-module(openapi_catalogs_product_groups_update_request).

-export([encode/1]).

-export_type([openapi_catalogs_product_groups_update_request/0]).

-type openapi_catalogs_product_groups_update_request() ::
    #{ 'name' => binary(),
       'description' => binary(),
       'is_featured' => boolean(),
       'filters' => openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters(),
       'catalog_type' => binary(),
       'country' => openapi_country:openapi_country(),
       'locale' => openapi_catalogs_locale:openapi_catalogs_locale()
     }.

encode(#{ 'name' := Name,
          'description' := Description,
          'is_featured' := IsFeatured,
          'filters' := Filters,
          'catalog_type' := CatalogType,
          'country' := Country,
          'locale' := Locale
        }) ->
    #{ 'name' => Name,
       'description' => Description,
       'is_featured' => IsFeatured,
       'filters' => Filters,
       'catalog_type' => CatalogType,
       'country' => Country,
       'locale' => Locale
     }.
