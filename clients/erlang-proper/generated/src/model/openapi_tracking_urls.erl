-module(openapi_tracking_urls).

-include("openapi.hrl").

-export([openapi_tracking_urls/0]).

-export([openapi_tracking_urls/1]).

-export_type([openapi_tracking_urls/0]).

-type openapi_tracking_urls() ::
  [ {'audience_verification', list(binary()) }
  | {'buyable_button', list(binary()) }
  | {'click', list(binary()) }
  | {'engagement', list(binary()) }
  | {'impression', list(binary()) }
  ].


openapi_tracking_urls() ->
    openapi_tracking_urls([]).

openapi_tracking_urls(Fields) ->
  Default = [ {'audience_verification', list(binary()) }
            , {'buyable_button', list(binary()) }
            , {'click', list(binary()) }
            , {'engagement', list(binary()) }
            , {'impression', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

