-module(openapi_page_visit_conversion_tags_get_200_response).

-include("openapi.hrl").

-export([openapi_page_visit_conversion_tags_get_200_response/0]).

-export([openapi_page_visit_conversion_tags_get_200_response/1]).

-export_type([openapi_page_visit_conversion_tags_get_200_response/0]).

-type openapi_page_visit_conversion_tags_get_200_response() ::
  [ {'items', list(openapi_conversion_event_response:openapi_conversion_event_response()) }
  | {'bookmark', binary() }
  ].


openapi_page_visit_conversion_tags_get_200_response() ->
    openapi_page_visit_conversion_tags_get_200_response([]).

openapi_page_visit_conversion_tags_get_200_response(Fields) ->
  Default = [ {'items', list(openapi_conversion_event_response:openapi_conversion_event_response()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

