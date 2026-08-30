-module(openapi_dynamic_titles_download_csv).

-include("openapi.hrl").

-export([openapi_dynamic_titles_download_csv/0]).

-export([openapi_dynamic_titles_download_csv/1]).

-export_type([openapi_dynamic_titles_download_csv/0]).

-type openapi_dynamic_titles_download_csv() ::
  [ {'download_url', binary() }
  ].


openapi_dynamic_titles_download_csv() ->
    openapi_dynamic_titles_download_csv([]).

openapi_dynamic_titles_download_csv(Fields) ->
  Default = [ {'download_url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

