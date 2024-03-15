#ifndef item_id_filter_TEST
#define item_id_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_id_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_id_filter.h"
item_id_filter_t* instantiate_item_id_filter(int include_optional);



item_id_filter_t* instantiate_item_id_filter(int include_optional) {
  item_id_filter_t* item_id_filter = NULL;
  if (include_optional) {
    item_id_filter = item_id_filter_create(
      0
    );
  } else {
    item_id_filter = item_id_filter_create(
      0
    );
  }

  return item_id_filter;
}


#ifdef item_id_filter_MAIN

void test_item_id_filter(int include_optional) {
    item_id_filter_t* item_id_filter_1 = instantiate_item_id_filter(include_optional);

	cJSON* jsonitem_id_filter_1 = item_id_filter_convertToJSON(item_id_filter_1);
	printf("item_id_filter :\n%s\n", cJSON_Print(jsonitem_id_filter_1));
	item_id_filter_t* item_id_filter_2 = item_id_filter_parseFromJSON(jsonitem_id_filter_1);
	cJSON* jsonitem_id_filter_2 = item_id_filter_convertToJSON(item_id_filter_2);
	printf("repeating item_id_filter:\n%s\n", cJSON_Print(jsonitem_id_filter_2));
}

int main() {
  test_item_id_filter(1);
  test_item_id_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_id_filter_MAIN
#endif // item_id_filter_TEST
