/*
 * preferred_media_type.h
 *
 * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
 */

#ifndef _preferred_media_type_H_
#define _preferred_media_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct preferred_media_type_t preferred_media_type_t;


// Enum  for preferred_media_type

typedef enum { pinterest_rest_api_preferred_media_type__NULL = 0, pinterest_rest_api_preferred_media_type__VIDEO, pinterest_rest_api_preferred_media_type__IMAGE } pinterest_rest_api_preferred_media_type__e;

char* preferred_media_type_preferred_media_type_ToString(pinterest_rest_api_preferred_media_type__e preferred_media_type);

pinterest_rest_api_preferred_media_type__e preferred_media_type_preferred_media_type_FromString(char* preferred_media_type);

cJSON *preferred_media_type_convertToJSON(pinterest_rest_api_preferred_media_type__e preferred_media_type);

pinterest_rest_api_preferred_media_type__e preferred_media_type_parseFromJSON(cJSON *preferred_media_typeJSON);

#endif /* _preferred_media_type_H_ */

