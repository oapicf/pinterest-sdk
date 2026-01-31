-module(openapi_item_attributes).

-include("openapi.hrl").

-export([openapi_item_attributes/0]).

-export([openapi_item_attributes/1]).

-export_type([openapi_item_attributes/0]).

-type openapi_item_attributes() ::
  [ {'ad_image_0_link', binary() }
  | {'ad_image_0_tag', binary() }
  | {'ad_image_10_link', binary() }
  | {'ad_image_10_tag', binary() }
  | {'ad_image_11_link', binary() }
  | {'ad_image_11_tag', binary() }
  | {'ad_image_12_link', binary() }
  | {'ad_image_12_tag', binary() }
  | {'ad_image_13_link', binary() }
  | {'ad_image_13_tag', binary() }
  | {'ad_image_14_link', binary() }
  | {'ad_image_14_tag', binary() }
  | {'ad_image_15_link', binary() }
  | {'ad_image_15_tag', binary() }
  | {'ad_image_16_link', binary() }
  | {'ad_image_16_tag', binary() }
  | {'ad_image_17_link', binary() }
  | {'ad_image_17_tag', binary() }
  | {'ad_image_18_link', binary() }
  | {'ad_image_18_tag', binary() }
  | {'ad_image_19_link', binary() }
  | {'ad_image_19_tag', binary() }
  | {'ad_image_1_link', binary() }
  | {'ad_image_1_tag', binary() }
  | {'ad_image_2_link', binary() }
  | {'ad_image_2_tag', binary() }
  | {'ad_image_3_link', binary() }
  | {'ad_image_3_tag', binary() }
  | {'ad_image_4_link', binary() }
  | {'ad_image_4_tag', binary() }
  | {'ad_image_5_link', binary() }
  | {'ad_image_5_tag', binary() }
  | {'ad_image_6_link', binary() }
  | {'ad_image_6_tag', binary() }
  | {'ad_image_7_link', binary() }
  | {'ad_image_7_tag', binary() }
  | {'ad_image_8_link', binary() }
  | {'ad_image_8_tag', binary() }
  | {'ad_image_9_link', binary() }
  | {'ad_image_9_tag', binary() }
  | {'ad_link', binary() }
  | {'ad_video_0_link', binary() }
  | {'ad_video_0_tag', binary() }
  | {'ad_video_1_link', binary() }
  | {'ad_video_1_tag', binary() }
  | {'ad_video_2_link', binary() }
  | {'ad_video_2_tag', binary() }
  | {'adult', boolean() }
  | {'age_group', binary() }
  | {'android_deep_link', binary() }
  | {'availability', binary() }
  | {'average_review_rating', integer() }
  | {'brand', binary() }
  | {'checkout_enabled', boolean() }
  | {'color', binary() }
  | {'condition', binary() }
  | {'custom_label_0', binary() }
  | {'custom_label_1', binary() }
  | {'custom_label_2', binary() }
  | {'custom_label_3', binary() }
  | {'custom_label_4', binary() }
  | {'custom_number_0', integer() }
  | {'custom_number_1', integer() }
  | {'custom_number_2', integer() }
  | {'custom_number_3', integer() }
  | {'custom_number_4', integer() }
  | {'description', binary() }
  | {'free_shipping_label', boolean() }
  | {'free_shipping_limit', binary() }
  | {'gender', binary() }
  | {'google_product_category', binary() }
  | {'gtin', openapi_updatable_item_attributes_gtin:openapi_updatable_item_attributes_gtin() }
  | {'id', binary() }
  | {'installment_price', binary() }
  | {'ios_deep_link', binary() }
  | {'item_group_id', binary() }
  | {'last_updated_time', integer() }
  | {'link', binary() }
  | {'material', binary() }
  | {'min_ad_price', binary() }
  | {'mobile_link', binary() }
  | {'mpn', binary() }
  | {'number_of_ratings', integer() }
  | {'number_of_reviews', integer() }
  | {'pattern', binary() }
  | {'price', binary() }
  | {'product_type', binary() }
  | {'promotion_id', binary() }
  | {'sale_price', binary() }
  | {'sale_price_effective_date', binary() }
  | {'shipping', binary() }
  | {'shipping_height', binary() }
  | {'shipping_weight', binary() }
  | {'shipping_width', binary() }
  | {'size', binary() }
  | {'size_system', binary() }
  | {'size_type', binary() }
  | {'tax', binary() }
  | {'title', binary() }
  | {'unit_pricing_base_measure', binary() }
  | {'unit_pricing_measure', binary() }
  | {'variant_names', list(binary()) }
  | {'variant_values', list(binary()) }
  | {'additional_image_link', list(binary()) }
  | {'image_link', list(binary()) }
  | {'video_link', binary() }
  ].


