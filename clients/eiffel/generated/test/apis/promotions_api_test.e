note
    description: "API tests for PROMOTIONS_API"
    date: "$Date$"
    revision: "$Revision$"


class PROMOTIONS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_promotions_create
            -- Create promotions
            --
            -- Create multiple new promotions.
        local
            l_response: PROMOTIONS_RESPONSE
            l_ad_account_id: STRING_32
            l_promotion_create: LIST [PROMOTION_CREATE]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [PROMOTION_CREATE]} l_promotion_create.make (2)

            -- l_response := api.promotions_create(l_ad_account_id, l_promotion_create)
            assert ("not_implemented", False)
        end

    test_promotions_delete
            -- Delete promotion by id
            --
            -- Delete a promotion within Pinterest.
        local
            l_response: PROMOTION
            l_promotion_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_promotion_id
            -- l_ad_account_id

            -- l_response := api.promotions_delete(l_promotion_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_promotions_get
            -- Get promotion by id
            --
            -- Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
        local
            l_response: PROMOTION
            l_promotion_id: STRING_32
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_promotion_id
            -- l_ad_account_id

            -- l_response := api.promotions_get(l_promotion_id, l_ad_account_id)
            assert ("not_implemented", False)
        end

    test_promotions_list
            -- Get promotions
            --
            -- Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
        local
            l_response: PROMOTIONS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_order: PINTEREST_LIB_PAGINATION_ORDER
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.promotions_list(l_ad_account_id, l_bookmark, l_page_size, l_order)
            assert ("not_implemented", False)
        end

    test_promotions_update
            -- Update promotions
            --
            -- Update multiple promotions.
        local
            l_response: PROMOTIONS_RESPONSE
            l_ad_account_id: STRING_32
            l_promotion_batch_update: LIST [PROMOTION_BATCH_UPDATE]
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- create {ARRAYED_LIST [PROMOTION_BATCH_UPDATE]} l_promotion_batch_update.make (2)

            -- l_response := api.promotions_update(l_ad_account_id, l_promotion_batch_update)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PROMOTIONS_API
            -- Create an object instance of `PROMOTIONS_API'.
        once
            create { PROMOTIONS_API } Result
        end

end
