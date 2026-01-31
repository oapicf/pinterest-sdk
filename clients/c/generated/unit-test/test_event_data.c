#ifndef event_data_TEST
#define event_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define event_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/event_data.h"
event_data_t* instantiate_event_data(int include_optional);

#include "test_line_item.c"


event_data_t* instantiate_event_data(int include_optional) {
  event_data_t* event_data = NULL;
  if (include_optional) {
    event_data = event_data_create(
      UNK,
      "Newsletter",
       // false, not to have infinite recursion
      instantiate_line_item(0),
      "X-151481",
      1,
      "Our Favorite Pins on Pinterest",
      "WINTER10",
      "Athleta",
      "boots",
      "199.98",
      "How to style your Parker Boots"
    );
  } else {
    event_data = event_data_create(
      UNK,
      "Newsletter",
      NULL,
      "X-151481",
      1,
      "Our Favorite Pins on Pinterest",
      "WINTER10",
      "Athleta",
      "boots",
      "199.98",
      "How to style your Parker Boots"
    );
  }

  return event_data;
}


#ifdef event_data_MAIN

void test_event_data(int include_optional) {
    event_data_t* event_data_1 = instantiate_event_data(include_optional);

	cJSON* jsonevent_data_1 = event_data_convertToJSON(event_data_1);
	printf("event_data :\n%s\n", cJSON_Print(jsonevent_data_1));
	event_data_t* event_data_2 = event_data_parseFromJSON(jsonevent_data_1);
	cJSON* jsonevent_data_2 = event_data_convertToJSON(event_data_2);
	printf("repeating event_data:\n%s\n", cJSON_Print(jsonevent_data_2));
}

int main() {
  test_event_data(1);
  test_event_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // event_data_MAIN
#endif // event_data_TEST
