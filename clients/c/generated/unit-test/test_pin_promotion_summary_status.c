#ifndef pin_promotion_summary_status_TEST
#define pin_promotion_summary_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_promotion_summary_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_promotion_summary_status.h"
pin_promotion_summary_status_t* instantiate_pin_promotion_summary_status(int include_optional);



pin_promotion_summary_status_t* instantiate_pin_promotion_summary_status(int include_optional) {
  pin_promotion_summary_status_t* pin_promotion_summary_status = NULL;
  if (include_optional) {
    pin_promotion_summary_status = pin_promotion_summary_status_create(
    );
  } else {
    pin_promotion_summary_status = pin_promotion_summary_status_create(
    );
  }

  return pin_promotion_summary_status;
}


#ifdef pin_promotion_summary_status_MAIN

void test_pin_promotion_summary_status(int include_optional) {
    pin_promotion_summary_status_t* pin_promotion_summary_status_1 = instantiate_pin_promotion_summary_status(include_optional);

	cJSON* jsonpin_promotion_summary_status_1 = pin_promotion_summary_status_convertToJSON(pin_promotion_summary_status_1);
	printf("pin_promotion_summary_status :\n%s\n", cJSON_Print(jsonpin_promotion_summary_status_1));
	pin_promotion_summary_status_t* pin_promotion_summary_status_2 = pin_promotion_summary_status_parseFromJSON(jsonpin_promotion_summary_status_1);
	cJSON* jsonpin_promotion_summary_status_2 = pin_promotion_summary_status_convertToJSON(pin_promotion_summary_status_2);
	printf("repeating pin_promotion_summary_status:\n%s\n", cJSON_Print(jsonpin_promotion_summary_status_2));
}

int main() {
  test_pin_promotion_summary_status(1);
  test_pin_promotion_summary_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_promotion_summary_status_MAIN
#endif // pin_promotion_summary_status_TEST
