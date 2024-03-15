#ifndef quiz_pin_question_TEST
#define quiz_pin_question_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define quiz_pin_question_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/quiz_pin_question.h"
quiz_pin_question_t* instantiate_quiz_pin_question(int include_optional);



quiz_pin_question_t* instantiate_quiz_pin_question(int include_optional) {
  quiz_pin_question_t* quiz_pin_question = NULL;
  if (include_optional) {
    quiz_pin_question = quiz_pin_question_create(
      1.337,
      "0",
      list_createList()
    );
  } else {
    quiz_pin_question = quiz_pin_question_create(
      1.337,
      "0",
      list_createList()
    );
  }

  return quiz_pin_question;
}


#ifdef quiz_pin_question_MAIN

void test_quiz_pin_question(int include_optional) {
    quiz_pin_question_t* quiz_pin_question_1 = instantiate_quiz_pin_question(include_optional);

	cJSON* jsonquiz_pin_question_1 = quiz_pin_question_convertToJSON(quiz_pin_question_1);
	printf("quiz_pin_question :\n%s\n", cJSON_Print(jsonquiz_pin_question_1));
	quiz_pin_question_t* quiz_pin_question_2 = quiz_pin_question_parseFromJSON(jsonquiz_pin_question_1);
	cJSON* jsonquiz_pin_question_2 = quiz_pin_question_convertToJSON(quiz_pin_question_2);
	printf("repeating quiz_pin_question:\n%s\n", cJSON_Print(jsonquiz_pin_question_2));
}

int main() {
  test_quiz_pin_question(1);
  test_quiz_pin_question(0);

  printf("Hello world \n");
  return 0;
}

#endif // quiz_pin_question_MAIN
#endif // quiz_pin_question_TEST
