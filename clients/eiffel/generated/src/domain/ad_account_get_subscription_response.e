note
 description:"[
		Pinterest REST API
 		Pinterest's REST API
  		The version of the OpenAPI document: 5.14.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class AD_ACCOUNT_GET_SUBSCRIPTION_RESPONSE




feature --Access

    lead_form_id: detachable STRING_32
      -- Lead form ID.
    webhook_url: detachable STRING_32
      -- Standard HTTPS webhook URL.
    id: detachable STRING_32
      -- Subscription ID.
    user_account_id: detachable STRING_32
      -- User account used to subscribe lead data.
    ad_account_id: detachable STRING_32
      -- The Ad Account ID that this lead form belongs to.
    api_version: detachable STRING_32
      -- API version.
    cryptographic_key: detachable STRING_32
      -- Base64 encoded key for client to decrypt lead data.
    cryptographic_algorithm: detachable STRING_32
      -- Lead data encryption algorithm.
    created_time: INTEGER_32
      -- Lead form creation time. Unix timestamp in milliseconds.

feature -- Change Element

    set_lead_form_id (a_name: like lead_form_id)
        -- Set 'lead_form_id' with 'a_name'.
      do
        lead_form_id := a_name
      ensure
        lead_form_id_set: lead_form_id = a_name
      end

    set_webhook_url (a_name: like webhook_url)
        -- Set 'webhook_url' with 'a_name'.
      do
        webhook_url := a_name
      ensure
        webhook_url_set: webhook_url = a_name
      end

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_user_account_id (a_name: like user_account_id)
        -- Set 'user_account_id' with 'a_name'.
      do
        user_account_id := a_name
      ensure
        user_account_id_set: user_account_id = a_name
      end

    set_ad_account_id (a_name: like ad_account_id)
        -- Set 'ad_account_id' with 'a_name'.
      do
        ad_account_id := a_name
      ensure
        ad_account_id_set: ad_account_id = a_name
      end

    set_api_version (a_name: like api_version)
        -- Set 'api_version' with 'a_name'.
      do
        api_version := a_name
      ensure
        api_version_set: api_version = a_name
      end

    set_cryptographic_key (a_name: like cryptographic_key)
        -- Set 'cryptographic_key' with 'a_name'.
      do
        cryptographic_key := a_name
      ensure
        cryptographic_key_set: cryptographic_key = a_name
      end

    set_cryptographic_algorithm (a_name: like cryptographic_algorithm)
        -- Set 'cryptographic_algorithm' with 'a_name'.
      do
        cryptographic_algorithm := a_name
      ensure
        cryptographic_algorithm_set: cryptographic_algorithm = a_name
      end

    set_created_time (a_name: like created_time)
        -- Set 'created_time' with 'a_name'.
      do
        created_time := a_name
      ensure
        created_time_set: created_time = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass AD_ACCOUNT_GET_SUBSCRIPTION_RESPONSE%N")
        if attached lead_form_id as l_lead_form_id then
          Result.append ("%Nlead_form_id:")
          Result.append (l_lead_form_id.out)
          Result.append ("%N")
        end
        if attached webhook_url as l_webhook_url then
          Result.append ("%Nwebhook_url:")
          Result.append (l_webhook_url.out)
          Result.append ("%N")
        end
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached user_account_id as l_user_account_id then
          Result.append ("%Nuser_account_id:")
          Result.append (l_user_account_id.out)
          Result.append ("%N")
        end
        if attached ad_account_id as l_ad_account_id then
          Result.append ("%Nad_account_id:")
          Result.append (l_ad_account_id.out)
          Result.append ("%N")
        end
        if attached api_version as l_api_version then
          Result.append ("%Napi_version:")
          Result.append (l_api_version.out)
          Result.append ("%N")
        end
        if attached cryptographic_key as l_cryptographic_key then
          Result.append ("%Ncryptographic_key:")
          Result.append (l_cryptographic_key.out)
          Result.append ("%N")
        end
        if attached cryptographic_algorithm as l_cryptographic_algorithm then
          Result.append ("%Ncryptographic_algorithm:")
          Result.append (l_cryptographic_algorithm.out)
          Result.append ("%N")
        end
        if attached created_time as l_created_time then
          Result.append ("%Ncreated_time:")
          Result.append (l_created_time.out)
          Result.append ("%N")
        end
      end
end

