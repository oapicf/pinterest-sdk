-module(openapi_account).

-include("openapi.hrl").

-export([openapi_account/0]).

-export([openapi_account/1]).

-export_type([openapi_account/0]).

-type openapi_account() ::
  [ {'account_type', binary() }
  | {'id', binary() }
  | {'profile_image', binary() }
  | {'website_url', binary() }
  | {'username', binary() }
  | {'about', binary() }
  | {'business_name', binary() }
  | {'board_count', integer() }
  | {'pin_count', integer() }
  | {'follower_count', integer() }
  | {'following_count', integer() }
  | {'monthly_views', integer() }
  ].


openapi_account() ->
    openapi_account([]).

openapi_account(Fields) ->
  Default = [ {'account_type', elements([<<"PINNER">>, <<"BUSINESS">>]) }
            , {'id', binary() }
            , {'profile_image', binary() }
            , {'website_url', binary() }
            , {'username', binary() }
            , {'about', binary() }
            , {'business_name', binary() }
            , {'board_count', integer() }
            , {'pin_count', integer() }
            , {'follower_count', integer() }
            , {'following_count', integer() }
            , {'monthly_views', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

