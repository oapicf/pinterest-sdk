-module(openapi_paginated).

-include("openapi.hrl").

-export([openapi_paginated/0]).

-export([openapi_paginated/1]).

-export_type([openapi_paginated/0]).

-type openapi_paginated() ::
  [ {'items', list(map()) }
  | {'bookmark', binary() }
  ].


openapi_paginated() ->
    openapi_paginated([]).

openapi_paginated(Fields) ->
  Default = [ {'items', list(map()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

