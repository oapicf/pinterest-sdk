-module(openapi_oauth_access_token_request_refresh).

-include("openapi.hrl").

-export([openapi_oauth_access_token_request_refresh/0]).

-export([openapi_oauth_access_token_request_refresh/1]).

-export_type([openapi_oauth_access_token_request_refresh/0]).

-type openapi_oauth_access_token_request_refresh() ::
  [ {'grant_type', binary() }
  | {'refresh_token', binary() }
  | {'scope', binary() }
  | {'refresh_on', boolean() }
  ].


openapi_oauth_access_token_request_refresh() ->
    openapi_oauth_access_token_request_refresh([]).

openapi_oauth_access_token_request_refresh(Fields) ->
  Default = [ {'grant_type', elements([<<"authorization_code">>, <<"refresh_token">>]) }
            , {'refresh_token', binary() }
            , {'scope', binary() }
            , {'refresh_on', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

