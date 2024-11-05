-module(openapi_conversion_events_user_data_any_of).

-export([encode/1]).

-export_type([openapi_conversion_events_user_data_any_of/0]).

-type openapi_conversion_events_user_data_any_of() ::
    #{ 'em' := list(),
       'hashed_maids' => list(),
       'client_ip_address' => binary(),
       'client_user_agent' => binary()
     }.

encode(#{ 'em' := Em,
          'hashed_maids' := HashedMaids,
          'client_ip_address' := ClientIpAddress,
          'client_user_agent' := ClientUserAgent
        }) ->
    #{ 'em' => Em,
       'hashed_maids' => HashedMaids,
       'client_ip_address' => ClientIpAddress,
       'client_user_agent' => ClientUserAgent
     }.
