-module(openapi_conversion_events_user_data_any_of_1).

-export([encode/1]).

-export_type([openapi_conversion_events_user_data_any_of_1/0]).

-type openapi_conversion_events_user_data_any_of_1() ::
    #{ 'em' => list(),
       'hashed_maids' := list(),
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
