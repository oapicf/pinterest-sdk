#ifndef featured_trend_TEST
#define featured_trend_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define featured_trend_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/featured_trend.h"
featured_trend_t* instantiate_featured_trend(int include_optional);



featured_trend_t* instantiate_featured_trend(int include_optional) {
  featured_trend_t* featured_trend = NULL;
  if (include_optional) {
    featured_trend = featured_trend_create(
      ALL,
      US,
      list_createList()
    );
  } else {
    featured_trend = featured_trend_create(
      ALL,
      US,
      list_createList()
    );
  }

  return featured_trend;
}


#ifdef featured_trend_MAIN

void test_featured_trend(int include_optional) {
    featured_trend_t* featured_trend_1 = instantiate_featured_trend(include_optional);

	cJSON* jsonfeatured_trend_1 = featured_trend_convertToJSON(featured_trend_1);
	printf("featured_trend :\n%s\n", cJSON_Print(jsonfeatured_trend_1));
	featured_trend_t* featured_trend_2 = featured_trend_parseFromJSON(jsonfeatured_trend_1);
	cJSON* jsonfeatured_trend_2 = featured_trend_convertToJSON(featured_trend_2);
	printf("repeating featured_trend:\n%s\n", cJSON_Print(jsonfeatured_trend_2));
}

int main() {
  test_featured_trend(1);
  test_featured_trend(0);

  printf("Hello world \n");
  return 0;
}

#endif // featured_trend_MAIN
#endif // featured_trend_TEST
