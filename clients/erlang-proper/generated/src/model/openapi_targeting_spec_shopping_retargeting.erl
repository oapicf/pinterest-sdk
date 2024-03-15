-module(openapi_targeting_spec_shopping_retargeting).

-include("openapi.hrl").

-export([openapi_targeting_spec_shopping_retargeting/0]).

-export([openapi_targeting_spec_shopping_retargeting/1]).

-export_type([openapi_targeting_spec_shopping_retargeting/0]).

-type openapi_targeting_spec_shopping_retargeting() ::
  [ {'lookback_window', integer() }
  | {'tag_types', list(integer()) }
  | {'exclusion_window', integer() }
  ].


openapi_targeting_spec_shopping_retargeting() ->
    openapi_targeting_spec_shopping_retargeting([]).

openapi_targeting_spec_shopping_retargeting(Fields) ->
  Default = [ {'lookback_window', integer() }
            , {'tag_types', list(integer()) }
            , {'exclusion_window', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

