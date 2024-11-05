-module(openapi_shared_audience_response).

-export([encode/1]).

-export_type([openapi_shared_audience_response/0]).

-type openapi_shared_audience_response() ::
    #{ 'audience_id' => binary(),
       'permissions' => list(),
       'recipient_account_ids' => list()
     }.

encode(#{ 'audience_id' := AudienceId,
          'permissions' := Permissions,
          'recipient_account_ids' := RecipientAccountIds
        }) ->
    #{ 'audience_id' => AudienceId,
       'permissions' => Permissions,
       'recipient_account_ids' => RecipientAccountIds
     }.
