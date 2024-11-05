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
       'INTEREST' => list(),
       'LOCALE' => list(),
       'LOCATION' => list(),
       'SHOPPING_RETARGETING' => list(),
       'TARGETING_STRATEGY' => list()
     }.

encode(#{ 'AGE_BUCKET' := AGEBUCKET,
          'APPTYPE' := APPTYPE,
          'AUDIENCE_EXCLUDE' := AUDIENCEEXCLUDE,
          'AUDIENCE_INCLUDE' := AUDIENCEINCLUDE,
          'GENDER' := GENDER,
          'GEO' := GEO,
          'INTEREST' := INTEREST,
          'LOCALE' := LOCALE,
          'LOCATION' := LOCATION,
          'SHOPPING_RETARGETING' := SHOPPINGRETARGETING,
          'TARGETING_STRATEGY' := TARGETINGSTRATEGY
        }) ->
    #{ 'AGE_BUCKET' => AGEBUCKET,
       'APPTYPE' => APPTYPE,
       'AUDIENCE_EXCLUDE' => AUDIENCEEXCLUDE,
       'AUDIENCE_INCLUDE' => AUDIENCEINCLUDE,
       'GENDER' => GENDER,
       'GEO' => GEO,
       'INTEREST' => INTEREST,
       'LOCALE' => LOCALE,
       'LOCATION' => LOCATION,
       'SHOPPING_RETARGETING' => SHOPPINGRETARGETING,
       'TARGETING_STRATEGY' => TARGETINGSTRATEGY
     }.
