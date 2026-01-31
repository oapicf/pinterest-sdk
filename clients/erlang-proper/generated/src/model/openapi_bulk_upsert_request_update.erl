-module(openapi_bulk_upsert_request_update).

-include("openapi.hrl").

-export([openapi_bulk_upsert_request_update/0]).

-export([openapi_bulk_upsert_request_update/1]).

-export_type([openapi_bulk_upsert_request_update/0]).

-type openapi_bulk_upsert_request_update() ::
  [ {'ad_groups', list(openapi_ad_group_update_request:openapi_ad_group_update_request()) }
  | {'ads', list(openapi_ad_update_request:openapi_ad_update_request()) }
  | {'campaigns', list(openapi_campaign_update_request:openapi_campaign_update_request()) }
  | {'catalog_product_groups', list(openapi_catalogs_product_groups_update_request:openapi_catalogs_product_groups_update_request()) }
  | {'keywords', list(openapi_keyword_update:openapi_keyword_update()) }
  | {'labels', list(openapi_label_bulk_update_request:openapi_label_bulk_update_request()) }
  | {'product_groups', list(openapi_product_group_promotion_update_request:openapi_product_group_promotion_update_request()) }
  ].


openapi_bulk_upsert_request_update() ->
    openapi_bulk_upsert_request_update([]).

openapi_bulk_upsert_request_update(Fields) ->
  Default = [ {'ad_groups', list(openapi_ad_group_update_request:openapi_ad_group_update_request()) }
            , {'ads', list(openapi_ad_update_request:openapi_ad_update_request()) }
            , {'campaigns', list(openapi_campaign_update_request:openapi_campaign_update_request()) }
            , {'catalog_product_groups', list(openapi_catalogs_product_groups_update_request:openapi_catalogs_product_groups_update_request()) }
            , {'keywords', list(openapi_keyword_update:openapi_keyword_update()) }
            , {'labels', list(openapi_label_bulk_update_request:openapi_label_bulk_update_request()) }
            , {'product_groups', list(openapi_product_group_promotion_update_request:openapi_product_group_promotion_update_request()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

