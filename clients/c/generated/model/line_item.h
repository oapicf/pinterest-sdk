/*
 * line_item.h
 *
 * 
 */

#ifndef _line_item_H_
#define _line_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct line_item_t line_item_t;




typedef struct line_item_t {
    char *product_brand; // string
    char *product_category; // string
    int product_id; //numeric
    char *product_name; // string
    char *product_price; // string
    int product_quantity; //numeric
    char *product_variant; // string
    char *product_variant_id; // string

} line_item_t;

line_item_t *line_item_create(
    char *product_brand,
    char *product_category,
    int product_id,
    char *product_name,
    char *product_price,
    int product_quantity,
    char *product_variant,
    char *product_variant_id
);

void line_item_free(line_item_t *line_item);

line_item_t *line_item_parseFromJSON(cJSON *line_itemJSON);

cJSON *line_item_convertToJSON(line_item_t *line_item);

#endif /* _line_item_H_ */

