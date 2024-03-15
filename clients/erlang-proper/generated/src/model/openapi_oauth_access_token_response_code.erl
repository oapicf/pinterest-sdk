-module(openapi_oauth_access_token_response_code).

-include("openapi.hrl").

-export([openapi_oauth_access_token_response_code/0]).

-export([openapi_oauth_access_token_response_code/1]).

-export_type([openapi_oauth_access_token_response_code/0]).

-type openapi_oauth_access_token_response_code() ::
  [ {'response_type', binary() }
  | {'access_token', binary() }
  | {'token_type', binary() }
  | {'expires_in', integer() }
  | {'scope', binary() }
  | {'refresh_token', binary() }
  | {'refresh_token_expires_in', integer() }
  ].


openapi_oauth_access_token_response_code() ->
    openapi_oauth_access_token_response_code([]).

openapi_oauth_access_token_response_code(Fields) ->
  Default = [ {'response_type', elements([<<"authorization_code">>, <<"refresh_token">>]) }
            , {'access_token', binary() }
            , {'token_type', binary() }
            , {'expires_in', integer() }
            , {'scope', binary() }
            , {'refresh_token', binary() }
            , {'refresh_token_expires_in', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

