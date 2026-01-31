-module(openapi_oauth_access_token_response_everlasting_refresh).

-include("openapi.hrl").

-export([openapi_oauth_access_token_response_everlasting_refresh/0]).

-export([openapi_oauth_access_token_response_everlasting_refresh/1]).

-export_type([openapi_oauth_access_token_response_everlasting_refresh/0]).

-type openapi_oauth_access_token_response_everlasting_refresh() ::
  [ {'refresh_token', binary() }
  | {'refresh_token_expires_in', integer() }
  | {'refresh_token_expires_at', integer() }
  | {'response_type', binary() }
  | {'access_token', binary() }
  | {'token_type', binary() }
  | {'expires_in', integer() }
  | {'scope', binary() }
  ].


openapi_oauth_access_token_response_everlasting_refresh() ->
    openapi_oauth_access_token_response_everlasting_refresh([]).

openapi_oauth_access_token_response_everlasting_refresh(Fields) ->
  Default = [ {'refresh_token', binary() }
            , {'refresh_token_expires_in', integer() }
            , {'refresh_token_expires_at', integer() }
            , {'response_type', elements([<<"authorization_code">>, <<"refresh_token">>, <<"client_credentials">>]) }
            , {'access_token', binary() }
            , {'token_type', binary() }
            , {'expires_in', integer() }
            , {'scope', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

