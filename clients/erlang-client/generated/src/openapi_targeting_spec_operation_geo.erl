-module(openapi_targeting_spec_operation_geo).

-export([encode/1]).

-export_type([openapi_targeting_spec_operation_geo/0]).

-type openapi_targeting_spec_operation_geo() ::
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
