-module(openapi_account).

-include("openapi.hrl").

-export([openapi_account/0]).

-export([openapi_account/1]).

-export_type([openapi_account/0]).

-type openapi_account() ::
  [ {'account_type', binary() }
  | {'profile_image', binary() }
  | {'website_url', binary() }
  | {'username', binary() }
  ].


openapi_account() ->
    openapi_account([]).

openapi_account(Fields) ->
  Default = [ {'account_type', elements([<<"PINNER">>, <<"BUSINESS">>]) }
            , {'profile_image', binary() }
            , {'website_url', binary() }
            , {'username', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

