#ifndef conversion_product_report_request_TEST
#define conversion_product_report_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_product_report_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_product_report_request.h"
conversion_product_report_request_t* instantiate_conversion_product_report_request(int include_optional);



conversion_product_report_request_t* instantiate_conversion_product_report_request(int include_optional) {
  conversion_product_report_request_t* conversion_product_report_request = NULL;
  if (include_optional) {
    conversion_product_report_request = conversion_product_report_request_create(
      ["12345678"],
      ["12345678"],
      list_createList(),
      0,
      list_createList(),
      pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTATTRIBUTIONTYPE_DEFAULT,
      pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTBREAKDOWN_PRODUCT_BRAND,
      "TIME_OF_AD_ACTION",
      "2024-04-23",
      pinterest_rest_api_conversion_product_report_request_GRANULARITY_WEEK,
      pinterest_rest_api_conversion_product_report_request_LEVEL_ADVERTISER,
      ["WBC45678","WBC45679"],
      "0",
      "2024-03-17",
      0
    );
  } else {
    conversion_product_report_request = conversion_product_report_request_create(
      ["12345678"],
      ["12345678"],
      list_createList(),
      0,
      list_createList(),
      pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTATTRIBUTIONTYPE_DEFAULT,
      pinterest_rest_api_conversion_product_report_request_CONVERSIONPRODUCTBREAKDOWN_PRODUCT_BRAND,
      "TIME_OF_AD_ACTION",
      "2024-04-23",
      pinterest_rest_api_conversion_product_report_request_GRANULARITY_WEEK,
      pinterest_rest_api_conversion_product_report_request_LEVEL_ADVERTISER,
      ["WBC45678","WBC45679"],
      "0",
      "2024-03-17",
      0
    );
  }

  return conversion_product_report_request;
}


#ifdef conversion_product_report_request_MAIN

void test_conversion_product_report_request(int include_optional) {
    conversion_product_report_request_t* conversion_product_report_request_1 = instantiate_conversion_product_report_request(include_optional);

	cJSON* jsonconversion_product_report_request_1 = conversion_product_report_request_convertToJSON(conversion_product_report_request_1);
	printf("conversion_product_report_request :\n%s\n", cJSON_Print(jsonconversion_product_report_request_1));
	conversion_product_report_request_t* conversion_product_report_request_2 = conversion_product_report_request_parseFromJSON(jsonconversion_product_report_request_1);
	cJSON* jsonconversion_product_report_request_2 = conversion_product_report_request_convertToJSON(conversion_product_report_request_2);
	printf("repeating conversion_product_report_request:\n%s\n", cJSON_Print(jsonconversion_product_report_request_2));
}

int main() {
  test_conversion_product_report_request(1);
  test_conversion_product_report_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_product_report_request_MAIN
#endif // conversion_product_report_request_TEST
