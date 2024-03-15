#ifndef conversion_events_TEST
#define conversion_events_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_events_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_events.h"
conversion_events_t* instantiate_conversion_events(int include_optional);



conversion_events_t* instantiate_conversion_events(int include_optional) {
  conversion_events_t* conversion_events = NULL;
  if (include_optional) {
    conversion_events = conversion_events_create(
      list_createList()
    );
  } else {
    conversion_events = conversion_events_create(
      list_createList()
    );
  }

  return conversion_events;
}


#ifdef conversion_events_MAIN

void test_conversion_events(int include_optional) {
    conversion_events_t* conversion_events_1 = instantiate_conversion_events(include_optional);

	cJSON* jsonconversion_events_1 = conversion_events_convertToJSON(conversion_events_1);
	printf("conversion_events :\n%s\n", cJSON_Print(jsonconversion_events_1));
	conversion_events_t* conversion_events_2 = conversion_events_parseFromJSON(jsonconversion_events_1);
	cJSON* jsonconversion_events_2 = conversion_events_convertToJSON(conversion_events_2);
	printf("repeating conversion_events:\n%s\n", cJSON_Print(jsonconversion_events_2));
}

int main() {
  test_conversion_events(1);
  test_conversion_events(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_events_MAIN
#endif // conversion_events_TEST
