-module(openapi_conversion_events_data_items).

-export([encode/1]).

-export_type([openapi_conversion_events_data_items/0]).

-type openapi_conversion_events_data_items() ::
    #{ 'action_source' := binary(),
       'app_id' => binary(),
       'app_info' => openapi_conversion_event_app_info:openapi_conversion_event_app_info(),
       'app_name' => binary(),
       'app_version' => binary(),
       'custom_data' => openapi_conversion_events_data_items_custom_data:openapi_conversion_events_data_items_custom_data(),
       'device_brand' => binary(),
       'device_carrier' => binary(),
       'device_info' => openapi_conversion_event_device_info:openapi_conversion_event_device_info(),
       'device_model' => binary(),
       'device_type' => binary(),
       'event_id' := binary(),
       'event_name' := binary(),
       'event_source_url' => binary(),
       'event_time' := integer(),
       'language' => binary(),
       'opt_out' => boolean(),
       'os_version' => binary(),
       'partner_name' => binary(),
       'user_data' := openapi_conversion_events_user_data_properties:openapi_conversion_events_user_data_properties(),
       'wifi' => boolean()
     }.

encode(#{ 'action_source' := ActionSource,
          'app_id' := AppId,
          'app_info' := AppInfo,
          'app_name' := AppName,
          'app_version' := AppVersion,
          'custom_data' := CustomData,
          'device_brand' := DeviceBrand,
          'device_carrier' := DeviceCarrier,
          'device_info' := DeviceInfo,
          'device_model' := DeviceModel,
          'device_type' := DeviceType,
          'event_id' := EventId,
          'event_name' := EventName,
          'event_source_url' := EventSourceUrl,
          'event_time' := EventTime,
          'language' := Language,
          'opt_out' := OptOut,
          'os_version' := OsVersion,
          'partner_name' := PartnerName,
          'user_data' := UserData,
          'wifi' := Wifi
        }) ->
    #{ 'action_source' => ActionSource,
       'app_id' => AppId,
       'app_info' => AppInfo,
       'app_name' => AppName,
       'app_version' => AppVersion,
       'custom_data' => CustomData,
       'device_brand' => DeviceBrand,
       'device_carrier' => DeviceCarrier,
       'device_info' => DeviceInfo,
       'device_model' => DeviceModel,
       'device_type' => DeviceType,
       'event_id' => EventId,
       'event_name' => EventName,
       'event_source_url' => EventSourceUrl,
       'event_time' => EventTime,
       'language' => Language,
       'opt_out' => OptOut,
       'os_version' => OsVersion,
       'partner_name' => PartnerName,
       'user_data' => UserData,
       'wifi' => Wifi
     }.
