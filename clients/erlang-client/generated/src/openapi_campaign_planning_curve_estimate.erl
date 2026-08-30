-module(openapi_campaign_planning_curve_estimate).

-export([encode/1]).

-export_type([openapi_campaign_planning_curve_estimate/0]).

-type openapi_campaign_planning_curve_estimate() ::
    #{ 'estimation_type' => openapi_campaign_planning_estimation_type:openapi_campaign_planning_estimation_type(),
       'points' => list()
     }.

encode(#{ 'estimation_type' := EstimationType,
          'points' := Points
        }) ->
    #{ 'estimation_type' => EstimationType,
       'points' => Points
     }.
