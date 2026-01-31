-module(openapi_quiz_pin_result).

-export([encode/1]).

-export_type([openapi_quiz_pin_result/0]).

-type openapi_quiz_pin_result() ::
    #{ 'android_deep_link' => binary(),
       'destination_url' => binary(),
       'ios_deep_link' => binary(),
       'organic_pin_id' => binary(),
       'result_id' => integer()
     }.

encode(#{ 'android_deep_link' := AndroidDeepLink,
          'destination_url' := DestinationUrl,
          'ios_deep_link' := IosDeepLink,
          'organic_pin_id' := OrganicPinId,
          'result_id' := ResultId
        }) ->
    #{ 'android_deep_link' => AndroidDeepLink,
       'destination_url' => DestinationUrl,
       'ios_deep_link' => IosDeepLink,
       'organic_pin_id' => OrganicPinId,
       'result_id' => ResultId
     }.
