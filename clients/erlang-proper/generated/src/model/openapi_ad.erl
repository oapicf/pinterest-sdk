-module(openapi_ad).

-include("openapi.hrl").

-export([openapi_ad/0]).

-export([openapi_ad/1]).

-export_type([openapi_ad/0]).

-type openapi_ad() ::
  [ {'ad_account_id', binary() }
  | {'ad_group_id', binary() }
  | {'android_deep_link', binary() }
  | {'campaign_id', binary() }
  | {'carousel_android_deep_links', list(binary()) }
  | {'carousel_destination_urls', list(binary()) }
  | {'carousel_ios_deep_links', list(binary()) }
  | {'carting_platform_type', integer() }
  | {'carting_products', list(openapi_carting_product:openapi_carting_product()) }
  | {'click_tracking_url', binary() }
  | {'collection_items_destination_url_template', binary() }
  | {'collections_header_type', openapi_ad_collections_header_type:openapi_ad_collections_header_type() }
  | {'created_time', integer() }
  | {'creative_type', openapi_creative_type:openapi_creative_type() }
  | {'customizable_cta_type', openapi_customizable_cta_type:openapi_customizable_cta_type() }
  | {'destination_url', binary() }
  | {'disclosure_type', openapi_disclosure_type:openapi_disclosure_type() }
  | {'disclosure_url', binary() }
  | {'grid_click_type', openapi_grid_click_type:openapi_grid_click_type() }
  | {'id', binary() }
  | {'ios_deep_link', binary() }
  | {'is_carting', boolean() }
  | {'is_collage_accepted_terms', boolean() }
  | {'is_collage_single_destination', boolean() }
  | {'is_pin_deleted', boolean() }
  | {'is_removable', boolean() }
  | {'lead_form_id', binary() }
  | {'name', binary() }
  | {'pin_id', binary() }
  | {'quiz_pin_data', openapi_quiz_pin_data:openapi_quiz_pin_data() }
  | {'rejected_reasons', list(openapi_ad_disapproval_reasons:openapi_ad_disapproval_reasons()) }
  | {'rejection_labels', list(binary()) }
  | {'review_status', openapi_ad_review_status:openapi_ad_review_status() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'summary_status', openapi_pin_promotion_summary_status:openapi_pin_promotion_summary_status() }
  | {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
  | {'type', binary() }
  | {'updated_time', integer() }
  | {'view_tracking_url', binary() }
  ].


openapi_ad() ->
    openapi_ad([]).

openapi_ad(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'ad_group_id', binary() }
            , {'android_deep_link', binary() }
            , {'campaign_id', binary() }
            , {'carousel_android_deep_links', list(binary()) }
            , {'carousel_destination_urls', list(binary()) }
            , {'carousel_ios_deep_links', list(binary()) }
            , {'carting_platform_type', integer(1, 2) }
            , {'carting_products', list(openapi_carting_product:openapi_carting_product()) }
            , {'click_tracking_url', binary() }
            , {'collection_items_destination_url_template', binary() }
            , {'collections_header_type', openapi_ad_collections_header_type:openapi_ad_collections_header_type() }
            , {'created_time', integer() }
            , {'creative_type', openapi_creative_type:openapi_creative_type() }
            , {'customizable_cta_type', openapi_customizable_cta_type:openapi_customizable_cta_type() }
            , {'destination_url', binary() }
            , {'disclosure_type', openapi_disclosure_type:openapi_disclosure_type() }
            , {'disclosure_url', binary() }
            , {'grid_click_type', openapi_grid_click_type:openapi_grid_click_type() }
            , {'id', binary() }
            , {'ios_deep_link', binary() }
            , {'is_carting', boolean() }
            , {'is_collage_accepted_terms', boolean() }
            , {'is_collage_single_destination', boolean() }
            , {'is_pin_deleted', boolean() }
            , {'is_removable', boolean() }
            , {'lead_form_id', binary() }
            , {'name', binary() }
            , {'pin_id', binary() }
            , {'quiz_pin_data', openapi_quiz_pin_data:openapi_quiz_pin_data() }
            , {'rejected_reasons', list(openapi_ad_disapproval_reasons:openapi_ad_disapproval_reasons()) }
            , {'rejection_labels', list(binary()) }
            , {'review_status', openapi_ad_review_status:openapi_ad_review_status() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'summary_status', openapi_pin_promotion_summary_status:openapi_pin_promotion_summary_status() }
            , {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
            , {'type', binary() }
            , {'updated_time', integer() }
            , {'view_tracking_url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

