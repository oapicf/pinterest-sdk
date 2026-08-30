-module(openapi_promotions_list_200_response).

-include("openapi.hrl").

-export([openapi_promotions_list_200_response/0]).

-export([openapi_promotions_list_200_response/1]).

-export_type([openapi_promotions_list_200_response/0]).

-type openapi_promotions_list_200_response() ::
  [ {'bookmark', binary() }
  | {'items', list(openapi_promotion:openapi_promotion()) }
  ].


openapi_promotions_list_200_response() ->
    openapi_promotions_list_200_response([]).

openapi_promotions_list_200_response(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(openapi_promotion:openapi_promotion()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

