note
    description: "API tests for MEDIA_API"
    date: "$Date$"
    revision: "$Revision$"


class MEDIA_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_media_create
            -- Register media upload
            --
            -- Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &#x60;curl&#x60;, for example) to &#x60;upload_url&#x60; using the &#x60;Content-Type&#x60; header value. Send the media file&#39;s contents as the request&#39;s &#x60;file&#x60; parameter and also include all of the parameters from &#x60;upload_parameters&#x60;.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
        local
            l_response: MEDIA_UPLOAD
            l_media_upload_create: MEDIA_UPLOAD_CREATE
        do
            -- TODO: Initialize required params.
            -- l_media_upload_create

            -- l_response := api.media_create(l_media_upload_create)
            assert ("not_implemented", False)
        end

    test_media_get
            -- Get media upload details
            --
            -- Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
        local
            l_response: MEDIA
            l_media_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_media_id

            -- l_response := api.media_get(l_media_id)
            assert ("not_implemented", False)
        end

    test_media_list
            -- List media uploads
            --
            -- List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
        local
            l_response: MEDIA_LIST_200_RESPONSE
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.media_list(l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: MEDIA_API
            -- Create an object instance of `MEDIA_API'.
        once
            create { MEDIA_API } Result
        end

end
