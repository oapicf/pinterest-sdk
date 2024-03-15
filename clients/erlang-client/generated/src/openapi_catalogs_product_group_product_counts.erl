-module(openapi_catalogs_product_group_product_counts).

-export([encode/1]).

-export_type([openapi_catalogs_product_group_product_counts/0]).

-type openapi_catalogs_product_group_product_counts() ::
    #{ 'in_stock' := integer(),
       'out_of_stock' := integer(),
       'preorder' := integer(),
       'total' := integer()
     }.

encode(#{ 'in_stock' := InStock,
          'out_of_stock' := OutOfStock,
          'preorder' := Preorder,
          'total' := Total
        }) ->
    #{ 'in_stock' => InStock,
       'out_of_stock' => OutOfStock,
       'preorder' => Preorder,
       'total' => Total
     }.
