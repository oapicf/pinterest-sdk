-module(openapi_update_member_asset_result_item).

-export([encode/1]).

-export_type([openapi_update_member_asset_result_item/0]).

-type openapi_update_member_asset_result_item() ::
    #{ 'response' => openapi_users_for_individual_asset_response:openapi_users_for_individual_asset_response()
     }.

encode(#{ 'response' := Response
        }) ->
    #{ 'response' => Response
     }.
