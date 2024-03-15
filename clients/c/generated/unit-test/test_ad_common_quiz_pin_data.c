#ifndef ad_common_quiz_pin_data_TEST
#define ad_common_quiz_pin_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_common_quiz_pin_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_common_quiz_pin_data.h"
ad_common_quiz_pin_data_t* instantiate_ad_common_quiz_pin_data(int include_optional);



ad_common_quiz_pin_data_t* instantiate_ad_common_quiz_pin_data(int include_optional) {
  ad_common_quiz_pin_data_t* ad_common_quiz_pin_data = NULL;
  if (include_optional) {
    ad_common_quiz_pin_data = ad_common_quiz_pin_data_create(
      list_createList(),
      list_createList()
    );
  } else {
    ad_common_quiz_pin_data = ad_common_quiz_pin_data_create(
      list_createList(),
      list_createList()
    );
  }

  return ad_common_quiz_pin_data;
}


#ifdef ad_common_quiz_pin_data_MAIN

void test_ad_common_quiz_pin_data(int include_optional) {
    ad_common_quiz_pin_data_t* ad_common_quiz_pin_data_1 = instantiate_ad_common_quiz_pin_data(include_optional);

	cJSON* jsonad_common_quiz_pin_data_1 = ad_common_quiz_pin_data_convertToJSON(ad_common_quiz_pin_data_1);
	printf("ad_common_quiz_pin_data :\n%s\n", cJSON_Print(jsonad_common_quiz_pin_data_1));
	ad_common_quiz_pin_data_t* ad_common_quiz_pin_data_2 = ad_common_quiz_pin_data_parseFromJSON(jsonad_common_quiz_pin_data_1);
	cJSON* jsonad_common_quiz_pin_data_2 = ad_common_quiz_pin_data_convertToJSON(ad_common_quiz_pin_data_2);
	printf("repeating ad_common_quiz_pin_data:\n%s\n", cJSON_Print(jsonad_common_quiz_pin_data_2));
}

int main() {
  test_ad_common_quiz_pin_data(1);
  test_ad_common_quiz_pin_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_common_quiz_pin_data_MAIN
#endif // ad_common_quiz_pin_data_TEST
