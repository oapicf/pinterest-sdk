-module(openapi_catalogs_local_stores_delete_200_response_inner).

-export([encode/1]).

-export_type([openapi_catalogs_local_stores_delete_200_response_inner/0]).

-type openapi_catalogs_local_stores_delete_200_response_inner() ::
    #{ 'id' := binary(),
       'status' := openapi_campaign_ad_preview_delete_200_response_inner_status:openapi_campaign_ad_preview_delete_200_response_inner_status()
     }.

encode(#{ 'id' := Id,
          'status' := Status
        }) ->
    #{ 'id' => Id,
       'status' => Status
     }.
