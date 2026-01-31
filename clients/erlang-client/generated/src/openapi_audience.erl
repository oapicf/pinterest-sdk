-module(openapi_audience).

-export([encode/1]).

-export_type([openapi_audience/0]).

-type openapi_audience() ::
    #{ 'ad_account_id' => binary(),
       'audience_type' => binary(),
       'created_by_company_name' => binary(),
       'created_timestamp' => integer(),
       'description' => binary(),
       'id' => binary(),
       'name' => binary(),
       'rule' => openapi_audience_rule:openapi_audience_rule(),
       'size' => integer(),
       'status' => binary(),
       'type' => binary(),
       'updated_timestamp' => integer()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'audience_type' := AudienceType,
          'created_by_company_name' := CreatedByCompanyName,
          'created_timestamp' := CreatedTimestamp,
          'description' := Description,
          'id' := Id,
          'name' := Name,
          'rule' := Rule,
          'size' := Size,
          'status' := Status,
          'type' := Type,
          'updated_timestamp' := UpdatedTimestamp
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'audience_type' => AudienceType,
       'created_by_company_name' => CreatedByCompanyName,
       'created_timestamp' => CreatedTimestamp,
       'description' => Description,
       'id' => Id,
       'name' => Name,
       'rule' => Rule,
       'size' => Size,
       'status' => Status,
       'type' => Type,
       'updated_timestamp' => UpdatedTimestamp
     }.
