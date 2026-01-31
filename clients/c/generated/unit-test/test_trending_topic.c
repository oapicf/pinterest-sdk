#ifndef trending_topic_TEST
#define trending_topic_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define trending_topic_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/trending_topic.h"
trending_topic_t* instantiate_trending_topic(int include_optional);



trending_topic_t* instantiate_trending_topic(int include_optional) {
  trending_topic_t* trending_topic = NULL;
  if (include_optional) {
    trending_topic = trending_topic_create(
      "0",
      56,
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      "0"
    );
  } else {
    trending_topic = trending_topic_create(
      "0",
      56,
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      "0"
    );
  }

  return trending_topic;
}


#ifdef trending_topic_MAIN

void test_trending_topic(int include_optional) {
    trending_topic_t* trending_topic_1 = instantiate_trending_topic(include_optional);

	cJSON* jsontrending_topic_1 = trending_topic_convertToJSON(trending_topic_1);
	printf("trending_topic :\n%s\n", cJSON_Print(jsontrending_topic_1));
	trending_topic_t* trending_topic_2 = trending_topic_parseFromJSON(jsontrending_topic_1);
	cJSON* jsontrending_topic_2 = trending_topic_convertToJSON(trending_topic_2);
	printf("repeating trending_topic:\n%s\n", cJSON_Print(jsontrending_topic_2));
}

int main() {
  test_trending_topic(1);
  test_trending_topic(0);

  printf("Hello world \n");
  return 0;
}

#endif // trending_topic_MAIN
#endif // trending_topic_TEST
