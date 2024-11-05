-module(openapi_creative_assets_id_filter).

-export([encode/1]).

-export_type([openapi_creative_assets_id_filter/0]).

-type openapi_creative_assets_id_filter() ::
    #{ 'CREATIVE_ASSETS_ID' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria()
     }.

encode(#{ 'CREATIVE_ASSETS_ID' := CREATIVEASSETSID
        }) ->
    #{ 'CREATIVE_ASSETS_ID' => CREATIVEASSETSID
     }.
