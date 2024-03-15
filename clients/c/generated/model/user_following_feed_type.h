/*
 * user_following_feed_type.h
 *
 * Specifies the type of followees to be kept when filtering them.
 */

#ifndef _user_following_feed_type_H_
#define _user_following_feed_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_following_feed_type_t user_following_feed_type_t;


// Enum  for user_following_feed_type

typedef enum { pinterest_rest_api_user_following_feed_type__NULL = 0, pinterest_rest_api_user_following_feed_type__ALL, pinterest_rest_api_user_following_feed_type__RANKED, pinterest_rest_api_user_following_feed_type__CREATOR_ONLY, pinterest_rest_api_user_following_feed_type__RANKED_CREATOR_ONLY } pinterest_rest_api_user_following_feed_type__e;

char* user_following_feed_type_user_following_feed_type_ToString(pinterest_rest_api_user_following_feed_type__e user_following_feed_type);

pinterest_rest_api_user_following_feed_type__e user_following_feed_type_user_following_feed_type_FromString(char* user_following_feed_type);

//cJSON *user_following_feed_type_user_following_feed_type_convertToJSON(pinterest_rest_api_user_following_feed_type__e user_following_feed_type);

//pinterest_rest_api_user_following_feed_type__e user_following_feed_type_user_following_feed_type_parseFromJSON(cJSON *user_following_feed_typeJSON);

#endif /* _user_following_feed_type_H_ */

