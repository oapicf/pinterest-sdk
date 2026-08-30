
/*
 * Lead_forms_list_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Lead_forms_list_200_response_H_
#define TINY_CPP_CLIENT_Lead_forms_list_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LeadForm.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Lead_forms_list_200_response{
public:

    /*! \brief Constructor.
	 */
    Lead_forms_list_200_response();
    Lead_forms_list_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Lead_forms_list_200_response();


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
	void setBookmark(std::string bookmark);
	/*! \brief Get 
	 */
	std::list<LeadForm> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<LeadForm> items);


    private:
    std::string bookmark{};
    std::list<LeadForm> items;
};
}

#endif /* TINY_CPP_CLIENT_Lead_forms_list_200_response_H_ */
