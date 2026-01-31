/*
 * quality_components.h
 *
 * Set of quality components, with each component containing a event coverage and details.
 */

#ifndef _quality_components_H_
#define _quality_components_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct quality_components_t quality_components_t;

#include "quality_component_details.h"



typedef struct quality_components_t {
    list_t* advertiser_external_id; //map
    list_t* click_id_epik; //map
    list_t* external_event_id; //map
    list_t* hashed_email; //map
    list_t* hashed_maid; //map
    list_t* ip_address; //map
    list_t* order_id; //map
    list_t* order_value; //map
    list_t* product_id; //map
    list_t* source_url; //map
    list_t* user_agent; //map

    int _library_owned; // Is the library responsible for freeing this object?
} quality_components_t;

__attribute__((deprecated)) quality_components_t *quality_components_create(
    list_t* advertiser_external_id,
    list_t* click_id_epik,
    list_t* external_event_id,
    list_t* hashed_email,
    list_t* hashed_maid,
    list_t* ip_address,
    list_t* order_id,
    list_t* order_value,
    list_t* product_id,
    list_t* source_url,
    list_t* user_agent
);

void quality_components_free(quality_components_t *quality_components);

quality_components_t *quality_components_parseFromJSON(cJSON *quality_componentsJSON);

cJSON *quality_components_convertToJSON(quality_components_t *quality_components);

#endif /* _quality_components_H_ */

