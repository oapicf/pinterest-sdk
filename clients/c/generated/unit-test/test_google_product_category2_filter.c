#ifndef google_product_category2_filter_TEST
#define google_product_category2_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define google_product_category2_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/google_product_category2_filter.h"
google_product_category2_filter_t* instantiate_google_product_category2_filter(int include_optional);



google_product_category2_filter_t* instantiate_google_product_category2_filter(int include_optional) {
  google_product_category2_filter_t* google_product_category2_filter = NULL;
  if (include_optional) {
    google_product_category2_filter = google_product_category2_filter_create(
      0
    );
  } else {
    google_product_category2_filter = google_product_category2_filter_create(
      0
    );
  }

  return google_product_category2_filter;
}


#ifdef google_product_category2_filter_MAIN

void test_google_product_category2_filter(int include_optional) {
    google_product_category2_filter_t* google_product_category2_filter_1 = instantiate_google_product_category2_filter(include_optional);

	cJSON* jsongoogle_product_category2_filter_1 = google_product_category2_filter_convertToJSON(google_product_category2_filter_1);
	printf("google_product_category2_filter :\n%s\n", cJSON_Print(jsongoogle_product_category2_filter_1));
	google_product_category2_filter_t* google_product_category2_filter_2 = google_product_category2_filter_parseFromJSON(jsongoogle_product_category2_filter_1);
	cJSON* jsongoogle_product_category2_filter_2 = google_product_category2_filter_convertToJSON(google_product_category2_filter_2);
	printf("repeating google_product_category2_filter:\n%s\n", cJSON_Print(jsongoogle_product_category2_filter_2));
}

int main() {
  test_google_product_category2_filter(1);
  test_google_product_category2_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // google_product_category2_filter_MAIN
#endif // google_product_category2_filter_TEST
