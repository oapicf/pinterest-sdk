/*
 * carting_retailer.h
 *
 * 
 */

#ifndef _carting_retailer_H_
#define _carting_retailer_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct carting_retailer_t carting_retailer_t;




typedef struct carting_retailer_t {
    char *retailer_id; // string
    char *retailer_name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} carting_retailer_t;

__attribute__((deprecated)) carting_retailer_t *carting_retailer_create(
    char *retailer_id,
    char *retailer_name
);

void carting_retailer_free(carting_retailer_t *carting_retailer);

carting_retailer_t *carting_retailer_parseFromJSON(cJSON *carting_retailerJSON);

cJSON *carting_retailer_convertToJSON(carting_retailer_t *carting_retailer);

#endif /* _carting_retailer_H_ */

