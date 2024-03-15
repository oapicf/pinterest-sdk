#ifndef pinterest_tag_event_data_TEST
#define pinterest_tag_event_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pinterest_tag_event_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pinterest_tag_event_data.h"
pinterest_tag_event_data_t* instantiate_pinterest_tag_event_data(int include_optional);

#include "test_line_item.c"


pinterest_tag_event_data_t* instantiate_pinterest_tag_event_data(int include_optional) {
  pinterest_tag_event_data_t* pinterest_tag_event_data = NULL;
  if (include_optional) {
    pinterest_tag_event_data = pinterest_tag_event_data_create(
      pinterest_rest_api_pinterest_tag_event_data__"USD",
      "Newsletter",
       // false, not to have infinite recursion
      instantiate_line_item(0),
      "X-151481",
      1,
      "Our Favorite Pins on Pinterest.",
      "WINTER10",
      "Athleta",
      "boots",
      "199.98",
      "How to style your Parker Boots"
    );
  } else {
    pinterest_tag_event_data = pinterest_tag_event_data_create(
      pinterest_rest_api_pinterest_tag_event_data__"USD",
      "Newsletter",
      NULL,
      "X-151481",
      1,
      "Our Favorite Pins on Pinterest.",
      "WINTER10",
      "Athleta",
      "boots",
      "199.98",
      "How to style your Parker Boots"
    );
  }

  return pinterest_tag_event_data;
}


#ifdef pinterest_tag_event_data_MAIN

void test_pinterest_tag_event_data(int include_optional) {
    pinterest_tag_event_data_t* pinterest_tag_event_data_1 = instantiate_pinterest_tag_event_data(include_optional);

	cJSON* jsonpinterest_tag_event_data_1 = pinterest_tag_event_data_convertToJSON(pinterest_tag_event_data_1);
	printf("pinterest_tag_event_data :\n%s\n", cJSON_Print(jsonpinterest_tag_event_data_1));
	pinterest_tag_event_data_t* pinterest_tag_event_data_2 = pinterest_tag_event_data_parseFromJSON(jsonpinterest_tag_event_data_1);
	cJSON* jsonpinterest_tag_event_data_2 = pinterest_tag_event_data_convertToJSON(pinterest_tag_event_data_2);
	printf("repeating pinterest_tag_event_data:\n%s\n", cJSON_Print(jsonpinterest_tag_event_data_2));
}

int main() {
  test_pinterest_tag_event_data(1);
  test_pinterest_tag_event_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // pinterest_tag_event_data_MAIN
#endif // pinterest_tag_event_data_TEST
