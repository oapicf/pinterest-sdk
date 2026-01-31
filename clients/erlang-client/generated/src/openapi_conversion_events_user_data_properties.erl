-module(openapi_conversion_events_user_data_properties).

-export([encode/1]).

-export_type([openapi_conversion_events_user_data_properties/0]).

-type openapi_conversion_events_user_data_properties() ::
    #{ 'click_id' => binary(),
       'client_ip_address' => binary(),
       'client_user_agent' => binary(),
       'country' => list(),
       'ct' => list(),
       'db' => list(),
       'em' => list(),
       'external_id' => list(),
       'fn' => list(),
       'ge' => list(),
       'hashed_maids' => list(),
       'ln' => list(),
       'partner_id' => binary(),
       'ph' => list(),
       'st' => list(),
       'zp' => list()
     }.

encode(#{ 'click_id' := ClickId,
          'client_ip_address' := ClientIpAddress,
          'client_user_agent' := ClientUserAgent,
          'country' := Country,
          'ct' := Ct,
          'db' := Db,
          'em' := Em,
          'external_id' := ExternalId,
          'fn' := Fn,
          'ge' := Ge,
          'hashed_maids' := HashedMaids,
          'ln' := Ln,
          'partner_id' := PartnerId,
          'ph' := Ph,
          'st' := St,
          'zp' := Zp
        }) ->
    #{ 'click_id' => ClickId,
       'client_ip_address' => ClientIpAddress,
       'client_user_agent' => ClientUserAgent,
       'country' => Country,
       'ct' => Ct,
       'db' => Db,
       'em' => Em,
       'external_id' => ExternalId,
       'fn' => Fn,
       'ge' => Ge,
       'hashed_maids' => HashedMaids,
       'ln' => Ln,
       'partner_id' => PartnerId,
       'ph' => Ph,
       'st' => St,
       'zp' => Zp
     }.
