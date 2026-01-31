-module(openapi_catalogs_product_groups_update_request).

-export([encode/1]).

-export_type([openapi_catalogs_product_groups_update_request/0]).

-type openapi_catalogs_product_groups_update_request() ::
    #{ 'description' => binary(),
       'filters' => openapi_catalogs_creative_assets_product_group_filters:openapi_catalogs_creative_assets_product_group_filters(),
       'is_featured' => boolean(),
       'name' => binary(),
       'catalog_type' => binary(),
       'country' => openapi_country:openapi_country(),
       'locale' => openapi_catalogs_locale:openapi_catalogs_locale()
     }.

encode(#{ 'description' := Description,
          'filters' := Filters,
          'is_featured' := IsFeatured,
          'name' := Name,
          'catalog_type' := CatalogType,
          'country' := Country,
          'locale' := Locale
        }) ->
    #{ 'description' => Description,
       'filters' => Filters,
       'is_featured' => IsFeatured,
       'name' => Name,
       'catalog_type' => CatalogType,
       'country' => Country,
       'locale' => Locale
     }.
