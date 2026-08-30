-module(openapi_advertiser_defined_event_mapping_type).

-include("openapi.hrl").

-export([openapi_advertiser_defined_event_mapping_type/0]).

-export_type([openapi_advertiser_defined_event_mapping_type/0]).

-type openapi_advertiser_defined_event_mapping_type() ::
  binary().

openapi_advertiser_defined_event_mapping_type() ->
  elements([<<"SIGNUP">>, <<"ADD_TO_CART">>, <<"LEAD">>, <<"CHECKOUT">>, <<"SUBSCRIBE">>, <<"ADD_TO_WISHLIST">>, <<"ADD_PAYMENT_INFO">>, <<"INITIATE_CHECKOUT">>, <<"CONTACT">>, <<"CUSTOMIZE_PRODUCT">>, <<"FIND_LOCATION">>, <<"SCHEDULE">>, <<"SUBMIT_APPLICATION">>, <<"START_TRIAL">>, <<"PAGE_VISIT">>, <<"VIEW_CATEGORY">>, <<"VIEW_CONTENT">>, <<"SEARCH">>, <<"WATCH_VIDEO">>]).

