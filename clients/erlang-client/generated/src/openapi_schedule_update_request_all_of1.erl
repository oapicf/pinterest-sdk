-module(openapi_schedule_update_request_all_of1).

-export([encode/1]).

-export_type([openapi_schedule_update_request_all_of1/0]).

-type openapi_schedule_update_request_all_of1() ::
    #{ 'entity_id' => binary(),
       'entity_type' => binary(),
       'id' := binary()
     }.

encode(#{ 'entity_id' := EntityId,
          'entity_type' := EntityType,
          'id' := Id
        }) ->
    #{ 'entity_id' => EntityId,
       'entity_type' => EntityType,
       'id' => Id
     }.
