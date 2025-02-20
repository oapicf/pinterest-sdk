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
class AUDIENCE




feature --Access

    ad_account_id: detachable STRING_32
      -- Ad account ID.
    id: detachable STRING_32
      -- Audience ID.
    name: detachable STRING_32
      -- Audience name.
    audience_type: detachable STRING_32
      -- <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
    description: detachable STRING_32
      -- Audience description.
    rule: detachable AUDIENCE_RULE
      
    size: INTEGER_32
      -- Audience size.
    status: detachable STRING_32
      -- Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
    type: detachable STRING_32
      -- Always \"audience\".
    created_timestamp: INTEGER_32
      -- Creation time. Unix timestamp in seconds.
    updated_timestamp: INTEGER_32
      -- Last update time. Unix timestamp in seconds.

feature -- Change Element

    set_ad_account_id (a_name: like ad_account_id)
        -- Set 'ad_account_id' with 'a_name'.
      do
        ad_account_id := a_name
      ensure
        ad_account_id_set: ad_account_id = a_name
      end

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end

    set_audience_type (a_name: like audience_type)
        -- Set 'audience_type' with 'a_name'.
      do
        audience_type := a_name
      ensure
        audience_type_set: audience_type = a_name
      end

    set_description (a_name: like description)
        -- Set 'description' with 'a_name'.
      do
        description := a_name
      ensure
        description_set: description = a_name
      end

    set_rule (a_name: like rule)
        -- Set 'rule' with 'a_name'.
      do
        rule := a_name
      ensure
        rule_set: rule = a_name
      end

    set_size (a_name: like size)
        -- Set 'size' with 'a_name'.
      do
        size := a_name
      ensure
        size_set: size = a_name
      end

    set_status (a_name: like status)
        -- Set 'status' with 'a_name'.
      do
        status := a_name
      ensure
        status_set: status = a_name
      end

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name
      end

    set_created_timestamp (a_name: like created_timestamp)
        -- Set 'created_timestamp' with 'a_name'.
      do
        created_timestamp := a_name
      ensure
        created_timestamp_set: created_timestamp = a_name
      end

    set_updated_timestamp (a_name: like updated_timestamp)
        -- Set 'updated_timestamp' with 'a_name'.
      do
        updated_timestamp := a_name
      ensure
        updated_timestamp_set: updated_timestamp = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass AUDIENCE%N")
        if attached ad_account_id as l_ad_account_id then
          Result.append ("%Nad_account_id:")
          Result.append (l_ad_account_id.out)
          Result.append ("%N")
        end
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
        if attached audience_type as l_audience_type then
          Result.append ("%Naudience_type:")
          Result.append (l_audience_type.out)
          Result.append ("%N")
        end
        if attached description as l_description then
          Result.append ("%Ndescription:")
          Result.append (l_description.out)
          Result.append ("%N")
        end
        if attached rule as l_rule then
          Result.append ("%Nrule:")
          Result.append (l_rule.out)
          Result.append ("%N")
        end
        if attached size as l_size then
          Result.append ("%Nsize:")
          Result.append (l_size.out)
          Result.append ("%N")
        end
        if attached status as l_status then
          Result.append ("%Nstatus:")
          Result.append (l_status.out)
          Result.append ("%N")
        end
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")
        end
        if attached created_timestamp as l_created_timestamp then
          Result.append ("%Ncreated_timestamp:")
          Result.append (l_created_timestamp.out)
          Result.append ("%N")
        end
        if attached updated_timestamp as l_updated_timestamp then
          Result.append ("%Nupdated_timestamp:")
          Result.append (l_updated_timestamp.out)
          Result.append ("%N")
        end
      end
end

