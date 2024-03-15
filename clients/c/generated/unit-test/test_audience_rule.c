#ifndef audience_rule_TEST
#define audience_rule_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_rule_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_rule.h"
audience_rule_t* instantiate_audience_rule(int include_optional);

#include "test_pinterest_tag_event_data.c"


audience_rule_t* instantiate_audience_rule(int include_optional) {
  audience_rule_t* audience_rule = NULL;
  if (include_optional) {
    audience_rule = audience_rule_create(
      "US",
      "5497558859876",
      ["www.somedomain.com"],
      "click",
      "checkout",
       // false, not to have infinite recursion
      instantiate_pinterest_tag_event_data(0),
      3,
      ["34567"],
      true,
      30,
      ["2542620639259","2542620639261"],
      list_createList(),
      "549755885175",
      {"=":["web","mobile"]},
      {"=":["tag"]},
      1,
      ["626744528398"],
      ["687201361754"],
      ["AWARENESS"],
      "549755885175"
    );
  } else {
    audience_rule = audience_rule_create(
      "US",
      "5497558859876",
      ["www.somedomain.com"],
      "click",
      "checkout",
      NULL,
      3,
      ["34567"],
      true,
      30,
      ["2542620639259","2542620639261"],
      list_createList(),
      "549755885175",
      {"=":["web","mobile"]},
      {"=":["tag"]},
      1,
      ["626744528398"],
      ["687201361754"],
      ["AWARENESS"],
      "549755885175"
    );
  }

  return audience_rule;
}


#ifdef audience_rule_MAIN

void test_audience_rule(int include_optional) {
    audience_rule_t* audience_rule_1 = instantiate_audience_rule(include_optional);

	cJSON* jsonaudience_rule_1 = audience_rule_convertToJSON(audience_rule_1);
	printf("audience_rule :\n%s\n", cJSON_Print(jsonaudience_rule_1));
	audience_rule_t* audience_rule_2 = audience_rule_parseFromJSON(jsonaudience_rule_1);
	cJSON* jsonaudience_rule_2 = audience_rule_convertToJSON(audience_rule_2);
	printf("repeating audience_rule:\n%s\n", cJSON_Print(jsonaudience_rule_2));
}

int main() {
  test_audience_rule(1);
  test_audience_rule(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_rule_MAIN
#endif // audience_rule_TEST
