#ifndef keywords_get_200_response_TEST
#define keywords_get_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define keywords_get_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/keywords_get_200_response.h"
keywords_get_200_response_t* instantiate_keywords_get_200_response(int include_optional);



keywords_get_200_response_t* instantiate_keywords_get_200_response(int include_optional) {
  keywords_get_200_response_t* keywords_get_200_response = NULL;
  if (include_optional) {
    keywords_get_200_response = keywords_get_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    keywords_get_200_response = keywords_get_200_response_create(
      list_createList(),
      "0"
    );
  }

  return keywords_get_200_response;
}


#ifdef keywords_get_200_response_MAIN

void test_keywords_get_200_response(int include_optional) {
    keywords_get_200_response_t* keywords_get_200_response_1 = instantiate_keywords_get_200_response(include_optional);

	cJSON* jsonkeywords_get_200_response_1 = keywords_get_200_response_convertToJSON(keywords_get_200_response_1);
	printf("keywords_get_200_response :\n%s\n", cJSON_Print(jsonkeywords_get_200_response_1));
	keywords_get_200_response_t* keywords_get_200_response_2 = keywords_get_200_response_parseFromJSON(jsonkeywords_get_200_response_1);
	cJSON* jsonkeywords_get_200_response_2 = keywords_get_200_response_convertToJSON(keywords_get_200_response_2);
	printf("repeating keywords_get_200_response:\n%s\n", cJSON_Print(jsonkeywords_get_200_response_2));
}

int main() {
  test_keywords_get_200_response(1);
  test_keywords_get_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // keywords_get_200_response_MAIN
#endif // keywords_get_200_response_TEST
