#ifndef bulk_download_request_TEST
#define bulk_download_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bulk_download_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bulk_download_request.h"
bulk_download_request_t* instantiate_bulk_download_request(int include_optional);

#include "test_bulk_download_request_campaign_filter.c"


bulk_download_request_t* instantiate_bulk_download_request(int include_optional) {
  bulk_download_request_t* bulk_download_request = NULL;
  if (include_optional) {
    bulk_download_request = bulk_download_request_create(
      ["CAMPAIGN","AD_GROUP"],
      list_createList(),
      "1622848072",
       // false, not to have infinite recursion
      instantiate_bulk_download_request_campaign_filter(0),
      CSV
    );
  } else {
    bulk_download_request = bulk_download_request_create(
      ["CAMPAIGN","AD_GROUP"],
      list_createList(),
      "1622848072",
      NULL,
      CSV
    );
  }

  return bulk_download_request;
}


#ifdef bulk_download_request_MAIN

void test_bulk_download_request(int include_optional) {
    bulk_download_request_t* bulk_download_request_1 = instantiate_bulk_download_request(include_optional);

	cJSON* jsonbulk_download_request_1 = bulk_download_request_convertToJSON(bulk_download_request_1);
	printf("bulk_download_request :\n%s\n", cJSON_Print(jsonbulk_download_request_1));
	bulk_download_request_t* bulk_download_request_2 = bulk_download_request_parseFromJSON(jsonbulk_download_request_1);
	cJSON* jsonbulk_download_request_2 = bulk_download_request_convertToJSON(bulk_download_request_2);
	printf("repeating bulk_download_request:\n%s\n", cJSON_Print(jsonbulk_download_request_2));
}

int main() {
  test_bulk_download_request(1);
  test_bulk_download_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // bulk_download_request_MAIN
#endif // bulk_download_request_TEST
