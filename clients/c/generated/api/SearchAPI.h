#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/error.h"
#include "../model/pins_list_200_response.h"
#include "../model/search_partner_pins_200_response.h"
#include "../model/search_user_boards_get_200_response.h"


// Search pins by a given search term
//
// <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.
//
search_partner_pins_200_response_t*
SearchAPI_searchPartnerPins(apiClient_t *apiClient, char *term, char *country_code, char *bookmark, char *locale, int *limit);


// Search user's boards
//
// Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
//
search_user_boards_get_200_response_t*
SearchAPI_searchUserBoardsGet(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, char *query);


// Search user's Pins
//
// Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.
//
pins_list_200_response_t*
SearchAPI_searchUserPinsList(apiClient_t *apiClient, char *query, char *ad_account_id, char *bookmark);


