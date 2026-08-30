-module(openapi_campaign_delivery_estimates_derived_metrics).

-include("openapi.hrl").

-export([openapi_campaign_delivery_estimates_derived_metrics/0]).

-export([openapi_campaign_delivery_estimates_derived_metrics/1]).

-export_type([openapi_campaign_delivery_estimates_derived_metrics/0]).

-type openapi_campaign_delivery_estimates_derived_metrics() ::
  [ {'cpc', integer() }
  | {'cpc_lower', integer() }
  | {'cpc_upper', integer() }
  | {'cpm', integer() }
  | {'cpm_lower', integer() }
  | {'cpm_upper', integer() }
  | {'lifetime_frequency', integer() }
  | {'lifetime_frequency_lower', integer() }
  | {'lifetime_frequency_upper', integer() }
  | {'lifetime_impression', integer() }
  | {'lifetime_impression_lower', integer() }
  | {'lifetime_impression_upper', integer() }
  | {'lifetime_reach', integer() }
  | {'lifetime_reach_lower', integer() }
  | {'lifetime_reach_upper', integer() }
  | {'weekly_click', integer() }
  | {'weekly_click_lower', integer() }
  | {'weekly_click_upper', integer() }
  | {'weekly_frequency', integer() }
  | {'weekly_frequency_lower', integer() }
  | {'weekly_frequency_upper', integer() }
  | {'weekly_impression', integer() }
  | {'weekly_impression_lower', integer() }
  | {'weekly_impression_upper', integer() }
  | {'weekly_reach', integer() }
  | {'weekly_reach_lower', integer() }
  | {'weekly_reach_upper', integer() }
  ].


openapi_campaign_delivery_estimates_derived_metrics() ->
    openapi_campaign_delivery_estimates_derived_metrics([]).

openapi_campaign_delivery_estimates_derived_metrics(Fields) ->
  Default = [ {'cpc', integer() }
            , {'cpc_lower', integer() }
            , {'cpc_upper', integer() }
            , {'cpm', integer() }
            , {'cpm_lower', integer() }
            , {'cpm_upper', integer() }
            , {'lifetime_frequency', integer() }
            , {'lifetime_frequency_lower', integer() }
            , {'lifetime_frequency_upper', integer() }
            , {'lifetime_impression', integer() }
            , {'lifetime_impression_lower', integer() }
            , {'lifetime_impression_upper', integer() }
            , {'lifetime_reach', integer() }
            , {'lifetime_reach_lower', integer() }
            , {'lifetime_reach_upper', integer() }
            , {'weekly_click', integer() }
            , {'weekly_click_lower', integer() }
            , {'weekly_click_upper', integer() }
            , {'weekly_frequency', integer() }
            , {'weekly_frequency_lower', integer() }
            , {'weekly_frequency_upper', integer() }
            , {'weekly_impression', integer() }
            , {'weekly_impression_lower', integer() }
            , {'weekly_impression_upper', integer() }
            , {'weekly_reach', integer() }
            , {'weekly_reach_lower', integer() }
            , {'weekly_reach_upper', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

