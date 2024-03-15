#ifndef nullable_catalogs_item_field_type_TEST
#define nullable_catalogs_item_field_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define nullable_catalogs_item_field_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/nullable_catalogs_item_field_type.h"
nullable_catalogs_item_field_type_t* instantiate_nullable_catalogs_item_field_type(int include_optional);



nullable_catalogs_item_field_type_t* instantiate_nullable_catalogs_item_field_type(int include_optional) {
  nullable_catalogs_item_field_type_t* nullable_catalogs_item_field_type = NULL;
  if (include_optional) {
    nullable_catalogs_item_field_type = nullable_catalogs_item_field_type_create(
    );
  } else {
    nullable_catalogs_item_field_type = nullable_catalogs_item_field_type_create(
    );
  }

  return nullable_catalogs_item_field_type;
}


#ifdef nullable_catalogs_item_field_type_MAIN

void test_nullable_catalogs_item_field_type(int include_optional) {
    nullable_catalogs_item_field_type_t* nullable_catalogs_item_field_type_1 = instantiate_nullable_catalogs_item_field_type(include_optional);

	cJSON* jsonnullable_catalogs_item_field_type_1 = nullable_catalogs_item_field_type_convertToJSON(nullable_catalogs_item_field_type_1);
	printf("nullable_catalogs_item_field_type :\n%s\n", cJSON_Print(jsonnullable_catalogs_item_field_type_1));
	nullable_catalogs_item_field_type_t* nullable_catalogs_item_field_type_2 = nullable_catalogs_item_field_type_parseFromJSON(jsonnullable_catalogs_item_field_type_1);
	cJSON* jsonnullable_catalogs_item_field_type_2 = nullable_catalogs_item_field_type_convertToJSON(nullable_catalogs_item_field_type_2);
	printf("repeating nullable_catalogs_item_field_type:\n%s\n", cJSON_Print(jsonnullable_catalogs_item_field_type_2));
}

int main() {
  test_nullable_catalogs_item_field_type(1);
  test_nullable_catalogs_item_field_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // nullable_catalogs_item_field_type_MAIN
#endif // nullable_catalogs_item_field_type_TEST
