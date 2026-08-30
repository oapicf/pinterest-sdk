-module(openapi_brand_account_profile_image_update).

-export([encode/1]).

-export_type([openapi_brand_account_profile_image_update/0]).

-type openapi_brand_account_profile_image_update() ::
    #{ 'content_type' => binary(),
       'data' => binary()
     }.

encode(#{ 'content_type' := ContentType,
          'data' := Data
        }) ->
    #{ 'content_type' => ContentType,
       'data' => Data
     }.
