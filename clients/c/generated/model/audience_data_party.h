/*
 * audience_data_party.h
 *
 * Whether the data is owned by the partner (1p) or by the data provider (3p)
 */

#ifndef _audience_data_party_H_
#define _audience_data_party_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audience_data_party_t audience_data_party_t;


// Enum  for audience_data_party

typedef enum { pinterest_rest_api_audience_data_party__NULL = 0, pinterest_rest_api_audience_data_party___1p, pinterest_rest_api_audience_data_party___3p } pinterest_rest_api_audience_data_party__e;

char* audience_data_party_audience_data_party_ToString(pinterest_rest_api_audience_data_party__e audience_data_party);

pinterest_rest_api_audience_data_party__e audience_data_party_audience_data_party_FromString(char* audience_data_party);

//cJSON *audience_data_party_audience_data_party_convertToJSON(pinterest_rest_api_audience_data_party__e audience_data_party);

//pinterest_rest_api_audience_data_party__e audience_data_party_audience_data_party_parseFromJSON(cJSON *audience_data_partyJSON);

#endif /* _audience_data_party_H_ */

