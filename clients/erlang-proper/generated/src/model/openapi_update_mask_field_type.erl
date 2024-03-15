-module(openapi_update_mask_field_type).

-include("openapi.hrl").

-export([openapi_update_mask_field_type/0]).

-export_type([openapi_update_mask_field_type/0]).

-type openapi_update_mask_field_type() ::
  binary().

openapi_update_mask_field_type() ->
  elements([<<"ad_link">>, <<"adult">>, <<"age_group">>, <<"availability">>, <<"average_review_rating">>, <<"brand">>, <<"checkout_enabled">>, <<"color">>, <<"condition">>, <<"custom_label_0">>, <<"custom_label_1">>, <<"custom_label_2">>, <<"custom_label_3">>, <<"custom_label_4">>, <<"description">>, <<"free_shipping_label">>, <<"free_shipping_limit">>, <<"gender">>, <<"google_product_category">>, <<"gtin">>, <<"item_group_id">>, <<"last_updated_time">>, <<"link">>, <<"material">>, <<"min_ad_price">>, <<"mpn">>, <<"number_of_ratings">>, <<"number_of_reviews">>, <<"pattern">>, <<"price">>, <<"product_type">>, <<"sale_price">>, <<"shipping">>, <<"shipping_height">>, <<"shipping_weight">>, <<"shipping_width">>, <<"size">>, <<"size_system">>, <<"size_type">>, <<"tax">>, <<"title">>, <<"variant_names">>, <<"variant_values">>]).

