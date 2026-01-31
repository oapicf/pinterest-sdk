-module(openapi_quality_component_issue).

-export([encode/1]).

-export_type([openapi_quality_component_issue/0]).

-type openapi_quality_component_issue() ::
    #{ 'id' := binary(),
       'name' := binary(),
       'reason' := binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'reason' := Reason
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'reason' => Reason
     }.
