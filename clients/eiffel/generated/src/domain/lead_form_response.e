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
class LEAD_FORM_RESPONSE




feature --Access

    name: detachable STRING_32
      -- Internal name of the lead form.
    privacy_policy_link: detachable STRING_32
      -- A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
    has_accepted_terms: BOOLEAN
      -- Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
    completion_message: detachable STRING_32
      -- A message for people who complete the form to let them know what happens next.
    status: detachable LEAD_FORM_STATUS
      
    disclosure_language: detachable STRING_32
      -- Additional disclosure language to be included in the lead form.
    questions: detachable LIST [LEAD_FORM_QUESTION]
      -- List of questions to be displayed on the lead form.
    policy_links: detachable LIST [LEAD_FORM_COMMON_POLICY_LINKS_INNER]
      -- List of additional policy links to be displayed on the lead form.
    id: detachable STRING_32
      -- The ID of this lead form
    ad_account_id: detachable STRING_32
      -- The Ad Account ID that this lead form belongs to.
    created_time: INTEGER_32
      -- Lead form creation time. Unix timestamp in seconds.
    updated_time: INTEGER_32
      -- Last update time. Unix timestamp in seconds.

feature -- Change Element

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end

    set_privacy_policy_link (a_name: like privacy_policy_link)
        -- Set 'privacy_policy_link' with 'a_name'.
      do
        privacy_policy_link := a_name
      ensure
        privacy_policy_link_set: privacy_policy_link = a_name
      end

    set_has_accepted_terms (a_name: like has_accepted_terms)
        -- Set 'has_accepted_terms' with 'a_name'.
      do
        has_accepted_terms := a_name
      ensure
        has_accepted_terms_set: has_accepted_terms = a_name
      end

    set_completion_message (a_name: like completion_message)
        -- Set 'completion_message' with 'a_name'.
      do
        completion_message := a_name
      ensure
        completion_message_set: completion_message = a_name
      end

    set_status (a_name: like status)
        -- Set 'status' with 'a_name'.
      do
        status := a_name
      ensure
        status_set: status = a_name
      end

    set_disclosure_language (a_name: like disclosure_language)
        -- Set 'disclosure_language' with 'a_name'.
      do
        disclosure_language := a_name
      ensure
        disclosure_language_set: disclosure_language = a_name
      end

    set_questions (a_name: like questions)
        -- Set 'questions' with 'a_name'.
      do
        questions := a_name
      ensure
        questions_set: questions = a_name
      end

    set_policy_links (a_name: like policy_links)
        -- Set 'policy_links' with 'a_name'.
      do
        policy_links := a_name
      ensure
        policy_links_set: policy_links = a_name
      end

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_ad_account_id (a_name: like ad_account_id)
        -- Set 'ad_account_id' with 'a_name'.
      do
        ad_account_id := a_name
      ensure
        ad_account_id_set: ad_account_id = a_name
      end

    set_created_time (a_name: like created_time)
        -- Set 'created_time' with 'a_name'.
      do
        created_time := a_name
      ensure
        created_time_set: created_time = a_name
      end

    set_updated_time (a_name: like updated_time)
        -- Set 'updated_time' with 'a_name'.
      do
        updated_time := a_name
      ensure
        updated_time_set: updated_time = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass LEAD_FORM_RESPONSE%N")
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
        if attached privacy_policy_link as l_privacy_policy_link then
          Result.append ("%Nprivacy_policy_link:")
          Result.append (l_privacy_policy_link.out)
          Result.append ("%N")
        end
        if attached has_accepted_terms as l_has_accepted_terms then
          Result.append ("%Nhas_accepted_terms:")
          Result.append (l_has_accepted_terms.out)
          Result.append ("%N")
        end
        if attached completion_message as l_completion_message then
          Result.append ("%Ncompletion_message:")
          Result.append (l_completion_message.out)
          Result.append ("%N")
        end
        if attached status as l_status then
          Result.append ("%Nstatus:")
          Result.append (l_status.out)
          Result.append ("%N")
        end
        if attached disclosure_language as l_disclosure_language then
          Result.append ("%Ndisclosure_language:")
          Result.append (l_disclosure_language.out)
          Result.append ("%N")
        end
        if attached questions as l_questions then
          across l_questions as ic loop
            Result.append ("%N questions:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached policy_links as l_policy_links then
          across l_policy_links as ic loop
            Result.append ("%N policy_links:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached ad_account_id as l_ad_account_id then
          Result.append ("%Nad_account_id:")
          Result.append (l_ad_account_id.out)
          Result.append ("%N")
        end
        if attached created_time as l_created_time then
          Result.append ("%Ncreated_time:")
          Result.append (l_created_time.out)
          Result.append ("%N")
        end
        if attached updated_time as l_updated_time then
          Result.append ("%Nupdated_time:")
          Result.append (l_updated_time.out)
          Result.append ("%N")
        end
      end
end

