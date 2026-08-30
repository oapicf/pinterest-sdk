-module(openapi_brand_account_update).

-export([encode/1]).

-export_type([openapi_brand_account_update/0]).

-type openapi_brand_account_update() ::
    #{ 'about' => binary(),
       'country' => openapi_country:openapi_country(),
       'name' => binary(),
       'profile_image' => openapi_brand_account_profile_image_update:openapi_brand_account_profile_image_update(),
       'username' => binary(),
       'website' => binary()
     }.

encode(#{ 'about' := About,
          'country' := Country,
          'name' := Name,
          'profile_image' := ProfileImage,
          'username' := Username,
          'website' := Website
        }) ->
    #{ 'about' => About,
       'country' => Country,
       'name' => Name,
       'profile_image' => ProfileImage,
       'username' => Username,
       'website' => Website
     }.
