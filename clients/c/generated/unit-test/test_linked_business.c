#ifndef linked_business_TEST
#define linked_business_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define linked_business_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/linked_business.h"
linked_business_t* instantiate_linked_business(int include_optional);



linked_business_t* instantiate_linked_business(int include_optional) {
  linked_business_t* linked_business = NULL;
  if (include_optional) {
    linked_business = linked_business_create(
      "username",
      "https://www.example.com/dj23454f53dfk2324.jpg",
      "https://www.example.com/dj23454f53dfk2324.jpg",
      "https://www.example.com/dj23454f53dfk2324.jpg",
      "https://www.example.com/dj23454f53dfk2324.jpg"
    );
  } else {
    linked_business = linked_business_create(
      "username",
      "https://www.example.com/dj23454f53dfk2324.jpg",
      "https://www.example.com/dj23454f53dfk2324.jpg",
      "https://www.example.com/dj23454f53dfk2324.jpg",
      "https://www.example.com/dj23454f53dfk2324.jpg"
    );
  }

  return linked_business;
}


#ifdef linked_business_MAIN

void test_linked_business(int include_optional) {
    linked_business_t* linked_business_1 = instantiate_linked_business(include_optional);

	cJSON* jsonlinked_business_1 = linked_business_convertToJSON(linked_business_1);
	printf("linked_business :\n%s\n", cJSON_Print(jsonlinked_business_1));
	linked_business_t* linked_business_2 = linked_business_parseFromJSON(jsonlinked_business_1);
	cJSON* jsonlinked_business_2 = linked_business_convertToJSON(linked_business_2);
	printf("repeating linked_business:\n%s\n", cJSON_Print(jsonlinked_business_2));
}

int main() {
  test_linked_business(1);
  test_linked_business(0);

  printf("Hello world \n");
  return 0;
}

#endif // linked_business_MAIN
#endif // linked_business_TEST
