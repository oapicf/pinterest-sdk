/*
 * catalogs_hotel_guest_ratings.h
 *
 * 
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
    double *max_score; //numeric
    int *number_of_reviewers; //numeric
    char *rating_system; // string
    double *score; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_hotel_guest_ratings_t;

__attribute__((deprecated)) catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_create(
    double *max_score,
    int *number_of_reviewers,
    char *rating_system,
    double *score
);

void catalogs_hotel_guest_ratings_free(catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings);

catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings_parseFromJSON(cJSON *catalogs_hotel_guest_ratingsJSON);

cJSON *catalogs_hotel_guest_ratings_convertToJSON(catalogs_hotel_guest_ratings_t *catalogs_hotel_guest_ratings);

#endif /* _catalogs_hotel_guest_ratings_H_ */

