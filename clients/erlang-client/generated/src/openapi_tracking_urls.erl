-module(openapi_tracking_urls).

-export([encode/1]).

-export_type([openapi_tracking_urls/0]).

-type openapi_tracking_urls() ::
    #{ 'audience_verification' => list(),
       'buyable_button' => list(),
       'click' => list(),
       'engagement' => list(),
       'impression' => list()
     }.

encode(#{ 'audience_verification' := AudienceVerification,
          'buyable_button' := BuyableButton,
          'click' := Click,
          'engagement' := Engagement,
          'impression' := Impression
        }) ->
    #{ 'audience_verification' => AudienceVerification,
       'buyable_button' => BuyableButton,
       'click' => Click,
       'engagement' => Engagement,
       'impression' => Impression
     }.
