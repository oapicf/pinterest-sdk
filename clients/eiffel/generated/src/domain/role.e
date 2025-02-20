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
class ROLE

feature -- Access

  value: detachable STRING_32
      -- enumerated value.
    note
            option: stable
    attribute
    end

feature -- Enum

 val_unknown: ROLE
    once
      create Result
      Result.set_value ("UNKNOWN")
    end

 val_owner: ROLE
    once
      create Result
      Result.set_value ("OWNER")
    end

 val_admin: ROLE
    once
      create Result
      Result.set_value ("ADMIN")
    end

 val_analyst: ROLE
    once
      create Result
      Result.set_value ("ANALYST")
    end

 val_sos_reader: ROLE
    once
      create Result
      Result.set_value ("SOS_READER")
    end

 val_finance_manager: ROLE
    once
      create Result
      Result.set_value ("FINANCE_MANAGER")
    end

 val_audience_manager: ROLE
    once
      create Result
      Result.set_value ("AUDIENCE_MANAGER")
    end

 val_campaign_manager: ROLE
    once
      create Result
      Result.set_value ("CAMPAIGN_MANAGER")
    end

 val_catalogs_manager: ROLE
    once
      create Result
      Result.set_value ("CATALOGS_MANAGER")
    end

 val_restricted_owner: ROLE
    once
      create Result
      Result.set_value ("RESTRICTED_OWNER")
    end

 val_profile_manager: ROLE
    once
      create Result
      Result.set_value ("PROFILE_MANAGER")
    end

 val_profile_publisher: ROLE
    once
      create Result
      Result.set_value ("PROFILE_PUBLISHER")
    end

 val_resource_pinner_list_owner: ROLE
    once
      create Result
      Result.set_value ("RESOURCE_PINNER_LIST_OWNER")
    end

 val_resource_pinner_list_reader: ROLE
    once
      create Result
      Result.set_value ("RESOURCE_PINNER_LIST_READER")
    end

 val_biz_pinner_list_sharer: ROLE
    once
      create Result
      Result.set_value ("BIZ_PINNER_LIST_SHARER")
    end

 val_resource_conversion_tags_reader: ROLE
    once
      create Result
      Result.set_value ("RESOURCE_CONVERSION_TAGS_READER")
    end


feature -- Element Change

  set_value (a_val: like value)
      -- Set `value' with `a_value'.
    do
      value := a_val
    ensure
      value_set: value = a_val
    end


end

