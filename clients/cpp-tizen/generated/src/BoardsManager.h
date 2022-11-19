#ifndef _BoardsManager_H_
#define _BoardsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Board.h"
#include "BoardSection.h"
#include "BoardUpdate.h"
#include "Board_sections_list_200_response.h"
#include "Board_sections_list_pins_200_response.h"
#include "Boards_list_200_response.h"
#include "Error.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Boards Boards
 * \ingroup Operations
 *  @{
 */
class BoardsManager {
public:
	BoardsManager();
	virtual ~BoardsManager();

/*! \brief Create board section. *Synchronous*
 *
 * Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param boardSection Create a board section. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardSectionsCreateSync(char * accessToken,
	std::string boardId, std::shared_ptr<BoardSection> boardSection, 
	void(* handler)(BoardSection, Error, void* )
	, void* userData);

/*! \brief Create board section. *Asynchronous*
 *
 * Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param boardSection Create a board section. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardSectionsCreateAsync(char * accessToken,
	std::string boardId, std::shared_ptr<BoardSection> boardSection, 
	void(* handler)(BoardSection, Error, void* )
	, void* userData);


/*! \brief Delete board section. *Synchronous*
 *
 * Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param sectionId Unique identifier of a board section. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardSectionsDeleteSync(char * accessToken,
	std::string boardId, std::string sectionId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete board section. *Asynchronous*
 *
 * Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param sectionId Unique identifier of a board section. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardSectionsDeleteAsync(char * accessToken,
	std::string boardId, std::string sectionId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief List board sections. *Synchronous*
 *
 * Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardSectionsListSync(char * accessToken,
	std::string boardId, std::string bookmark, int pageSize, 
	void(* handler)(Board_sections_list_200_response, Error, void* )
	, void* userData);

/*! \brief List board sections. *Asynchronous*
 *
 * Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardSectionsListAsync(char * accessToken,
	std::string boardId, std::string bookmark, int pageSize, 
	void(* handler)(Board_sections_list_200_response, Error, void* )
	, void* userData);


/*! \brief List Pins on board section. *Synchronous*
 *
 * Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param sectionId Unique identifier of a board section. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardSectionsListPinsSync(char * accessToken,
	std::string boardId, std::string sectionId, std::string bookmark, int pageSize, 
	void(* handler)(Board_sections_list_pins_200_response, Error, void* )
	, void* userData);

/*! \brief List Pins on board section. *Asynchronous*
 *
 * Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param sectionId Unique identifier of a board section. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardSectionsListPinsAsync(char * accessToken,
	std::string boardId, std::string sectionId, std::string bookmark, int pageSize, 
	void(* handler)(Board_sections_list_pins_200_response, Error, void* )
	, void* userData);


/*! \brief Update board section. *Synchronous*
 *
 * Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param sectionId Unique identifier of a board section. *Required*
 * \param boardSection Update a board section. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardSectionsUpdateSync(char * accessToken,
	std::string boardId, std::string sectionId, std::shared_ptr<BoardSection> boardSection, 
	void(* handler)(BoardSection, Error, void* )
	, void* userData);

/*! \brief Update board section. *Asynchronous*
 *
 * Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param sectionId Unique identifier of a board section. *Required*
 * \param boardSection Update a board section. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardSectionsUpdateAsync(char * accessToken,
	std::string boardId, std::string sectionId, std::shared_ptr<BoardSection> boardSection, 
	void(* handler)(BoardSection, Error, void* )
	, void* userData);


/*! \brief Create board. *Synchronous*
 *
 * Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
 * \param board Create a board using a single board json object. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardsCreateSync(char * accessToken,
	std::shared_ptr<Board> board, 
	void(* handler)(Board, Error, void* )
	, void* userData);

/*! \brief Create board. *Asynchronous*
 *
 * Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
 * \param board Create a board using a single board json object. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardsCreateAsync(char * accessToken,
	std::shared_ptr<Board> board, 
	void(* handler)(Board, Error, void* )
	, void* userData);


/*! \brief Delete board. *Synchronous*
 *
 * Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardsDeleteSync(char * accessToken,
	std::string boardId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete board. *Asynchronous*
 *
 * Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardsDeleteAsync(char * accessToken,
	std::string boardId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get board. *Synchronous*
 *
 * Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardsGetSync(char * accessToken,
	std::string boardId, 
	void(* handler)(Board, Error, void* )
	, void* userData);

/*! \brief Get board. *Asynchronous*
 *
 * Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardsGetAsync(char * accessToken,
	std::string boardId, 
	void(* handler)(Board, Error, void* )
	, void* userData);


/*! \brief List boards. *Synchronous*
 *
 * Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param privacy Privacy setting for a board.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardsListSync(char * accessToken,
	std::string bookmark, int pageSize, std::string privacy, 
	void(* handler)(Boards_list_200_response, Error, void* )
	, void* userData);

/*! \brief List boards. *Asynchronous*
 *
 * Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param privacy Privacy setting for a board.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardsListAsync(char * accessToken,
	std::string bookmark, int pageSize, std::string privacy, 
	void(* handler)(Boards_list_200_response, Error, void* )
	, void* userData);


/*! \brief List Pins on board. *Synchronous*
 *
 * Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardsListPinsSync(char * accessToken,
	std::string boardId, std::string bookmark, int pageSize, 
	void(* handler)(Board_sections_list_pins_200_response, Error, void* )
	, void* userData);

/*! \brief List Pins on board. *Asynchronous*
 *
 * Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
 * \param boardId Unique identifier of a board. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardsListPinsAsync(char * accessToken,
	std::string boardId, std::string bookmark, int pageSize, 
	void(* handler)(Board_sections_list_pins_200_response, Error, void* )
	, void* userData);


/*! \brief Update board. *Synchronous*
 *
 * Update a board owned by the \"operating user_account\".
 * \param boardId Unique identifier of a board. *Required*
 * \param boardUpdate Update a board. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardsUpdateSync(char * accessToken,
	std::string boardId, std::shared_ptr<BoardUpdate> boardUpdate, 
	void(* handler)(Board, Error, void* )
	, void* userData);

/*! \brief Update board. *Asynchronous*
 *
 * Update a board owned by the \"operating user_account\".
 * \param boardId Unique identifier of a board. *Required*
 * \param boardUpdate Update a board. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool boardsUpdateAsync(char * accessToken,
	std::string boardId, std::shared_ptr<BoardUpdate> boardUpdate, 
	void(* handler)(Board, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* BoardsManager_H_ */
