-module(openapi_ad_create_request).

-include("openapi.hrl").

-export([openapi_ad_create_request/0]).

-export([openapi_ad_create_request/1]).

-export_type([openapi_ad_create_request/0]).

-type openapi_ad_create_request() ::
  [ {'ad_group_id', binary() }
  | {'android_deep_link', binary() }
  | {'carousel_android_deep_links', list(binary()) }
  | {'carousel_destination_urls', list(binary()) }
  | {'carousel_ios_deep_links', list(binary()) }
  | {'click_tracking_url', binary() }
  | {'creative_type', openapi_creative_type:openapi_creative_type() }
  | {'destination_url', binary() }
  | {'ios_deep_link', binary() }
  | {'is_pin_deleted', boolean() }
  | {'is_removable', boolean() }
  | {'name', binary() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'tracking_urls', openapi_ad_common_tracking_urls:openapi_ad_common_tracking_urls() }
  | {'view_tracking_url', binary() }
  | {'lead_form_id', binary() }
  | {'grid_click_type', openapi_grid_click_type:openapi_grid_click_type() }
  | {'customizable_cta_type', binary() }
  | {'quiz_pin_data', openapi_ad_common_quiz_pin_data:openapi_ad_common_quiz_pin_data() }
  | {'pin_id', binary() }
  ].


openapi_ad_create_request() ->
    openapi_ad_create_request([]).

openapi_ad_create_request(Fields) ->
  Default = [ {'ad_group_id', binary() }
            , {'android_deep_link', binary() }
            , {'carousel_android_deep_links', list(binary()) }
            , {'carousel_destination_urls', list(binary()) }
            , {'carousel_ios_deep_links', list(binary()) }
            , {'click_tracking_url', binary() }
            , {'creative_type', openapi_creative_type:openapi_creative_type() }
            , {'destination_url', binary() }
            , {'ios_deep_link', binary() }
            , {'is_pin_deleted', boolean() }
            , {'is_removable', boolean() }
            , {'name', binary() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'tracking_urls', openapi_ad_common_tracking_urls:openapi_ad_common_tracking_urls() }
            , {'view_tracking_url', binary() }
            , {'lead_form_id', binary() }
            , {'grid_click_type', openapi_grid_click_type:openapi_grid_click_type() }
            , {'customizable_cta_type', elements([<<"GET_OFFER">>, <<"LEARN_MORE">>, <<"ORDER_NOW">>, <<"SHOP_NOW">>, <<"SIGN_UP">>, <<"SUBSCRIBE">>, <<"BUY_NOW">>, <<"CONTACT_US">>, <<"GET_QUOTE">>, <<"VISIT_WEBSITE">>, <<"APPLY_NOW">>, <<"BOOK_NOW">>, <<"REQUEST_DEMO">>, <<"REGISTER_NOW">>, <<"FIND_A_DEALER">>, <<"ADD_TO_CART">>, <<"WATCH_NOW">>, <<"READ_MORE">>, <<"">>]) }
            , {'quiz_pin_data', openapi_ad_common_quiz_pin_data:openapi_ad_common_quiz_pin_data() }
            , {'pin_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

