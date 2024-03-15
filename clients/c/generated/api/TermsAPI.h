#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/error.h"
#include "../model/related_terms.h"


// List related terms
//
// Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.
//
related_terms_t*
TermsAPI_termsRelatedList(apiClient_t *apiClient, list_t *terms);


// List suggested terms
//
// Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.
//
list_t*
TermsAPI_termsSuggestedList(apiClient_t *apiClient, char *term, int *limit);


