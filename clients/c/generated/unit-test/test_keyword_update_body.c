#ifndef keyword_update_body_TEST
#define keyword_update_body_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define keyword_update_body_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/keyword_update_body.h"
keyword_update_body_t* instantiate_keyword_update_body(int include_optional);



keyword_update_body_t* instantiate_keyword_update_body(int include_optional) {
  keyword_update_body_t* keyword_update_body = NULL;
  if (include_optional) {
    keyword_update_body = keyword_update_body_create(
      list_createList()
    );
  } else {
    keyword_update_body = keyword_update_body_create(
      list_createList()
    );
  }

  return keyword_update_body;
}


#ifdef keyword_update_body_MAIN

void test_keyword_update_body(int include_optional) {
    keyword_update_body_t* keyword_update_body_1 = instantiate_keyword_update_body(include_optional);

	cJSON* jsonkeyword_update_body_1 = keyword_update_body_convertToJSON(keyword_update_body_1);
	printf("keyword_update_body :\n%s\n", cJSON_Print(jsonkeyword_update_body_1));
	keyword_update_body_t* keyword_update_body_2 = keyword_update_body_parseFromJSON(jsonkeyword_update_body_1);
	cJSON* jsonkeyword_update_body_2 = keyword_update_body_convertToJSON(keyword_update_body_2);
	printf("repeating keyword_update_body:\n%s\n", cJSON_Print(jsonkeyword_update_body_2));
}

int main() {
  test_keyword_update_body(1);
  test_keyword_update_body(0);

  printf("Hello world \n");
  return 0;
}

#endif // keyword_update_body_MAIN
#endif // keyword_update_body_TEST
