-module(openapi_media_upload_create).

-include("openapi.hrl").

-export([openapi_media_upload_create/0]).

-export([openapi_media_upload_create/1]).

-export_type([openapi_media_upload_create/0]).

-type openapi_media_upload_create() ::
  [ {'media_type', openapi_media_upload_type:openapi_media_upload_type() }
  ].


openapi_media_upload_create() ->
    openapi_media_upload_create([]).

openapi_media_upload_create(Fields) ->
  Default = [ {'media_type', openapi_media_upload_type:openapi_media_upload_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

