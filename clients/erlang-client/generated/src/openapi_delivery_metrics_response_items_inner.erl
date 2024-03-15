-module(openapi_delivery_metrics_response_items_inner).

-export([encode/1]).

-export_type([openapi_delivery_metrics_response_items_inner/0]).

-type openapi_delivery_metrics_response_items_inner() ::
    #{ 'name' => binary(),
       'category' => binary(),
       'definition' => binary(),
       'display_name' => binary()
     }.

encode(#{ 'name' := Name,
          'category' := Category,
          'definition' := Definition,
          'display_name' := DisplayName
        }) ->
    #{ 'name' => Name,
       'category' => Category,
       'definition' => Definition,
       'display_name' => DisplayName
     }.
