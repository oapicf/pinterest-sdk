-module(openapi_schedules_create_200_response_inner_data_one_of).

-export([encode/1]).

-export_type([openapi_schedules_create_200_response_inner_data_one_of/0]).

-type openapi_schedules_create_200_response_inner_data_one_of() ::
    #{ 'id' := binary(),
       'schedule_id' := binary(),
       'exceptions' := openapi_pinterest_lib_error:openapi_pinterest_lib_error()
     }.

encode(#{ 'id' := Id,
          'schedule_id' := ScheduleId,
          'exceptions' := Exceptions
        }) ->
    #{ 'id' => Id,
       'schedule_id' => ScheduleId,
       'exceptions' => Exceptions
     }.
