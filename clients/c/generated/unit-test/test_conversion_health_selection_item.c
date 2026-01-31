#ifndef conversion_health_selection_item_TEST
#define conversion_health_selection_item_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_health_selection_item_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_health_selection_item.h"
conversion_health_selection_item_t* instantiate_conversion_health_selection_item(int include_optional);



conversion_health_selection_item_t* instantiate_conversion_health_selection_item(int include_optional) {
  conversion_health_selection_item_t* conversion_health_selection_item = NULL;
  if (include_optional) {
    conversion_health_selection_item = conversion_health_selection_item_create(
      0,
      0,
      0,
      null
    );
  } else {
    conversion_health_selection_item = conversion_health_selection_item_create(
      0,
      0,
      0,
      null
    );
  }

  return conversion_health_selection_item;
}


#ifdef conversion_health_selection_item_MAIN

void test_conversion_health_selection_item(int include_optional) {
    conversion_health_selection_item_t* conversion_health_selection_item_1 = instantiate_conversion_health_selection_item(include_optional);

	cJSON* jsonconversion_health_selection_item_1 = conversion_health_selection_item_convertToJSON(conversion_health_selection_item_1);
	printf("conversion_health_selection_item :\n%s\n", cJSON_Print(jsonconversion_health_selection_item_1));
	conversion_health_selection_item_t* conversion_health_selection_item_2 = conversion_health_selection_item_parseFromJSON(jsonconversion_health_selection_item_1);
	cJSON* jsonconversion_health_selection_item_2 = conversion_health_selection_item_convertToJSON(conversion_health_selection_item_2);
	printf("repeating conversion_health_selection_item:\n%s\n", cJSON_Print(jsonconversion_health_selection_item_2));
}

int main() {
  test_conversion_health_selection_item(1);
  test_conversion_health_selection_item(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_health_selection_item_MAIN
#endif // conversion_health_selection_item_TEST
