#ifndef feeds_update_request_TEST
#define feeds_update_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feeds_update_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feeds_update_request.h"
feeds_update_request_t* instantiate_feeds_update_request(int include_optional);

#include "test_catalogs_feed_credentials.c"
#include "test_catalogs_feed_processing_schedule.c"


feeds_update_request_t* instantiate_feeds_update_request(int include_optional) {
  feeds_update_request_t* feeds_update_request = NULL;
  if (include_optional) {
    feeds_update_request = feeds_update_request_create(
      pinterest_rest_api_feeds_update_request__"USD",
      "0",
      pinterest_rest_api_feeds_update_request__TSV,
       // false, not to have infinite recursion
      instantiate_catalogs_feed_credentials(0),
      "a",
       // false, not to have infinite recursion
      instantiate_catalogs_feed_processing_schedule(0),
      pinterest_rest_api_feeds_update_request__ACTIVE,
      pinterest_rest_api_feeds_update_request__RETAIL,
      pinterest_rest_api_feeds_update_request__IN_STOCK
    );
  } else {
    feeds_update_request = feeds_update_request_create(
      pinterest_rest_api_feeds_update_request__"USD",
      "0",
      pinterest_rest_api_feeds_update_request__TSV,
      NULL,
      "a",
      NULL,
      pinterest_rest_api_feeds_update_request__ACTIVE,
      pinterest_rest_api_feeds_update_request__RETAIL,
      pinterest_rest_api_feeds_update_request__IN_STOCK
    );
  }

  return feeds_update_request;
}


#ifdef feeds_update_request_MAIN

void test_feeds_update_request(int include_optional) {
    feeds_update_request_t* feeds_update_request_1 = instantiate_feeds_update_request(include_optional);

	cJSON* jsonfeeds_update_request_1 = feeds_update_request_convertToJSON(feeds_update_request_1);
	printf("feeds_update_request :\n%s\n", cJSON_Print(jsonfeeds_update_request_1));
	feeds_update_request_t* feeds_update_request_2 = feeds_update_request_parseFromJSON(jsonfeeds_update_request_1);
	cJSON* jsonfeeds_update_request_2 = feeds_update_request_convertToJSON(feeds_update_request_2);
	printf("repeating feeds_update_request:\n%s\n", cJSON_Print(jsonfeeds_update_request_2));
}

int main() {
  test_feeds_update_request(1);
  test_feeds_update_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // feeds_update_request_MAIN
#endif // feeds_update_request_TEST
