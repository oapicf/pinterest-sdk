/*
 * conversion_tag_configs.h
 *
 * 
 */

#ifndef _conversion_tag_configs_H_
#define _conversion_tag_configs_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_tag_configs_t conversion_tag_configs_t;




typedef struct conversion_tag_configs_t {
    int aem_enabled; //boolean
    double md_frequency; //numeric
    int aem_fnln_enabled; //boolean
    int aem_ph_enabled; //boolean
    int aem_ge_enabled; //boolean
    int aem_db_enabled; //boolean
    int aem_loc_enabled; //boolean

} conversion_tag_configs_t;

conversion_tag_configs_t *conversion_tag_configs_create(
    int aem_enabled,
    double md_frequency,
    int aem_fnln_enabled,
    int aem_ph_enabled,
    int aem_ge_enabled,
    int aem_db_enabled,
    int aem_loc_enabled
);

void conversion_tag_configs_free(conversion_tag_configs_t *conversion_tag_configs);

conversion_tag_configs_t *conversion_tag_configs_parseFromJSON(cJSON *conversion_tag_configsJSON);

cJSON *conversion_tag_configs_convertToJSON(conversion_tag_configs_t *conversion_tag_configs);

#endif /* _conversion_tag_configs_H_ */

