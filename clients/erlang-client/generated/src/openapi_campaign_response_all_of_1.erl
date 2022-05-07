-module(openapi_campaign_response_all_of_1).

-export([encode/1]).

-export_type([openapi_campaign_response_all_of_1/0]).

-type openapi_campaign_response_all_of_1() ::
    #{ 'objective_type' => openapi_objective_type:openapi_objective_type(),
       'created_time' => integer(),
       'updated_time' => integer(),
       'type' => binary()
     }.

encode(#{ 'objective_type' := ObjectiveType,
          'created_time' := CreatedTime,
          'updated_time' := UpdatedTime,
          'type' := Type
        }) ->
    #{ 'objective_type' => ObjectiveType,
       'created_time' => CreatedTime,
       'updated_time' => UpdatedTime,
       'type' => Type
     }.
