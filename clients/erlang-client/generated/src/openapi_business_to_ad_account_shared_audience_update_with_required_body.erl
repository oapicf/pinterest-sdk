-module(openapi_business_to_ad_account_shared_audience_update_with_required_body).

-export([encode/1]).

-export_type([openapi_business_to_ad_account_shared_audience_update_with_required_body/0]).

-type openapi_business_to_ad_account_shared_audience_update_with_required_body() ::
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
