-module(openapi_campaign_planning_budget_recommendation).

-export([encode/1]).

-export_type([openapi_campaign_planning_budget_recommendation/0]).

-type openapi_campaign_planning_budget_recommendation() ::
    #{ 'budget_recommendation' => integer(),
       'experiment_campaign_budget_recommendation' => list(),
       'lifetime_days_recommendation' => integer(),
       'point_estimations' => list()
     }.

encode(#{ 'budget_recommendation' := BudgetRecommendation,
          'experiment_campaign_budget_recommendation' := ExperimentCampaignBudgetRecommendation,
          'lifetime_days_recommendation' := LifetimeDaysRecommendation,
          'point_estimations' := PointEstimations
        }) ->
    #{ 'budget_recommendation' => BudgetRecommendation,
       'experiment_campaign_budget_recommendation' => ExperimentCampaignBudgetRecommendation,
       'lifetime_days_recommendation' => LifetimeDaysRecommendation,
       'point_estimations' => PointEstimations
     }.
