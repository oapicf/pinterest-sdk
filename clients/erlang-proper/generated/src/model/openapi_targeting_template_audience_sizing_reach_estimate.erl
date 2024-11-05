-module(openapi_targeting_template_audience_sizing_reach_estimate).

-include("openapi.hrl").

-export([openapi_targeting_template_audience_sizing_reach_estimate/0]).

-export([openapi_targeting_template_audience_sizing_reach_estimate/1]).

-export_type([openapi_targeting_template_audience_sizing_reach_estimate/0]).

-type openapi_targeting_template_audience_sizing_reach_estimate() ::
  [ {'estimate', integer() }
  | {'lower_bound', integer() }
  | {'upper_bound', integer() }
  ].


openapi_targeting_template_audience_sizing_reach_estimate() ->
    openapi_targeting_template_audience_sizing_reach_estimate([]).

openapi_targeting_template_audience_sizing_reach_estimate(Fields) ->
  Default = [ {'estimate', integer() }
            , {'lower_bound', integer() }
            , {'upper_bound', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

