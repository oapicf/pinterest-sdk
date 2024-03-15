#ifndef keywords_request_TEST
#define keywords_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define keywords_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/keywords_request.h"
keywords_request_t* instantiate_keywords_request(int include_optional);



keywords_request_t* instantiate_keywords_request(int include_optional) {
  keywords_request_t* keywords_request = NULL;
  if (include_optional) {
    keywords_request = keywords_request_create(
      list_createList(),
      "383791336903426391"
    );
  } else {
    keywords_request = keywords_request_create(
      list_createList(),
      "383791336903426391"
    );
  }

  return keywords_request;
}


#ifdef keywords_request_MAIN

void test_keywords_request(int include_optional) {
    keywords_request_t* keywords_request_1 = instantiate_keywords_request(include_optional);

	cJSON* jsonkeywords_request_1 = keywords_request_convertToJSON(keywords_request_1);
	printf("keywords_request :\n%s\n", cJSON_Print(jsonkeywords_request_1));
	keywords_request_t* keywords_request_2 = keywords_request_parseFromJSON(jsonkeywords_request_1);
	cJSON* jsonkeywords_request_2 = keywords_request_convertToJSON(keywords_request_2);
	printf("repeating keywords_request:\n%s\n", cJSON_Print(jsonkeywords_request_2));
}

int main() {
  test_keywords_request(1);
  test_keywords_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // keywords_request_MAIN
#endif // keywords_request_TEST
