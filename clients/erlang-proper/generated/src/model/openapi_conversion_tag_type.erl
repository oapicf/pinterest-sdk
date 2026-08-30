-module(openapi_conversion_tag_type).

-include("openapi.hrl").

-export([openapi_conversion_tag_type/0]).

-export_type([openapi_conversion_tag_type/0]).

-type openapi_conversion_tag_type() ::
  binary().

openapi_conversion_tag_type() ->
  elements([<<"PAGE_LOAD">>, <<"UNKNOWN">>, <<"INITIALIZED">>, <<"PAGE_VISIT">>, <<"SIGNUP">>, <<"CHECKOUT">>, <<"CUSTOM">>, <<"VIEW_CATEGORY">>, <<"SEARCH">>, <<"ADD_TO_CART">>, <<"WATCH_VIDEO">>, <<"LEAD">>, <<"APP_INSTALL">>, <<"WEB_SESSION">>, <<"EXTERNAL_MEASUREMENT">>, <<"ADD_PAYMENT_INFO">>, <<"ADD_TO_WISHLIST">>, <<"INITIATE_CHECKOUT">>, <<"SUBSCRIBE">>, <<"VIEW_CONTENT">>, <<"ADVERTISER_DEFINED_EVENT">>, <<"APP_OPEN">>, <<"CONTACT">>, <<"SCHEDULE">>, <<"FIND_LOCATION">>, <<"CUSTOMIZE_PRODUCT">>, <<"SUBMIT_APPLICATION">>, <<"START_TRIAL">>]).

