
/*
 * Conversion_deletion_request_list_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Conversion_deletion_request_list_200_response_H_
#define TINY_CPP_CLIENT_Conversion_deletion_request_list_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionDeletionRequest.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Conversion_deletion_request_list_200_response{
public:

    /*! \brief Constructor.
	 */
    Conversion_deletion_request_list_200_response();
    Conversion_deletion_request_list_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Conversion_deletion_request_list_200_response();


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
	std::list<ConversionDeletionRequest> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<ConversionDeletionRequest> items);


    private:
    std::string bookmark{};
    std::list<ConversionDeletionRequest> items;
};
}

#endif /* TINY_CPP_CLIENT_Conversion_deletion_request_list_200_response_H_ */
