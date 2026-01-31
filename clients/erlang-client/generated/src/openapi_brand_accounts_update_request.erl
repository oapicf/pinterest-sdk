-module(openapi_brand_accounts_update_request).

-export([encode/1]).

-export_type([openapi_brand_accounts_update_request/0]).

-type openapi_brand_accounts_update_request() ::
    #{ 'name' => binary(),
       'username' => binary(),
       'country' => openapi_country:openapi_country(),
       'about' => binary(),
       'website' => binary(),
       'profile_image' => openapi_image_base64:openapi_image_base64()
     }.

encode(#{ 'name' := Name,
          'username' := Username,
          'country' := Country,
          'about' := About,
          'website' := Website,
          'profile_image' := ProfileImage
        }) ->
    #{ 'name' => Name,
       'username' => Username,
       'country' => Country,
       'about' => About,
       'website' => Website,
       'profile_image' => ProfileImage
     }.
