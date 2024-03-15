-module(openapi_quiz_pin_result).

-export([encode/1]).

-export_type([openapi_quiz_pin_result/0]).

-type openapi_quiz_pin_result() ::
    #{ 'organic_pin_id' => binary(),
       'android_deep_link' => binary(),
       'ios_deep_link' => binary(),
       'destination_url' => binary(),
       'result_id' => integer()
     }.

encode(#{ 'organic_pin_id' := OrganicPinId,
          'android_deep_link' := AndroidDeepLink,
          'ios_deep_link' := IosDeepLink,
          'destination_url' := DestinationUrl,
          'result_id' := ResultId
        }) ->
    #{ 'organic_pin_id' => OrganicPinId,
       'android_deep_link' => AndroidDeepLink,
       'ios_deep_link' => IosDeepLink,
       'destination_url' => DestinationUrl,
       'result_id' => ResultId
     }.
