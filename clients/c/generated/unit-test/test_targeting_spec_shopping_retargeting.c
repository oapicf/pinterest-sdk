#ifndef targeting_spec_shopping_retargeting_TEST
#define targeting_spec_shopping_retargeting_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_spec_shopping_retargeting_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_spec_shopping_retargeting.h"
targeting_spec_shopping_retargeting_t* instantiate_targeting_spec_shopping_retargeting(int include_optional);



targeting_spec_shopping_retargeting_t* instantiate_targeting_spec_shopping_retargeting(int include_optional) {
  targeting_spec_shopping_retargeting_t* targeting_spec_shopping_retargeting = NULL;
  if (include_optional) {
    targeting_spec_shopping_retargeting = targeting_spec_shopping_retargeting_create(
      30,
      [0,6],
      14
    );
  } else {
    targeting_spec_shopping_retargeting = targeting_spec_shopping_retargeting_create(
      30,
      [0,6],
      14
    );
  }

  return targeting_spec_shopping_retargeting;
}


#ifdef targeting_spec_shopping_retargeting_MAIN

void test_targeting_spec_shopping_retargeting(int include_optional) {
    targeting_spec_shopping_retargeting_t* targeting_spec_shopping_retargeting_1 = instantiate_targeting_spec_shopping_retargeting(include_optional);

	cJSON* jsontargeting_spec_shopping_retargeting_1 = targeting_spec_shopping_retargeting_convertToJSON(targeting_spec_shopping_retargeting_1);
	printf("targeting_spec_shopping_retargeting :\n%s\n", cJSON_Print(jsontargeting_spec_shopping_retargeting_1));
	targeting_spec_shopping_retargeting_t* targeting_spec_shopping_retargeting_2 = targeting_spec_shopping_retargeting_parseFromJSON(jsontargeting_spec_shopping_retargeting_1);
	cJSON* jsontargeting_spec_shopping_retargeting_2 = targeting_spec_shopping_retargeting_convertToJSON(targeting_spec_shopping_retargeting_2);
	printf("repeating targeting_spec_shopping_retargeting:\n%s\n", cJSON_Print(jsontargeting_spec_shopping_retargeting_2));
}

int main() {
  test_targeting_spec_shopping_retargeting(1);
  test_targeting_spec_shopping_retargeting(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_spec_shopping_retargeting_MAIN
#endif // targeting_spec_shopping_retargeting_TEST
