-module(openapi_targeting_spec_shopping_retargeting).

-include("openapi.hrl").

-export([openapi_targeting_spec_shopping_retargeting/0]).

-export([openapi_targeting_spec_shopping_retargeting/1]).

-export_type([openapi_targeting_spec_shopping_retargeting/0]).

-type openapi_targeting_spec_shopping_retargeting() ::
  [ {'exclusion_window', integer() }
  | {'lookback_window', integer() }
  | {'tag_types', list(integer()) }
  ].


openapi_targeting_spec_shopping_retargeting() ->
    openapi_targeting_spec_shopping_retargeting([]).

openapi_targeting_spec_shopping_retargeting(Fields) ->
  Default = [ {'exclusion_window', integer() }
            , {'lookback_window', integer() }
            , {'tag_types', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

