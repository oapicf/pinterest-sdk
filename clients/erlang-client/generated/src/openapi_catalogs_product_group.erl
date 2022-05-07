-module(openapi_catalogs_product_group).

-export([encode/1]).

-export_type([openapi_catalogs_product_group/0]).

-type openapi_catalogs_product_group() ::
    #{ 'id' := binary(),
       'name' => binary(),
       'description' => binary(),
       'filters' := openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters(),
       'type' => openapi_catalogs_product_group_type:openapi_catalogs_product_group_type(),
       'status' => openapi_catalogs_product_group_status:openapi_catalogs_product_group_status(),
       'feed_id' => binary(),
       'created_at' => integer(),
       'updated_at' => integer()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'description' := Description,
          'filters' := Filters,
          'type' := Type,
          'status' := Status,
          'feed_id' := FeedId,
          'created_at' := CreatedAt,
          'updated_at' := UpdatedAt
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'description' => Description,
       'filters' => Filters,
       'type' => Type,
       'status' => Status,
       'feed_id' => FeedId,
       'created_at' => CreatedAt,
       'updated_at' => UpdatedAt
     }.
