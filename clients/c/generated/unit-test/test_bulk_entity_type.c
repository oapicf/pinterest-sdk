#ifndef bulk_entity_type_TEST
#define bulk_entity_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bulk_entity_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bulk_entity_type.h"
bulk_entity_type_t* instantiate_bulk_entity_type(int include_optional);



bulk_entity_type_t* instantiate_bulk_entity_type(int include_optional) {
  bulk_entity_type_t* bulk_entity_type = NULL;
  if (include_optional) {
    bulk_entity_type = bulk_entity_type_create(
    );
  } else {
    bulk_entity_type = bulk_entity_type_create(
    );
  }

  return bulk_entity_type;
}


#ifdef bulk_entity_type_MAIN

void test_bulk_entity_type(int include_optional) {
    bulk_entity_type_t* bulk_entity_type_1 = instantiate_bulk_entity_type(include_optional);

	cJSON* jsonbulk_entity_type_1 = bulk_entity_type_convertToJSON(bulk_entity_type_1);
	printf("bulk_entity_type :\n%s\n", cJSON_Print(jsonbulk_entity_type_1));
	bulk_entity_type_t* bulk_entity_type_2 = bulk_entity_type_parseFromJSON(jsonbulk_entity_type_1);
	cJSON* jsonbulk_entity_type_2 = bulk_entity_type_convertToJSON(bulk_entity_type_2);
	printf("repeating bulk_entity_type:\n%s\n", cJSON_Print(jsonbulk_entity_type_2));
}

int main() {
  test_bulk_entity_type(1);
  test_bulk_entity_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // bulk_entity_type_MAIN
#endif // bulk_entity_type_TEST
