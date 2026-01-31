-module(openapi_account).

-export([encode/1]).

-export_type([openapi_account/0]).

-type openapi_account() ::
    #{ 'about' => binary(),
       'account_type' => binary(),
       'board_count' => integer(),
       'business_name' => binary(),
       'follower_count' => integer(),
       'following_count' => integer(),
       'id' => binary(),
       'monthly_views' => integer(),
       'pin_count' => integer(),
       'profile_image' => binary(),
       'username' => binary(),
       'website_url' => binary()
     }.

encode(#{ 'about' := About,
          'account_type' := AccountType,
          'board_count' := BoardCount,
          'business_name' := BusinessName,
          'follower_count' := FollowerCount,
          'following_count' := FollowingCount,
          'id' := Id,
          'monthly_views' := MonthlyViews,
          'pin_count' := PinCount,
          'profile_image' := ProfileImage,
          'username' := Username,
          'website_url' := WebsiteUrl
        }) ->
    #{ 'about' => About,
       'account_type' => AccountType,
       'board_count' => BoardCount,
       'business_name' => BusinessName,
       'follower_count' => FollowerCount,
       'following_count' => FollowingCount,
       'id' => Id,
       'monthly_views' => MonthlyViews,
       'pin_count' => PinCount,
       'profile_image' => ProfileImage,
       'username' => Username,
       'website_url' => WebsiteUrl
     }.
