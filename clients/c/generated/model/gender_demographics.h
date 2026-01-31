/*
 * gender_demographics.h
 *
 * Gender demographic distribution
 */

#ifndef _gender_demographics_H_
#define _gender_demographics_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct gender_demographics_t gender_demographics_t;




typedef struct gender_demographics_t {
    double female; //numeric
    double male; //numeric
    double unspecified; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} gender_demographics_t;

__attribute__((deprecated)) gender_demographics_t *gender_demographics_create(
    double female,
    double male,
    double unspecified
);

void gender_demographics_free(gender_demographics_t *gender_demographics);

gender_demographics_t *gender_demographics_parseFromJSON(cJSON *gender_demographicsJSON);

cJSON *gender_demographics_convertToJSON(gender_demographics_t *gender_demographics);

#endif /* _gender_demographics_H_ */

