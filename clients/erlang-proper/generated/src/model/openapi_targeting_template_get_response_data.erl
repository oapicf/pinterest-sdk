-module(openapi_targeting_template_get_response_data).

-include("openapi.hrl").

-export([openapi_targeting_template_get_response_data/0]).

-export([openapi_targeting_template_get_response_data/1]).

-export_type([openapi_targeting_template_get_response_data/0]).

-type openapi_targeting_template_get_response_data() ::
  [ {'name', binary() }
  | {'auto_targeting_enabled', boolean() }
  | {'targeting_attributes', openapi_targeting_spec:openapi_targeting_spec() }
  | {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
  | {'keywords', list(openapi_targeting_template_keyword:openapi_targeting_template_keyword()) }
  | {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
  | {'id', binary() }
  | {'created_time', integer() }
  | {'updated_time', integer() }
  | {'ad_account_id', binary() }
  | {'status', binary() }
  | {'sizing', openapi_targeting_template_audience_sizing:openapi_targeting_template_audience_sizing() }
  | {'valid', boolean() }
  ].


openapi_targeting_template_get_response_data() ->
    openapi_targeting_template_get_response_data([]).

openapi_targeting_template_get_response_data(Fields) ->
  Default = [ {'name', binary() }
            , {'auto_targeting_enabled', boolean() }
            , {'targeting_attributes', openapi_targeting_spec:openapi_targeting_spec() }
            , {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
            , {'keywords', list(openapi_targeting_template_keyword:openapi_targeting_template_keyword()) }
            , {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
            , {'id', binary() }
            , {'created_time', integer() }
            , {'updated_time', integer() }
            , {'ad_account_id', binary() }
            , {'status', elements([<<"ACTIVE">>, <<"DELETED">>]) }
            , {'sizing', openapi_targeting_template_audience_sizing:openapi_targeting_template_audience_sizing() }
            , {'valid', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

