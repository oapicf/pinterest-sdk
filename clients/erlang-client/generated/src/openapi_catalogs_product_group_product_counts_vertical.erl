-module(openapi_catalogs_product_group_product_counts_vertical).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_product_counts_vertical/0]).

-type openapi_catalogs_product_group_product_counts_vertical() ::
    #{ 'catalog_type' := binary(),
       'in_stock' := integer(),
       'out_of_stock' := integer(),
       'preorder' := integer(),
       'total' := integer(),
       'videos' := integer(),
       'app_links' := integer(),
       'images' := integer()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'in_stock' := InStock,
          'out_of_stock' := OutOfStock,
          'preorder' := Preorder,
          'total' := Total,
          'videos' := Videos,
          'app_links' := AppLinks,
          'images' := Images
        }) ->
    #{ 'catalog_type' => CatalogType,
       'in_stock' => InStock,
       'out_of_stock' => OutOfStock,
       'preorder' => Preorder,
       'total' => Total,
       'videos' => Videos,
       'app_links' => AppLinks,
       'images' => Images
     }.
