-module(openapi_business_shared_audience_response).

-export([encode/1]).

-export_type([openapi_business_shared_audience_response/0]).

-type openapi_business_shared_audience_response() ::
    #{ 'audience_id' => binary(),
       'permissions' => list(),
       'recipient_business_ids' => list()
     }.

encode(#{ 'audience_id' := AudienceId,
          'permissions' := Permissions,
          'recipient_business_ids' := RecipientBusinessIds
        }) ->
    #{ 'audience_id' => AudienceId,
       'permissions' => Permissions,
       'recipient_business_ids' => RecipientBusinessIds
     }.
