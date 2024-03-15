#ifndef bulk_upsert_response_TEST
#define bulk_upsert_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bulk_upsert_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bulk_upsert_response.h"
bulk_upsert_response_t* instantiate_bulk_upsert_response(int include_optional);



bulk_upsert_response_t* instantiate_bulk_upsert_response(int include_optional) {
  bulk_upsert_response_t* bulk_upsert_response = NULL;
  if (include_optional) {
    bulk_upsert_response = bulk_upsert_response_create(
      "549763856477-1660864560-1407e16a-c586-4add-94df-d0b160bec0ff, 549763856477-1660864560-d0b160bec0ff"
    );
  } else {
    bulk_upsert_response = bulk_upsert_response_create(
      "549763856477-1660864560-1407e16a-c586-4add-94df-d0b160bec0ff, 549763856477-1660864560-d0b160bec0ff"
    );
  }

  return bulk_upsert_response;
}


#ifdef bulk_upsert_response_MAIN

void test_bulk_upsert_response(int include_optional) {
    bulk_upsert_response_t* bulk_upsert_response_1 = instantiate_bulk_upsert_response(include_optional);

	cJSON* jsonbulk_upsert_response_1 = bulk_upsert_response_convertToJSON(bulk_upsert_response_1);
	printf("bulk_upsert_response :\n%s\n", cJSON_Print(jsonbulk_upsert_response_1));
	bulk_upsert_response_t* bulk_upsert_response_2 = bulk_upsert_response_parseFromJSON(jsonbulk_upsert_response_1);
	cJSON* jsonbulk_upsert_response_2 = bulk_upsert_response_convertToJSON(bulk_upsert_response_2);
	printf("repeating bulk_upsert_response:\n%s\n", cJSON_Print(jsonbulk_upsert_response_2));
}

int main() {
  test_bulk_upsert_response(1);
  test_bulk_upsert_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // bulk_upsert_response_MAIN
#endif // bulk_upsert_response_TEST
