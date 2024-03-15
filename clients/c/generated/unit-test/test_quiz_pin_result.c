#ifndef quiz_pin_result_TEST
#define quiz_pin_result_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define quiz_pin_result_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/quiz_pin_result.h"
quiz_pin_result_t* instantiate_quiz_pin_result(int include_optional);



quiz_pin_result_t* instantiate_quiz_pin_result(int include_optional) {
  quiz_pin_result_t* quiz_pin_result = NULL;
  if (include_optional) {
    quiz_pin_result = quiz_pin_result_create(
      "0",
      "0",
      "0",
      "0",
      1.337
    );
  } else {
    quiz_pin_result = quiz_pin_result_create(
      "0",
      "0",
      "0",
      "0",
      1.337
    );
  }

  return quiz_pin_result;
}


#ifdef quiz_pin_result_MAIN

void test_quiz_pin_result(int include_optional) {
    quiz_pin_result_t* quiz_pin_result_1 = instantiate_quiz_pin_result(include_optional);

	cJSON* jsonquiz_pin_result_1 = quiz_pin_result_convertToJSON(quiz_pin_result_1);
	printf("quiz_pin_result :\n%s\n", cJSON_Print(jsonquiz_pin_result_1));
	quiz_pin_result_t* quiz_pin_result_2 = quiz_pin_result_parseFromJSON(jsonquiz_pin_result_1);
	cJSON* jsonquiz_pin_result_2 = quiz_pin_result_convertToJSON(quiz_pin_result_2);
	printf("repeating quiz_pin_result:\n%s\n", cJSON_Print(jsonquiz_pin_result_2));
}

int main() {
  test_quiz_pin_result(1);
  test_quiz_pin_result(0);

  printf("Hello world \n");
  return 0;
}

#endif // quiz_pin_result_MAIN
#endif // quiz_pin_result_TEST
