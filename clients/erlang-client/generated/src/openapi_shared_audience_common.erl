-module(openapi_shared_audience_common).

-export([encode/1]).

-export_type([openapi_shared_audience_common/0]).

-type openapi_shared_audience_common() ::
    #{ 'audience_id' => binary(),
       'operation_type' => openapi_operation_type:openapi_operation_type()
     }.

encode(#{ 'audience_id' := AudienceId,
          'operation_type' := OperationType
        }) ->
    #{ 'audience_id' => AudienceId,
       'operation_type' => OperationType
     }.
