
/*
 * Conversion_tags_list_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Conversion_tags_list_200_response_H_
#define TINY_CPP_CLIENT_Conversion_tags_list_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionTag.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Conversion_tags_list_200_response{
public:

    /*! \brief Constructor.
	 */
    Conversion_tags_list_200_response();
    Conversion_tags_list_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Conversion_tags_list_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<ConversionTag> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <ConversionTag> items);


    private:
    std::list<ConversionTag> items;
};
}

#endif /* TINY_CPP_CLIENT_Conversion_tags_list_200_response_H_ */
