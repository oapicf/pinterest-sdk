-module(openapi_promotion_template_value).

-include("openapi.hrl").

-export([openapi_promotion_template_value/0]).

-export([openapi_promotion_template_value/1]).

-export_type([openapi_promotion_template_value/0]).

-type openapi_promotion_template_value() ::
  [ {'amount', integer() }
  | {'currency_code', openapi_currency:openapi_currency() }
  | {'custom_text', binary() }
  | {'percent', integer() }
  ].


openapi_promotion_template_value() ->
    openapi_promotion_template_value([]).

openapi_promotion_template_value(Fields) ->
  Default = [ {'amount', integer() }
            , {'currency_code', openapi_currency:openapi_currency() }
            , {'custom_text', binary() }
            , {'percent', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

