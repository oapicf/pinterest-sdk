#ifndef keyword_error_TEST
#define keyword_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define keyword_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/keyword_error.h"
keyword_error_t* instantiate_keyword_error(int include_optional);

#include "test_keyword.c"


keyword_error_t* instantiate_keyword_error(int include_optional) {
  keyword_error_t* keyword_error = NULL;
  if (include_optional) {
    keyword_error = keyword_error_create(
       // false, not to have infinite recursion
      instantiate_keyword(0),
      list_createList()
    );
  } else {
    keyword_error = keyword_error_create(
      NULL,
      list_createList()
    );
  }

  return keyword_error;
}


#ifdef keyword_error_MAIN

void test_keyword_error(int include_optional) {
    keyword_error_t* keyword_error_1 = instantiate_keyword_error(include_optional);

	cJSON* jsonkeyword_error_1 = keyword_error_convertToJSON(keyword_error_1);
	printf("keyword_error :\n%s\n", cJSON_Print(jsonkeyword_error_1));
	keyword_error_t* keyword_error_2 = keyword_error_parseFromJSON(jsonkeyword_error_1);
	cJSON* jsonkeyword_error_2 = keyword_error_convertToJSON(keyword_error_2);
	printf("repeating keyword_error:\n%s\n", cJSON_Print(jsonkeyword_error_2));
}

int main() {
  test_keyword_error(1);
  test_keyword_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // keyword_error_MAIN
#endif // keyword_error_TEST
