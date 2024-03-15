-module(openapi_user_following_feed_type).

-include("openapi.hrl").

-export([openapi_user_following_feed_type/0]).

-export_type([openapi_user_following_feed_type/0]).

-type openapi_user_following_feed_type() ::
  binary().

openapi_user_following_feed_type() ->
  elements([<<"ALL">>, <<"RANKED">>, <<"CREATOR_ONLY">>, <<"RANKED_CREATOR_ONLY">>]).

