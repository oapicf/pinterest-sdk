-module(openapi_targeting_spec_operation_list).

-export([encode/1]).

-export_type([openapi_targeting_spec_operation_list/0]).

-type openapi_targeting_spec_operation_list() ::
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
