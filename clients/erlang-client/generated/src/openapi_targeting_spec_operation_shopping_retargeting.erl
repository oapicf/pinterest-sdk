-module(openapi_targeting_spec_operation_shopping_retargeting).

-export([encode/1]).

-export_type([openapi_targeting_spec_operation_shopping_retargeting/0]).

-type openapi_targeting_spec_operation_shopping_retargeting() ::
    #{ 'field' := binary(),
       'operation' := binary(),
       'values' := list()
     }.

encode(#{ 'field' := Field,
          'operation' := Operation,
          'values' := Values
        }) ->
    #{ 'field' => Field,
       'operation' => Operation,
       'values' => Values
     }.
