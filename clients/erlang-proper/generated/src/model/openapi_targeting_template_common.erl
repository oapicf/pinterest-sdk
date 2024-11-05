-module(openapi_targeting_template_common).

-include("openapi.hrl").

-export([openapi_targeting_template_common/0]).

-export([openapi_targeting_template_common/1]).

-export_type([openapi_targeting_template_common/0]).

-type openapi_targeting_template_common() ::
  [ {'name', binary() }
  | {'auto_targeting_enabled', boolean() }
  | {'targeting_attributes', openapi_targeting_spec:openapi_targeting_spec() }
  | {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
  | {'keywords', list(openapi_targeting_template_keyword:openapi_targeting_template_keyword()) }
  | {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
  ].


openapi_targeting_template_common() ->
    openapi_targeting_template_common([]).

openapi_targeting_template_common(Fields) ->
  Default = [ {'name', binary() }
            , {'auto_targeting_enabled', boolean() }
            , {'targeting_attributes', openapi_targeting_spec:openapi_targeting_spec() }
            , {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
            , {'keywords', list(openapi_targeting_template_keyword:openapi_targeting_template_keyword()) }
            , {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

