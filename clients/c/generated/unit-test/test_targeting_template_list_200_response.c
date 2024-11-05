#ifndef targeting_template_list_200_response_TEST
#define targeting_template_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_template_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_template_list_200_response.h"
targeting_template_list_200_response_t* instantiate_targeting_template_list_200_response(int include_optional);



targeting_template_list_200_response_t* instantiate_targeting_template_list_200_response(int include_optional) {
  targeting_template_list_200_response_t* targeting_template_list_200_response = NULL;
  if (include_optional) {
    targeting_template_list_200_response = targeting_template_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    targeting_template_list_200_response = targeting_template_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return targeting_template_list_200_response;
}


#ifdef targeting_template_list_200_response_MAIN

void test_targeting_template_list_200_response(int include_optional) {
    targeting_template_list_200_response_t* targeting_template_list_200_response_1 = instantiate_targeting_template_list_200_response(include_optional);

	cJSON* jsontargeting_template_list_200_response_1 = targeting_template_list_200_response_convertToJSON(targeting_template_list_200_response_1);
	printf("targeting_template_list_200_response :\n%s\n", cJSON_Print(jsontargeting_template_list_200_response_1));
	targeting_template_list_200_response_t* targeting_template_list_200_response_2 = targeting_template_list_200_response_parseFromJSON(jsontargeting_template_list_200_response_1);
	cJSON* jsontargeting_template_list_200_response_2 = targeting_template_list_200_response_convertToJSON(targeting_template_list_200_response_2);
	printf("repeating targeting_template_list_200_response:\n%s\n", cJSON_Print(jsontargeting_template_list_200_response_2));
}

int main() {
  test_targeting_template_list_200_response(1);
  test_targeting_template_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_template_list_200_response_MAIN
#endif // targeting_template_list_200_response_TEST
