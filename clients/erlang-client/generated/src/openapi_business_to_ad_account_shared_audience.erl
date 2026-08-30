-module(openapi_business_to_ad_account_shared_audience).

-export([encode/1]).

-export_type([openapi_business_to_ad_account_shared_audience/0]).

-type openapi_business_to_ad_account_shared_audience() ::
    #{ 'audience_id' := binary(),
       'permissions' => list(),
       'recipient_account_ids' := list()
     }.

encode(#{ 'audience_id' := AudienceId,
          'permissions' := Permissions,
          'recipient_account_ids' := RecipientAccountIds
        }) ->
    #{ 'audience_id' => AudienceId,
       'permissions' => Permissions,
       'recipient_account_ids' => RecipientAccountIds
     }.
