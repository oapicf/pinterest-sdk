#ifndef bulk_download_response_TEST
#define bulk_download_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bulk_download_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bulk_download_response.h"
bulk_download_response_t* instantiate_bulk_download_response(int include_optional);



bulk_download_response_t* instantiate_bulk_download_response(int include_optional) {
  bulk_download_response_t* bulk_download_response = NULL;
  if (include_optional) {
    bulk_download_response = bulk_download_response_create(
      "2680059592705"
    );
  } else {
    bulk_download_response = bulk_download_response_create(
      "2680059592705"
    );
  }

  return bulk_download_response;
}


#ifdef bulk_download_response_MAIN

void test_bulk_download_response(int include_optional) {
    bulk_download_response_t* bulk_download_response_1 = instantiate_bulk_download_response(include_optional);

	cJSON* jsonbulk_download_response_1 = bulk_download_response_convertToJSON(bulk_download_response_1);
	printf("bulk_download_response :\n%s\n", cJSON_Print(jsonbulk_download_response_1));
	bulk_download_response_t* bulk_download_response_2 = bulk_download_response_parseFromJSON(jsonbulk_download_response_1);
	cJSON* jsonbulk_download_response_2 = bulk_download_response_convertToJSON(bulk_download_response_2);
	printf("repeating bulk_download_response:\n%s\n", cJSON_Print(jsonbulk_download_response_2));
}

int main() {
  test_bulk_download_response(1);
  test_bulk_download_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // bulk_download_response_MAIN
#endif // bulk_download_response_TEST
