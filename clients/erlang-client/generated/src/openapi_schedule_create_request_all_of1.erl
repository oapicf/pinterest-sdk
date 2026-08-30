-module(openapi_schedule_create_request_all_of1).

-export([encode/1]).

-export_type([openapi_schedule_create_request_all_of1/0]).

-type openapi_schedule_create_request_all_of1() ::
    #{ 'entity_id' := binary(),
       'entity_type' := binary()
     }.

encode(#{ 'entity_id' := EntityId,
          'entity_type' := EntityType
        }) ->
    #{ 'entity_id' => EntityId,
       'entity_type' => EntityType
     }.
