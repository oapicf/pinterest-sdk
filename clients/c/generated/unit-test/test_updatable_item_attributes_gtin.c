#ifndef updatable_item_attributes_gtin_TEST
#define updatable_item_attributes_gtin_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define updatable_item_attributes_gtin_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/updatable_item_attributes_gtin.h"
updatable_item_attributes_gtin_t* instantiate_updatable_item_attributes_gtin(int include_optional);



updatable_item_attributes_gtin_t* instantiate_updatable_item_attributes_gtin(int include_optional) {
  updatable_item_attributes_gtin_t* updatable_item_attributes_gtin = NULL;
  if (include_optional) {
    updatable_item_attributes_gtin = updatable_item_attributes_gtin_create(
    );
  } else {
    updatable_item_attributes_gtin = updatable_item_attributes_gtin_create(
    );
  }

  return updatable_item_attributes_gtin;
}


#ifdef updatable_item_attributes_gtin_MAIN

void test_updatable_item_attributes_gtin(int include_optional) {
    updatable_item_attributes_gtin_t* updatable_item_attributes_gtin_1 = instantiate_updatable_item_attributes_gtin(include_optional);

	cJSON* jsonupdatable_item_attributes_gtin_1 = updatable_item_attributes_gtin_convertToJSON(updatable_item_attributes_gtin_1);
	printf("updatable_item_attributes_gtin :\n%s\n", cJSON_Print(jsonupdatable_item_attributes_gtin_1));
	updatable_item_attributes_gtin_t* updatable_item_attributes_gtin_2 = updatable_item_attributes_gtin_parseFromJSON(jsonupdatable_item_attributes_gtin_1);
	cJSON* jsonupdatable_item_attributes_gtin_2 = updatable_item_attributes_gtin_convertToJSON(updatable_item_attributes_gtin_2);
	printf("repeating updatable_item_attributes_gtin:\n%s\n", cJSON_Print(jsonupdatable_item_attributes_gtin_2));
}

int main() {
  test_updatable_item_attributes_gtin(1);
  test_updatable_item_attributes_gtin(0);

  printf("Hello world \n");
  return 0;
}

#endif // updatable_item_attributes_gtin_MAIN
#endif // updatable_item_attributes_gtin_TEST
