-module(openapi_trending_topic).

-export([encode/1]).

-export_type([openapi_trending_topic/0]).

-type openapi_trending_topic() ::
    #{ 'description' := binary(),
       'id' := binary(),
       'percent_growth_mom' => integer(),
       'pins' := list(),
       'related_interests' := list(),
       'related_searches' := list(),
       'time_series' := maps:map(),
       'title' := binary()
     }.

encode(#{ 'description' := Description,
          'id' := Id,
          'percent_growth_mom' := PercentGrowthMom,
          'pins' := Pins,
          'related_interests' := RelatedInterests,
          'related_searches' := RelatedSearches,
          'time_series' := TimeSeries,
          'title' := Title
        }) ->
    #{ 'description' => Description,
       'id' => Id,
       'percent_growth_mom' => PercentGrowthMom,
       'pins' => Pins,
       'related_interests' => RelatedInterests,
       'related_searches' => RelatedSearches,
       'time_series' => TimeSeries,
       'title' => Title
     }.
