-module(openapi_paginated).

-include("openapi.hrl").

-export([openapi_paginated/0]).

-export([openapi_paginated/1]).

-export_type([openapi_paginated/0]).

-type openapi_paginated() ::
  [ {'bookmark', binary() }
  | {'items', list(map()) }
  ].


openapi_paginated() ->
    openapi_paginated([]).

openapi_paginated(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(map()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

