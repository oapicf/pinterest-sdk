#ifndef bulk_upsert_request_update_TEST
#define bulk_upsert_request_update_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bulk_upsert_request_update_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bulk_upsert_request_update.h"
bulk_upsert_request_update_t* instantiate_bulk_upsert_request_update(int include_optional);



bulk_upsert_request_update_t* instantiate_bulk_upsert_request_update(int include_optional) {
  bulk_upsert_request_update_t* bulk_upsert_request_update = NULL;
  if (include_optional) {
    bulk_upsert_request_update = bulk_upsert_request_update_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    bulk_upsert_request_update = bulk_upsert_request_update_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return bulk_upsert_request_update;
}


#ifdef bulk_upsert_request_update_MAIN

void test_bulk_upsert_request_update(int include_optional) {
    bulk_upsert_request_update_t* bulk_upsert_request_update_1 = instantiate_bulk_upsert_request_update(include_optional);

	cJSON* jsonbulk_upsert_request_update_1 = bulk_upsert_request_update_convertToJSON(bulk_upsert_request_update_1);
	printf("bulk_upsert_request_update :\n%s\n", cJSON_Print(jsonbulk_upsert_request_update_1));
	bulk_upsert_request_update_t* bulk_upsert_request_update_2 = bulk_upsert_request_update_parseFromJSON(jsonbulk_upsert_request_update_1);
	cJSON* jsonbulk_upsert_request_update_2 = bulk_upsert_request_update_convertToJSON(bulk_upsert_request_update_2);
	printf("repeating bulk_upsert_request_update:\n%s\n", cJSON_Print(jsonbulk_upsert_request_update_2));
}

int main() {
  test_bulk_upsert_request_update(1);
  test_bulk_upsert_request_update(0);

  printf("Hello world \n");
  return 0;
}

#endif // bulk_upsert_request_update_MAIN
#endif // bulk_upsert_request_update_TEST
