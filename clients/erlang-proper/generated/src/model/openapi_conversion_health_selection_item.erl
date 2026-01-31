-module(openapi_conversion_health_selection_item).

-include("openapi.hrl").

-export([openapi_conversion_health_selection_item/0]).

-export([openapi_conversion_health_selection_item/1]).

-export_type([openapi_conversion_health_selection_item/0]).

-type openapi_conversion_health_selection_item() ::
  [ {'conversionType', map() }
  | {'criteria', map() }
  | {'ingestionSource', map() }
  | {'status', openapi_any_type:openapi_any_type() }
  ].


openapi_conversion_health_selection_item() ->
    openapi_conversion_health_selection_item([]).

openapi_conversion_health_selection_item(Fields) ->
  Default = [ {'conversionType', map() }
            , {'criteria', map() }
            , {'ingestionSource', map() }
            , {'status', openapi_any_type:openapi_any_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

