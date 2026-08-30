/*
 * item_id_store_code_pair.h
 *
 * A pair of item_id and store_code that uniquely identifies a local inventory item
 */

#ifndef _item_id_store_code_pair_H_
#define _item_id_store_code_pair_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_id_store_code_pair_t item_id_store_code_pair_t;




typedef struct item_id_store_code_pair_t {
    char *item_id; // string
    char *store_code; // string

    int _library_owned; // Is the library responsible for freeing this object?
} item_id_store_code_pair_t;

__attribute__((deprecated)) item_id_store_code_pair_t *item_id_store_code_pair_create(
    char *item_id,
    char *store_code
);

void item_id_store_code_pair_free(item_id_store_code_pair_t *item_id_store_code_pair);

item_id_store_code_pair_t *item_id_store_code_pair_parseFromJSON(cJSON *item_id_store_code_pairJSON);

cJSON *item_id_store_code_pair_convertToJSON(item_id_store_code_pair_t *item_id_store_code_pair);

#endif /* _item_id_store_code_pair_H_ */

