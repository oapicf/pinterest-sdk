-module(openapi_bulk_upsert_request_create).

-include("openapi.hrl").

-export([openapi_bulk_upsert_request_create/0]).

-export([openapi_bulk_upsert_request_create/1]).

-export_type([openapi_bulk_upsert_request_create/0]).

-type openapi_bulk_upsert_request_create() ::
  [ {'campaigns', list(openapi_campaign_create_request:openapi_campaign_create_request()) }
  | {'ad_groups', list(openapi_ad_group_create_request:openapi_ad_group_create_request()) }
  | {'ads', list(openapi_ad_create_request:openapi_ad_create_request()) }
  | {'product_groups', list(openapi_product_group_promotion_create_request:openapi_product_group_promotion_create_request()) }
  | {'keywords', list(openapi_keywords_request:openapi_keywords_request()) }
  ].


openapi_bulk_upsert_request_create() ->
    openapi_bulk_upsert_request_create([]).

openapi_bulk_upsert_request_create(Fields) ->
  Default = [ {'campaigns', list(openapi_campaign_create_request:openapi_campaign_create_request()) }
            , {'ad_groups', list(openapi_ad_group_create_request:openapi_ad_group_create_request()) }
            , {'ads', list(openapi_ad_create_request:openapi_ad_create_request()) }
            , {'product_groups', list(openapi_product_group_promotion_create_request:openapi_product_group_promotion_create_request()) }
            , {'keywords', list(openapi_keywords_request:openapi_keywords_request()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

