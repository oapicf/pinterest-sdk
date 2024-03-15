-module(openapi_catalog_product_group).

-export([encode/1]).

-export_type([openapi_catalog_product_group/0]).

-type openapi_catalog_product_group() ::
    #{ 'id' => binary(),
       'merchant_id' => binary(),
       'name' => binary(),
       'filters' => maps:map(),
       'filter_v2' => maps:map(),
       'type' => openapi_board:openapi_board(),
       'status' => openapi_entity_status:openapi_entity_status(),
       'feed_profile_id' => binary(),
       'created_at' => integer(),
       'last_update' => integer(),
       'product_count' => integer(),
       'featured_position' => integer()
     }.

encode(#{ 'id' := Id,
          'merchant_id' := MerchantId,
          'name' := Name,
          'filters' := Filters,
          'filter_v2' := FilterV2,
          'type' := Type,
          'status' := Status,
          'feed_profile_id' := FeedProfileId,
          'created_at' := CreatedAt,
          'last_update' := LastUpdate,
          'product_count' := ProductCount,
          'featured_position' := FeaturedPosition
        }) ->
    #{ 'id' => Id,
       'merchant_id' => MerchantId,
       'name' => Name,
       'filters' => Filters,
       'filter_v2' => FilterV2,
       'type' => Type,
       'status' => Status,
       'feed_profile_id' => FeedProfileId,
       'created_at' => CreatedAt,
       'last_update' => LastUpdate,
       'product_count' => ProductCount,
       'featured_position' => FeaturedPosition
     }.
