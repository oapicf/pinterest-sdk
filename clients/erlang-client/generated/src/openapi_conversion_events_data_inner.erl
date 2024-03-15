-module(openapi_conversion_events_data_inner).

-export([encode/1]).

-export_type([openapi_conversion_events_data_inner/0]).

-type openapi_conversion_events_data_inner() ::
    #{ 'event_name' := binary(),
       'action_source' := binary(),
       'event_time' := integer(),
       'event_id' := binary(),
       'event_source_url' => binary(),
       'opt_out' => boolean(),
       'partner_name' => binary(),
       'user_data' := openapi_conversion_events_user_data:openapi_conversion_events_user_data(),
       'custom_data' => openapi_conversion_events_data_inner_custom_data:openapi_conversion_events_data_inner_custom_data(),
       'app_id' => binary(),
       'app_name' => binary(),
       'app_version' => binary(),
       'device_brand' => binary(),
       'device_carrier' => binary(),
       'device_model' => binary(),
       'device_type' => binary(),
       'os_version' => binary(),
       'wifi' => boolean(),
       'language' => binary()
     }.

encode(#{ 'event_name' := EventName,
          'action_source' := ActionSource,
          'event_time' := EventTime,
          'event_id' := EventId,
          'event_source_url' := EventSourceUrl,
          'opt_out' := OptOut,
          'partner_name' := PartnerName,
          'user_data' := UserData,
          'custom_data' := CustomData,
          'app_id' := AppId,
          'app_name' := AppName,
          'app_version' := AppVersion,
          'device_brand' := DeviceBrand,
          'device_carrier' := DeviceCarrier,
          'device_model' := DeviceModel,
          'device_type' := DeviceType,
          'os_version' := OsVersion,
          'wifi' := Wifi,
          'language' := Language
        }) ->
    #{ 'event_name' => EventName,
       'action_source' => ActionSource,
       'event_time' => EventTime,
       'event_id' => EventId,
       'event_source_url' => EventSourceUrl,
       'opt_out' => OptOut,
       'partner_name' => PartnerName,
       'user_data' => UserData,
       'custom_data' => CustomData,
       'app_id' => AppId,
       'app_name' => AppName,
       'app_version' => AppVersion,
       'device_brand' => DeviceBrand,
       'device_carrier' => DeviceCarrier,
       'device_model' => DeviceModel,
       'device_type' => DeviceType,
       'os_version' => OsVersion,
       'wifi' => Wifi,
       'language' => Language
     }.
