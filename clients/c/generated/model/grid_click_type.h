/*
 * grid_click_type.h
 *
 * Where a user is taken after clicking on an ad in grid. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt;  This parameter is read-only and is set to DIRECT_TO_DESTINATION by default for direct links supported ads.  grid_click_type values provided will be ignored.
 */

#ifndef _grid_click_type_H_
#define _grid_click_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct grid_click_type_t grid_click_type_t;


// Enum  for grid_click_type

typedef enum { pinterest_rest_api_grid_click_type__NULL = 0, pinterest_rest_api_grid_click_type__CLOSEUP, pinterest_rest_api_grid_click_type__DIRECT_TO_DESTINATION } pinterest_rest_api_grid_click_type__e;

char* grid_click_type_grid_click_type_ToString(pinterest_rest_api_grid_click_type__e grid_click_type);

pinterest_rest_api_grid_click_type__e grid_click_type_grid_click_type_FromString(char* grid_click_type);

//cJSON *grid_click_type_grid_click_type_convertToJSON(pinterest_rest_api_grid_click_type__e grid_click_type);

//pinterest_rest_api_grid_click_type__e grid_click_type_grid_click_type_parseFromJSON(cJSON *grid_click_typeJSON);

#endif /* _grid_click_type_H_ */

