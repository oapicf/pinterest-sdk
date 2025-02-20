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
class AUDIENCE_CREATE_CUSTOM_REQUEST




feature --Access

    ad_account_id: detachable STRING_32
      -- Ad account ID.
    name: detachable STRING_32
      -- Audience name.
    rule: detachable AUDIENCE_RULE
      
    sharing_type: detachable AUDIENCE_SHARING_TYPE
      
    data_party: detachable AUDIENCE_DATA_PARTY
      
    category: detachable STRING_32
      

feature -- Change Element

    set_ad_account_id (a_name: like ad_account_id)
        -- Set 'ad_account_id' with 'a_name'.
      do
        ad_account_id := a_name
      ensure
        ad_account_id_set: ad_account_id = a_name
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end

    set_rule (a_name: like rule)
        -- Set 'rule' with 'a_name'.
      do
        rule := a_name
      ensure
        rule_set: rule = a_name
      end

    set_sharing_type (a_name: like sharing_type)
        -- Set 'sharing_type' with 'a_name'.
      do
        sharing_type := a_name
      ensure
        sharing_type_set: sharing_type = a_name
      end

    set_data_party (a_name: like data_party)
        -- Set 'data_party' with 'a_name'.
      do
        data_party := a_name
      ensure
        data_party_set: data_party = a_name
      end

    set_category (a_name: like category)
        -- Set 'category' with 'a_name'.
      do
        category := a_name
      ensure
        category_set: category = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass AUDIENCE_CREATE_CUSTOM_REQUEST%N")
        if attached ad_account_id as l_ad_account_id then
          Result.append ("%Nad_account_id:")
          Result.append (l_ad_account_id.out)
          Result.append ("%N")
        end
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
        if attached rule as l_rule then
          Result.append ("%Nrule:")
          Result.append (l_rule.out)
          Result.append ("%N")
        end
        if attached sharing_type as l_sharing_type then
          Result.append ("%Nsharing_type:")
          Result.append (l_sharing_type.out)
          Result.append ("%N")
        end
        if attached data_party as l_data_party then
          Result.append ("%Ndata_party:")
          Result.append (l_data_party.out)
          Result.append ("%N")
        end
        if attached category as l_category then
          Result.append ("%Ncategory:")
          Result.append (l_category.out)
          Result.append ("%N")
        end
      end
end

