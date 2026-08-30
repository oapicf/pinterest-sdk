-module(openapi_attribution_windows).

-include("openapi.hrl").

-export([openapi_attribution_windows/0]).

-export([openapi_attribution_windows/1]).

-export_type([openapi_attribution_windows/0]).

-type openapi_attribution_windows() ::
  [ {'click_window_days', integer() }
  | {'engagement_window_days', integer() }
  | {'view_window_days', integer() }
  ].


openapi_attribution_windows() ->
    openapi_attribution_windows([]).

openapi_attribution_windows(Fields) ->
  Default = [ {'click_window_days', integer() }
            , {'engagement_window_days', integer() }
            , {'view_window_days', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

