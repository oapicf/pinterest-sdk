-module(openapi_item_attributes).

-include("openapi.hrl").

-export([openapi_item_attributes/0]).

-export([openapi_item_attributes/1]).

-export_type([openapi_item_attributes/0]).

-type openapi_item_attributes() ::
  [ {'ad_link', binary() }
  | {'adult', boolean() }
  | {'age_group', binary() }
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
  | {'description', binary() }
  | {'free_shipping_label', boolean() }
  | {'free_shipping_limit', binary() }
  | {'gender', binary() }
  | {'google_product_category', binary() }
  | {'gtin', integer() }
  | {'id', binary() }
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
  | {'sale_price', binary() }
  | {'shipping', binary() }
  | {'shipping_height', binary() }
  | {'shipping_weight', binary() }
  | {'shipping_width', binary() }
  | {'size', binary() }
  | {'size_system', binary() }
  | {'size_type', binary() }
  | {'tax', binary() }
  | {'title', binary() }
  | {'variant_names', list(binary()) }
  | {'variant_values', list(binary()) }
  | {'additional_image_link', list(binary()) }
  | {'image_link', list(binary()) }
  ].


openapi_item_attributes() ->
    openapi_item_attributes([]).

openapi_item_attributes(Fields) ->
  Default = [ {'ad_link', binary() }
            , {'adult', boolean() }
            , {'age_group', binary() }
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
            , {'description', binary() }
            , {'free_shipping_label', boolean() }
            , {'free_shipping_limit', binary() }
            , {'gender', binary() }
            , {'google_product_category', binary() }
            , {'gtin', integer() }
            , {'id', binary() }
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
            , {'sale_price', binary() }
            , {'shipping', binary() }
            , {'shipping_height', binary() }
            , {'shipping_weight', binary() }
            , {'shipping_width', binary() }
            , {'size', binary() }
            , {'size_system', binary() }
            , {'size_type', binary() }
            , {'tax', binary() }
            , {'title', binary() }
            , {'variant_names', list(binary()) }
            , {'variant_values', list(binary()) }
            , {'additional_image_link', list(binary()) }
            , {'image_link', list(binary(), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

