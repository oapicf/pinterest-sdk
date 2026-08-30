-module(openapi_bulk_upsert_request_create).

-include("openapi.hrl").

-export([openapi_bulk_upsert_request_create/0]).

-export([openapi_bulk_upsert_request_create/1]).

-export_type([openapi_bulk_upsert_request_create/0]).

-type openapi_bulk_upsert_request_create() ::
  [ {'ad_groups', list(openapi_ad_group_create_request:openapi_ad_group_create_request()) }
  | {'ads', list(openapi_ad_create_request:openapi_ad_create_request()) }
  | {'campaigns', list(openapi_campaign_create_request:openapi_campaign_create_request()) }
  | {'catalog_product_groups', list(openapi_bulk_upsert_request_create_catalog_product_groups_items:openapi_bulk_upsert_request_create_catalog_product_groups_items()) }
  | {'keywords', list(openapi_keywords_request:openapi_keywords_request()) }
  | {'labels', list(openapi_label_bulk_create_request:openapi_label_bulk_create_request()) }
  | {'product_groups', list(openapi_product_group_promotion_create_request:openapi_product_group_promotion_create_request()) }
  | {'schedules', list(openapi_schedule_create_request:openapi_schedule_create_request()) }
  ].


openapi_bulk_upsert_request_create() ->
    openapi_bulk_upsert_request_create([]).

openapi_bulk_upsert_request_create(Fields) ->
  Default = [ {'ad_groups', list(openapi_ad_group_create_request:openapi_ad_group_create_request()) }
            , {'ads', list(openapi_ad_create_request:openapi_ad_create_request()) }
            , {'campaigns', list(openapi_campaign_create_request:openapi_campaign_create_request()) }
            , {'catalog_product_groups', list(openapi_bulk_upsert_request_create_catalog_product_groups_items:openapi_bulk_upsert_request_create_catalog_product_groups_items()) }
            , {'keywords', list(openapi_keywords_request:openapi_keywords_request()) }
            , {'labels', list(openapi_label_bulk_create_request:openapi_label_bulk_create_request()) }
            , {'product_groups', list(openapi_product_group_promotion_create_request:openapi_product_group_promotion_create_request()) }
            , {'schedules', list(openapi_schedule_create_request:openapi_schedule_create_request()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

