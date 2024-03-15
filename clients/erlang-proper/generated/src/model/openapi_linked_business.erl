-module(openapi_linked_business).

-include("openapi.hrl").

-export([openapi_linked_business/0]).

-export([openapi_linked_business/1]).

-export_type([openapi_linked_business/0]).

-type openapi_linked_business() ::
  [ {'username', binary() }
  | {'image_small_url', binary() }
  | {'image_medium_url', binary() }
  | {'image_large_url', binary() }
  | {'image_xlarge_url', binary() }
  ].


openapi_linked_business() ->
    openapi_linked_business([]).

openapi_linked_business(Fields) ->
  Default = [ {'username', binary() }
            , {'image_small_url', binary() }
            , {'image_medium_url', binary() }
            , {'image_large_url', binary() }
            , {'image_xlarge_url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

