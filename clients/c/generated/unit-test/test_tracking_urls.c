#ifndef tracking_urls_TEST
#define tracking_urls_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define tracking_urls_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/tracking_urls.h"
tracking_urls_t* instantiate_tracking_urls(int include_optional);



tracking_urls_t* instantiate_tracking_urls(int include_optional) {
  tracking_urls_t* tracking_urls = NULL;
  if (include_optional) {
    tracking_urls = tracking_urls_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    tracking_urls = tracking_urls_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return tracking_urls;
}


#ifdef tracking_urls_MAIN

void test_tracking_urls(int include_optional) {
    tracking_urls_t* tracking_urls_1 = instantiate_tracking_urls(include_optional);

	cJSON* jsontracking_urls_1 = tracking_urls_convertToJSON(tracking_urls_1);
	printf("tracking_urls :\n%s\n", cJSON_Print(jsontracking_urls_1));
	tracking_urls_t* tracking_urls_2 = tracking_urls_parseFromJSON(jsontracking_urls_1);
	cJSON* jsontracking_urls_2 = tracking_urls_convertToJSON(tracking_urls_2);
	printf("repeating tracking_urls:\n%s\n", cJSON_Print(jsontracking_urls_2));
}

int main() {
  test_tracking_urls(1);
  test_tracking_urls(0);

  printf("Hello world \n");
  return 0;
}

#endif // tracking_urls_MAIN
#endif // tracking_urls_TEST
