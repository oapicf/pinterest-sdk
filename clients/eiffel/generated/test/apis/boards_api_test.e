note
    description: "API tests for BOARDS_API"
    date: "$Date$"
    revision: "$Revision$"


class BOARDS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_board_sections_create
            -- Create board section
            --
            -- Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        local
            l_response: BOARD_SECTION
            l_board_id: STRING_32
            l_board_section: BOARD_SECTION
        do
            -- TODO: Initialize required params.
            -- l_board_id
            -- l_board_section

            -- l_response := api.board_sections_create(l_board_id, l_board_section)
            assert ("not_implemented", False)
        end

    test_board_sections_delete
            -- Delete board section
            --
            -- Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        local
            l_board_id: STRING_32
            l_section_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_board_id
            -- l_section_id

            -- api.board_sections_delete(l_board_id, l_section_id)
            assert ("not_implemented", False)
        end

    test_board_sections_list
            -- List board sections
            --
            -- Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        local
            l_response: PAGINATED
            l_board_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_board_id

            -- l_response := api.board_sections_list(l_board_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_board_sections_list_pins
            -- List Pins on board section
            --
            -- Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        local
            l_response: PAGINATED
            l_board_id: STRING_32
            l_section_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_board_id
            -- l_section_id

            -- l_response := api.board_sections_list_pins(l_board_id, l_section_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_board_sections_update
            -- Update board section
            --
            -- Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        local
            l_response: BOARD_SECTION
            l_board_id: STRING_32
            l_section_id: STRING_32
            l_board_section: BOARD_SECTION
        do
            -- TODO: Initialize required params.
            -- l_board_id
            -- l_section_id
            -- l_board_section

            -- l_response := api.board_sections_update(l_board_id, l_section_id, l_board_section)
            assert ("not_implemented", False)
        end

    test_boards_create
            -- Create board
            --
            -- Create a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        local
            l_response: BOARD
            l_board: BOARD
        do
            -- TODO: Initialize required params.
            -- l_board

            -- l_response := api.boards_create(l_board)
            assert ("not_implemented", False)
        end

    test_boards_delete
            -- Delete board
            --
            -- Delete a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        local
            l_board_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_board_id

            -- api.boards_delete(l_board_id)
            assert ("not_implemented", False)
        end

    test_boards_get
            -- Get board
            --
            -- Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        local
            l_response: BOARD
            l_board_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_board_id

            -- l_response := api.boards_get(l_board_id)
            assert ("not_implemented", False)
        end

    test_boards_list
            -- List boards
            --
            -- Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
        local
            l_response: PAGINATED
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_privacy: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.boards_list(l_bookmark, l_page_size, l_privacy)
            assert ("not_implemented", False)
        end

    test_boards_list_pins
            -- List Pins on board
            --
            -- Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
        local
            l_response: PAGINATED
            l_board_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_board_id

            -- l_response := api.boards_list_pins(l_board_id, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_boards_update
            -- Update board
            --
            -- Update a board owned by the \&quot;operating user_account\&quot;.
        local
            l_response: BOARD
            l_board_id: STRING_32
            l_board_update: BOARD_UPDATE
        do
            -- TODO: Initialize required params.
            -- l_board_id
            -- l_board_update

            -- l_response := api.boards_update(l_board_id, l_board_update)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: BOARDS_API
            -- Create an object instance of `BOARDS_API'.
        once
            create { BOARDS_API } Result
        end

end
