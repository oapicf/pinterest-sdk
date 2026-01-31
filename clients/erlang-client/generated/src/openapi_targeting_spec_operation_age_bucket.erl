-module(openapi_targeting_spec_operation_age_bucket).

-export([encode/1]).

-export_type([openapi_targeting_spec_operation_age_bucket/0]).

-type openapi_targeting_spec_operation_age_bucket() ::
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
