-module(openapi_product_group_promotion).

-include("openapi.hrl").

-export([openapi_product_group_promotion/0]).

-export([openapi_product_group_promotion/1]).

-export_type([openapi_product_group_promotion/0]).

-type openapi_product_group_promotion() ::
  [ {'ad_group_id', binary() }
  | {'bid_in_micro_currency', integer() }
  | {'catalog_product_group_id', binary() }
  | {'catalog_product_group_name', binary() }
  | {'collections_header_type', binary() }
  | {'collections_hero_destination_url', binary() }
  | {'collections_hero_pin_id', binary() }
  | {'creative_type', openapi_creative_type:openapi_creative_type() }
  | {'customizable_cta_type', binary() }
  | {'definition', binary() }
  | {'grid_click_type', openapi_grid_click_type:openapi_grid_click_type() }
  | {'id', binary() }
  | {'included', boolean() }
  | {'is_generate_background', boolean() }
  | {'is_mdl', boolean() }
  | {'parent_id', binary() }
  | {'preferred_media_type', binary() }
  | {'relative_definition', binary() }
  | {'selected_image_tag', binary() }
  | {'selected_video_tag', binary() }
  | {'slideshow_collections_description', binary() }
  | {'slideshow_collections_title', binary() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'tracking_url', binary() }
  ].


openapi_product_group_promotion() ->
    openapi_product_group_promotion([]).

openapi_product_group_promotion(Fields) ->
  Default = [ {'ad_group_id', binary() }
            , {'bid_in_micro_currency', integer() }
            , {'catalog_product_group_id', binary() }
            , {'catalog_product_group_name', binary() }
            , {'collections_header_type', elements([<<"SHOP_THIS_COLLECTION">>, <<"EXPLORE_THIS_COLLECTION">>, <<"NO_HEADER">>, <<"ON_SALE">>, <<"GET_DEAL">>, <<"">>]) }
            , {'collections_hero_destination_url', binary() }
            , {'collections_hero_pin_id', binary() }
            , {'creative_type', openapi_creative_type:openapi_creative_type() }
            , {'customizable_cta_type', elements([<<"SHOP_NOW">>, <<"BOOK_NOW">>, <<"ON_SALE">>, <<"GET_DEAL">>, <<"BUY_ONLINE_PICKUP_IN_STORE">>, <<"">>]) }
            , {'definition', binary() }
            , {'grid_click_type', openapi_grid_click_type:openapi_grid_click_type() }
            , {'id', binary() }
            , {'included', boolean() }
            , {'is_generate_background', boolean() }
            , {'is_mdl', boolean() }
            , {'parent_id', binary() }
            , {'preferred_media_type', elements([<<"VIDEO">>, <<"IMAGE">>, <<"">>]) }
            , {'relative_definition', binary() }
            , {'selected_image_tag', binary() }
            , {'selected_video_tag', binary() }
            , {'slideshow_collections_description', binary() }
            , {'slideshow_collections_title', binary() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'tracking_url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

