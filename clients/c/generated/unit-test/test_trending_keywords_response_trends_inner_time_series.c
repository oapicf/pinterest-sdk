#ifndef trending_keywords_response_trends_inner_time_series_TEST
#define trending_keywords_response_trends_inner_time_series_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define trending_keywords_response_trends_inner_time_series_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/trending_keywords_response_trends_inner_time_series.h"
trending_keywords_response_trends_inner_time_series_t* instantiate_trending_keywords_response_trends_inner_time_series(int include_optional);



trending_keywords_response_trends_inner_time_series_t* instantiate_trending_keywords_response_trends_inner_time_series(int include_optional) {
  trending_keywords_response_trends_inner_time_series_t* trending_keywords_response_trends_inner_time_series = NULL;
  if (include_optional) {
    trending_keywords_response_trends_inner_time_series = trending_keywords_response_trends_inner_time_series_create(
      "2013-10-20"
    );
  } else {
    trending_keywords_response_trends_inner_time_series = trending_keywords_response_trends_inner_time_series_create(
      "2013-10-20"
    );
  }

  return trending_keywords_response_trends_inner_time_series;
}


#ifdef trending_keywords_response_trends_inner_time_series_MAIN

void test_trending_keywords_response_trends_inner_time_series(int include_optional) {
    trending_keywords_response_trends_inner_time_series_t* trending_keywords_response_trends_inner_time_series_1 = instantiate_trending_keywords_response_trends_inner_time_series(include_optional);

	cJSON* jsontrending_keywords_response_trends_inner_time_series_1 = trending_keywords_response_trends_inner_time_series_convertToJSON(trending_keywords_response_trends_inner_time_series_1);
	printf("trending_keywords_response_trends_inner_time_series :\n%s\n", cJSON_Print(jsontrending_keywords_response_trends_inner_time_series_1));
	trending_keywords_response_trends_inner_time_series_t* trending_keywords_response_trends_inner_time_series_2 = trending_keywords_response_trends_inner_time_series_parseFromJSON(jsontrending_keywords_response_trends_inner_time_series_1);
	cJSON* jsontrending_keywords_response_trends_inner_time_series_2 = trending_keywords_response_trends_inner_time_series_convertToJSON(trending_keywords_response_trends_inner_time_series_2);
	printf("repeating trending_keywords_response_trends_inner_time_series:\n%s\n", cJSON_Print(jsontrending_keywords_response_trends_inner_time_series_2));
}

int main() {
  test_trending_keywords_response_trends_inner_time_series(1);
  test_trending_keywords_response_trends_inner_time_series(0);

  printf("Hello world \n");
  return 0;
}

#endif // trending_keywords_response_trends_inner_time_series_MAIN
#endif // trending_keywords_response_trends_inner_time_series_TEST
