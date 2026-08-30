-module(openapi_customer_segment_update_request_update_with_required_body).

-export([encode/1]).

-export_type([openapi_customer_segment_update_request_update_with_required_body/0]).

-type openapi_customer_segment_update_request_update_with_required_body() ::
    #{ 'audience_ids' => list(),
       'id' := binary(),
       'operation_type' := openapi_audience_update_operation_type:openapi_audience_update_operation_type()
     }.

encode(#{ 'audience_ids' := AudienceIds,
          'id' := Id,
          'operation_type' := OperationType
        }) ->
    #{ 'audience_ids' => AudienceIds,
       'id' => Id,
       'operation_type' => OperationType
     }.
