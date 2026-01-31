-module(openapi_ad_response).

-include("openapi.hrl").

-export([openapi_ad_response/0]).

-export([openapi_ad_response/1]).

-export_type([openapi_ad_response/0]).

-type openapi_ad_response() ::
  [ {'ad_group_id', binary() }
  | {'android_deep_link', binary() }
  | {'carousel_android_deep_links', list(binary()) }
  | {'carousel_destination_urls', list(binary()) }
  | {'carousel_ios_deep_links', list(binary()) }
  | {'click_tracking_url', binary() }
  | {'creative_type', openapi_creative_type:openapi_creative_type() }
  | {'customizable_cta_type', openapi_customizable_cta_type:openapi_customizable_cta_type() }
  | {'destination_url', binary() }
  | {'disclosure_type', openapi_disclosure_type:openapi_disclosure_type() }
  | {'disclosure_url', binary() }
  | {'grid_click_type', openapi_grid_click_type:openapi_grid_click_type() }
  | {'ios_deep_link', binary() }
  | {'is_pin_deleted', boolean() }
  | {'is_removable', boolean() }
  | {'lead_form_id', binary() }
  | {'name', binary() }
  | {'quiz_pin_data', openapi_quiz_pin_data:openapi_quiz_pin_data() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
  | {'view_tracking_url', binary() }
  | {'pin_id', binary() }
  | {'ad_account_id', binary() }
  | {'campaign_id', binary() }
  | {'collection_items_destination_url_template', binary() }
  | {'created_time', integer() }
  | {'id', binary() }
  | {'rejected_reasons', list(binary()) }
  | {'rejection_labels', list(binary()) }
  | {'review_status', binary() }
  | {'summary_status', openapi_pin_promotion_summary_status:openapi_pin_promotion_summary_status() }
  | {'type', binary() }
  | {'updated_time', integer() }
  ].


openapi_ad_response() ->
    openapi_ad_response([]).

openapi_ad_response(Fields) ->
  Default = [ {'ad_group_id', binary() }
            , {'android_deep_link', binary() }
            , {'carousel_android_deep_links', list(binary()) }
            , {'carousel_destination_urls', list(binary()) }
            , {'carousel_ios_deep_links', list(binary()) }
            , {'click_tracking_url', binary() }
            , {'creative_type', openapi_creative_type:openapi_creative_type() }
            , {'customizable_cta_type', openapi_customizable_cta_type:openapi_customizable_cta_type() }
            , {'destination_url', binary() }
            , {'disclosure_type', openapi_disclosure_type:openapi_disclosure_type() }
            , {'disclosure_url', binary() }
            , {'grid_click_type', openapi_grid_click_type:openapi_grid_click_type() }
            , {'ios_deep_link', binary() }
            , {'is_pin_deleted', boolean() }
            , {'is_removable', boolean() }
            , {'lead_form_id', binary() }
            , {'name', binary() }
            , {'quiz_pin_data', openapi_quiz_pin_data:openapi_quiz_pin_data() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
            , {'view_tracking_url', binary() }
            , {'pin_id', binary() }
            , {'ad_account_id', binary() }
            , {'campaign_id', binary() }
            , {'collection_items_destination_url_template', binary() }
            , {'created_time', integer() }
            , {'id', binary() }
            , {'rejected_reasons', list(binary()) }
            , {'rejection_labels', list(binary()) }
            , {'review_status', elements([<<"OTHER">>, <<"PENDING">>, <<"REJECTED">>, <<"APPROVED">>]) }
            , {'summary_status', openapi_pin_promotion_summary_status:openapi_pin_promotion_summary_status() }
            , {'type', binary() }
            , {'updated_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

