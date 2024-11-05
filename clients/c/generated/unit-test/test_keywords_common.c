#ifndef keywords_common_TEST
#define keywords_common_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define keywords_common_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/keywords_common.h"
keywords_common_t* instantiate_keywords_common(int include_optional);



keywords_common_t* instantiate_keywords_common(int include_optional) {
  keywords_common_t* keywords_common = NULL;
  if (include_optional) {
    keywords_common = keywords_common_create(
      56,
      pinterest_rest_api_keywords_common__"BROAD",
      "0"
    );
  } else {
    keywords_common = keywords_common_create(
      56,
      pinterest_rest_api_keywords_common__"BROAD",
      "0"
    );
  }

  return keywords_common;
}


#ifdef keywords_common_MAIN

void test_keywords_common(int include_optional) {
    keywords_common_t* keywords_common_1 = instantiate_keywords_common(include_optional);

	cJSON* jsonkeywords_common_1 = keywords_common_convertToJSON(keywords_common_1);
	printf("keywords_common :\n%s\n", cJSON_Print(jsonkeywords_common_1));
	keywords_common_t* keywords_common_2 = keywords_common_parseFromJSON(jsonkeywords_common_1);
	cJSON* jsonkeywords_common_2 = keywords_common_convertToJSON(keywords_common_2);
	printf("repeating keywords_common:\n%s\n", cJSON_Print(jsonkeywords_common_2));
}

int main() {
  test_keywords_common(1);
  test_keywords_common(0);

  printf("Hello world \n");
  return 0;
}

#endif // keywords_common_MAIN
#endif // keywords_common_TEST
