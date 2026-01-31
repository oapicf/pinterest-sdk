-module(openapi_oauth_access_token_response_refresh).

-include("openapi.hrl").

-export([openapi_oauth_access_token_response_refresh/0]).

-export([openapi_oauth_access_token_response_refresh/1]).

-export_type([openapi_oauth_access_token_response_refresh/0]).

-type openapi_oauth_access_token_response_refresh() ::
  [ {'access_token', binary() }
  | {'expires_in', integer() }
  | {'response_type', binary() }
  | {'scope', binary() }
  | {'token_type', binary() }
  | {'refresh_token', binary() }
  | {'refresh_token_expires_at', integer() }
  | {'refresh_token_expires_in', integer() }
  ].


openapi_oauth_access_token_response_refresh() ->
    openapi_oauth_access_token_response_refresh([]).

openapi_oauth_access_token_response_refresh(Fields) ->
  Default = [ {'access_token', binary() }
            , {'expires_in', integer() }
            , {'response_type', elements([<<"authorization_code">>, <<"refresh_token">>, <<"client_credentials">>]) }
            , {'scope', binary() }
            , {'token_type', binary() }
            , {'refresh_token', binary() }
            , {'refresh_token_expires_at', integer() }
            , {'refresh_token_expires_in', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

