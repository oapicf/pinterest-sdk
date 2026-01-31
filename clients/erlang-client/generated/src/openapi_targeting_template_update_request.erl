-module(openapi_targeting_template_update_request).

-export([encode/1]).

-export_type([openapi_targeting_template_update_request/0]).

-type openapi_targeting_template_update_request() ::
    #{ 'id' := binary(),
       'operation_type' := binary(),
       'targeting_attributes' => openapi_targeting_spec:openapi_targeting_spec()
     }.

encode(#{ 'id' := Id,
          'operation_type' := OperationType,
          'targeting_attributes' := TargetingAttributes
        }) ->
    #{ 'id' => Id,
       'operation_type' => OperationType,
       'targeting_attributes' => TargetingAttributes
     }.
