-module(openapi_audience).

-export([encode/1]).

-export_type([openapi_audience/0]).

-type openapi_audience() ::
    #{ 'ad_account_id' => binary(),
       'id' => binary(),
       'name' => binary(),
       'audience_type' => binary(),
       'description' => binary(),
       'rule' => openapi_audience_rule:openapi_audience_rule(),
       'size' => integer(),
       'status' => binary(),
       'type' => binary(),
       'created_timestamp' => integer(),
       'updated_timestamp' => integer()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'id' := Id,
          'name' := Name,
          'audience_type' := AudienceType,
          'description' := Description,
          'rule' := Rule,
          'size' := Size,
          'status' := Status,
          'type' := Type,
          'created_timestamp' := CreatedTimestamp,
          'updated_timestamp' := UpdatedTimestamp
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'id' => Id,
       'name' => Name,
       'audience_type' => AudienceType,
       'description' => Description,
       'rule' => Rule,
       'size' => Size,
       'status' => Status,
       'type' => Type,
       'created_timestamp' => CreatedTimestamp,
       'updated_timestamp' => UpdatedTimestamp
     }.
