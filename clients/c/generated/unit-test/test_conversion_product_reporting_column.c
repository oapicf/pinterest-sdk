#ifndef conversion_product_reporting_column_TEST
#define conversion_product_reporting_column_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_product_reporting_column_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_product_reporting_column.h"
conversion_product_reporting_column_t* instantiate_conversion_product_reporting_column(int include_optional);



conversion_product_reporting_column_t* instantiate_conversion_product_reporting_column(int include_optional) {
  conversion_product_reporting_column_t* conversion_product_reporting_column = NULL;
  if (include_optional) {
    conversion_product_reporting_column = conversion_product_reporting_column_create(
    );
  } else {
    conversion_product_reporting_column = conversion_product_reporting_column_create(
    );
  }

  return conversion_product_reporting_column;
}


#ifdef conversion_product_reporting_column_MAIN

void test_conversion_product_reporting_column(int include_optional) {
    conversion_product_reporting_column_t* conversion_product_reporting_column_1 = instantiate_conversion_product_reporting_column(include_optional);

	cJSON* jsonconversion_product_reporting_column_1 = conversion_product_reporting_column_convertToJSON(conversion_product_reporting_column_1);
	printf("conversion_product_reporting_column :\n%s\n", cJSON_Print(jsonconversion_product_reporting_column_1));
	conversion_product_reporting_column_t* conversion_product_reporting_column_2 = conversion_product_reporting_column_parseFromJSON(jsonconversion_product_reporting_column_1);
	cJSON* jsonconversion_product_reporting_column_2 = conversion_product_reporting_column_convertToJSON(conversion_product_reporting_column_2);
	printf("repeating conversion_product_reporting_column:\n%s\n", cJSON_Print(jsonconversion_product_reporting_column_2));
}

int main() {
  test_conversion_product_reporting_column(1);
  test_conversion_product_reporting_column(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_product_reporting_column_MAIN
#endif // conversion_product_reporting_column_TEST
