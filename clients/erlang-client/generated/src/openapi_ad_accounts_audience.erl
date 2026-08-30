-module(openapi_ad_accounts_audience).

-export([encode/1]).

-export_type([openapi_ad_accounts_audience/0]).

-type openapi_ad_accounts_audience() ::
    #{ 'ad_account_id' => binary(),
       'audience_type' => openapi_audience_type:openapi_audience_type(),
       'created_by_company_name' => binary(),
       'created_timestamp' => integer(),
       'description' => binary(),
       'id' := binary(),
       'is_nca' => boolean(),
       'name' => binary(),
       'rule' => openapi_ad_accounts_audience_rule:openapi_ad_accounts_audience_rule(),
       'size' => integer(),
       'status' => openapi_audience_status:openapi_audience_status(),
       'type' => binary(),
       'updated_timestamp' => integer()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'audience_type' := AudienceType,
          'created_by_company_name' := CreatedByCompanyName,
          'created_timestamp' := CreatedTimestamp,
          'description' := Description,
          'id' := Id,
          'is_nca' := IsNca,
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
       'is_nca' => IsNca,
       'name' => Name,
       'rule' => Rule,
       'size' => Size,
       'status' => Status,
       'type' => Type,
       'updated_timestamp' => UpdatedTimestamp
     }.
