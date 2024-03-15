#ifndef bulk_upsert_request_create_TEST
#define bulk_upsert_request_create_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bulk_upsert_request_create_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bulk_upsert_request_create.h"
bulk_upsert_request_create_t* instantiate_bulk_upsert_request_create(int include_optional);



bulk_upsert_request_create_t* instantiate_bulk_upsert_request_create(int include_optional) {
  bulk_upsert_request_create_t* bulk_upsert_request_create = NULL;
  if (include_optional) {
    bulk_upsert_request_create = bulk_upsert_request_create_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    bulk_upsert_request_create = bulk_upsert_request_create_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return bulk_upsert_request_create;
}


#ifdef bulk_upsert_request_create_MAIN

void test_bulk_upsert_request_create(int include_optional) {
    bulk_upsert_request_create_t* bulk_upsert_request_create_1 = instantiate_bulk_upsert_request_create(include_optional);

	cJSON* jsonbulk_upsert_request_create_1 = bulk_upsert_request_create_convertToJSON(bulk_upsert_request_create_1);
	printf("bulk_upsert_request_create :\n%s\n", cJSON_Print(jsonbulk_upsert_request_create_1));
	bulk_upsert_request_create_t* bulk_upsert_request_create_2 = bulk_upsert_request_create_parseFromJSON(jsonbulk_upsert_request_create_1);
	cJSON* jsonbulk_upsert_request_create_2 = bulk_upsert_request_create_convertToJSON(bulk_upsert_request_create_2);
	printf("repeating bulk_upsert_request_create:\n%s\n", cJSON_Print(jsonbulk_upsert_request_create_2));
}

int main() {
  test_bulk_upsert_request_create(1);
  test_bulk_upsert_request_create(0);

  printf("Hello world \n");
  return 0;
}

#endif // bulk_upsert_request_create_MAIN
#endif // bulk_upsert_request_create_TEST
