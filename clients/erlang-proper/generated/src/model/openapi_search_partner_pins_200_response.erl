-module(openapi_search_partner_pins_200_response).

-include("openapi.hrl").

-export([openapi_search_partner_pins_200_response/0]).

-export([openapi_search_partner_pins_200_response/1]).

-export_type([openapi_search_partner_pins_200_response/0]).

-type openapi_search_partner_pins_200_response() ::
  [ {'items', list(openapi_summary_pin:openapi_summary_pin()) }
  | {'bookmark', binary() }
  ].


openapi_search_partner_pins_200_response() ->
    openapi_search_partner_pins_200_response([]).

openapi_search_partner_pins_200_response(Fields) ->
  Default = [ {'items', list(openapi_summary_pin:openapi_summary_pin()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

