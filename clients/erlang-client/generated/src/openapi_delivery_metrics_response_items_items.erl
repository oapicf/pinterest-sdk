-module(openapi_delivery_metrics_response_items_items).

-export([encode/1]).

-export_type([openapi_delivery_metrics_response_items_items/0]).

-type openapi_delivery_metrics_response_items_items() ::
    #{ 'category' => binary(),
       'definition' => binary(),
       'display_name' => binary(),
       'name' => binary()
     }.

encode(#{ 'category' := Category,
          'definition' := Definition,
          'display_name' := DisplayName,
          'name' := Name
        }) ->
    #{ 'category' => Category,
       'definition' => Definition,
       'display_name' => DisplayName,
       'name' => Name
     }.
