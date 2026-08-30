-module(openapi_conversion_events_data_items_custom_data_contents_items).

-export([encode/1]).

-export_type([openapi_conversion_events_data_items_custom_data_contents_items/0]).

-type openapi_conversion_events_data_items_custom_data_contents_items() ::
    #{ 'id' => binary(),
       'item_brand' => binary(),
       'item_brand_id' => binary(),
       'item_category' => binary(),
       'item_name' => binary(),
       'item_price' => binary(),
       'quantity' => integer()
     }.

encode(#{ 'id' := Id,
          'item_brand' := ItemBrand,
          'item_brand_id' := ItemBrandId,
          'item_category' := ItemCategory,
          'item_name' := ItemName,
          'item_price' := ItemPrice,
          'quantity' := Quantity
        }) ->
    #{ 'id' => Id,
       'item_brand' => ItemBrand,
       'item_brand_id' => ItemBrandId,
       'item_category' => ItemCategory,
       'item_name' => ItemName,
       'item_price' => ItemPrice,
       'quantity' => Quantity
     }.
