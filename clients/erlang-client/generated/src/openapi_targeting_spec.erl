-module(openapi_targeting_spec).

-export([encode/1]).

-export_type([openapi_targeting_spec/0]).

-type openapi_targeting_spec() ::
    #{ 'AGE_BUCKET' => list(),
       'APPTYPE' => list(),
       'AUDIENCE_EXCLUDE' => list(),
       'AUDIENCE_INCLUDE' => list(),
       'GENDER' => list(),
       'GEO' => list(),
       'GEO_EXCLUDE' => list(),
       'INTEREST' => list(),
       'LOCALE' => list(),
       'LOCATION' => list(),
       'LOCATION_EXCLUDE' => list(),
       'MAXIMUM_AGE' => binary(),
       'MINIMUM_AGE' => binary(),
       'SHOPPING_RETARGETING' => list(),
       'TARGETING_STRATEGY' => list()
     }.

encode(#{ 'AGE_BUCKET' := AGEBUCKET,
          'APPTYPE' := APPTYPE,
          'AUDIENCE_EXCLUDE' := AUDIENCEEXCLUDE,
          'AUDIENCE_INCLUDE' := AUDIENCEINCLUDE,
          'GENDER' := GENDER,
          'GEO' := GEO,
          'GEO_EXCLUDE' := GEOEXCLUDE,
          'INTEREST' := INTEREST,
          'LOCALE' := LOCALE,
          'LOCATION' := LOCATION,
          'LOCATION_EXCLUDE' := LOCATIONEXCLUDE,
          'MAXIMUM_AGE' := MAXIMUMAGE,
          'MINIMUM_AGE' := MINIMUMAGE,
          'SHOPPING_RETARGETING' := SHOPPINGRETARGETING,
          'TARGETING_STRATEGY' := TARGETINGSTRATEGY
        }) ->
    #{ 'AGE_BUCKET' => AGEBUCKET,
       'APPTYPE' => APPTYPE,
       'AUDIENCE_EXCLUDE' => AUDIENCEEXCLUDE,
       'AUDIENCE_INCLUDE' => AUDIENCEINCLUDE,
       'GENDER' => GENDER,
       'GEO' => GEO,
       'GEO_EXCLUDE' => GEOEXCLUDE,
       'INTEREST' => INTEREST,
       'LOCALE' => LOCALE,
       'LOCATION' => LOCATION,
       'LOCATION_EXCLUDE' => LOCATIONEXCLUDE,
       'MAXIMUM_AGE' => MAXIMUMAGE,
       'MINIMUM_AGE' => MINIMUMAGE,
       'SHOPPING_RETARGETING' => SHOPPINGRETARGETING,
       'TARGETING_STRATEGY' => TARGETINGSTRATEGY
     }.
