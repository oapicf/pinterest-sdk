-module(openapi_oauth_access_token_request_refresh).

-include("openapi.hrl").

-export([openapi_oauth_access_token_request_refresh/0]).

-export([openapi_oauth_access_token_request_refresh/1]).

-export_type([openapi_oauth_access_token_request_refresh/0]).

-type openapi_oauth_access_token_request_refresh() ::
  [ {'refresh_token', binary() }
  | {'scope', binary() }
  | {'refresh_on', boolean() }
  | {'grant_type', binary() }
  ].


openapi_oauth_access_token_request_refresh() ->
    openapi_oauth_access_token_request_refresh([]).

openapi_oauth_access_token_request_refresh(Fields) ->
  Default = [ {'refresh_token', binary() }
            , {'scope', binary() }
            , {'refresh_on', boolean() }
            , {'grant_type', elements([<<"authorization_code">>, <<"refresh_token">>, <<"client_credentials">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

