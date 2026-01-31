-module(openapi_bulk_upsert_request_create).

-export([encode/1]).

-export_type([openapi_bulk_upsert_request_create/0]).

-type openapi_bulk_upsert_request_create() ::
    #{ 'ad_groups' => list(),
       'ads' => list(),
       'campaigns' => list(),
       'catalog_product_groups' => list(),
       'keywords' => list(),
       'labels' => list(),
       'product_groups' => list()
     }.

encode(#{ 'ad_groups' := AdGroups,
          'ads' := Ads,
          'campaigns' := Campaigns,
          'catalog_product_groups' := CatalogProductGroups,
          'keywords' := Keywords,
          'labels' := Labels,
          'product_groups' := ProductGroups
        }) ->
    #{ 'ad_groups' => AdGroups,
       'ads' => Ads,
       'campaigns' => Campaigns,
       'catalog_product_groups' => CatalogProductGroups,
       'keywords' => Keywords,
       'labels' => Labels,
       'product_groups' => ProductGroups
     }.
