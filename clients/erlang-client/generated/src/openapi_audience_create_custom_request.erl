-module(openapi_audience_create_custom_request).

-export([encode/1]).

-export_type([openapi_audience_create_custom_request/0]).

-type openapi_audience_create_custom_request() ::
    #{ 'ad_account_id' => binary(),
       'name' := binary(),
       'rule' := openapi_audience_rule:openapi_audience_rule(),
       'sharing_type' := openapi_audience_sharing_type:openapi_audience_sharing_type(),
       'data_party' := openapi_audience_data_party:openapi_audience_data_party(),
       'category' => binary()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'name' := Name,
          'rule' := Rule,
          'sharing_type' := SharingType,
          'data_party' := DataParty,
          'category' := Category
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'name' => Name,
       'rule' => Rule,
       'sharing_type' => SharingType,
       'data_party' => DataParty,
       'category' => Category
     }.
