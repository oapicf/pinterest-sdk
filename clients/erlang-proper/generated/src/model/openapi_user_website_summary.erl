-module(openapi_user_website_summary).

-include("openapi.hrl").

-export([openapi_user_website_summary/0]).

-export([openapi_user_website_summary/1]).

-export_type([openapi_user_website_summary/0]).

-type openapi_user_website_summary() ::
  [ {'website', binary() }
  | {'status', binary() }
  | {'verified_at', binary() }
  ].


openapi_user_website_summary() ->
    openapi_user_website_summary([]).

openapi_user_website_summary(Fields) ->
  Default = [ {'website', binary() }
            , {'status', binary() }
            , {'verified_at', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

