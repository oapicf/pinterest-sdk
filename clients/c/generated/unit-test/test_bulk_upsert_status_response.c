#ifndef bulk_upsert_status_response_TEST
#define bulk_upsert_status_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bulk_upsert_status_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bulk_upsert_status_response.h"
bulk_upsert_status_response_t* instantiate_bulk_upsert_status_response(int include_optional);



bulk_upsert_status_response_t* instantiate_bulk_upsert_status_response(int include_optional) {
  bulk_upsert_status_response_t* bulk_upsert_status_response = NULL;
  if (include_optional) {
    bulk_upsert_status_response = bulk_upsert_status_response_create(
      pinterest_rest_api_bulk_upsert_status_response__"SUCCEEDED",
      "https://pinterest-waterloo.s3.us-east-1.amazonaws.com/bulk_framework/AD_ENTITY_UPSERT/549763856637-1659122537-0b4d77d3-f620-48ce-bec9-616106afb8d4/(...)"
    );
  } else {
    bulk_upsert_status_response = bulk_upsert_status_response_create(
      pinterest_rest_api_bulk_upsert_status_response__"SUCCEEDED",
      "https://pinterest-waterloo.s3.us-east-1.amazonaws.com/bulk_framework/AD_ENTITY_UPSERT/549763856637-1659122537-0b4d77d3-f620-48ce-bec9-616106afb8d4/(...)"
    );
  }

  return bulk_upsert_status_response;
}


#ifdef bulk_upsert_status_response_MAIN

void test_bulk_upsert_status_response(int include_optional) {
    bulk_upsert_status_response_t* bulk_upsert_status_response_1 = instantiate_bulk_upsert_status_response(include_optional);

	cJSON* jsonbulk_upsert_status_response_1 = bulk_upsert_status_response_convertToJSON(bulk_upsert_status_response_1);
	printf("bulk_upsert_status_response :\n%s\n", cJSON_Print(jsonbulk_upsert_status_response_1));
	bulk_upsert_status_response_t* bulk_upsert_status_response_2 = bulk_upsert_status_response_parseFromJSON(jsonbulk_upsert_status_response_1);
	cJSON* jsonbulk_upsert_status_response_2 = bulk_upsert_status_response_convertToJSON(bulk_upsert_status_response_2);
	printf("repeating bulk_upsert_status_response:\n%s\n", cJSON_Print(jsonbulk_upsert_status_response_2));
}

int main() {
  test_bulk_upsert_status_response(1);
  test_bulk_upsert_status_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // bulk_upsert_status_response_MAIN
#endif // bulk_upsert_status_response_TEST
