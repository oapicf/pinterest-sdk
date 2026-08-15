
#include "QuizPinQuestion.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_QuizPinQuestion_question_id_is_assigned_from_json()
{








}


void test_QuizPinQuestion_question_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "question_text", "hello"
    };

    QuizPinQuestion obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getQuestionText().c_str());






}




void test_QuizPinQuestion_question_id_is_converted_to_json()
{




}


void test_QuizPinQuestion_question_text_is_converted_to_json()
{

    bourne::json input =
    {
        "question_text", "hello"
    };

    QuizPinQuestion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["question_text"] == output["question_text"]);



}


