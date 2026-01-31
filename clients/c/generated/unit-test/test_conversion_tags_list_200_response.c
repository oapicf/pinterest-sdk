#ifndef conversion_tags_list_200_response_TEST
#define conversion_tags_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_tags_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_tags_list_200_response.h"
conversion_tags_list_200_response_t* instantiate_conversion_tags_list_200_response(int include_optional);



conversion_tags_list_200_response_t* instantiate_conversion_tags_list_200_response(int include_optional) {
  conversion_tags_list_200_response_t* conversion_tags_list_200_response = NULL;
  if (include_optional) {
    conversion_tags_list_200_response = conversion_tags_list_200_response_create(
      list_createList()
    );
  } else {
    conversion_tags_list_200_response = conversion_tags_list_200_response_create(
      list_createList()
    );
  }

  return conversion_tags_list_200_response;
}


#ifdef conversion_tags_list_200_response_MAIN

void test_conversion_tags_list_200_response(int include_optional) {
    conversion_tags_list_200_response_t* conversion_tags_list_200_response_1 = instantiate_conversion_tags_list_200_response(include_optional);

	cJSON* jsonconversion_tags_list_200_response_1 = conversion_tags_list_200_response_convertToJSON(conversion_tags_list_200_response_1);
	printf("conversion_tags_list_200_response :\n%s\n", cJSON_Print(jsonconversion_tags_list_200_response_1));
	conversion_tags_list_200_response_t* conversion_tags_list_200_response_2 = conversion_tags_list_200_response_parseFromJSON(jsonconversion_tags_list_200_response_1);
	cJSON* jsonconversion_tags_list_200_response_2 = conversion_tags_list_200_response_convertToJSON(conversion_tags_list_200_response_2);
	printf("repeating conversion_tags_list_200_response:\n%s\n", cJSON_Print(jsonconversion_tags_list_200_response_2));
}

int main() {
  test_conversion_tags_list_200_response(1);
  test_conversion_tags_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_tags_list_200_response_MAIN
#endif // conversion_tags_list_200_response_TEST
