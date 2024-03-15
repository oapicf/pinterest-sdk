#ifndef quiz_pin_option_TEST
#define quiz_pin_option_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define quiz_pin_option_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/quiz_pin_option.h"
quiz_pin_option_t* instantiate_quiz_pin_option(int include_optional);



quiz_pin_option_t* instantiate_quiz_pin_option(int include_optional) {
  quiz_pin_option_t* quiz_pin_option = NULL;
  if (include_optional) {
    quiz_pin_option = quiz_pin_option_create(
      1.337,
      "0"
    );
  } else {
    quiz_pin_option = quiz_pin_option_create(
      1.337,
      "0"
    );
  }

  return quiz_pin_option;
}


#ifdef quiz_pin_option_MAIN

void test_quiz_pin_option(int include_optional) {
    quiz_pin_option_t* quiz_pin_option_1 = instantiate_quiz_pin_option(include_optional);

	cJSON* jsonquiz_pin_option_1 = quiz_pin_option_convertToJSON(quiz_pin_option_1);
	printf("quiz_pin_option :\n%s\n", cJSON_Print(jsonquiz_pin_option_1));
	quiz_pin_option_t* quiz_pin_option_2 = quiz_pin_option_parseFromJSON(jsonquiz_pin_option_1);
	cJSON* jsonquiz_pin_option_2 = quiz_pin_option_convertToJSON(quiz_pin_option_2);
	printf("repeating quiz_pin_option:\n%s\n", cJSON_Print(jsonquiz_pin_option_2));
}

int main() {
  test_quiz_pin_option(1);
  test_quiz_pin_option(0);

  printf("Hello world \n");
  return 0;
}

#endif // quiz_pin_option_MAIN
#endif // quiz_pin_option_TEST
