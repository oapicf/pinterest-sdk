#ifndef feed_processing_results_list_200_response_TEST
#define feed_processing_results_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feed_processing_results_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feed_processing_results_list_200_response.h"
feed_processing_results_list_200_response_t* instantiate_feed_processing_results_list_200_response(int include_optional);



feed_processing_results_list_200_response_t* instantiate_feed_processing_results_list_200_response(int include_optional) {
  feed_processing_results_list_200_response_t* feed_processing_results_list_200_response = NULL;
  if (include_optional) {
    feed_processing_results_list_200_response = feed_processing_results_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    feed_processing_results_list_200_response = feed_processing_results_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return feed_processing_results_list_200_response;
}


#ifdef feed_processing_results_list_200_response_MAIN

void test_feed_processing_results_list_200_response(int include_optional) {
    feed_processing_results_list_200_response_t* feed_processing_results_list_200_response_1 = instantiate_feed_processing_results_list_200_response(include_optional);

	cJSON* jsonfeed_processing_results_list_200_response_1 = feed_processing_results_list_200_response_convertToJSON(feed_processing_results_list_200_response_1);
	printf("feed_processing_results_list_200_response :\n%s\n", cJSON_Print(jsonfeed_processing_results_list_200_response_1));
	feed_processing_results_list_200_response_t* feed_processing_results_list_200_response_2 = feed_processing_results_list_200_response_parseFromJSON(jsonfeed_processing_results_list_200_response_1);
	cJSON* jsonfeed_processing_results_list_200_response_2 = feed_processing_results_list_200_response_convertToJSON(feed_processing_results_list_200_response_2);
	printf("repeating feed_processing_results_list_200_response:\n%s\n", cJSON_Print(jsonfeed_processing_results_list_200_response_2));
}

int main() {
  test_feed_processing_results_list_200_response(1);
  test_feed_processing_results_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // feed_processing_results_list_200_response_MAIN
#endif // feed_processing_results_list_200_response_TEST
