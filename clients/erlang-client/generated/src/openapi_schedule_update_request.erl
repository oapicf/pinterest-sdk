-module(openapi_schedule_update_request).

-export([encode/1]).

-export_type([openapi_schedule_update_request/0]).

-type openapi_schedule_update_request() ::
    #{ 'entity_id' => binary(),
       'entity_type' => binary(),
       'id' := binary(),
       'delta_value' => openapi_schedule_common_delta_value:openapi_schedule_common_delta_value(),
       'end_timestamp' => integer(),
       'name' => binary(),
       'schedule_action' => openapi_schedule_action:openapi_schedule_action(),
       'schedule_status' => openapi_schedule_status:openapi_schedule_status(),
       'schedule_type' => openapi_schedule_type:openapi_schedule_type(),
       'start_timestamp' => integer()
     }.

encode(#{ 'entity_id' := EntityId,
          'entity_type' := EntityType,
          'id' := Id,
          'delta_value' := DeltaValue,
          'end_timestamp' := EndTimestamp,
          'name' := Name,
          'schedule_action' := ScheduleAction,
          'schedule_status' := ScheduleStatus,
          'schedule_type' := ScheduleType,
          'start_timestamp' := StartTimestamp
        }) ->
    #{ 'entity_id' => EntityId,
       'entity_type' => EntityType,
       'id' => Id,
       'delta_value' => DeltaValue,
       'end_timestamp' => EndTimestamp,
       'name' => Name,
       'schedule_action' => ScheduleAction,
       'schedule_status' => ScheduleStatus,
       'schedule_type' => ScheduleType,
       'start_timestamp' => StartTimestamp
     }.
