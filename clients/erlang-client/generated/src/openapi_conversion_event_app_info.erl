-module(openapi_conversion_event_app_info).

-export([encode/1]).

-export_type([openapi_conversion_event_app_info/0]).

-type openapi_conversion_event_app_info() ::
    #{ 'app_id' => binary(),
       'app_name' => binary(),
       'app_package_name' => binary(),
       'app_store' => binary(),
       'app_version' => binary(),
       'install_time' => integer(),
       'user_agent' => binary(),
       'window_height' => integer(),
       'window_width' => integer()
     }.

encode(#{ 'app_id' := AppId,
          'app_name' := AppName,
          'app_package_name' := AppPackageName,
          'app_store' := AppStore,
          'app_version' := AppVersion,
          'install_time' := InstallTime,
          'user_agent' := UserAgent,
          'window_height' := WindowHeight,
          'window_width' := WindowWidth
        }) ->
    #{ 'app_id' => AppId,
       'app_name' => AppName,
       'app_package_name' => AppPackageName,
       'app_store' => AppStore,
       'app_version' => AppVersion,
       'install_time' => InstallTime,
       'user_agent' => UserAgent,
       'window_height' => WindowHeight,
       'window_width' => WindowWidth
     }.
