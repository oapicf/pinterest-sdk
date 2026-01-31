-module(openapi_targeting_template_response_data).

-include("openapi.hrl").

-export([openapi_targeting_template_response_data/0]).

-export([openapi_targeting_template_response_data/1]).

-export_type([openapi_targeting_template_response_data/0]).

-type openapi_targeting_template_response_data() ::
  [ {'auto_targeting_enabled', boolean() }
  | {'keywords', list(openapi_targeting_template_keyword:openapi_targeting_template_keyword()) }
  | {'name', binary() }
  | {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
  | {'targeting_attributes', openapi_targeting_spec:openapi_targeting_spec() }
  | {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
  | {'ad_account_id', binary() }
  | {'created_time', integer() }
  | {'id', binary() }
  | {'sizing', openapi_targeting_template_audience_sizing:openapi_targeting_template_audience_sizing() }
  | {'status', binary() }
  | {'updated_time', integer() }
  ].


openapi_targeting_template_response_data() ->
    openapi_targeting_template_response_data([]).

openapi_targeting_template_response_data(Fields) ->
  Default = [ {'auto_targeting_enabled', boolean() }
            , {'keywords', list(openapi_targeting_template_keyword:openapi_targeting_template_keyword()) }
            , {'name', binary() }
            , {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
            , {'targeting_attributes', openapi_targeting_spec:openapi_targeting_spec() }
            , {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
            , {'ad_account_id', binary() }
            , {'created_time', integer() }
            , {'id', binary() }
            , {'sizing', openapi_targeting_template_audience_sizing:openapi_targeting_template_audience_sizing() }
            , {'status', elements([<<"ACTIVE">>, <<"DELETED">>]) }
            , {'updated_time', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

