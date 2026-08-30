-module(openapi_targeting_template).

-include("openapi.hrl").

-export([openapi_targeting_template/0]).

-export([openapi_targeting_template/1]).

-export_type([openapi_targeting_template/0]).

-type openapi_targeting_template() ::
  [ {'ad_account_id', binary() }
  | {'auto_targeting_enabled', boolean() }
  | {'created_time', integer() }
  | {'id', binary() }
  | {'keywords', list(openapi_targeting_template_keyword:openapi_targeting_template_keyword()) }
  | {'name', binary() }
  | {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
  | {'sizing', openapi_targeting_template_audience_sizing:openapi_targeting_template_audience_sizing() }
  | {'status', openapi_targeting_template_status:openapi_targeting_template_status() }
  | {'targeting_attributes', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
  | {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
  | {'updated_time', integer() }
  | {'valid', boolean() }
  ].


openapi_targeting_template() ->
    openapi_targeting_template([]).

openapi_targeting_template(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'auto_targeting_enabled', boolean() }
            , {'created_time', integer() }
            , {'id', binary() }
            , {'keywords', list(openapi_targeting_template_keyword:openapi_targeting_template_keyword()) }
            , {'name', binary() }
            , {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
            , {'sizing', openapi_targeting_template_audience_sizing:openapi_targeting_template_audience_sizing() }
            , {'status', openapi_targeting_template_status:openapi_targeting_template_status() }
            , {'targeting_attributes', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
            , {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
            , {'updated_time', integer() }
            , {'valid', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

