-module(openapi_catalogs_product_metadata).

-export([encode/1]).

-export_type([openapi_catalogs_product_metadata/0]).

-type openapi_catalogs_product_metadata() ::
    #{ 'item_id' := binary(),
       'item_group_id' := binary(),
       'availability' := openapi_non_nullable_product_availability_type:openapi_non_nullable_product_availability_type(),
       'price' := integer(),
       'sale_price' := integer(),
       'currency' := openapi_non_nullable_catalogs_currency:openapi_non_nullable_catalogs_currency()
     }.

encode(#{ 'item_id' := ItemId,
          'item_group_id' := ItemGroupId,
          'availability' := Availability,
          'price' := Price,
          'sale_price' := SalePrice,
          'currency' := Currency
        }) ->
    #{ 'item_id' => ItemId,
       'item_group_id' => ItemGroupId,
       'availability' => Availability,
       'price' => Price,
       'sale_price' => SalePrice,
       'currency' => Currency
     }.
