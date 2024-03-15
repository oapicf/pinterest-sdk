-module(openapi_conversion_events_data_inner_custom_data).

-export([encode/1]).

-export_type([openapi_conversion_events_data_inner_custom_data/0]).

-type openapi_conversion_events_data_inner_custom_data() ::
    #{ 'currency' => binary(),
       'value' => binary(),
       'content_ids' => list(),
       'content_name' => binary(),
       'content_category' => binary(),
       'content_brand' => binary(),
       'contents' => list(),
       'num_items' => integer(),
       'order_id' => binary(),
       'search_string' => binary(),
       'opt_out_type' => binary(),
       'np' => binary()
     }.

encode(#{ 'currency' := Currency,
          'value' := Value,
          'content_ids' := ContentIds,
          'content_name' := ContentName,
          'content_category' := ContentCategory,
          'content_brand' := ContentBrand,
          'contents' := Contents,
          'num_items' := NumItems,
          'order_id' := OrderId,
          'search_string' := SearchString,
          'opt_out_type' := OptOutType,
          'np' := Np
        }) ->
    #{ 'currency' => Currency,
       'value' => Value,
       'content_ids' => ContentIds,
       'content_name' => ContentName,
       'content_category' => ContentCategory,
       'content_brand' => ContentBrand,
       'contents' => Contents,
       'num_items' => NumItems,
       'order_id' => OrderId,
       'search_string' => SearchString,
       'opt_out_type' => OptOutType,
       'np' => Np
     }.
