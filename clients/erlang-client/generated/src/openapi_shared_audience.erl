-module(openapi_shared_audience).

-export([encode/1]).

-export_type([openapi_shared_audience/0]).

-type openapi_shared_audience() ::
    #{ 'audience_id' := binary(),
       'operation_type' := openapi_operation_type:openapi_operation_type(),
       'recipient_account_ids' := list()
     }.

encode(#{ 'audience_id' := AudienceId,
          'operation_type' := OperationType,
          'recipient_account_ids' := RecipientAccountIds
        }) ->
    #{ 'audience_id' => AudienceId,
       'operation_type' => OperationType,
       'recipient_account_ids' => RecipientAccountIds
     }.
