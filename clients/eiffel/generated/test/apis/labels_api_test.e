note
    description: "API tests for LABELS_API"
    date: "$Date$"
    revision: "$Revision$"


class LABELS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_labels_apply
            -- Apply label to entity
            --
            --   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
        local
            l_response: LABELED_ENTITIES
            l_ad_account_id: STRING_32
            l_label_id: STRING_32
            l_labeled_entities_create: LABELED_ENTITIES_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_label_id
            -- l_labeled_entities_create

            -- l_response := api.labels_apply(l_ad_account_id, l_label_id, l_labeled_entities_create)
            assert ("not_implemented", False)
        end

    test_labels_create
            -- Create labels
            --
            -- [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
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
            -- [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
        local
            l_response: LABELS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_campaign_ids: LIST [STRING_32]
            l_label_ids: LIST [STRING_32]
            l_entity_statuses: LIST [QUERY_LABEL_ENTITY_STATUSES_ITEMS]
            l_label_types: LIST [QUERY_LABEL_TYPES_ITEMS]
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.labels_list(l_ad_account_id, l_campaign_ids, l_label_ids, l_entity_statuses, l_label_types, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_labels_remove
            -- Remove label from entities
            --
            --   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
        local
            l_response: LABELED_ENTITIES
            l_ad_account_id: STRING_32
            l_label_id: STRING_32
            l_labeled_entities_create: LABELED_ENTITIES_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_label_id
            -- l_labeled_entities_create

            -- l_response := api.labels_remove(l_ad_account_id, l_label_id, l_labeled_entities_create)
            assert ("not_implemented", False)
        end

    test_labels_update
            -- Update labels
            --
            -- [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
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
