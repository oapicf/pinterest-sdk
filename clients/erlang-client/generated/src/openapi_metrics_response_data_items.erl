-module(openapi_metrics_response_data_items).

-export([encode/1]).

-export_type([openapi_metrics_response_data_items/0]).

-type openapi_metrics_response_data_items() ::
    #{ 'metrics' := maps:map(),
       'targeting_type' := binary(),
       'targeting_value' := binary()
     }.

encode(#{ 'metrics' := Metrics,
          'targeting_type' := TargetingType,
          'targeting_value' := TargetingValue
        }) ->
    #{ 'metrics' => Metrics,
       'targeting_type' => TargetingType,
       'targeting_value' => TargetingValue
     }.
