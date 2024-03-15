#ifndef pacing_delivery_type_TEST
#define pacing_delivery_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pacing_delivery_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pacing_delivery_type.h"
pacing_delivery_type_t* instantiate_pacing_delivery_type(int include_optional);



pacing_delivery_type_t* instantiate_pacing_delivery_type(int include_optional) {
  pacing_delivery_type_t* pacing_delivery_type = NULL;
  if (include_optional) {
    pacing_delivery_type = pacing_delivery_type_create(
    );
  } else {
    pacing_delivery_type = pacing_delivery_type_create(
    );
  }

  return pacing_delivery_type;
}


#ifdef pacing_delivery_type_MAIN

void test_pacing_delivery_type(int include_optional) {
    pacing_delivery_type_t* pacing_delivery_type_1 = instantiate_pacing_delivery_type(include_optional);

	cJSON* jsonpacing_delivery_type_1 = pacing_delivery_type_convertToJSON(pacing_delivery_type_1);
	printf("pacing_delivery_type :\n%s\n", cJSON_Print(jsonpacing_delivery_type_1));
	pacing_delivery_type_t* pacing_delivery_type_2 = pacing_delivery_type_parseFromJSON(jsonpacing_delivery_type_1);
	cJSON* jsonpacing_delivery_type_2 = pacing_delivery_type_convertToJSON(pacing_delivery_type_2);
	printf("repeating pacing_delivery_type:\n%s\n", cJSON_Print(jsonpacing_delivery_type_2));
}

int main() {
  test_pacing_delivery_type(1);
  test_pacing_delivery_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // pacing_delivery_type_MAIN
#endif // pacing_delivery_type_TEST
