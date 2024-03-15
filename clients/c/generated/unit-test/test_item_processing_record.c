#ifndef item_processing_record_TEST
#define item_processing_record_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_processing_record_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_processing_record.h"
item_processing_record_t* instantiate_item_processing_record(int include_optional);



item_processing_record_t* instantiate_item_processing_record(int include_optional) {
  item_processing_record_t* item_processing_record = NULL;
  if (include_optional) {
    item_processing_record = item_processing_record_create(
      "DS0294-M",
      list_createList(),
      list_createList(),
      pinterest_rest_api_item_processing_record__"SUCCESS"
    );
  } else {
    item_processing_record = item_processing_record_create(
      "DS0294-M",
      list_createList(),
      list_createList(),
      pinterest_rest_api_item_processing_record__"SUCCESS"
    );
  }

  return item_processing_record;
}


#ifdef item_processing_record_MAIN

void test_item_processing_record(int include_optional) {
    item_processing_record_t* item_processing_record_1 = instantiate_item_processing_record(include_optional);

	cJSON* jsonitem_processing_record_1 = item_processing_record_convertToJSON(item_processing_record_1);
	printf("item_processing_record :\n%s\n", cJSON_Print(jsonitem_processing_record_1));
	item_processing_record_t* item_processing_record_2 = item_processing_record_parseFromJSON(jsonitem_processing_record_1);
	cJSON* jsonitem_processing_record_2 = item_processing_record_convertToJSON(item_processing_record_2);
	printf("repeating item_processing_record:\n%s\n", cJSON_Print(jsonitem_processing_record_2));
}

int main() {
  test_item_processing_record(1);
  test_item_processing_record(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_processing_record_MAIN
#endif // item_processing_record_TEST
