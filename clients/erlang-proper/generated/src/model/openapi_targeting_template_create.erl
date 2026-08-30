-module(openapi_targeting_template_create).

-include("openapi.hrl").

-export([openapi_targeting_template_create/0]).

-export([openapi_targeting_template_create/1]).

-export_type([openapi_targeting_template_create/0]).

-type openapi_targeting_template_create() ::
  [ {'auto_targeting_enabled', boolean() }
  | {'keywords', list(openapi_targeting_template_keyword:openapi_targeting_template_keyword()) }
  | {'name', binary() }
  | {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
  | {'targeting_attributes', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
  | {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
  ].


openapi_targeting_template_create() ->
    openapi_targeting_template_create([]).

openapi_targeting_template_create(Fields) ->
  Default = [ {'auto_targeting_enabled', boolean() }
            , {'keywords', list(openapi_targeting_template_keyword:openapi_targeting_template_keyword()) }
            , {'name', binary() }
            , {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
            , {'targeting_attributes', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
            , {'tracking_urls', openapi_tracking_urls:openapi_tracking_urls() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

