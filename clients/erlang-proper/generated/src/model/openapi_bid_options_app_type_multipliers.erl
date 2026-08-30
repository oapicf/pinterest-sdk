-module(openapi_bid_options_app_type_multipliers).

-include("openapi.hrl").

-export([openapi_bid_options_app_type_multipliers/0]).

-export([openapi_bid_options_app_type_multipliers/1]).

-export_type([openapi_bid_options_app_type_multipliers/0]).

-type openapi_bid_options_app_type_multipliers() ::
  [ {'android_mobile', integer() }
  | {'android_tablet', integer() }
  | {'ipad', integer() }
  | {'iphone', integer() }
  | {'web', integer() }
  | {'web_mobile', integer() }
  ].


openapi_bid_options_app_type_multipliers() ->
    openapi_bid_options_app_type_multipliers([]).

openapi_bid_options_app_type_multipliers(Fields) ->
  Default = [ {'android_mobile', integer() }
            , {'android_tablet', integer() }
            , {'ipad', integer() }
            , {'iphone', integer() }
            , {'web', integer() }
            , {'web_mobile', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

