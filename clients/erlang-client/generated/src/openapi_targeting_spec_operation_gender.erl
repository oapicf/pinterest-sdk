-module(openapi_targeting_spec_operation_gender).

-export([encode/1]).

-export_type([openapi_targeting_spec_operation_gender/0]).

-type openapi_targeting_spec_operation_gender() ::
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
