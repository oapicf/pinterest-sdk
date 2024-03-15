#ifndef targeting_spec_TEST
#define targeting_spec_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_spec_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_spec.h"
targeting_spec_t* instantiate_targeting_spec(int include_optional);



targeting_spec_t* instantiate_targeting_spec(int include_optional) {
  targeting_spec_t* targeting_spec = NULL;
  if (include_optional) {
    targeting_spec = targeting_spec_create(
      ["35-44","50-54"],
      ["ipad","iphone"],
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    targeting_spec = targeting_spec_create(
      ["35-44","50-54"],
      ["ipad","iphone"],
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return targeting_spec;
}


#ifdef targeting_spec_MAIN

void test_targeting_spec(int include_optional) {
    targeting_spec_t* targeting_spec_1 = instantiate_targeting_spec(include_optional);

	cJSON* jsontargeting_spec_1 = targeting_spec_convertToJSON(targeting_spec_1);
	printf("targeting_spec :\n%s\n", cJSON_Print(jsontargeting_spec_1));
	targeting_spec_t* targeting_spec_2 = targeting_spec_parseFromJSON(jsontargeting_spec_1);
	cJSON* jsontargeting_spec_2 = targeting_spec_convertToJSON(targeting_spec_2);
	printf("repeating targeting_spec:\n%s\n", cJSON_Print(jsontargeting_spec_2));
}

int main() {
  test_targeting_spec(1);
  test_targeting_spec(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_spec_MAIN
#endif // targeting_spec_TEST
