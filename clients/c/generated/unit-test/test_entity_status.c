#ifndef entity_status_TEST
#define entity_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define entity_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/entity_status.h"
entity_status_t* instantiate_entity_status(int include_optional);



entity_status_t* instantiate_entity_status(int include_optional) {
  entity_status_t* entity_status = NULL;
  if (include_optional) {
    entity_status = entity_status_create(
    );
  } else {
    entity_status = entity_status_create(
    );
  }

  return entity_status;
}


#ifdef entity_status_MAIN

void test_entity_status(int include_optional) {
    entity_status_t* entity_status_1 = instantiate_entity_status(include_optional);

	cJSON* jsonentity_status_1 = entity_status_convertToJSON(entity_status_1);
	printf("entity_status :\n%s\n", cJSON_Print(jsonentity_status_1));
	entity_status_t* entity_status_2 = entity_status_parseFromJSON(jsonentity_status_1);
	cJSON* jsonentity_status_2 = entity_status_convertToJSON(entity_status_2);
	printf("repeating entity_status:\n%s\n", cJSON_Print(jsonentity_status_2));
}

int main() {
  test_entity_status(1);
  test_entity_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // entity_status_MAIN
#endif // entity_status_TEST
