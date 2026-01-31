#ifndef title_keywords_filter_TEST
#define title_keywords_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define title_keywords_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/title_keywords_filter.h"
title_keywords_filter_t* instantiate_title_keywords_filter(int include_optional);



title_keywords_filter_t* instantiate_title_keywords_filter(int include_optional) {
  title_keywords_filter_t* title_keywords_filter = NULL;
  if (include_optional) {
    title_keywords_filter = title_keywords_filter_create(
      0
    );
  } else {
    title_keywords_filter = title_keywords_filter_create(
      0
    );
  }

  return title_keywords_filter;
}


#ifdef title_keywords_filter_MAIN

void test_title_keywords_filter(int include_optional) {
    title_keywords_filter_t* title_keywords_filter_1 = instantiate_title_keywords_filter(include_optional);

	cJSON* jsontitle_keywords_filter_1 = title_keywords_filter_convertToJSON(title_keywords_filter_1);
	printf("title_keywords_filter :\n%s\n", cJSON_Print(jsontitle_keywords_filter_1));
	title_keywords_filter_t* title_keywords_filter_2 = title_keywords_filter_parseFromJSON(jsontitle_keywords_filter_1);
	cJSON* jsontitle_keywords_filter_2 = title_keywords_filter_convertToJSON(title_keywords_filter_2);
	printf("repeating title_keywords_filter:\n%s\n", cJSON_Print(jsontitle_keywords_filter_2));
}

int main() {
  test_title_keywords_filter(1);
  test_title_keywords_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // title_keywords_filter_MAIN
#endif // title_keywords_filter_TEST
