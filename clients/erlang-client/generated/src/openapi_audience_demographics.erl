-module(openapi_audience_demographics).

-export([encode/1]).

-export_type([openapi_audience_demographics/0]).

-type openapi_audience_demographics() ::
    #{ 'ages' => list(),
       'genders' => list(),
       'devices' => list(),
       'metros' => list(),
       'countries' => list()
     }.

encode(#{ 'ages' := Ages,
          'genders' := Genders,
          'devices' := Devices,
          'metros' := Metros,
          'countries' := Countries
        }) ->
    #{ 'ages' => Ages,
       'genders' => Genders,
       'devices' => Devices,
       'metros' => Metros,
       'countries' => Countries
     }.
