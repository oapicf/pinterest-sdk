-module(openapi_audience_demographic_value).

-export([encode/1]).

-export_type([openapi_audience_demographic_value/0]).

-type openapi_audience_demographic_value() ::
    #{ 'key' => binary(),
       'name' => binary(),
       'ratio' => integer()
     }.

encode(#{ 'key' := Key,
          'name' := Name,
          'ratio' := Ratio
        }) ->
    #{ 'key' => Key,
       'name' => Name,
       'ratio' => Ratio
     }.
