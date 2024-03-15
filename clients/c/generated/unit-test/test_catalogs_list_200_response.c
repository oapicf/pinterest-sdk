#ifndef catalogs_list_200_response_TEST
#define catalogs_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_list_200_response.h"
catalogs_list_200_response_t* instantiate_catalogs_list_200_response(int include_optional);



catalogs_list_200_response_t* instantiate_catalogs_list_200_response(int include_optional) {
  catalogs_list_200_response_t* catalogs_list_200_response = NULL;
  if (include_optional) {
    catalogs_list_200_response = catalogs_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    catalogs_list_200_response = catalogs_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return catalogs_list_200_response;
}


#ifdef catalogs_list_200_response_MAIN

void test_catalogs_list_200_response(int include_optional) {
    catalogs_list_200_response_t* catalogs_list_200_response_1 = instantiate_catalogs_list_200_response(include_optional);

	cJSON* jsoncatalogs_list_200_response_1 = catalogs_list_200_response_convertToJSON(catalogs_list_200_response_1);
	printf("catalogs_list_200_response :\n%s\n", cJSON_Print(jsoncatalogs_list_200_response_1));
	catalogs_list_200_response_t* catalogs_list_200_response_2 = catalogs_list_200_response_parseFromJSON(jsoncatalogs_list_200_response_1);
	cJSON* jsoncatalogs_list_200_response_2 = catalogs_list_200_response_convertToJSON(catalogs_list_200_response_2);
	printf("repeating catalogs_list_200_response:\n%s\n", cJSON_Print(jsoncatalogs_list_200_response_2));
}

int main() {
  test_catalogs_list_200_response(1);
  test_catalogs_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_list_200_response_MAIN
#endif // catalogs_list_200_response_TEST
