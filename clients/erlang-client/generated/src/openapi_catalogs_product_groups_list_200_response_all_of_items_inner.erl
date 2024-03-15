-module(openapi_catalogs_product_groups_list_200_response_all_of_items_inner).

-export([encode/1]).

-export_type([openapi_catalogs_product_groups_list_200_response_all_of_items_inner/0]).

-type openapi_catalogs_product_groups_list_200_response_all_of_items_inner() ::
    #{ 'id' := binary(),
       'name' => binary(),
       'description' => binary(),
       'filters' := openapi_catalogs_product_group_filters:openapi_catalogs_product_group_filters(),
       'is_featured' => boolean(),
       'type' => openapi_catalogs_product_group_type:openapi_catalogs_product_group_type(),
       'status' => openapi_catalogs_product_group_status:openapi_catalogs_product_group_status(),
       'created_at' => integer(),
       'updated_at' => integer(),
       'feed_id' := binary(),
       'catalog_type' := binary(),
       'catalog_id' := binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'description' := Description,
          'filters' := Filters,
          'is_featured' := IsFeatured,
          'type' := Type,
          'status' := Status,
          'created_at' := CreatedAt,
          'updated_at' := UpdatedAt,
          'feed_id' := FeedId,
          'catalog_type' := CatalogType,
          'catalog_id' := CatalogId
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'description' => Description,
       'filters' => Filters,
       'is_featured' => IsFeatured,
       'type' => Type,
       'status' => Status,
       'created_at' => CreatedAt,
       'updated_at' => UpdatedAt,
       'feed_id' => FeedId,
       'catalog_type' => CatalogType,
       'catalog_id' => CatalogId
     }.
