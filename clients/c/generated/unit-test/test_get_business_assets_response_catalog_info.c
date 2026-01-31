#ifndef get_business_assets_response_catalog_info_TEST
#define get_business_assets_response_catalog_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_business_assets_response_catalog_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_business_assets_response_catalog_info.h"
get_business_assets_response_catalog_info_t* instantiate_get_business_assets_response_catalog_info(int include_optional);



get_business_assets_response_catalog_info_t* instantiate_get_business_assets_response_catalog_info(int include_optional) {
  get_business_assets_response_catalog_info_t* get_business_assets_response_catalog_info = NULL;
  if (include_optional) {
    get_business_assets_response_catalog_info = get_business_assets_response_catalog_info_create(
      "PRODUCT",
      "4836859046874",
      "Canada Catalog"
    );
  } else {
    get_business_assets_response_catalog_info = get_business_assets_response_catalog_info_create(
      "PRODUCT",
      "4836859046874",
      "Canada Catalog"
    );
  }

  return get_business_assets_response_catalog_info;
}


#ifdef get_business_assets_response_catalog_info_MAIN

void test_get_business_assets_response_catalog_info(int include_optional) {
    get_business_assets_response_catalog_info_t* get_business_assets_response_catalog_info_1 = instantiate_get_business_assets_response_catalog_info(include_optional);

	cJSON* jsonget_business_assets_response_catalog_info_1 = get_business_assets_response_catalog_info_convertToJSON(get_business_assets_response_catalog_info_1);
	printf("get_business_assets_response_catalog_info :\n%s\n", cJSON_Print(jsonget_business_assets_response_catalog_info_1));
	get_business_assets_response_catalog_info_t* get_business_assets_response_catalog_info_2 = get_business_assets_response_catalog_info_parseFromJSON(jsonget_business_assets_response_catalog_info_1);
	cJSON* jsonget_business_assets_response_catalog_info_2 = get_business_assets_response_catalog_info_convertToJSON(get_business_assets_response_catalog_info_2);
	printf("repeating get_business_assets_response_catalog_info:\n%s\n", cJSON_Print(jsonget_business_assets_response_catalog_info_2));
}

int main() {
  test_get_business_assets_response_catalog_info(1);
  test_get_business_assets_response_catalog_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_business_assets_response_catalog_info_MAIN
#endif // get_business_assets_response_catalog_info_TEST
