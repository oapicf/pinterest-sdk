#ifndef items_issues_list_200_response_TEST
#define items_issues_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define items_issues_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/items_issues_list_200_response.h"
items_issues_list_200_response_t* instantiate_items_issues_list_200_response(int include_optional);



items_issues_list_200_response_t* instantiate_items_issues_list_200_response(int include_optional) {
  items_issues_list_200_response_t* items_issues_list_200_response = NULL;
  if (include_optional) {
    items_issues_list_200_response = items_issues_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    items_issues_list_200_response = items_issues_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return items_issues_list_200_response;
}


#ifdef items_issues_list_200_response_MAIN

void test_items_issues_list_200_response(int include_optional) {
    items_issues_list_200_response_t* items_issues_list_200_response_1 = instantiate_items_issues_list_200_response(include_optional);

	cJSON* jsonitems_issues_list_200_response_1 = items_issues_list_200_response_convertToJSON(items_issues_list_200_response_1);
	printf("items_issues_list_200_response :\n%s\n", cJSON_Print(jsonitems_issues_list_200_response_1));
	items_issues_list_200_response_t* items_issues_list_200_response_2 = items_issues_list_200_response_parseFromJSON(jsonitems_issues_list_200_response_1);
	cJSON* jsonitems_issues_list_200_response_2 = items_issues_list_200_response_convertToJSON(items_issues_list_200_response_2);
	printf("repeating items_issues_list_200_response:\n%s\n", cJSON_Print(jsonitems_issues_list_200_response_2));
}

int main() {
  test_items_issues_list_200_response(1);
  test_items_issues_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // items_issues_list_200_response_MAIN
#endif // items_issues_list_200_response_TEST
