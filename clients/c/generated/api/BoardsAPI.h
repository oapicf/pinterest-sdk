#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/board.h"
#include "../model/board_section.h"
#include "../model/board_sections_list_200_response.h"
#include "../model/board_update.h"
#include "../model/boards_list_200_response.h"
#include "../model/boards_list_pins_200_response.h"
#include "../model/error.h"

// Enum PRIVACY for BoardsAPI_boardsList
typedef enum  { pinterest_rest_api_boardsList_PRIVACY_NULL = 0, pinterest_rest_api_boardsList_PRIVACY_ALL, pinterest_rest_api_boardsList_PRIVACY__PROTECTED, pinterest_rest_api_boardsList_PRIVACY__PUBLIC, pinterest_rest_api_boardsList_PRIVACY_SECRET, pinterest_rest_api_boardsList_PRIVACY_PUBLIC_AND_SECRET } pinterest_rest_api_boardsList_privacy_e;

// Enum CREATIVETYPES for BoardsAPI_boardsListPins
typedef enum  { pinterest_rest_api_boardsListPins_CREATIVETYPES_NULL = 0, pinterest_rest_api_boardsListPins_CREATIVETYPES_REGULAR, pinterest_rest_api_boardsListPins_CREATIVETYPES_VIDEO, pinterest_rest_api_boardsListPins_CREATIVETYPES_SHOPPING, pinterest_rest_api_boardsListPins_CREATIVETYPES_CAROUSEL, pinterest_rest_api_boardsListPins_CREATIVETYPES_MAX_VIDEO, pinterest_rest_api_boardsListPins_CREATIVETYPES_SHOP_THE_PIN, pinterest_rest_api_boardsListPins_CREATIVETYPES_COLLECTION, pinterest_rest_api_boardsListPins_CREATIVETYPES_IDEA } pinterest_rest_api_boardsListPins_creative_types_e;


// Create board section
//
// Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_section_t*
BoardsAPI_boardSectionsCreate(apiClient_t *apiClient, char *board_id, board_section_t *board_section, char *ad_account_id);


// Delete board section
//
// Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
void
BoardsAPI_boardSectionsDelete(apiClient_t *apiClient, char *board_id, char *section_id, char *ad_account_id);


// List board sections
//
// Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_sections_list_200_response_t*
BoardsAPI_boardSectionsList(apiClient_t *apiClient, char *board_id, char *ad_account_id, char *bookmark, int *page_size);


// List Pins on board section
//
// Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
boards_list_pins_200_response_t*
BoardsAPI_boardSectionsListPins(apiClient_t *apiClient, char *board_id, char *section_id, char *ad_account_id, char *bookmark, int *page_size);


// Update board section
//
// Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_section_t*
BoardsAPI_boardSectionsUpdate(apiClient_t *apiClient, char *board_id, char *section_id, board_section_t *board_section, char *ad_account_id);


// Create board
//
// Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_t*
BoardsAPI_boardsCreate(apiClient_t *apiClient, board_t *board, char *ad_account_id);


// Delete board
//
// Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
void
BoardsAPI_boardsDelete(apiClient_t *apiClient, char *board_id, char *ad_account_id);


// Get board
//
// Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_t*
BoardsAPI_boardsGet(apiClient_t *apiClient, char *board_id, char *ad_account_id);


// List boards
//
// Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
//
boards_list_200_response_t*
BoardsAPI_boardsList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_rest_api_boardsList_privacy_e privacy);


// List Pins on board
//
// Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
boards_list_pins_200_response_t*
BoardsAPI_boardsListPins(apiClient_t *apiClient, char *board_id, char *bookmark, int *page_size, list_t *creative_types, char *ad_account_id, int *pin_metrics);


// Update board
//
// Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_t*
BoardsAPI_boardsUpdate(apiClient_t *apiClient, char *board_id, board_update_t *board_update, char *ad_account_id);


