#ifndef non_draft_entity_status_TEST
#define non_draft_entity_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define non_draft_entity_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/non_draft_entity_status.h"
non_draft_entity_status_t* instantiate_non_draft_entity_status(int include_optional);



non_draft_entity_status_t* instantiate_non_draft_entity_status(int include_optional) {
  non_draft_entity_status_t* non_draft_entity_status = NULL;
  if (include_optional) {
    non_draft_entity_status = non_draft_entity_status_create(
    );
  } else {
    non_draft_entity_status = non_draft_entity_status_create(
    );
  }

  return non_draft_entity_status;
}


#ifdef non_draft_entity_status_MAIN

void test_non_draft_entity_status(int include_optional) {
    non_draft_entity_status_t* non_draft_entity_status_1 = instantiate_non_draft_entity_status(include_optional);

	cJSON* jsonnon_draft_entity_status_1 = non_draft_entity_status_convertToJSON(non_draft_entity_status_1);
	printf("non_draft_entity_status :\n%s\n", cJSON_Print(jsonnon_draft_entity_status_1));
	non_draft_entity_status_t* non_draft_entity_status_2 = non_draft_entity_status_parseFromJSON(jsonnon_draft_entity_status_1);
	cJSON* jsonnon_draft_entity_status_2 = non_draft_entity_status_convertToJSON(non_draft_entity_status_2);
	printf("repeating non_draft_entity_status:\n%s\n", cJSON_Print(jsonnon_draft_entity_status_2));
}

int main() {
  test_non_draft_entity_status(1);
  test_non_draft_entity_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // non_draft_entity_status_MAIN
#endif // non_draft_entity_status_TEST
