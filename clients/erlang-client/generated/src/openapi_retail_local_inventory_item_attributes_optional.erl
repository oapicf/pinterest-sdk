-module(openapi_retail_local_inventory_item_attributes_optional).

-export([encode/1]).

-export_type([openapi_retail_local_inventory_item_attributes_optional/0]).

-type openapi_retail_local_inventory_item_attributes_optional() ::
    #{ 'ad_link' => binary(),
       'availability' => openapi_item_availability:openapi_item_availability(),
       'price' => binary(),
       'sale_price' => binary()
     }.

encode(#{ 'ad_link' := AdLink,
          'availability' := Availability,
          'price' := Price,
          'sale_price' := SalePrice
        }) ->
    #{ 'ad_link' => AdLink,
       'availability' => Availability,
       'price' => Price,
       'sale_price' => SalePrice
     }.
