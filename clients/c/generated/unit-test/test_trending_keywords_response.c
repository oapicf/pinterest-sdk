#ifndef trending_keywords_response_TEST
#define trending_keywords_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define trending_keywords_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/trending_keywords_response.h"
trending_keywords_response_t* instantiate_trending_keywords_response(int include_optional);



trending_keywords_response_t* instantiate_trending_keywords_response(int include_optional) {
  trending_keywords_response_t* trending_keywords_response = NULL;
  if (include_optional) {
    trending_keywords_response = trending_keywords_response_create(
      list_createList()
    );
  } else {
    trending_keywords_response = trending_keywords_response_create(
      list_createList()
    );
  }

  return trending_keywords_response;
}


#ifdef trending_keywords_response_MAIN

void test_trending_keywords_response(int include_optional) {
    trending_keywords_response_t* trending_keywords_response_1 = instantiate_trending_keywords_response(include_optional);

	cJSON* jsontrending_keywords_response_1 = trending_keywords_response_convertToJSON(trending_keywords_response_1);
	printf("trending_keywords_response :\n%s\n", cJSON_Print(jsontrending_keywords_response_1));
	trending_keywords_response_t* trending_keywords_response_2 = trending_keywords_response_parseFromJSON(jsontrending_keywords_response_1);
	cJSON* jsontrending_keywords_response_2 = trending_keywords_response_convertToJSON(trending_keywords_response_2);
	printf("repeating trending_keywords_response:\n%s\n", cJSON_Print(jsontrending_keywords_response_2));
}

int main() {
  test_trending_keywords_response(1);
  test_trending_keywords_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // trending_keywords_response_MAIN
#endif // trending_keywords_response_TEST
