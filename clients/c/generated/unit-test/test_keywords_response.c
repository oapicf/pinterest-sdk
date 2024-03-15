#ifndef keywords_response_TEST
#define keywords_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define keywords_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/keywords_response.h"
keywords_response_t* instantiate_keywords_response(int include_optional);



keywords_response_t* instantiate_keywords_response(int include_optional) {
  keywords_response_t* keywords_response = NULL;
  if (include_optional) {
    keywords_response = keywords_response_create(
      list_createList(),
      list_createList()
    );
  } else {
    keywords_response = keywords_response_create(
      list_createList(),
      list_createList()
    );
  }

  return keywords_response;
}


#ifdef keywords_response_MAIN

void test_keywords_response(int include_optional) {
    keywords_response_t* keywords_response_1 = instantiate_keywords_response(include_optional);

	cJSON* jsonkeywords_response_1 = keywords_response_convertToJSON(keywords_response_1);
	printf("keywords_response :\n%s\n", cJSON_Print(jsonkeywords_response_1));
	keywords_response_t* keywords_response_2 = keywords_response_parseFromJSON(jsonkeywords_response_1);
	cJSON* jsonkeywords_response_2 = keywords_response_convertToJSON(keywords_response_2);
	printf("repeating keywords_response:\n%s\n", cJSON_Print(jsonkeywords_response_2));
}

int main() {
  test_keywords_response(1);
  test_keywords_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // keywords_response_MAIN
#endif // keywords_response_TEST
