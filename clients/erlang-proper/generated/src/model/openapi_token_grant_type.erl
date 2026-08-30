-module(openapi_token_grant_type).

-include("openapi.hrl").

-export([openapi_token_grant_type/0]).

-export_type([openapi_token_grant_type/0]).

-type openapi_token_grant_type() ::
  binary().

openapi_token_grant_type() ->
  elements([<<"authorization_code">>, <<"refresh_token">>, <<"client_credentials">>]).

