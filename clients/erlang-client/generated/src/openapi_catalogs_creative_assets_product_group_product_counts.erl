-module(openapi_catalogs_creative_assets_product_group_product_counts).

-export([encode/1]).

-export_type([openapi_catalogs_creative_assets_product_group_product_counts/0]).

-type openapi_catalogs_creative_assets_product_group_product_counts() ::
    #{ 'app_links' := integer(),
       'catalog_type' := binary(),
       'images' := integer(),
       'total' := integer(),
       'videos' := integer()
     }.

encode(#{ 'app_links' := AppLinks,
          'catalog_type' := CatalogType,
          'images' := Images,
          'total' := Total,
          'videos' := Videos
        }) ->
    #{ 'app_links' => AppLinks,
       'catalog_type' => CatalogType,
       'images' => Images,
       'total' => Total,
       'videos' => Videos
     }.
