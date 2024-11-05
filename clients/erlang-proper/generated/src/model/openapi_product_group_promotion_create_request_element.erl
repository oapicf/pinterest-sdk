-module(openapi_product_group_promotion_create_request_element).

-include("openapi.hrl").

-export([openapi_product_group_promotion_create_request_element/0]).

-export([openapi_product_group_promotion_create_request_element/1]).

-export_type([openapi_product_group_promotion_create_request_element/0]).

-type openapi_product_group_promotion_create_request_element() ::
  [ {'id', binary() }
  | {'ad_group_id', binary() }
  | {'bid_in_micro_currency', integer() }
  | {'included', boolean() }
  | {'definition', binary() }
  | {'relative_definition', binary() }
  | {'parent_id', binary() }
  | {'slideshow_collections_title', binary() }
  | {'slideshow_collections_description', binary() }
  | {'is_mdl', boolean() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'tracking_url', binary() }
  | {'catalog_product_group_id', binary() }
  | {'catalog_product_group_name', binary() }
  | {'collections_hero_pin_id', binary() }
  | {'collections_hero_destination_url', binary() }
  | {'grid_click_type', openapi_grid_click_type:openapi_grid_click_type() }
  | {'creative_type', openapi_creative_type:openapi_creative_type() }
  ].


openapi_product_group_promotion_create_request_element() ->
    openapi_product_group_promotion_create_request_element([]).

openapi_product_group_promotion_create_request_element(Fields) ->
  Default = [ {'id', binary() }
            , {'ad_group_id', binary() }
            , {'bid_in_micro_currency', integer() }
            , {'included', boolean() }
            , {'definition', binary() }
            , {'relative_definition', binary() }
            , {'parent_id', binary() }
            , {'slideshow_collections_title', binary() }
            , {'slideshow_collections_description', binary() }
            , {'is_mdl', boolean() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'tracking_url', binary() }
            , {'catalog_product_group_id', binary() }
            , {'catalog_product_group_name', binary() }
            , {'collections_hero_pin_id', binary() }
            , {'collections_hero_destination_url', binary() }
            , {'grid_click_type', openapi_grid_click_type:openapi_grid_click_type() }
            , {'creative_type', openapi_creative_type:openapi_creative_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

