#ifndef keyword_TEST
#define keyword_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define keyword_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/keyword.h"
keyword_t* instantiate_keyword(int include_optional);



keyword_t* instantiate_keyword(int include_optional) {
  keyword_t* keyword = NULL;
  if (include_optional) {
    keyword = keyword_create(
      false,
      "383791336903426391",
      "383791336903426391",
      "campaign",
      "keyword",
      200000,
      pinterest_rest_api_keyword__"BROAD",
      "0"
    );
  } else {
    keyword = keyword_create(
      false,
      "383791336903426391",
      "383791336903426391",
      "campaign",
      "keyword",
      200000,
      pinterest_rest_api_keyword__"BROAD",
      "0"
    );
  }

  return keyword;
}


#ifdef keyword_MAIN

void test_keyword(int include_optional) {
    keyword_t* keyword_1 = instantiate_keyword(include_optional);

	cJSON* jsonkeyword_1 = keyword_convertToJSON(keyword_1);
	printf("keyword :\n%s\n", cJSON_Print(jsonkeyword_1));
	keyword_t* keyword_2 = keyword_parseFromJSON(jsonkeyword_1);
	cJSON* jsonkeyword_2 = keyword_convertToJSON(keyword_2);
	printf("repeating keyword:\n%s\n", cJSON_Print(jsonkeyword_2));
}

int main() {
  test_keyword(1);
  test_keyword(0);

  printf("Hello world \n");
  return 0;
}

#endif // keyword_MAIN
#endif // keyword_TEST
