#ifndef keyword_metrics_TEST
#define keyword_metrics_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define keyword_metrics_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/keyword_metrics.h"
keyword_metrics_t* instantiate_keyword_metrics(int include_optional);



keyword_metrics_t* instantiate_keyword_metrics(int include_optional) {
  keyword_metrics_t* keyword_metrics = NULL;
  if (include_optional) {
    keyword_metrics = keyword_metrics_create(
      100000,
      "5M+"
    );
  } else {
    keyword_metrics = keyword_metrics_create(
      100000,
      "5M+"
    );
  }

  return keyword_metrics;
}


#ifdef keyword_metrics_MAIN

void test_keyword_metrics(int include_optional) {
    keyword_metrics_t* keyword_metrics_1 = instantiate_keyword_metrics(include_optional);

	cJSON* jsonkeyword_metrics_1 = keyword_metrics_convertToJSON(keyword_metrics_1);
	printf("keyword_metrics :\n%s\n", cJSON_Print(jsonkeyword_metrics_1));
	keyword_metrics_t* keyword_metrics_2 = keyword_metrics_parseFromJSON(jsonkeyword_metrics_1);
	cJSON* jsonkeyword_metrics_2 = keyword_metrics_convertToJSON(keyword_metrics_2);
	printf("repeating keyword_metrics:\n%s\n", cJSON_Print(jsonkeyword_metrics_2));
}

int main() {
  test_keyword_metrics(1);
  test_keyword_metrics(0);

  printf("Hello world \n");
  return 0;
}

#endif // keyword_metrics_MAIN
#endif // keyword_metrics_TEST
