#ifndef quiz_pin_data_TEST
#define quiz_pin_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define quiz_pin_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/quiz_pin_data.h"
quiz_pin_data_t* instantiate_quiz_pin_data(int include_optional);

#include "test_quiz_pin_result.c"


quiz_pin_data_t* instantiate_quiz_pin_data(int include_optional) {
  quiz_pin_data_t* quiz_pin_data = NULL;
  if (include_optional) {
    quiz_pin_data = quiz_pin_data_create(
      list_createList(),
      list_createList(),
      pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_RANDOM,
      {"organic_pin_id":"pinId","android_deep_link":"https://www.pinterest.com/","ios_deep_link":"https://www.pinterest.com/","destination_url":"https://www.pinterest.com/"}
    );
  } else {
    quiz_pin_data = quiz_pin_data_create(
      list_createList(),
      list_createList(),
      pinterest_rest_api_quiz_pin_data_TIEBREAKERTYPE_RANDOM,
      {"organic_pin_id":"pinId","android_deep_link":"https://www.pinterest.com/","ios_deep_link":"https://www.pinterest.com/","destination_url":"https://www.pinterest.com/"}
    );
  }

  return quiz_pin_data;
}


#ifdef quiz_pin_data_MAIN

void test_quiz_pin_data(int include_optional) {
    quiz_pin_data_t* quiz_pin_data_1 = instantiate_quiz_pin_data(include_optional);

	cJSON* jsonquiz_pin_data_1 = quiz_pin_data_convertToJSON(quiz_pin_data_1);
	printf("quiz_pin_data :\n%s\n", cJSON_Print(jsonquiz_pin_data_1));
	quiz_pin_data_t* quiz_pin_data_2 = quiz_pin_data_parseFromJSON(jsonquiz_pin_data_1);
	cJSON* jsonquiz_pin_data_2 = quiz_pin_data_convertToJSON(quiz_pin_data_2);
	printf("repeating quiz_pin_data:\n%s\n", cJSON_Print(jsonquiz_pin_data_2));
}

int main() {
  test_quiz_pin_data(1);
  test_quiz_pin_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // quiz_pin_data_MAIN
#endif // quiz_pin_data_TEST
