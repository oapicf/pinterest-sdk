-module(openapi_campaign_planning_point_estimate).

-export([encode/1]).

-export_type([openapi_campaign_planning_point_estimate/0]).

-type openapi_campaign_planning_point_estimate() ::
    #{ 'budget' := integer(),
       'double_y' := float(),
       'max_y' := integer(),
       'min_y' := integer(),
       'y' := integer()
     }.

encode(#{ 'budget' := Budget,
          'double_y' := DoubleY,
          'max_y' := MaxY,
          'min_y' := MinY,
          'y' := Y
        }) ->
    #{ 'budget' => Budget,
       'double_y' => DoubleY,
       'max_y' => MaxY,
       'min_y' => MinY,
       'y' => Y
     }.
