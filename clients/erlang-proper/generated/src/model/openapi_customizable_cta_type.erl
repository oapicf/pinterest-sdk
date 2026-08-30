-module(openapi_customizable_cta_type).

-include("openapi.hrl").

-export([openapi_customizable_cta_type/0]).

-export_type([openapi_customizable_cta_type/0]).

-type openapi_customizable_cta_type() ::
  binary().

openapi_customizable_cta_type() ->
  elements([<<"GET_OFFER">>, <<"LEARN_MORE">>, <<"ORDER_NOW">>, <<"SHOP_NOW">>, <<"SIGN_UP">>, <<"SUBSCRIBE">>, <<"BUY_NOW">>, <<"CONTACT_US">>, <<"GET_QUOTE">>, <<"VISIT_SITE">>, <<"APPLY_NOW">>, <<"BOOK_NOW">>, <<"REQUEST_DEMO">>, <<"REGISTER_NOW">>, <<"FIND_A_DEALER">>, <<"ADD_TO_CART">>, <<"WATCH_NOW">>, <<"READ_MORE">>, <<"BUY_TICKETS">>, <<"DONATE_NOW">>, <<"DOWNLOAD">>, <<"EXPLORE_MORE">>, <<"FIND_A_LOCATION">>, <<"FIND_RETAILERS">>, <<"GET_DEAL">>, <<"GET_RECIPE">>, <<"GET_SHOWTIMES">>, <<"ON_SALE">>, <<"PLAY_GAME">>, <<"TRY_IT">>, <<"TAKE_A_PEEK">>, <<"">>]).

