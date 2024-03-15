-module(openapi_bulk_upsert_request_update).

-export([encode/1]).

-export_type([openapi_bulk_upsert_request_update/0]).

-type openapi_bulk_upsert_request_update() ::
    #{ 'campaigns' => list(),
       'ad_groups' => list(),
       'ads' => list(),
       'product_groups' => list(),
       'keywords' => list()
     }.

encode(#{ 'campaigns' := Campaigns,
          'ad_groups' := AdGroups,
          'ads' := Ads,
          'product_groups' := ProductGroups,
          'keywords' := Keywords
        }) ->
    #{ 'campaigns' => Campaigns,
       'ad_groups' => AdGroups,
       'ads' => Ads,
       'product_groups' => ProductGroups,
       'keywords' => Keywords
     }.
