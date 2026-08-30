-module(openapi_user_website).

-include("openapi.hrl").

-export([openapi_user_website/0]).

-export([openapi_user_website/1]).

-export_type([openapi_user_website/0]).

-type openapi_user_website() ::
  [ {'status', binary() }
  | {'verified_at', binary() }
  | {'website', binary() }
  ].


openapi_user_website() ->
    openapi_user_website([]).

openapi_user_website(Fields) ->
  Default = [ {'status', binary() }
            , {'verified_at', binary() }
            , {'website', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

