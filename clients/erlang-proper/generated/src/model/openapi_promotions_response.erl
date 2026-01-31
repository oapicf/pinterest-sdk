-module(openapi_promotions_response).

-include("openapi.hrl").

-export([openapi_promotions_response/0]).

-export([openapi_promotions_response/1]).

-export_type([openapi_promotions_response/0]).

-type openapi_promotions_response() ::
  [ {'promotions', list(openapi_promotion_array_element:openapi_promotion_array_element()) }
  ].


openapi_promotions_response() ->
    openapi_promotions_response([]).

openapi_promotions_response(Fields) ->
  Default = [ {'promotions', list(openapi_promotion_array_element:openapi_promotion_array_element()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

