#ifndef keyword_metrics_response_TEST
#define keyword_metrics_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define keyword_metrics_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/keyword_metrics_response.h"
keyword_metrics_response_t* instantiate_keyword_metrics_response(int include_optional);

#include "test_keyword_metrics.c"


keyword_metrics_response_t* instantiate_keyword_metrics_response(int include_optional) {
  keyword_metrics_response_t* keyword_metrics_response = NULL;
  if (include_optional) {
    keyword_metrics_response = keyword_metrics_response_create(
      "animals",
       // false, not to have infinite recursion
      instantiate_keyword_metrics(0)
    );
  } else {
    keyword_metrics_response = keyword_metrics_response_create(
      "animals",
      NULL
    );
  }

  return keyword_metrics_response;
}


#ifdef keyword_metrics_response_MAIN

void test_keyword_metrics_response(int include_optional) {
    keyword_metrics_response_t* keyword_metrics_response_1 = instantiate_keyword_metrics_response(include_optional);

	cJSON* jsonkeyword_metrics_response_1 = keyword_metrics_response_convertToJSON(keyword_metrics_response_1);
	printf("keyword_metrics_response :\n%s\n", cJSON_Print(jsonkeyword_metrics_response_1));
	keyword_metrics_response_t* keyword_metrics_response_2 = keyword_metrics_response_parseFromJSON(jsonkeyword_metrics_response_1);
	cJSON* jsonkeyword_metrics_response_2 = keyword_metrics_response_convertToJSON(keyword_metrics_response_2);
	printf("repeating keyword_metrics_response:\n%s\n", cJSON_Print(jsonkeyword_metrics_response_2));
}

int main() {
  test_keyword_metrics_response(1);
  test_keyword_metrics_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // keyword_metrics_response_MAIN
#endif // keyword_metrics_response_TEST
