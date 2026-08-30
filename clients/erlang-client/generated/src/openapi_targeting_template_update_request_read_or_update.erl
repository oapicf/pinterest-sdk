-module(openapi_targeting_template_update_request_read_or_update).

-export([encode/1]).

-export_type([openapi_targeting_template_update_request_read_or_update/0]).

-type openapi_targeting_template_update_request_read_or_update() ::
    #{ 'id' := binary(),
       'operation_type' := openapi_audience_update_operation_type:openapi_audience_update_operation_type(),
       'targeting_attributes' => openapi_targeting_spec_optimal:openapi_targeting_spec_optimal()
     }.

encode(#{ 'id' := Id,
          'operation_type' := OperationType,
          'targeting_attributes' := TargetingAttributes
        }) ->
    #{ 'id' => Id,
       'operation_type' => OperationType,
       'targeting_attributes' => TargetingAttributes
     }.
