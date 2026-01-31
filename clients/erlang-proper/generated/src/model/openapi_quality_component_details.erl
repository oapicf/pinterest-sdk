-module(openapi_quality_component_details).

-include("openapi.hrl").

-export([openapi_quality_component_details/0]).

-export([openapi_quality_component_details/1]).

-export_type([openapi_quality_component_details/0]).

-type openapi_quality_component_details() ::
  [ {'coverage', integer() }
  | {'issues', list(openapi_quality_component_issue:openapi_quality_component_issue()) }
  | {'overlap', integer() }
  ].


openapi_quality_component_details() ->
    openapi_quality_component_details([]).

openapi_quality_component_details(Fields) ->
  Default = [ {'coverage', integer() }
            , {'issues', list(openapi_quality_component_issue:openapi_quality_component_issue()) }
            , {'overlap', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

