-module(openapi_account).

-export([encode/1]).

-export_type([openapi_account/0]).

-type openapi_account() ::
    #{ 'account_type' => binary(),
       'id' => binary(),
       'profile_image' => binary(),
       'website_url' => binary(),
       'username' => binary(),
       'about' => binary(),
       'business_name' => binary(),
       'board_count' => integer(),
       'pin_count' => integer(),
       'follower_count' => integer(),
       'following_count' => integer(),
       'monthly_views' => integer()
     }.

encode(#{ 'account_type' := AccountType,
          'id' := Id,
          'profile_image' := ProfileImage,
          'website_url' := WebsiteUrl,
          'username' := Username,
          'about' := About,
          'business_name' := BusinessName,
          'board_count' := BoardCount,
          'pin_count' := PinCount,
          'follower_count' := FollowerCount,
          'following_count' := FollowingCount,
          'monthly_views' := MonthlyViews
        }) ->
    #{ 'account_type' => AccountType,
       'id' => Id,
       'profile_image' => ProfileImage,
       'website_url' => WebsiteUrl,
       'username' => Username,
       'about' => About,
       'business_name' => BusinessName,
       'board_count' => BoardCount,
       'pin_count' => PinCount,
       'follower_count' => FollowerCount,
       'following_count' => FollowingCount,
       'monthly_views' => MonthlyViews
     }.
