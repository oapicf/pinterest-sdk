-module(openapi_pin_media_source_pin_url).

-include("openapi.hrl").

-export([openapi_pin_media_source_pin_url/0]).

-export([openapi_pin_media_source_pin_url/1]).

-export_type([openapi_pin_media_source_pin_url/0]).

-type openapi_pin_media_source_pin_url() ::
  [ {'is_affiliate_link', boolean() }
  | {'source_type', binary() }
  ].


openapi_pin_media_source_pin_url() ->
    openapi_pin_media_source_pin_url([]).

openapi_pin_media_source_pin_url(Fields) ->
  Default = [ {'is_affiliate_link', boolean() }
            , {'source_type', elements([<<"pin_url">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

