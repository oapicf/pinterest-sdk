#ifndef paginated_TEST
#define paginated_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define paginated_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/paginated.h"
paginated_t* instantiate_paginated(int include_optional);



paginated_t* instantiate_paginated(int include_optional) {
  paginated_t* paginated = NULL;
  if (include_optional) {
    paginated = paginated_create(
      list_createList(),
      "0"
    );
  } else {
    paginated = paginated_create(
      list_createList(),
      "0"
    );
  }

  return paginated;
}


#ifdef paginated_MAIN

void test_paginated(int include_optional) {
    paginated_t* paginated_1 = instantiate_paginated(include_optional);

	cJSON* jsonpaginated_1 = paginated_convertToJSON(paginated_1);
	printf("paginated :\n%s\n", cJSON_Print(jsonpaginated_1));
	paginated_t* paginated_2 = paginated_parseFromJSON(jsonpaginated_1);
	cJSON* jsonpaginated_2 = paginated_convertToJSON(paginated_2);
	printf("repeating paginated:\n%s\n", cJSON_Print(jsonpaginated_2));
}

int main() {
  test_paginated(1);
  test_paginated(0);

  printf("Hello world \n");
  return 0;
}

#endif // paginated_MAIN
#endif // paginated_TEST
