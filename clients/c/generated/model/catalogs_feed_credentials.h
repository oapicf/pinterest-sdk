/*
 * catalogs_feed_credentials.h
 *
 * This field is **OPTIONAL**. Use this if your feed file requires username and password.
 */

#ifndef _catalogs_feed_credentials_H_
#define _catalogs_feed_credentials_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_feed_credentials_t catalogs_feed_credentials_t;




typedef struct catalogs_feed_credentials_t {
    char *password; // string
    char *username; // string

} catalogs_feed_credentials_t;

catalogs_feed_credentials_t *catalogs_feed_credentials_create(
    char *password,
    char *username
);

void catalogs_feed_credentials_free(catalogs_feed_credentials_t *catalogs_feed_credentials);

catalogs_feed_credentials_t *catalogs_feed_credentials_parseFromJSON(cJSON *catalogs_feed_credentialsJSON);

cJSON *catalogs_feed_credentials_convertToJSON(catalogs_feed_credentials_t *catalogs_feed_credentials);

#endif /* _catalogs_feed_credentials_H_ */

