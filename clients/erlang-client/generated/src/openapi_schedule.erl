-module(openapi_schedule).

-export([encode/1]).

-export_type([openapi_schedule/0]).

-type openapi_schedule() ::
    #{ 'delta_value' => openapi_schedule_delta_value:openapi_schedule_delta_value(),
       'end_timestamp' => integer(),
       'entity_id' := binary(),
       'entity_type' => openapi_ad_account_entity_type:openapi_ad_account_entity_type(),
       'name' => binary(),
       'schedule_action' => openapi_schedule_action:openapi_schedule_action(),
       'schedule_id' := binary(),
       'schedule_status' => openapi_schedule_status:openapi_schedule_status(),
       'schedule_type' => openapi_schedule_type:openapi_schedule_type(),
       'start_timestamp' => integer()
     }.

encode(#{ 'delta_value' := DeltaValue,
          'end_timestamp' := EndTimestamp,
          'entity_id' := EntityId,
          'entity_type' := EntityType,
          'name' := Name,
          'schedule_action' := ScheduleAction,
          'schedule_id' := ScheduleId,
          'schedule_status' := ScheduleStatus,
          'schedule_type' := ScheduleType,
          'start_timestamp' := StartTimestamp
        }) ->
    #{ 'delta_value' => DeltaValue,
       'end_timestamp' => EndTimestamp,
       'entity_id' => EntityId,
       'entity_type' => EntityType,
       'name' => Name,
       'schedule_action' => ScheduleAction,
       'schedule_id' => ScheduleId,
       'schedule_status' => ScheduleStatus,
       'schedule_type' => ScheduleType,
       'start_timestamp' => StartTimestamp
     }.
