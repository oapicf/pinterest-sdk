-module(openapi_catalogs_feed_credentials).

-export([encode/1]).

-export_type([openapi_catalogs_feed_credentials/0]).

-type openapi_catalogs_feed_credentials() ::
    #{ 'password' := binary(),
       'username' := binary()
     }.

encode(#{ 'password' := Password,
          'username' := Username
        }) ->
    #{ 'password' => Password,
       'username' => Username
     }.
