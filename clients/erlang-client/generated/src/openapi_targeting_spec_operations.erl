-module(openapi_targeting_spec_operations).

-export([encode/1]).

-export_type([openapi_targeting_spec_operations/0]).

-type openapi_targeting_spec_operations() ::
    #{ 'field' := binary(),
       'operation' := binary(),
       'values' := list(),
       'value' := binary()
     }.

encode(#{ 'field' := Field,
          'operation' := Operation,
          'values' := Values,
          'value' := Value
        }) ->
    #{ 'field' => Field,
       'operation' => Operation,
       'values' => Values,
       'value' => Value
     }.
