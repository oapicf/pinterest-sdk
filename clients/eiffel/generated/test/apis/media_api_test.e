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
            -- Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &lt;tt&gt;curl&lt;/tt&gt;, for example) to &lt;tt&gt;upload_url&lt;/tt&gt; using the &lt;tt&gt;Content-Type&lt;/tt&gt; header value. Send the media file&#39;s contents as the request&#39;s &lt;tt&gt;file&lt;/tt&gt; parameter and also include all of the parameters from &lt;tt&gt;upload_parameters&lt;/tt&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/content/content-creation/#Creating%20video%20Pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
        local
            l_response: MEDIA_UPLOAD
            l_media_upload_request: MEDIA_UPLOAD_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_media_upload_request

            -- l_response := api.media_create(l_media_upload_request)
            assert ("not_implemented", False)
        end

    test_media_get
            -- Get media upload details
            --
            -- Get details for a registered media upload, including its current status.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/content/content-creation/#Creating%20video%20Pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
        local
            l_response: MEDIA_UPLOAD_DETAILS
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
            -- List media uploads filtered by given parameters.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/content/content-creation/#Creating%20video%20Pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
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
