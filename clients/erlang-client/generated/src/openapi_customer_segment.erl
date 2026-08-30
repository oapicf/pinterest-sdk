-module(openapi_customer_segment).

-export([encode/1]).

-export_type([openapi_customer_segment/0]).

-type openapi_customer_segment() ::
    #{ 'ad_account_id' => binary(),
       'audience_ids' := list(),
       'created_time' => integer(),
       'id' => binary(),
       'name' := binary(),
       'status' => openapi_targeting_template_status:openapi_targeting_template_status(),
       'updated_time' => integer()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'audience_ids' := AudienceIds,
          'created_time' := CreatedTime,
          'id' := Id,
          'name' := Name,
          'status' := Status,
          'updated_time' := UpdatedTime
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'audience_ids' => AudienceIds,
       'created_time' => CreatedTime,
       'id' => Id,
       'name' => Name,
       'status' => Status,
       'updated_time' => UpdatedTime
     }.
