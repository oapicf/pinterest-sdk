/*
 * catalogs_hotel_guest_ratings.h
 *
 * If specified, you must provide all properties
 */

#ifndef _catalogs_hotel_guest_ratings_H_
#define _catalogs_hotel_guest_ratings_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_guest_ratings_t catalogs_hotel_guest_ratings_t;




typedef struct catalogs_hotel_guest_ratings_t {
    double score; //numeric
    int number_of_reviewers; //numeric
    double max_score; //numeric
    char *rating_system; // string

} catalogs_hotel_guest_ratings_t;

catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_create(
    double score,
    int number_of_reviewers,
    double max_score,
    char *rating_system
);

void catalogs_hotel_guest_ratings_free(catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings);

catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_parseFromJSON(cJSON *catalogs_hotel_guest_ratingsJSON);

cJSON *catalogs_hotel_guest_ratings_convertToJSON(catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings);

#endif /* _catalogs_hotel_guest_ratings_H_ */

