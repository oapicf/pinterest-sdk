#ifndef trending_pin_TEST
#define trending_pin_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define trending_pin_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/trending_pin.h"
trending_pin_t* instantiate_trending_pin(int include_optional);



trending_pin_t* instantiate_trending_pin(int include_optional) {
  trending_pin_t* trending_pin = NULL;
  if (include_optional) {
    trending_pin = trending_pin_create(
      56,
      "0",
      "0",
      56
    );
  } else {
    trending_pin = trending_pin_create(
      56,
      "0",
      "0",
      56
    );
  }

  return trending_pin;
}


#ifdef trending_pin_MAIN

void test_trending_pin(int include_optional) {
    trending_pin_t* trending_pin_1 = instantiate_trending_pin(include_optional);

	cJSON* jsontrending_pin_1 = trending_pin_convertToJSON(trending_pin_1);
	printf("trending_pin :\n%s\n", cJSON_Print(jsontrending_pin_1));
	trending_pin_t* trending_pin_2 = trending_pin_parseFromJSON(jsontrending_pin_1);
	cJSON* jsontrending_pin_2 = trending_pin_convertToJSON(trending_pin_2);
	printf("repeating trending_pin:\n%s\n", cJSON_Print(jsontrending_pin_2));
}

int main() {
  test_trending_pin(1);
  test_trending_pin(0);

  printf("Hello world \n");
  return 0;
}

#endif // trending_pin_MAIN
#endif // trending_pin_TEST
