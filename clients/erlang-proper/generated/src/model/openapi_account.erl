-module(openapi_account).

-include("openapi.hrl").

-export([openapi_account/0]).

-export([openapi_account/1]).

-export_type([openapi_account/0]).

-type openapi_account() ::
  [ {'about', binary() }
  | {'account_type', binary() }
  | {'board_count', integer() }
  | {'business_name', binary() }
  | {'follower_count', integer() }
  | {'following_count', integer() }
  | {'id', binary() }
  | {'monthly_views', integer() }
  | {'pin_count', integer() }
  | {'profile_image', binary() }
  | {'username', binary() }
  | {'website_url', binary() }
  ].


openapi_account() ->
    openapi_account([]).

openapi_account(Fields) ->
  Default = [ {'about', binary() }
            , {'account_type', elements([<<"PINNER">>, <<"BUSINESS">>]) }
            , {'board_count', integer() }
            , {'business_name', binary() }
            , {'follower_count', integer() }
            , {'following_count', integer() }
            , {'id', binary() }
            , {'monthly_views', integer() }
            , {'pin_count', integer() }
            , {'profile_image', binary() }
            , {'username', binary() }
            , {'website_url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

