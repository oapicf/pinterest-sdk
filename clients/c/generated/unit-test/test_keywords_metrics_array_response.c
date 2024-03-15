#ifndef keywords_metrics_array_response_TEST
#define keywords_metrics_array_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define keywords_metrics_array_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/keywords_metrics_array_response.h"
keywords_metrics_array_response_t* instantiate_keywords_metrics_array_response(int include_optional);



keywords_metrics_array_response_t* instantiate_keywords_metrics_array_response(int include_optional) {
  keywords_metrics_array_response_t* keywords_metrics_array_response = NULL;
  if (include_optional) {
    keywords_metrics_array_response = keywords_metrics_array_response_create(
      list_createList()
    );
  } else {
    keywords_metrics_array_response = keywords_metrics_array_response_create(
      list_createList()
    );
  }

  return keywords_metrics_array_response;
}


#ifdef keywords_metrics_array_response_MAIN

void test_keywords_metrics_array_response(int include_optional) {
    keywords_metrics_array_response_t* keywords_metrics_array_response_1 = instantiate_keywords_metrics_array_response(include_optional);

	cJSON* jsonkeywords_metrics_array_response_1 = keywords_metrics_array_response_convertToJSON(keywords_metrics_array_response_1);
	printf("keywords_metrics_array_response :\n%s\n", cJSON_Print(jsonkeywords_metrics_array_response_1));
	keywords_metrics_array_response_t* keywords_metrics_array_response_2 = keywords_metrics_array_response_parseFromJSON(jsonkeywords_metrics_array_response_1);
	cJSON* jsonkeywords_metrics_array_response_2 = keywords_metrics_array_response_convertToJSON(keywords_metrics_array_response_2);
	printf("repeating keywords_metrics_array_response:\n%s\n", cJSON_Print(jsonkeywords_metrics_array_response_2));
}

int main() {
  test_keywords_metrics_array_response(1);
  test_keywords_metrics_array_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // keywords_metrics_array_response_MAIN
#endif // keywords_metrics_array_response_TEST
