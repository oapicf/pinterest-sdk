-module(openapi_targeting_spec_operation_audience_exclude).

-export([encode/1]).

-export_type([openapi_targeting_spec_operation_audience_exclude/0]).

-type openapi_targeting_spec_operation_audience_exclude() ::
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
