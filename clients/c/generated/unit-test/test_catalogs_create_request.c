#ifndef catalogs_create_request_TEST
#define catalogs_create_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_create_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_create_request.h"
catalogs_create_request_t* instantiate_catalogs_create_request(int include_optional);



catalogs_create_request_t* instantiate_catalogs_create_request(int include_optional) {
  catalogs_create_request_t* catalogs_create_request = NULL;
  if (include_optional) {
    catalogs_create_request = catalogs_create_request_create(
      pinterest_rest_api_catalogs_create_request_CATALOGTYPE_HOTEL,
      "0"
    );
  } else {
    catalogs_create_request = catalogs_create_request_create(
      pinterest_rest_api_catalogs_create_request_CATALOGTYPE_HOTEL,
      "0"
    );
  }

  return catalogs_create_request;
}


#ifdef catalogs_create_request_MAIN

void test_catalogs_create_request(int include_optional) {
    catalogs_create_request_t* catalogs_create_request_1 = instantiate_catalogs_create_request(include_optional);

	cJSON* jsoncatalogs_create_request_1 = catalogs_create_request_convertToJSON(catalogs_create_request_1);
	printf("catalogs_create_request :\n%s\n", cJSON_Print(jsoncatalogs_create_request_1));
	catalogs_create_request_t* catalogs_create_request_2 = catalogs_create_request_parseFromJSON(jsoncatalogs_create_request_1);
	cJSON* jsoncatalogs_create_request_2 = catalogs_create_request_convertToJSON(catalogs_create_request_2);
	printf("repeating catalogs_create_request:\n%s\n", cJSON_Print(jsoncatalogs_create_request_2));
}

int main() {
  test_catalogs_create_request(1);
  test_catalogs_create_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_create_request_MAIN
#endif // catalogs_create_request_TEST
