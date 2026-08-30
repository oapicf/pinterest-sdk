-module(openapi_dynamic_titles_upload_url).

-include("openapi.hrl").

-export([openapi_dynamic_titles_upload_url/0]).

-export([openapi_dynamic_titles_upload_url/1]).

-export_type([openapi_dynamic_titles_upload_url/0]).

-type openapi_dynamic_titles_upload_url() ::
  [ {'existing_filename', binary() }
  | {'request_id', binary() }
  | {'upload_url', binary() }
  ].


openapi_dynamic_titles_upload_url() ->
    openapi_dynamic_titles_upload_url([]).

openapi_dynamic_titles_upload_url(Fields) ->
  Default = [ {'existing_filename', binary() }
            , {'request_id', binary() }
            , {'upload_url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

