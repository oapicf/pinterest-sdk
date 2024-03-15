-module(openapi_media_list_200_response).

-include("openapi.hrl").

-export([openapi_media_list_200_response/0]).

-export([openapi_media_list_200_response/1]).

-export_type([openapi_media_list_200_response/0]).

-type openapi_media_list_200_response() ::
  [ {'items', list(openapi_media_upload_details:openapi_media_upload_details()) }
  | {'bookmark', binary() }
  ].


openapi_media_list_200_response() ->
    openapi_media_list_200_response([]).

openapi_media_list_200_response(Fields) ->
  Default = [ {'items', list(openapi_media_upload_details:openapi_media_upload_details()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

