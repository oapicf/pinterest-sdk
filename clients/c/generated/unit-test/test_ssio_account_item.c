#ifndef ssio_account_item_TEST
#define ssio_account_item_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ssio_account_item_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ssio_account_item.h"
ssio_account_item_t* instantiate_ssio_account_item(int include_optional);



ssio_account_item_t* instantiate_ssio_account_item(int include_optional) {
  ssio_account_item_t* ssio_account_item = NULL;
  if (include_optional) {
    ssio_account_item = ssio_account_item_create(
      "0011N00001LW8kAQAT",
      "a2S1N000000bKHgUAM",
      "The IO is governed by the terms available at https://business.pinterest.com/en/pinterest-advertising-services-agreement/. If a budget is listed on this IO, the parties agree that Advertiser (or if applicable, its Agency) may apply any of the budget to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees. The terms of the Agreement supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.",
      "a2S1N000000bKIOUA2",
      "This Insertion Order ("IO") is subject to the Pinterest Addendum To IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0), as executed by Pinterest, Inc. and GroupM Worldwide LLC on May 7, 2014 and Amendment No. 1 to Pinterest Addendum to IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0) as executed by Pinterest, Inc. and GroupM Worldwide LLC on August 20, 2015. The parties agree that Agency may apply any of the budget listed on this IO to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees.The terms of the Addendum supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.",
      "a2S1N000000bKHhUAM",
      "The IO is governed by the terms available at
https://business.pinterest.com/en-gb/pinterest-advertising-services-agreement",
      "Pinterest Paper",
      list_createList()
    );
  } else {
    ssio_account_item = ssio_account_item_create(
      "0011N00001LW8kAQAT",
      "a2S1N000000bKHgUAM",
      "The IO is governed by the terms available at https://business.pinterest.com/en/pinterest-advertising-services-agreement/. If a budget is listed on this IO, the parties agree that Advertiser (or if applicable, its Agency) may apply any of the budget to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees. The terms of the Agreement supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.",
      "a2S1N000000bKIOUA2",
      "This Insertion Order ("IO") is subject to the Pinterest Addendum To IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0), as executed by Pinterest, Inc. and GroupM Worldwide LLC on May 7, 2014 and Amendment No. 1 to Pinterest Addendum to IAB Standard Terms and Conditions for Internet Advertising For Media Buys One Year or Less (Version 3.0) as executed by Pinterest, Inc. and GroupM Worldwide LLC on August 20, 2015. The parties agree that Agency may apply any of the budget listed on this IO to any auction bid type or ad product. Price will be determined by auction closing price, plus any applicable non-auction fees.The terms of the Addendum supersede any terms on this IO. ANY ADDITIONAL TERMS AND CONDITIONS ON THIS IO ARE NULL AND VOID.",
      "a2S1N000000bKHhUAM",
      "The IO is governed by the terms available at
https://business.pinterest.com/en-gb/pinterest-advertising-services-agreement",
      "Pinterest Paper",
      list_createList()
    );
  }

  return ssio_account_item;
}


#ifdef ssio_account_item_MAIN

void test_ssio_account_item(int include_optional) {
    ssio_account_item_t* ssio_account_item_1 = instantiate_ssio_account_item(include_optional);

	cJSON* jsonssio_account_item_1 = ssio_account_item_convertToJSON(ssio_account_item_1);
	printf("ssio_account_item :\n%s\n", cJSON_Print(jsonssio_account_item_1));
	ssio_account_item_t* ssio_account_item_2 = ssio_account_item_parseFromJSON(jsonssio_account_item_1);
	cJSON* jsonssio_account_item_2 = ssio_account_item_convertToJSON(ssio_account_item_2);
	printf("repeating ssio_account_item:\n%s\n", cJSON_Print(jsonssio_account_item_2));
}

int main() {
  test_ssio_account_item(1);
  test_ssio_account_item(0);

  printf("Hello world \n");
  return 0;
}

#endif // ssio_account_item_MAIN
#endif // ssio_account_item_TEST
