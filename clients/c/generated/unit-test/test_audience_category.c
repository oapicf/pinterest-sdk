#ifndef audience_category_TEST
#define audience_category_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_category_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_category.h"
audience_category_t* instantiate_audience_category(int include_optional);



audience_category_t* instantiate_audience_category(int include_optional) {
  audience_category_t* audience_category = NULL;
  if (include_optional) {
    audience_category = audience_category_create(
      "1234567",
      "travel",
      0.551,
      1.2,
      "1234567",
      list_createList()
    );
  } else {
    audience_category = audience_category_create(
      "1234567",
      "travel",
      0.551,
      1.2,
      "1234567",
      list_createList()
    );
  }

  return audience_category;
}


#ifdef audience_category_MAIN

void test_audience_category(int include_optional) {
    audience_category_t* audience_category_1 = instantiate_audience_category(include_optional);

	cJSON* jsonaudience_category_1 = audience_category_convertToJSON(audience_category_1);
	printf("audience_category :\n%s\n", cJSON_Print(jsonaudience_category_1));
	audience_category_t* audience_category_2 = audience_category_parseFromJSON(jsonaudience_category_1);
	cJSON* jsonaudience_category_2 = audience_category_convertToJSON(audience_category_2);
	printf("repeating audience_category:\n%s\n", cJSON_Print(jsonaudience_category_2));
}

int main() {
  test_audience_category(1);
  test_audience_category(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_category_MAIN
#endif // audience_category_TEST
