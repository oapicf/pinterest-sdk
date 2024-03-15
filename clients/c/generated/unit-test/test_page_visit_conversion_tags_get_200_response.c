#ifndef page_visit_conversion_tags_get_200_response_TEST
#define page_visit_conversion_tags_get_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define page_visit_conversion_tags_get_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/page_visit_conversion_tags_get_200_response.h"
page_visit_conversion_tags_get_200_response_t* instantiate_page_visit_conversion_tags_get_200_response(int include_optional);



page_visit_conversion_tags_get_200_response_t* instantiate_page_visit_conversion_tags_get_200_response(int include_optional) {
  page_visit_conversion_tags_get_200_response_t* page_visit_conversion_tags_get_200_response = NULL;
  if (include_optional) {
    page_visit_conversion_tags_get_200_response = page_visit_conversion_tags_get_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    page_visit_conversion_tags_get_200_response = page_visit_conversion_tags_get_200_response_create(
      list_createList(),
      "0"
    );
  }

  return page_visit_conversion_tags_get_200_response;
}


#ifdef page_visit_conversion_tags_get_200_response_MAIN

void test_page_visit_conversion_tags_get_200_response(int include_optional) {
    page_visit_conversion_tags_get_200_response_t* page_visit_conversion_tags_get_200_response_1 = instantiate_page_visit_conversion_tags_get_200_response(include_optional);

	cJSON* jsonpage_visit_conversion_tags_get_200_response_1 = page_visit_conversion_tags_get_200_response_convertToJSON(page_visit_conversion_tags_get_200_response_1);
	printf("page_visit_conversion_tags_get_200_response :\n%s\n", cJSON_Print(jsonpage_visit_conversion_tags_get_200_response_1));
	page_visit_conversion_tags_get_200_response_t* page_visit_conversion_tags_get_200_response_2 = page_visit_conversion_tags_get_200_response_parseFromJSON(jsonpage_visit_conversion_tags_get_200_response_1);
	cJSON* jsonpage_visit_conversion_tags_get_200_response_2 = page_visit_conversion_tags_get_200_response_convertToJSON(page_visit_conversion_tags_get_200_response_2);
	printf("repeating page_visit_conversion_tags_get_200_response:\n%s\n", cJSON_Print(jsonpage_visit_conversion_tags_get_200_response_2));
}

int main() {
  test_page_visit_conversion_tags_get_200_response(1);
  test_page_visit_conversion_tags_get_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // page_visit_conversion_tags_get_200_response_MAIN
#endif // page_visit_conversion_tags_get_200_response_TEST
