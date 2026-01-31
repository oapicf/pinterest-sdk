-module(openapi_quality_component_issue).

-include("openapi.hrl").

-export([openapi_quality_component_issue/0]).

-export([openapi_quality_component_issue/1]).

-export_type([openapi_quality_component_issue/0]).

-type openapi_quality_component_issue() ::
  [ {'id', binary() }
  | {'name', binary() }
  | {'reason', binary() }
  ].


openapi_quality_component_issue() ->
    openapi_quality_component_issue([]).

openapi_quality_component_issue(Fields) ->
  Default = [ {'id', binary() }
            , {'name', binary() }
            , {'reason', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

