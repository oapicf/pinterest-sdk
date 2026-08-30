-module(openapi_oauth_access_token).

-include("openapi.hrl").

-export([openapi_oauth_access_token/0]).

-export([openapi_oauth_access_token/1]).

-export_type([openapi_oauth_access_token/0]).

-type openapi_oauth_access_token() ::
  [ {'access_token', binary() }
  | {'expires_in', integer() }
  | {'refresh_token', binary() }
  | {'refresh_token_expires_at', integer() }
  | {'refresh_token_expires_in', integer() }
  | {'response_type', openapi_token_grant_type:openapi_token_grant_type() }
  | {'scope', binary() }
  | {'token_type', binary() }
  ].


openapi_oauth_access_token() ->
    openapi_oauth_access_token([]).

openapi_oauth_access_token(Fields) ->
  Default = [ {'access_token', binary() }
            , {'expires_in', integer() }
            , {'refresh_token', binary() }
            , {'refresh_token_expires_at', integer() }
            , {'refresh_token_expires_in', integer() }
            , {'response_type', openapi_token_grant_type:openapi_token_grant_type() }
            , {'scope', binary() }
            , {'token_type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

