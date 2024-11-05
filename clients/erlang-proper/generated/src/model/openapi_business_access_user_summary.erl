-module(openapi_business_access_user_summary).

-include("openapi.hrl").

-export([openapi_business_access_user_summary/0]).

-export([openapi_business_access_user_summary/1]).

-export_type([openapi_business_access_user_summary/0]).

-type openapi_business_access_user_summary() ::
  [ {'email', binary() }
  | {'id', binary() }
  | {'username', binary() }
  ].


openapi_business_access_user_summary() ->
    openapi_business_access_user_summary([]).

openapi_business_access_user_summary(Fields) ->
  Default = [ {'email', binary() }
            , {'id', binary(1, 20) }
            , {'username', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

