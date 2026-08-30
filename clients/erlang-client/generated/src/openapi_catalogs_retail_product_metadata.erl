-module(openapi_catalogs_retail_product_metadata).

-export([encode/1]).

-export_type([openapi_catalogs_retail_product_metadata/0]).

-type openapi_catalogs_retail_product_metadata() ::
    #{ 'availability' := openapi_product_availability:openapi_product_availability(),
       'currency' := openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency(),
       'item_group_id' := binary(),
       'item_id' := binary(),
       'price' := integer(),
       'sale_price' := integer()
     }.

encode(#{ 'availability' := Availability,
          'currency' := Currency,
          'item_group_id' := ItemGroupId,
          'item_id' := ItemId,
          'price' := Price,
          'sale_price' := SalePrice
        }) ->
    #{ 'availability' => Availability,
       'currency' => Currency,
       'item_group_id' => ItemGroupId,
       'item_id' => ItemId,
       'price' => Price,
       'sale_price' => SalePrice
     }.
