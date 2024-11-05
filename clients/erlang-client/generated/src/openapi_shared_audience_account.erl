-module(openapi_shared_audience_account).

-export([encode/1]).

-export_type([openapi_shared_audience_account/0]).

-type openapi_shared_audience_account() ::
    #{ 'account_id' := binary(),
       'account_name' := binary(),
       'account_type' := binary(),
       'shared_on_timestamp' := integer()
     }.

encode(#{ 'account_id' := AccountId,
          'account_name' := AccountName,
          'account_type' := AccountType,
          'shared_on_timestamp' := SharedOnTimestamp
        }) ->
    #{ 'account_id' => AccountId,
       'account_name' => AccountName,
       'account_type' => AccountType,
       'shared_on_timestamp' => SharedOnTimestamp
     }.
