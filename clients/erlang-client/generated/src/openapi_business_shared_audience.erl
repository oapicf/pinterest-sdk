-module(openapi_business_shared_audience).

-export([encode/1]).

-export_type([openapi_business_shared_audience/0]).

-type openapi_business_shared_audience() ::
    #{ 'audience_id' := binary(),
       'operation_type' := openapi_operation_type:openapi_operation_type(),
       'recipient_business_ids' := list()
     }.

encode(#{ 'audience_id' := AudienceId,
          'operation_type' := OperationType,
          'recipient_business_ids' := RecipientBusinessIds
        }) ->
    #{ 'audience_id' => AudienceId,
       'operation_type' => OperationType,
       'recipient_business_ids' => RecipientBusinessIds
     }.
