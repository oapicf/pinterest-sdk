-module(openapi_campaign_planning_budget_recommendation_point).

-export([encode/1]).

-export_type([openapi_campaign_planning_budget_recommendation_point/0]).

-type openapi_campaign_planning_budget_recommendation_point() ::
    #{ 'estimation_type' => openapi_campaign_planning_estimation_type:openapi_campaign_planning_estimation_type(),
       'point_estimate' => openapi_campaign_planning_point_estimate:openapi_campaign_planning_point_estimate()
     }.

encode(#{ 'estimation_type' := EstimationType,
          'point_estimate' := PointEstimate
        }) ->
    #{ 'estimation_type' => EstimationType,
       'point_estimate' => PointEstimate
     }.
