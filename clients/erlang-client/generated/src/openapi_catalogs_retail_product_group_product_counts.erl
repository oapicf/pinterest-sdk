-module(openapi_catalogs_retail_product_group_product_counts).

-export([encode/1]).

-export_type([openapi_catalogs_retail_product_group_product_counts/0]).

-type openapi_catalogs_retail_product_group_product_counts() ::
    #{ 'catalog_type' := binary(),
       'in_stock' := integer(),
       'out_of_stock' := integer(),
       'preorder' := integer(),
       'total' := integer(),
       'videos' => integer()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'in_stock' := InStock,
          'out_of_stock' := OutOfStock,
          'preorder' := Preorder,
          'total' := Total,
          'videos' := Videos
        }) ->
    #{ 'catalog_type' => CatalogType,
       'in_stock' => InStock,
       'out_of_stock' => OutOfStock,
       'preorder' => Preorder,
       'total' => Total,
       'videos' => Videos
     }.
