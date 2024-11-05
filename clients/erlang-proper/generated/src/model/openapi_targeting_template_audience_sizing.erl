-module(openapi_targeting_template_audience_sizing).

-include("openapi.hrl").

-export([openapi_targeting_template_audience_sizing/0]).

-export([openapi_targeting_template_audience_sizing/1]).

-export_type([openapi_targeting_template_audience_sizing/0]).

-type openapi_targeting_template_audience_sizing() ::
  [ {'reach_estimate', openapi_targeting_template_audience_sizing_reach_estimate:openapi_targeting_template_audience_sizing_reach_estimate() }
  ].


openapi_targeting_template_audience_sizing() ->
    openapi_targeting_template_audience_sizing([]).

openapi_targeting_template_audience_sizing(Fields) ->
  Default = [ {'reach_estimate', openapi_targeting_template_audience_sizing_reach_estimate:openapi_targeting_template_audience_sizing_reach_estimate() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

