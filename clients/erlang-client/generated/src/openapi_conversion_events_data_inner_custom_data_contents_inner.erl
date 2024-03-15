-module(openapi_conversion_events_data_inner_custom_data_contents_inner).

-export([encode/1]).

-export_type([openapi_conversion_events_data_inner_custom_data_contents_inner/0]).

-type openapi_conversion_events_data_inner_custom_data_contents_inner() ::
    #{ 'id' => binary(),
       'item_price' => binary(),
       'quantity' => integer(),
       'item_name' => binary(),
       'item_category' => binary(),
       'item_brand' => binary()
     }.

encode(#{ 'id' := Id,
          'item_price' := ItemPrice,
          'quantity' := Quantity,
          'item_name' := ItemName,
          'item_category' := ItemCategory,
          'item_brand' := ItemBrand
        }) ->
    #{ 'id' => Id,
       'item_price' => ItemPrice,
       'quantity' => Quantity,
       'item_name' => ItemName,
       'item_category' => ItemCategory,
       'item_brand' => ItemBrand
     }.
