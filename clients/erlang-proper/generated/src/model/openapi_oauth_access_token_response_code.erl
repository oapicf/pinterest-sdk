-module(openapi_oauth_access_token_response_code).

-include("openapi.hrl").

-export([openapi_oauth_access_token_response_code/0]).

-export([openapi_oauth_access_token_response_code/1]).

-export_type([openapi_oauth_access_token_response_code/0]).

-type openapi_oauth_access_token_response_code() ::
  [ {'refresh_token', binary() }
  | {'refresh_token_expires_at', integer() }
  | {'refresh_token_expires_in', integer() }
  | {'access_token', binary() }
  | {'expires_in', integer() }
  | {'response_type', binary() }
  | {'scope', binary() }
  | {'token_type', binary() }
  ].


openapi_oauth_access_token_response_code() ->
    openapi_oauth_access_token_response_code([]).

openapi_oauth_access_token_response_code(Fields) ->
  Default = [ {'refresh_token', binary() }
            , {'refresh_token_expires_at', integer() }
            , {'refresh_token_expires_in', integer() }
            , {'access_token', binary() }
            , {'expires_in', integer() }
            , {'response_type', elements([<<"authorization_code">>, <<"refresh_token">>, <<"client_credentials">>]) }
            , {'scope', binary() }
            , {'token_type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

