-module(openapi_catalog_product_group).

-include("openapi.hrl").

-export([openapi_catalog_product_group/0]).

-export([openapi_catalog_product_group/1]).

-export_type([openapi_catalog_product_group/0]).

-type openapi_catalog_product_group() ::
  [ {'id', binary() }
  | {'merchant_id', binary() }
  | {'name', binary() }
  | {'filters', map() }
  | {'filter_v2', map() }
  | {'type', openapi_board:openapi_board() }
  | {'status', openapi_entity_status:openapi_entity_status() }
  | {'feed_profile_id', binary() }
  | {'created_at', integer() }
  | {'last_update', integer() }
  | {'product_count', integer() }
  | {'featured_position', integer() }
  ].


openapi_catalog_product_group() ->
    openapi_catalog_product_group([]).

openapi_catalog_product_group(Fields) ->
  Default = [ {'id', binary() }
            , {'merchant_id', binary() }
            , {'name', binary() }
            , {'filters', map() }
            , {'filter_v2', map() }
            , {'type', openapi_board:openapi_board() }
            , {'status', openapi_entity_status:openapi_entity_status() }
            , {'feed_profile_id', binary() }
            , {'created_at', integer() }
            , {'last_update', integer() }
            , {'product_count', integer() }
            , {'featured_position', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

