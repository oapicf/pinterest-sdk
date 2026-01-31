#ifndef updatable_item_attributes_TEST
#define updatable_item_attributes_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define updatable_item_attributes_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/updatable_item_attributes.h"
updatable_item_attributes_t* instantiate_updatable_item_attributes(int include_optional);

#include "test_updatable_item_attributes_gtin.c"


updatable_item_attributes_t* instantiate_updatable_item_attributes(int include_optional) {
  updatable_item_attributes_t* updatable_item_attributes = NULL;
  if (include_optional) {
    updatable_item_attributes = updatable_item_attributes_create(
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest",
      "https://www.example.com/video/video_v2.mov",
      "black friday",
      "https://www.example.com/video/video_v2.mov",
      "black friday",
      "https://www.example.com/video/video_v2.mov",
      "black friday",
      true,
      "newborn",
      "pinterest://item/1234567890",
      "in stock",
      5,
      "Josie’s Denim",
      false,
      "blue",
      "new",
      "Best sellers",
      "Summer promotion",
      "Winter sales",
      "Woman dress",
      "Man hat",
      10,
      0,
      1520000000,
      4294967295,
      50,
      "Casual fit denim shirt made with the finest quality Japanese denim.",
      true,
      "35 USD",
      "unisex",
      "Apparel & Accessories > Clothing > Shirts & Tops",
      3234567890126,
      "DS0294-L",
      "10:10.00 USD",
      "pinterest://item/1234567890",
      "DS0294",
      1641483432072,
      "https://www.example.com/cat/womens-clothing/denim-shirt-0294",
      "cotton",
      "19.99 USD",
      "https://m.example.com/cat/womens-clothing/denim-shirt-0294",
      "PI12345NTEREST",
      10,
      10,
      "plaid",
      "24.99 USD",
      "Clothing > Women’s > Shirts > Denim",
      "promotion_1",
      "14.99 USD",
      "2025-01-01T00:00:00.000000Z/2025-01-07T00:00:00.000000Z",
      "US:CA:Ground:0 USD",
      "12 in",
      "3 kg",
      "16 in",
      "M",
      "US",
      "regular",
      "US:1025433:6.00:y",
      "Women’s denim shirt, large",
      "10 ML",
      "10 ML",
      ["Color","Size"],
      ["Red","Small"]
    );
  } else {
    updatable_item_attributes = updatable_item_attributes_create(
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/image/image_v2.jpg",
      "black friday",
      "https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest",
      "https://www.example.com/video/video_v2.mov",
      "black friday",
      "https://www.example.com/video/video_v2.mov",
      "black friday",
      "https://www.example.com/video/video_v2.mov",
      "black friday",
      true,
      "newborn",
      "pinterest://item/1234567890",
      "in stock",
      5,
      "Josie’s Denim",
      false,
      "blue",
      "new",
      "Best sellers",
      "Summer promotion",
      "Winter sales",
      "Woman dress",
      "Man hat",
      10,
      0,
      1520000000,
      4294967295,
      50,
      "Casual fit denim shirt made with the finest quality Japanese denim.",
      true,
      "35 USD",
      "unisex",
      "Apparel & Accessories > Clothing > Shirts & Tops",
      3234567890126,
      "DS0294-L",
      "10:10.00 USD",
      "pinterest://item/1234567890",
      "DS0294",
      1641483432072,
      "https://www.example.com/cat/womens-clothing/denim-shirt-0294",
      "cotton",
      "19.99 USD",
      "https://m.example.com/cat/womens-clothing/denim-shirt-0294",
      "PI12345NTEREST",
      10,
      10,
      "plaid",
      "24.99 USD",
      "Clothing > Women’s > Shirts > Denim",
      "promotion_1",
      "14.99 USD",
      "2025-01-01T00:00:00.000000Z/2025-01-07T00:00:00.000000Z",
      "US:CA:Ground:0 USD",
      "12 in",
      "3 kg",
      "16 in",
      "M",
      "US",
      "regular",
      "US:1025433:6.00:y",
      "Women’s denim shirt, large",
      "10 ML",
      "10 ML",
      ["Color","Size"],
      ["Red","Small"]
    );
  }

  return updatable_item_attributes;
}


#ifdef updatable_item_attributes_MAIN

void test_updatable_item_attributes(int include_optional) {
    updatable_item_attributes_t* updatable_item_attributes_1 = instantiate_updatable_item_attributes(include_optional);

	cJSON* jsonupdatable_item_attributes_1 = updatable_item_attributes_convertToJSON(updatable_item_attributes_1);
	printf("updatable_item_attributes :\n%s\n", cJSON_Print(jsonupdatable_item_attributes_1));
	updatable_item_attributes_t* updatable_item_attributes_2 = updatable_item_attributes_parseFromJSON(jsonupdatable_item_attributes_1);
	cJSON* jsonupdatable_item_attributes_2 = updatable_item_attributes_convertToJSON(updatable_item_attributes_2);
	printf("repeating updatable_item_attributes:\n%s\n", cJSON_Print(jsonupdatable_item_attributes_2));
}

int main() {
  test_updatable_item_attributes(1);
  test_updatable_item_attributes(0);

  printf("Hello world \n");
  return 0;
}

#endif // updatable_item_attributes_MAIN
#endif // updatable_item_attributes_TEST
