
/*
 * Catalogs_local_stores_create_200_response_inner_data_oneOf.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Catalogs_local_stores_create_200_response_inner_data_oneOf_H_
#define TINY_CPP_CLIENT_Catalogs_local_stores_create_200_response_inner_data_oneOf_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Catalogs_local_stores_create_200_response_inner_data_oneOf{
public:

    /*! \brief Constructor.
	 */
    Catalogs_local_stores_create_200_response_inner_data_oneOf();
    Catalogs_local_stores_create_200_response_inner_data_oneOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Catalogs_local_stores_create_200_response_inner_data_oneOf();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the local store.
	 */
	std::string getId();

	/*! \brief Set The ID of the local store.
	 */
	void setId(std::string id);
	/*! \brief Get 
	 */
	Pinterest.Lib.Error getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(Pinterest.Lib.Error exceptions);


    private:
    std::string id{};
    Pinterest.Lib.Error exceptions;
};
}

#endif /* TINY_CPP_CLIENT_Catalogs_local_stores_create_200_response_inner_data_oneOf_H_ */
