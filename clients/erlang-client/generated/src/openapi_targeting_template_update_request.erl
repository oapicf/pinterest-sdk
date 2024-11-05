-module(openapi_targeting_template_update_request).

-export([encode/1]).

-export_type([openapi_targeting_template_update_request/0]).

-type openapi_targeting_template_update_request() ::
    #{ 'operation_type' := binary(),
       'id' := binary()
     }.

encode(#{ 'operation_type' := OperationType,
          'id' := Id
        }) ->
    #{ 'operation_type' => OperationType,
       'id' => Id
     }.
