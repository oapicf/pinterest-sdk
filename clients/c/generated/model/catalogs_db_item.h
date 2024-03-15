/*
 * catalogs_db_item.h
 *
 * 
 */

#ifndef _catalogs_db_item_H_
#define _catalogs_db_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_db_item_t catalogs_db_item_t;




typedef struct catalogs_db_item_t {
    char *created_at; //date time
    char *id; // string
    char *updated_at; //date time

} catalogs_db_item_t;

catalogs_db_item_t *catalogs_db_item_create(
    char *created_at,
    char *id,
    char *updated_at
);

void catalogs_db_item_free(catalogs_db_item_t *catalogs_db_item);

catalogs_db_item_t *catalogs_db_item_parseFromJSON(cJSON *catalogs_db_itemJSON);

cJSON *catalogs_db_item_convertToJSON(catalogs_db_item_t *catalogs_db_item);

#endif /* _catalogs_db_item_H_ */

