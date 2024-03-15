#ifndef trending_keywords_response_trends_inner_TEST
#define trending_keywords_response_trends_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define trending_keywords_response_trends_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/trending_keywords_response_trends_inner.h"
trending_keywords_response_trends_inner_t* instantiate_trending_keywords_response_trends_inner(int include_optional);



trending_keywords_response_trends_inner_t* instantiate_trending_keywords_response_trends_inner(int include_optional) {
  trending_keywords_response_trends_inner_t* trending_keywords_response_trends_inner = NULL;
  if (include_optional) {
    trending_keywords_response_trends_inner = trending_keywords_response_trends_inner_create(
      "couples halloween costumes",
      50,
      400,
      -5,
      {"2023-10-10":31,"2023-10-17":54,"2023-10-24":77,"2023-10-31":100}
    );
  } else {
    trending_keywords_response_trends_inner = trending_keywords_response_trends_inner_create(
      "couples halloween costumes",
      50,
      400,
      -5,
      {"2023-10-10":31,"2023-10-17":54,"2023-10-24":77,"2023-10-31":100}
    );
  }

  return trending_keywords_response_trends_inner;
}


#ifdef trending_keywords_response_trends_inner_MAIN

void test_trending_keywords_response_trends_inner(int include_optional) {
    trending_keywords_response_trends_inner_t* trending_keywords_response_trends_inner_1 = instantiate_trending_keywords_response_trends_inner(include_optional);

	cJSON* jsontrending_keywords_response_trends_inner_1 = trending_keywords_response_trends_inner_convertToJSON(trending_keywords_response_trends_inner_1);
	printf("trending_keywords_response_trends_inner :\n%s\n", cJSON_Print(jsontrending_keywords_response_trends_inner_1));
	trending_keywords_response_trends_inner_t* trending_keywords_response_trends_inner_2 = trending_keywords_response_trends_inner_parseFromJSON(jsontrending_keywords_response_trends_inner_1);
	cJSON* jsontrending_keywords_response_trends_inner_2 = trending_keywords_response_trends_inner_convertToJSON(trending_keywords_response_trends_inner_2);
	printf("repeating trending_keywords_response_trends_inner:\n%s\n", cJSON_Print(jsontrending_keywords_response_trends_inner_2));
}

int main() {
  test_trending_keywords_response_trends_inner(1);
  test_trending_keywords_response_trends_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // trending_keywords_response_trends_inner_MAIN
#endif // trending_keywords_response_trends_inner_TEST
