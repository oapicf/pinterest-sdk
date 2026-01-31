-module(openapi_targeting_spec_shopping_retargeting).

-export([encode/1]).

-export_type([openapi_targeting_spec_shopping_retargeting/0]).

-type openapi_targeting_spec_shopping_retargeting() ::
    #{ 'exclusion_window' => integer(),
       'lookback_window' => integer(),
       'tag_types' => list()
     }.

encode(#{ 'exclusion_window' := ExclusionWindow,
          'lookback_window' := LookbackWindow,
          'tag_types' := TagTypes
        }) ->
    #{ 'exclusion_window' => ExclusionWindow,
       'lookback_window' => LookbackWindow,
       'tag_types' => TagTypes
     }.
