#ifndef metrics_response_TEST
#define metrics_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define metrics_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/metrics_response.h"
metrics_response_t* instantiate_metrics_response(int include_optional);



metrics_response_t* instantiate_metrics_response(int include_optional) {
  metrics_response_t* metrics_response = NULL;
  if (include_optional) {
    metrics_response = metrics_response_create(
      [{"targeting_type":"KEYWORD","targeting_value":"christmas decor ideas","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"iphone","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"ipad","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"web","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"web_mobile","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"android_mobile","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"android_tablet","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"GENDER","targeting_value":"female","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"LOCATION","targeting_value":500,"metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"PLACEMENT","targeting_value":"SEARCH","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"COUNTRY","targeting_value":"US","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"TARGETED_INTEREST","targeting_value":"Food and Drinks","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"PINNER_INTEREST","targeting_value":"Chocolate Cookies","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"AUDIENCE_INCLUDE","targeting_value":254261234567,"metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"GEO","targeting_value":"US:94102","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"AGE_BUCKET","targeting_value":"45-49","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"REGION","targeting_value":"US-CA","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}}]
    );
  } else {
    metrics_response = metrics_response_create(
      [{"targeting_type":"KEYWORD","targeting_value":"christmas decor ideas","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"iphone","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"ipad","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"web","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"web_mobile","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"android_mobile","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"APPTYPE","targeting_value":"android_tablet","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"GENDER","targeting_value":"female","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"LOCATION","targeting_value":500,"metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"PLACEMENT","targeting_value":"SEARCH","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"COUNTRY","targeting_value":"US","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"TARGETED_INTEREST","targeting_value":"Food and Drinks","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"PINNER_INTEREST","targeting_value":"Chocolate Cookies","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"AUDIENCE_INCLUDE","targeting_value":254261234567,"metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"GEO","targeting_value":"US:94102","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"AGE_BUCKET","targeting_value":"45-49","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}},{"targeting_type":"REGION","targeting_value":"US-CA","metrics":{"AD_GROUP_ID":2680067996745,"DATE":"2022-04-26","SPEND_IN_DOLLAR":240}}]
    );
  }

  return metrics_response;
}


#ifdef metrics_response_MAIN

void test_metrics_response(int include_optional) {
    metrics_response_t* metrics_response_1 = instantiate_metrics_response(include_optional);

	cJSON* jsonmetrics_response_1 = metrics_response_convertToJSON(metrics_response_1);
	printf("metrics_response :\n%s\n", cJSON_Print(jsonmetrics_response_1));
	metrics_response_t* metrics_response_2 = metrics_response_parseFromJSON(jsonmetrics_response_1);
	cJSON* jsonmetrics_response_2 = metrics_response_convertToJSON(metrics_response_2);
	printf("repeating metrics_response:\n%s\n", cJSON_Print(jsonmetrics_response_2));
}

int main() {
  test_metrics_response(1);
  test_metrics_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // metrics_response_MAIN
#endif // metrics_response_TEST
