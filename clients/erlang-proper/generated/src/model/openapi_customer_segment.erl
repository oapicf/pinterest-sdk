-module(openapi_customer_segment).

-include("openapi.hrl").

-export([openapi_customer_segment/0]).

-export([openapi_customer_segment/1]).

-export_type([openapi_customer_segment/0]).

-type openapi_customer_segment() ::
  [ {'ad_account_id', binary() }
  | {'audience_ids', list(binary()) }
  | {'created_time', integer() }
  | {'id', binary() }
  | {'name', binary() }
  | {'status', openapi_targeting_template_status:openapi_targeting_template_status() }
  | {'updated_time', integer() }
  ].


openapi_customer_segment() ->
    openapi_customer_segment([]).

openapi_customer_segment(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'audience_ids', list(binary()) }
            , {'created_time', integer() }
            , {'id', binary() }
            , {'name', binary() }
            , {'status', openapi_targeting_template_status:openapi_targeting_template_status() }
            , {'updated_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

