-module(openapi_targeting_spec_operation_min_max_age).

-export([encode/1]).

-export_type([openapi_targeting_spec_operation_min_max_age/0]).

-type openapi_targeting_spec_operation_min_max_age() ::
    #{ 'field' := binary(),
       'operation' := binary(),
       'value' := binary()
     }.

encode(#{ 'field' := Field,
          'operation' := Operation,
          'value' := Value
        }) ->
    #{ 'field' => Field,
       'operation' => Operation,
       'value' => Value
     }.
