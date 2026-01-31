-module(openapi_advertiser_defined_event).

-include("openapi.hrl").

-export([openapi_advertiser_defined_event/0]).

-export([openapi_advertiser_defined_event/1]).

-export_type([openapi_advertiser_defined_event/0]).

-type openapi_advertiser_defined_event() ::
  [ {'name', binary() }
  | {'mapped_conversion_type', binary() }
  ].


openapi_advertiser_defined_event() ->
    openapi_advertiser_defined_event([]).

openapi_advertiser_defined_event(Fields) ->
  Default = [ {'name', binary() }
            , {'mapped_conversion_type', elements([<<"PAGE_LOAD">>, <<"UNKNOWN">>, <<"INITIALIZED">>, <<"PAGE_VISIT">>, <<"SIGNUP">>, <<"CHECKOUT">>, <<"CUSTOM">>, <<"VIEW_CATEGORY">>, <<"SEARCH">>, <<"ADD_TO_CART">>, <<"WATCH_VIDEO">>, <<"LEAD">>, <<"APP_INSTALL">>, <<"WEB_SESSION">>, <<"EXTERNAL_MEASUREMENT">>, <<"ADD_PAYMENT_INFO">>, <<"ADD_TO_WISHLIST">>, <<"INITIATE_CHECKOUT">>, <<"SUBSCRIBE">>, <<"VIEW_CONTENT">>, <<"ADVERTISER_DEFINED_EVENT">>, <<"APP_OPEN">>, <<"CONTACT">>, <<"SCHEDULE">>, <<"FIND_LOCATION">>, <<"CUSTOMIZE_PRODUCT">>, <<"SUBMIT_APPLICATION">>, <<"START_TRIAL">>, <<"">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

