#ifndef advertiser_defined_event_TEST
#define advertiser_defined_event_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define advertiser_defined_event_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/advertiser_defined_event.h"
advertiser_defined_event_t* instantiate_advertiser_defined_event(int include_optional);


// it is enum. Work in Progress


advertiser_defined_event_t* instantiate_advertiser_defined_event(int include_optional) {
  advertiser_defined_event_t* advertiser_defined_event = NULL;
  if (include_optional) {
    advertiser_defined_event = advertiser_defined_event_create(
      "download_picture",
      pinterest_rest_api_advertiser_defined_event_MAPPEDCONVERSIONTYPE_PAGE_LOAD
    );
  } else {
    advertiser_defined_event = advertiser_defined_event_create(
      "download_picture",
      pinterest_rest_api_advertiser_defined_event_MAPPEDCONVERSIONTYPE_PAGE_LOAD
    );
  }

  return advertiser_defined_event;
}


#ifdef advertiser_defined_event_MAIN

void test_advertiser_defined_event(int include_optional) {
    advertiser_defined_event_t* advertiser_defined_event_1 = instantiate_advertiser_defined_event(include_optional);

	cJSON* jsonadvertiser_defined_event_1 = advertiser_defined_event_convertToJSON(advertiser_defined_event_1);
	printf("advertiser_defined_event :\n%s\n", cJSON_Print(jsonadvertiser_defined_event_1));
	advertiser_defined_event_t* advertiser_defined_event_2 = advertiser_defined_event_parseFromJSON(jsonadvertiser_defined_event_1);
	cJSON* jsonadvertiser_defined_event_2 = advertiser_defined_event_convertToJSON(advertiser_defined_event_2);
	printf("repeating advertiser_defined_event:\n%s\n", cJSON_Print(jsonadvertiser_defined_event_2));
}

int main() {
  test_advertiser_defined_event(1);
  test_advertiser_defined_event(0);

  printf("Hello world \n");
  return 0;
}

#endif // advertiser_defined_event_MAIN
#endif // advertiser_defined_event_TEST
