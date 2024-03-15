-module(openapi_line_item).

-export([encode/1]).

-export_type([openapi_line_item/0]).

-type openapi_line_item() ::
    #{ 'product_brand' => binary(),
       'product_category' => binary(),
       'product_id' => integer(),
       'product_name' => binary(),
       'product_price' => binary(),
       'product_quantity' => integer(),
       'product_variant' => binary(),
       'product_variant_id' => binary()
     }.

encode(#{ 'product_brand' := ProductBrand,
          'product_category' := ProductCategory,
          'product_id' := ProductId,
          'product_name' := ProductName,
          'product_price' := ProductPrice,
          'product_quantity' := ProductQuantity,
          'product_variant' := ProductVariant,
          'product_variant_id' := ProductVariantId
        }) ->
    #{ 'product_brand' => ProductBrand,
       'product_category' => ProductCategory,
       'product_id' => ProductId,
       'product_name' => ProductName,
       'product_price' => ProductPrice,
       'product_quantity' => ProductQuantity,
       'product_variant' => ProductVariant,
       'product_variant_id' => ProductVariantId
     }.
