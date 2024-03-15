#ifndef bulk_download_request_campaign_filter_TEST
#define bulk_download_request_campaign_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bulk_download_request_campaign_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bulk_download_request_campaign_filter.h"
bulk_download_request_campaign_filter_t* instantiate_bulk_download_request_campaign_filter(int include_optional);



bulk_download_request_campaign_filter_t* instantiate_bulk_download_request_campaign_filter(int include_optional) {
  bulk_download_request_campaign_filter_t* bulk_download_request_campaign_filter = NULL;
  if (include_optional) {
    bulk_download_request_campaign_filter = bulk_download_request_campaign_filter_create(
      "1622848072",
      "1622848072",
      "campaign name",
      list_createList(),
      list_createList()
    );
  } else {
    bulk_download_request_campaign_filter = bulk_download_request_campaign_filter_create(
      "1622848072",
      "1622848072",
      "campaign name",
      list_createList(),
      list_createList()
    );
  }

  return bulk_download_request_campaign_filter;
}


#ifdef bulk_download_request_campaign_filter_MAIN

void test_bulk_download_request_campaign_filter(int include_optional) {
    bulk_download_request_campaign_filter_t* bulk_download_request_campaign_filter_1 = instantiate_bulk_download_request_campaign_filter(include_optional);

	cJSON* jsonbulk_download_request_campaign_filter_1 = bulk_download_request_campaign_filter_convertToJSON(bulk_download_request_campaign_filter_1);
	printf("bulk_download_request_campaign_filter :\n%s\n", cJSON_Print(jsonbulk_download_request_campaign_filter_1));
	bulk_download_request_campaign_filter_t* bulk_download_request_campaign_filter_2 = bulk_download_request_campaign_filter_parseFromJSON(jsonbulk_download_request_campaign_filter_1);
	cJSON* jsonbulk_download_request_campaign_filter_2 = bulk_download_request_campaign_filter_convertToJSON(bulk_download_request_campaign_filter_2);
	printf("repeating bulk_download_request_campaign_filter:\n%s\n", cJSON_Print(jsonbulk_download_request_campaign_filter_2));
}

int main() {
  test_bulk_download_request_campaign_filter(1);
  test_bulk_download_request_campaign_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // bulk_download_request_campaign_filter_MAIN
#endif // bulk_download_request_campaign_filter_TEST
