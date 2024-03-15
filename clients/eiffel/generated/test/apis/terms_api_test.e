note
    description: "API tests for TERMS_API"
    date: "$Date$"
    revision: "$Revision$"


class TERMS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_terms_related_list
            -- List related terms
            --
            -- Get a list of terms logically related to each input term. &lt;p/&gt; Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc.
        local
            l_response: RELATED_TERMS
            l_terms: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [STRING_32]} l_terms.make (2)

            -- l_response := api.terms_related_list(l_terms)
            assert ("not_implemented", False)
        end

    test_terms_suggested_list
            -- List suggested terms
            --
            -- Get popular search terms that begin with your input term. &lt;p/&gt; Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term.
        local
            l_response: LIST [STRING_32]
            l_term: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_term

            -- l_response := api.terms_suggested_list(l_term, l_limit)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: TERMS_API
            -- Create an object instance of `TERMS_API'.
        once
            create { TERMS_API } Result
        end

end
