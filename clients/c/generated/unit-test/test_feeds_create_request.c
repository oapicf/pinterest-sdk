#ifndef feeds_create_request_TEST
#define feeds_create_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feeds_create_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feeds_create_request.h"
feeds_create_request_t* instantiate_feeds_create_request(int include_optional);

#include "test_catalogs_feeds_create_request_default_locale.c"
#include "test_catalogs_feed_credentials.c"
#include "test_catalogs_feed_processing_schedule.c"
#include "test_catalogs_status.c"


feeds_create_request_t* instantiate_feeds_create_request(int include_optional) {
  feeds_create_request_t* feeds_create_request = NULL;
  if (include_optional) {
    feeds_create_request = feeds_create_request_create(
      pinterest_rest_api_feeds_create_request__"USD",
      "0",
      pinterest_rest_api_feeds_create_request__TSV,
      en-US,
       // false, not to have infinite recursion
      instantiate_catalogs_feed_credentials(0),
      "a",
       // false, not to have infinite recursion
      instantiate_catalogs_feed_processing_schedule(0),
      pinterest_rest_api_feeds_create_request__RETAIL,
      pinterest_rest_api_feeds_create_request__"US",
      pinterest_rest_api_feeds_create_request__IN_STOCK,
      "0",
      "a"
    );
  } else {
    feeds_create_request = feeds_create_request_create(
      pinterest_rest_api_feeds_create_request__"USD",
      "0",
      pinterest_rest_api_feeds_create_request__TSV,
      en-US,
      NULL,
      "a",
      NULL,
      pinterest_rest_api_feeds_create_request__RETAIL,
      pinterest_rest_api_feeds_create_request__"US",
      pinterest_rest_api_feeds_create_request__IN_STOCK,
      "0",
      "a"
    );
  }

  return feeds_create_request;
}


#ifdef feeds_create_request_MAIN

void test_feeds_create_request(int include_optional) {
    feeds_create_request_t* feeds_create_request_1 = instantiate_feeds_create_request(include_optional);

	cJSON* jsonfeeds_create_request_1 = feeds_create_request_convertToJSON(feeds_create_request_1);
	printf("feeds_create_request :\n%s\n", cJSON_Print(jsonfeeds_create_request_1));
	feeds_create_request_t* feeds_create_request_2 = feeds_create_request_parseFromJSON(jsonfeeds_create_request_1);
	cJSON* jsonfeeds_create_request_2 = feeds_create_request_convertToJSON(feeds_create_request_2);
	printf("repeating feeds_create_request:\n%s\n", cJSON_Print(jsonfeeds_create_request_2));
}

int main() {
  test_feeds_create_request(1);
  test_feeds_create_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // feeds_create_request_MAIN
#endif // feeds_create_request_TEST
