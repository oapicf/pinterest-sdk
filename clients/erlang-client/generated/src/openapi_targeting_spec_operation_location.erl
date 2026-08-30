-module(openapi_targeting_spec_operation_location).

-export([encode/1]).

-export_type([openapi_targeting_spec_operation_location/0]).

-type openapi_targeting_spec_operation_location() ::
    #{ 'field' := binary(),
       'operation' := openapi_targeting_spec_list_operation:openapi_targeting_spec_list_operation(),
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
