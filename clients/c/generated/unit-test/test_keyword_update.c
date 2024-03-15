#ifndef keyword_update_TEST
#define keyword_update_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define keyword_update_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/keyword_update.h"
keyword_update_t* instantiate_keyword_update(int include_optional);



keyword_update_t* instantiate_keyword_update(int include_optional) {
  keyword_update_t* keyword_update = NULL;
  if (include_optional) {
    keyword_update = keyword_update_create(
      "2886364308355",
      false,
      200000
    );
  } else {
    keyword_update = keyword_update_create(
      "2886364308355",
      false,
      200000
    );
  }

  return keyword_update;
}


#ifdef keyword_update_MAIN

void test_keyword_update(int include_optional) {
    keyword_update_t* keyword_update_1 = instantiate_keyword_update(include_optional);

	cJSON* jsonkeyword_update_1 = keyword_update_convertToJSON(keyword_update_1);
	printf("keyword_update :\n%s\n", cJSON_Print(jsonkeyword_update_1));
	keyword_update_t* keyword_update_2 = keyword_update_parseFromJSON(jsonkeyword_update_1);
	cJSON* jsonkeyword_update_2 = keyword_update_convertToJSON(keyword_update_2);
	printf("repeating keyword_update:\n%s\n", cJSON_Print(jsonkeyword_update_2));
}

int main() {
  test_keyword_update(1);
  test_keyword_update(0);

  printf("Hello world \n");
  return 0;
}

#endif // keyword_update_MAIN
#endif // keyword_update_TEST
