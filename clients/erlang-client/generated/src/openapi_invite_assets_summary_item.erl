-module(openapi_invite_assets_summary_item).

-export([encode/1]).

-export_type([openapi_invite_assets_summary_item/0]).

-type openapi_invite_assets_summary_item() ::
    #{ 'id' => binary(),
       'permissions' => list()
     }.

encode(#{ 'id' := Id,
          'permissions' := Permissions
        }) ->
    #{ 'id' => Id,
       'permissions' => Permissions
     }.
