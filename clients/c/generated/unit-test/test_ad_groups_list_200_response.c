#ifndef ad_groups_list_200_response_TEST
#define ad_groups_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_groups_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_groups_list_200_response.h"
ad_groups_list_200_response_t* instantiate_ad_groups_list_200_response(int include_optional);



ad_groups_list_200_response_t* instantiate_ad_groups_list_200_response(int include_optional) {
  ad_groups_list_200_response_t* ad_groups_list_200_response = NULL;
  if (include_optional) {
    ad_groups_list_200_response = ad_groups_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    ad_groups_list_200_response = ad_groups_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return ad_groups_list_200_response;
}


#ifdef ad_groups_list_200_response_MAIN

void test_ad_groups_list_200_response(int include_optional) {
    ad_groups_list_200_response_t* ad_groups_list_200_response_1 = instantiate_ad_groups_list_200_response(include_optional);

	cJSON* jsonad_groups_list_200_response_1 = ad_groups_list_200_response_convertToJSON(ad_groups_list_200_response_1);
	printf("ad_groups_list_200_response :\n%s\n", cJSON_Print(jsonad_groups_list_200_response_1));
	ad_groups_list_200_response_t* ad_groups_list_200_response_2 = ad_groups_list_200_response_parseFromJSON(jsonad_groups_list_200_response_1);
	cJSON* jsonad_groups_list_200_response_2 = ad_groups_list_200_response_convertToJSON(ad_groups_list_200_response_2);
	printf("repeating ad_groups_list_200_response:\n%s\n", cJSON_Print(jsonad_groups_list_200_response_2));
}

int main() {
  test_ad_groups_list_200_response(1);
  test_ad_groups_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_groups_list_200_response_MAIN
#endif // ad_groups_list_200_response_TEST
