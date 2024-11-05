-module(openapi_conversion_events_user_data).

-export([encode/1]).

-export_type([openapi_conversion_events_user_data/0]).

-type openapi_conversion_events_user_data() ::
    #{ 'ph' => list(),
       'ge' => list(),
       'db' => list(),
       'ln' => list(),
       'fn' => list(),
       'ct' => list(),
       'st' => list(),
       'zp' => list(),
       'country' => list(),
       'external_id' => list(),
       'click_id' => binary(),
       'partner_id' => binary(),
       'em' := list(),
       'hashed_maids' := list(),
       'client_ip_address' := binary(),
       'client_user_agent' := binary()
     }.

encode(#{ 'ph' := Ph,
          'ge' := Ge,
          'db' := Db,
          'ln' := Ln,
          'fn' := Fn,
          'ct' := Ct,
          'st' := St,
          'zp' := Zp,
          'country' := Country,
          'external_id' := ExternalId,
          'click_id' := ClickId,
          'partner_id' := PartnerId,
          'em' := Em,
          'hashed_maids' := HashedMaids,
          'client_ip_address' := ClientIpAddress,
          'client_user_agent' := ClientUserAgent
        }) ->
    #{ 'ph' => Ph,
       'ge' => Ge,
       'db' => Db,
       'ln' => Ln,
       'fn' => Fn,
       'ct' => Ct,
       'st' => St,
       'zp' => Zp,
       'country' => Country,
       'external_id' => ExternalId,
       'click_id' => ClickId,
       'partner_id' => PartnerId,
       'em' => Em,
       'hashed_maids' => HashedMaids,
       'client_ip_address' => ClientIpAddress,
       'client_user_agent' => ClientUserAgent
     }.
