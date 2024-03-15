#ifndef catalogs_product_groups_list_200_response_TEST
#define catalogs_product_groups_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_product_groups_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_product_groups_list_200_response.h"
catalogs_product_groups_list_200_response_t* instantiate_catalogs_product_groups_list_200_response(int include_optional);



catalogs_product_groups_list_200_response_t* instantiate_catalogs_product_groups_list_200_response(int include_optional) {
  catalogs_product_groups_list_200_response_t* catalogs_product_groups_list_200_response = NULL;
  if (include_optional) {
    catalogs_product_groups_list_200_response = catalogs_product_groups_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    catalogs_product_groups_list_200_response = catalogs_product_groups_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return catalogs_product_groups_list_200_response;
}


#ifdef catalogs_product_groups_list_200_response_MAIN

void test_catalogs_product_groups_list_200_response(int include_optional) {
    catalogs_product_groups_list_200_response_t* catalogs_product_groups_list_200_response_1 = instantiate_catalogs_product_groups_list_200_response(include_optional);

	cJSON* jsoncatalogs_product_groups_list_200_response_1 = catalogs_product_groups_list_200_response_convertToJSON(catalogs_product_groups_list_200_response_1);
	printf("catalogs_product_groups_list_200_response :\n%s\n", cJSON_Print(jsoncatalogs_product_groups_list_200_response_1));
	catalogs_product_groups_list_200_response_t* catalogs_product_groups_list_200_response_2 = catalogs_product_groups_list_200_response_parseFromJSON(jsoncatalogs_product_groups_list_200_response_1);
	cJSON* jsoncatalogs_product_groups_list_200_response_2 = catalogs_product_groups_list_200_response_convertToJSON(catalogs_product_groups_list_200_response_2);
	printf("repeating catalogs_product_groups_list_200_response:\n%s\n", cJSON_Print(jsoncatalogs_product_groups_list_200_response_2));
}

int main() {
  test_catalogs_product_groups_list_200_response(1);
  test_catalogs_product_groups_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_product_groups_list_200_response_MAIN
#endif // catalogs_product_groups_list_200_response_TEST
