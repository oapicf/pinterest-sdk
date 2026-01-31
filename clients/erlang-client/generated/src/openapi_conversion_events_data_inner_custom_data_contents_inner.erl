-module(openapi_conversion_events_data_inner_custom_data_contents_inner).

-export([encode/1]).

-export_type([openapi_conversion_events_data_inner_custom_data_contents_inner/0]).

-type openapi_conversion_events_data_inner_custom_data_contents_inner() ::
    #{ 'id' => binary(),
       'item_brand' => binary(),
       'item_category' => binary(),
       'item_name' => binary(),
       'item_price' => binary(),
       'quantity' => integer()
     }.

encode(#{ 'id' := Id,
          'item_brand' := ItemBrand,
          'item_category' := ItemCategory,
          'item_name' := ItemName,
          'item_price' := ItemPrice,
          'quantity' := Quantity
        }) ->
    #{ 'id' => Id,
       'item_brand' => ItemBrand,
       'item_category' => ItemCategory,
       'item_name' => ItemName,
       'item_price' => ItemPrice,
       'quantity' => Quantity
     }.
