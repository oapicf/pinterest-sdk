-module(openapi_customer_list_record_row).

-export([encode/1]).

-export_type([openapi_customer_list_record_row/0]).

-type openapi_customer_list_record_row() ::
    #{ 'email' => binary(),
       'external_id' => binary(),
       'hashed_phone_number' => binary(),
       'hashed_pinner_id' => binary(),
       'ip_address' => binary(),
       'liveramp_envelope' => binary(),
       'maid' => binary(),
       'user_agent' => binary()
     }.

encode(#{ 'email' := Email,
          'external_id' := ExternalId,
          'hashed_phone_number' := HashedPhoneNumber,
          'hashed_pinner_id' := HashedPinnerId,
          'ip_address' := IpAddress,
          'liveramp_envelope' := LiverampEnvelope,
          'maid' := Maid,
          'user_agent' := UserAgent
        }) ->
    #{ 'email' => Email,
       'external_id' => ExternalId,
       'hashed_phone_number' => HashedPhoneNumber,
       'hashed_pinner_id' => HashedPinnerId,
       'ip_address' => IpAddress,
       'liveramp_envelope' => LiverampEnvelope,
       'maid' => Maid,
       'user_agent' => UserAgent
     }.
