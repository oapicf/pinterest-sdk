-module(openapi_campaign_objectives_filter).

-include("openapi.hrl").

-export([openapi_campaign_objectives_filter/0]).

-export([openapi_campaign_objectives_filter/1]).

-export_type([openapi_campaign_objectives_filter/0]).

-type openapi_campaign_objectives_filter() ::
  [ {'campaign_objective_types', list(openapi_objective_type:openapi_objective_type()) }
  ].


openapi_campaign_objectives_filter() ->
    openapi_campaign_objectives_filter([]).

openapi_campaign_objectives_filter(Fields) ->
  Default = [ {'campaign_objective_types', list(openapi_objective_type:openapi_objective_type(), 1, 7) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

