-module(openapi_ad_group_common_tracking_urls).

-export([encode/1]).

-export_type([openapi_ad_group_common_tracking_urls/0]).

-type openapi_ad_group_common_tracking_urls() ::
    #{ 'impression' => list(),
       'click' => list(),
       'engagement' => list(),
       'buyable_button' => list(),
       'audience_verification' => list()
     }.

encode(#{ 'impression' := Impression,
          'click' := Click,
          'engagement' := Engagement,
          'buyable_button' := BuyableButton,
          'audience_verification' := AudienceVerification
        }) ->
    #{ 'impression' => Impression,
       'click' => Click,
       'engagement' => Engagement,
       'buyable_button' => BuyableButton,
       'audience_verification' => AudienceVerification
     }.
