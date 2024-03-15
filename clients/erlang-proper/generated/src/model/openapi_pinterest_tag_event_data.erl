-module(openapi_pinterest_tag_event_data).

-include("openapi.hrl").

-export([openapi_pinterest_tag_event_data/0]).

-export([openapi_pinterest_tag_event_data/1]).

-export_type([openapi_pinterest_tag_event_data/0]).

-type openapi_pinterest_tag_event_data() ::
  [ {'currency', openapi_currency:openapi_currency() }
  | {'lead_type', binary() }
  | {'line_items', openapi_line_item:openapi_line_item() }
  | {'order_id', binary() }
  | {'order_quantity', integer() }
  | {'page_name', binary() }
  | {'promo_code', binary() }
  | {'property', binary() }
  | {'search_query', binary() }
  | {'value', binary() }
  | {'video_title', binary() }
  ].


openapi_pinterest_tag_event_data() ->
    openapi_pinterest_tag_event_data([]).

openapi_pinterest_tag_event_data(Fields) ->
  Default = [ {'currency', openapi_currency:openapi_currency() }
            , {'lead_type', binary() }
            , {'line_items', openapi_line_item:openapi_line_item() }
            , {'order_id', binary() }
            , {'order_quantity', integer() }
            , {'page_name', binary() }
            , {'promo_code', binary() }
            , {'property', binary() }
            , {'search_query', binary() }
            , {'value', binary() }
            , {'video_title', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

