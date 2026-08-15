
/*
 * Board_sections_list_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Board_sections_list_200_response_H_
#define TINY_CPP_CLIENT_Board_sections_list_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BoardSection.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Board_sections_list_200_response{
public:

    /*! \brief Constructor.
	 */
    Board_sections_list_200_response();
    Board_sections_list_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Board_sections_list_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);
	/*! \brief Get Board sections
	 */
	std::list<BoardSection> getItems();

	/*! \brief Set Board sections
	 */
	void setItems(std::list <BoardSection> items);


    private:
    std::string bookmark{};
    std::list<BoardSection> items;
};
}

#endif /* TINY_CPP_CLIENT_Board_sections_list_200_response_H_ */
