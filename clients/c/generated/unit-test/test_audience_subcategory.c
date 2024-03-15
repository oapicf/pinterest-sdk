#ifndef audience_subcategory_TEST
#define audience_subcategory_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_subcategory_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_subcategory.h"
audience_subcategory_t* instantiate_audience_subcategory(int include_optional);



audience_subcategory_t* instantiate_audience_subcategory(int include_optional) {
  audience_subcategory_t* audience_subcategory = NULL;
  if (include_optional) {
    audience_subcategory = audience_subcategory_create(
      "958862518888",
      "travel destinations",
      0.482,
      1.2,
      "958862518888"
    );
  } else {
    audience_subcategory = audience_subcategory_create(
      "958862518888",
      "travel destinations",
      0.482,
      1.2,
      "958862518888"
    );
  }

  return audience_subcategory;
}


#ifdef audience_subcategory_MAIN

void test_audience_subcategory(int include_optional) {
    audience_subcategory_t* audience_subcategory_1 = instantiate_audience_subcategory(include_optional);

	cJSON* jsonaudience_subcategory_1 = audience_subcategory_convertToJSON(audience_subcategory_1);
	printf("audience_subcategory :\n%s\n", cJSON_Print(jsonaudience_subcategory_1));
	audience_subcategory_t* audience_subcategory_2 = audience_subcategory_parseFromJSON(jsonaudience_subcategory_1);
	cJSON* jsonaudience_subcategory_2 = audience_subcategory_convertToJSON(audience_subcategory_2);
	printf("repeating audience_subcategory:\n%s\n", cJSON_Print(jsonaudience_subcategory_2));
}

int main() {
  test_audience_subcategory(1);
  test_audience_subcategory(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_subcategory_MAIN
#endif // audience_subcategory_TEST
