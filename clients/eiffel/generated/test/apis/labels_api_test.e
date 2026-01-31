note
    description: "API tests for LABELS_API"
    date: "$Date$"
    revision: "$Revision$"


class LABELS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_labels_create
            -- Create labels
            --
            -- &lt;p&gt; &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  &lt;/p&gt;
        local
            l_response: LABELS_RESPONSE
            l_ad_account_id: STRING_32
            l_label_create_request: LABEL_CREATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_label_create_request

            -- l_response := api.labels_create(l_ad_account_id, l_label_create_request)
            assert ("not_implemented", False)
        end

    test_labels_list
            -- List labels
            --
            -- &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   See a list of labels for assets that your account owns, and filter the list by different criteria. &lt;/p&gt;
        local
            l_response: LABELS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_campaign_ids: LIST [STRING_32]
            l_label_ids: LIST [STRING_32]
            l_entity_statuses: LIST [STRING_32]
            l_label_types: LIST [STRING_32]
            l_page_size: INTEGER_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.labels_list(l_ad_account_id, l_campaign_ids, l_label_ids, l_entity_statuses, l_label_types, l_page_size, l_bookmark)
            assert ("not_implemented", False)
        end

    test_labels_update
            -- Update labels
            --
            -- &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Change the properties of one or more labels. &lt;/p&gt;
        local
            l_response: LABELS_RESPONSE
            l_ad_account_id: STRING_32
            l_label_update_request: LABEL_UPDATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_label_update_request

            -- l_response := api.labels_update(l_ad_account_id, l_label_update_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: LABELS_API
            -- Create an object instance of `LABELS_API'.
        once
            create { LABELS_API } Result
        end

end
