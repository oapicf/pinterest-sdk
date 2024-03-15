#ifndef targeting_type_filter_TEST
#define targeting_type_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_type_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_type_filter.h"
targeting_type_filter_t* instantiate_targeting_type_filter(int include_optional);



targeting_type_filter_t* instantiate_targeting_type_filter(int include_optional) {
  targeting_type_filter_t* targeting_type_filter = NULL;
  if (include_optional) {
    targeting_type_filter = targeting_type_filter_create(
      list_createList()
    );
  } else {
    targeting_type_filter = targeting_type_filter_create(
      list_createList()
    );
  }

  return targeting_type_filter;
}


#ifdef targeting_type_filter_MAIN

void test_targeting_type_filter(int include_optional) {
    targeting_type_filter_t* targeting_type_filter_1 = instantiate_targeting_type_filter(include_optional);

	cJSON* jsontargeting_type_filter_1 = targeting_type_filter_convertToJSON(targeting_type_filter_1);
	printf("targeting_type_filter :\n%s\n", cJSON_Print(jsontargeting_type_filter_1));
	targeting_type_filter_t* targeting_type_filter_2 = targeting_type_filter_parseFromJSON(jsontargeting_type_filter_1);
	cJSON* jsontargeting_type_filter_2 = targeting_type_filter_convertToJSON(targeting_type_filter_2);
	printf("repeating targeting_type_filter:\n%s\n", cJSON_Print(jsontargeting_type_filter_2));
}

int main() {
  test_targeting_type_filter(1);
  test_targeting_type_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_type_filter_MAIN
#endif // targeting_type_filter_TEST
