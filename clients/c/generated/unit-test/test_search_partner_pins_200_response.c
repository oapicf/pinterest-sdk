#ifndef search_partner_pins_200_response_TEST
#define search_partner_pins_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define search_partner_pins_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/search_partner_pins_200_response.h"
search_partner_pins_200_response_t* instantiate_search_partner_pins_200_response(int include_optional);



search_partner_pins_200_response_t* instantiate_search_partner_pins_200_response(int include_optional) {
  search_partner_pins_200_response_t* search_partner_pins_200_response = NULL;
  if (include_optional) {
    search_partner_pins_200_response = search_partner_pins_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    search_partner_pins_200_response = search_partner_pins_200_response_create(
      list_createList(),
      "0"
    );
  }

  return search_partner_pins_200_response;
}


#ifdef search_partner_pins_200_response_MAIN

void test_search_partner_pins_200_response(int include_optional) {
    search_partner_pins_200_response_t* search_partner_pins_200_response_1 = instantiate_search_partner_pins_200_response(include_optional);

	cJSON* jsonsearch_partner_pins_200_response_1 = search_partner_pins_200_response_convertToJSON(search_partner_pins_200_response_1);
	printf("search_partner_pins_200_response :\n%s\n", cJSON_Print(jsonsearch_partner_pins_200_response_1));
	search_partner_pins_200_response_t* search_partner_pins_200_response_2 = search_partner_pins_200_response_parseFromJSON(jsonsearch_partner_pins_200_response_1);
	cJSON* jsonsearch_partner_pins_200_response_2 = search_partner_pins_200_response_convertToJSON(search_partner_pins_200_response_2);
	printf("repeating search_partner_pins_200_response:\n%s\n", cJSON_Print(jsonsearch_partner_pins_200_response_2));
}

int main() {
  test_search_partner_pins_200_response(1);
  test_search_partner_pins_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // search_partner_pins_200_response_MAIN
#endif // search_partner_pins_200_response_TEST
