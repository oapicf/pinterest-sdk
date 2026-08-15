#ifndef TINY_CPP_CLIENT_BoardsApi_H_
#define TINY_CPP_CLIENT_BoardsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Board.h"
#include "BoardCreate.h"
#include "BoardPrivacyFilter.h"
#include "BoardSection.h"
#include "BoardWithUpdatePrivacy.h"
#include "BoardWithUpdatePrivacyUpdate.h"
#include "Board_sections_list_200_response.h"
#include "Boards_list_200_response.h"
#include "Boards_list_pins_200_response.h"
#include "CreativeType.h"
#include "Error.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class BoardsApi : public Service {
public:
    BoardsApi() = default;

    virtual ~BoardsApi() = default;

    /**
    * Create board section.
    *
    * Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
    * \param boardId Unique identifier of a board. *Required*
    * \param boardSection Create a board section. *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                BoardSection
        >
    boardSections_create(
            
            std::string boardId
            , 
            
            BoardSection boardSection
            , 
            
            std::string adAccountId
            
    );
    /**
    * Delete board section.
    *
    * Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
    * \param boardId Unique identifier of a board. *Required*
    * \param sectionId Unique identifier of a board section. *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
            String
        >
    boardSections_delete(
            
            std::string boardId
            , 
            
            std::string sectionId
            , 
            
            std::string adAccountId
            
    );
    /**
    * List board sections.
    *
    * Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
    * \param boardId Unique identifier of a board. *Required*
    * \param adAccountId Unique identifier of an ad account.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    */
    Response<
                Board_sections_list_200_response
        >
    boardSections_list(
            
            std::string boardId
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * List Pins on board section.
    *
    * Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
    * \param boardId Unique identifier of a board. *Required*
    * \param sectionId Unique identifier of a board section. *Required*
    * \param adAccountId Unique identifier of an ad account.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    */
    Response<
                Boards_list_pins_200_response
        >
    boardSections_listPins(
            
            std::string boardId
            , 
            
            std::string sectionId
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Update board section.
    *
    * Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
    * \param boardId Unique identifier of a board. *Required*
    * \param sectionId Unique identifier of a board section. *Required*
    * \param boardSection Update a board section. *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                BoardSection
        >
    boardSections_update(
            
            std::string boardId
            , 
            
            std::string sectionId
            , 
            
            BoardSection boardSection
            , 
            
            std::string adAccountId
            
    );
    /**
    * Create board.
    *
    * Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
    * \param boardCreate  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                Board
        >
    boards_create(
            
            BoardCreate boardCreate
            , 
            
            std::string adAccountId
            
    );
    /**
    * Delete board.
    *
    * Delete a board owned by the \"operation user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
    * \param boardId  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
            String
        >
    boards_delete(
            
            std::string boardId
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get board.
    *
    * Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
    * \param boardId  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                Board
        >
    boards_get(
            
            std::string boardId
            , 
            
            std::string adAccountId
            
    );
    /**
    * List boards.
    *
    * Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
    * \param adAccountId Unique identifier of an ad account.
    * \param privacy The privacy level of the board
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Boards_list_200_response
        >
    boards_list(
            
            std::string adAccountId
            , 
            
            BoardPrivacyFilter privacy
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * List Pins on board.
    *
    * Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
    * \param boardId Unique identifier of a board. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param creativeTypes Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
    * \param adAccountId Unique identifier of an ad account.
    * \param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    */
    Response<
                Boards_list_pins_200_response
        >
    boards_listPins(
            
            std::string boardId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            std::list<CreativeType> creativeTypes
            
            , 
            
            std::string adAccountId
            , 
            
            bool pinMetrics
            
    );
    /**
    * Update board.
    *
    * Update a board owned by the \"operating user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.
    * \param boardId  *Required*
    * \param boardWithUpdatePrivacyUpdate  *Required*
    * \param adAccountId Unique identifier of an ad account.
    */
    Response<
                BoardWithUpdatePrivacy
        >
    boards_update(
            
            std::string boardId
            , 
            
            BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate
            , 
            
            std::string adAccountId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_BoardsApi_H_ */