openapi_item_attributes() ->
    openapi_item_attributes([]).

openapi_item_attributes(Fields) ->
  Default = [ {'ad_image_0_link', binary() }
            , {'ad_image_0_tag', binary() }
            , {'ad_image_10_link', binary() }
            , {'ad_image_10_tag', binary() }
            , {'ad_image_11_link', binary() }
            , {'ad_image_11_tag', binary() }
            , {'ad_image_12_link', binary() }
            , {'ad_image_12_tag', binary() }
            , {'ad_image_13_link', binary() }
            , {'ad_image_13_tag', binary() }
            , {'ad_image_14_link', binary() }
            , {'ad_image_14_tag', binary() }
            , {'ad_image_15_link', binary() }
            , {'ad_image_15_tag', binary() }
            , {'ad_image_16_link', binary() }
            , {'ad_image_16_tag', binary() }
            , {'ad_image_17_link', binary() }
            , {'ad_image_17_tag', binary() }
            , {'ad_image_18_link', binary() }
            , {'ad_image_18_tag', binary() }
            , {'ad_image_19_link', binary() }
            , {'ad_image_19_tag', binary() }
            , {'ad_image_1_link', binary() }
            , {'ad_image_1_tag', binary() }
            , {'ad_image_2_link', binary() }
            , {'ad_image_2_tag', binary() }
            , {'ad_image_3_link', binary() }
            , {'ad_image_3_tag', binary() }
            , {'ad_image_4_link', binary() }
            , {'ad_image_4_tag', binary() }
            , {'ad_image_5_link', binary() }
            , {'ad_image_5_tag', binary() }
            , {'ad_image_6_link', binary() }
            , {'ad_image_6_tag', binary() }
            , {'ad_image_7_link', binary() }
            , {'ad_image_7_tag', binary() }
            , {'ad_image_8_link', binary() }
            , {'ad_image_8_tag', binary() }
            , {'ad_image_9_link', binary() }
            , {'ad_image_9_tag', binary() }
            , {'ad_link', binary() }
            , {'ad_video_0_link', binary() }
            , {'ad_video_0_tag', binary() }
            , {'ad_video_1_link', binary() }
            , {'ad_video_1_tag', binary() }
            , {'ad_video_2_link', binary() }
            , {'ad_video_2_tag', binary() }
            , {'adult', boolean() }
            , {'age_group', binary() }
            , {'android_deep_link', binary() }
            , {'availability', binary() }
            , {'average_review_rating', integer() }
            , {'brand', binary() }
            , {'checkout_enabled', boolean() }
            , {'color', binary() }
            , {'condition', binary() }
            , {'custom_label_0', binary() }
            , {'custom_label_1', binary() }
            , {'custom_label_2', binary() }
            , {'custom_label_3', binary() }
            , {'custom_label_4', binary() }
            , {'custom_number_0', integer() }
            , {'custom_number_1', integer() }
            , {'custom_number_2', integer() }
            , {'custom_number_3', integer() }
            , {'custom_number_4', integer() }
            , {'description', binary() }
            , {'free_shipping_label', boolean() }
            , {'free_shipping_limit', binary() }
            , {'gender', binary() }
            , {'google_product_category', binary() }
            , {'gtin', openapi_updatable_item_attributes_gtin:openapi_updatable_item_attributes_gtin() }
            , {'id', binary() }
            , {'installment_price', binary() }
            , {'ios_deep_link', binary() }
            , {'item_group_id', binary() }
            , {'last_updated_time', integer() }
            , {'link', binary() }
            , {'material', binary() }
            , {'min_ad_price', binary() }
            , {'mobile_link', binary() }
            , {'mpn', binary() }
            , {'number_of_ratings', integer() }
            , {'number_of_reviews', integer() }
            , {'pattern', binary() }
            , {'price', binary() }
            , {'product_type', binary() }
            , {'promotion_id', binary() }
            , {'sale_price', binary() }
            , {'sale_price_effective_date', binary() }
            , {'shipping', binary() }
            , {'shipping_height', binary() }
            , {'shipping_weight', binary() }
            , {'shipping_width', binary() }
            , {'size', binary() }
            , {'size_system', binary() }
            , {'size_type', binary() }
            , {'tax', binary() }
            , {'title', binary() }
            , {'unit_pricing_base_measure', binary() }
            , {'unit_pricing_measure', binary() }
            , {'variant_names', list(binary()) }
            , {'variant_values', list(binary()) }
            , {'additional_image_link', list(binary()) }
            , {'image_link', list(binary(), 1) }
            , {'video_link', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

