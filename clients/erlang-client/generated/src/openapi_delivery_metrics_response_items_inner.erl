-module(openapi_delivery_metrics_response_items_inner).

-export([encode/1]).

-export_type([openapi_delivery_metrics_response_items_inner/0]).

-type openapi_delivery_metrics_response_items_inner() ::
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
