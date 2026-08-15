
#include "RelatedTerms_related_terms_list_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_RelatedTerms_related_terms_list_inner_term_is_assigned_from_json()
{


    bourne::json input =
    {
        "term", "hello"
    };

    RelatedTerms_related_terms_list_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTerm().c_str());






}




void test_RelatedTerms_related_terms_list_inner_term_is_converted_to_json()
{

    bourne::json input =
    {
        "term", "hello"
    };

    RelatedTerms_related_terms_list_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["term"] == output["term"]);



}


