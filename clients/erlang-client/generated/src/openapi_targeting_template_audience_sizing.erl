-module(openapi_targeting_template_audience_sizing).

-export([encode/1]).

-export_type([openapi_targeting_template_audience_sizing/0]).

-type openapi_targeting_template_audience_sizing() ::
    #{ 'reach_estimate' => openapi_targeting_template_audience_sizing_reach_estimate:openapi_targeting_template_audience_sizing_reach_estimate()
     }.

encode(#{ 'reach_estimate' := ReachEstimate
        }) ->
    #{ 'reach_estimate' => ReachEstimate
     }.
