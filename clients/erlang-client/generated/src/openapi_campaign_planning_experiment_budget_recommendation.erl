-module(openapi_campaign_planning_experiment_budget_recommendation).

-export([encode/1]).

-export_type([openapi_campaign_planning_experiment_budget_recommendation/0]).

-type openapi_campaign_planning_experiment_budget_recommendation() ::
    #{ 'budget_recommendation' => integer(),
       'lifetime_days_recommendation' => integer(),
       'point_estimations' => list(),
       'version_id' => binary()
     }.

encode(#{ 'budget_recommendation' := BudgetRecommendation,
          'lifetime_days_recommendation' := LifetimeDaysRecommendation,
          'point_estimations' := PointEstimations,
          'version_id' := VersionId
        }) ->
    #{ 'budget_recommendation' => BudgetRecommendation,
       'lifetime_days_recommendation' => LifetimeDaysRecommendation,
       'point_estimations' => PointEstimations,
       'version_id' => VersionId
     }.
