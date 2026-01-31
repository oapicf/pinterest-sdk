-module(openapi_targeting_spec_operation_string).

-export([encode/1]).

-export_type([openapi_targeting_spec_operation_string/0]).

-type openapi_targeting_spec_operation_string() ::
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
