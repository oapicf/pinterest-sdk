#ifndef advertiser_defined_events_response_TEST
#define advertiser_defined_events_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define advertiser_defined_events_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/advertiser_defined_events_response.h"
advertiser_defined_events_response_t* instantiate_advertiser_defined_events_response(int include_optional);



advertiser_defined_events_response_t* instantiate_advertiser_defined_events_response(int include_optional) {
  advertiser_defined_events_response_t* advertiser_defined_events_response = NULL;
  if (include_optional) {
    advertiser_defined_events_response = advertiser_defined_events_response_create(
      list_createList()
    );
  } else {
    advertiser_defined_events_response = advertiser_defined_events_response_create(
      list_createList()
    );
  }

  return advertiser_defined_events_response;
}


#ifdef advertiser_defined_events_response_MAIN

void test_advertiser_defined_events_response(int include_optional) {
    advertiser_defined_events_response_t* advertiser_defined_events_response_1 = instantiate_advertiser_defined_events_response(include_optional);

	cJSON* jsonadvertiser_defined_events_response_1 = advertiser_defined_events_response_convertToJSON(advertiser_defined_events_response_1);
	printf("advertiser_defined_events_response :\n%s\n", cJSON_Print(jsonadvertiser_defined_events_response_1));
	advertiser_defined_events_response_t* advertiser_defined_events_response_2 = advertiser_defined_events_response_parseFromJSON(jsonadvertiser_defined_events_response_1);
	cJSON* jsonadvertiser_defined_events_response_2 = advertiser_defined_events_response_convertToJSON(advertiser_defined_events_response_2);
	printf("repeating advertiser_defined_events_response:\n%s\n", cJSON_Print(jsonadvertiser_defined_events_response_2));
}

int main() {
  test_advertiser_defined_events_response(1);
  test_advertiser_defined_events_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // advertiser_defined_events_response_MAIN
#endif // advertiser_defined_events_response_TEST
