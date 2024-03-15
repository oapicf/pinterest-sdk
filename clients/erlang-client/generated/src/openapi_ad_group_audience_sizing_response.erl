-module(openapi_ad_group_audience_sizing_response).

-export([encode/1]).

-export_type([openapi_ad_group_audience_sizing_response/0]).

-type openapi_ad_group_audience_sizing_response() ::
    #{ 'audience_size_lower_bound' => integer(),
       'audience_size_upper_bound' => integer()
     }.

encode(#{ 'audience_size_lower_bound' := AudienceSizeLowerBound,
          'audience_size_upper_bound' := AudienceSizeUpperBound
        }) ->
    #{ 'audience_size_lower_bound' => AudienceSizeLowerBound,
       'audience_size_upper_bound' => AudienceSizeUpperBound
     }.
