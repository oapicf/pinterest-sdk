#ifndef bulk_upsert_request_TEST
#define bulk_upsert_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bulk_upsert_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bulk_upsert_request.h"
bulk_upsert_request_t* instantiate_bulk_upsert_request(int include_optional);

#include "test_bulk_upsert_request_create.c"
#include "test_bulk_upsert_request_update.c"


bulk_upsert_request_t* instantiate_bulk_upsert_request(int include_optional) {
  bulk_upsert_request_t* bulk_upsert_request = NULL;
  if (include_optional) {
    bulk_upsert_request = bulk_upsert_request_create(
       // false, not to have infinite recursion
      instantiate_bulk_upsert_request_create(0),
       // false, not to have infinite recursion
      instantiate_bulk_upsert_request_update(0)
    );
  } else {
    bulk_upsert_request = bulk_upsert_request_create(
      NULL,
      NULL
    );
  }

  return bulk_upsert_request;
}


#ifdef bulk_upsert_request_MAIN

void test_bulk_upsert_request(int include_optional) {
    bulk_upsert_request_t* bulk_upsert_request_1 = instantiate_bulk_upsert_request(include_optional);

	cJSON* jsonbulk_upsert_request_1 = bulk_upsert_request_convertToJSON(bulk_upsert_request_1);
	printf("bulk_upsert_request :\n%s\n", cJSON_Print(jsonbulk_upsert_request_1));
	bulk_upsert_request_t* bulk_upsert_request_2 = bulk_upsert_request_parseFromJSON(jsonbulk_upsert_request_1);
	cJSON* jsonbulk_upsert_request_2 = bulk_upsert_request_convertToJSON(bulk_upsert_request_2);
	printf("repeating bulk_upsert_request:\n%s\n", cJSON_Print(jsonbulk_upsert_request_2));
}

int main() {
  test_bulk_upsert_request(1);
  test_bulk_upsert_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // bulk_upsert_request_MAIN
#endif // bulk_upsert_request_TEST
