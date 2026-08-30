
/*
 * Catalogs_local_stores_create_200_response_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Catalogs_local_stores_create_200_response_inner_H_
#define TINY_CPP_CLIENT_Catalogs_local_stores_create_200_response_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Catalogs_local_stores_create_200_response_inner_data.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Catalogs_local_stores_create_200_response_inner{
public:

    /*! \brief Constructor.
	 */
    Catalogs_local_stores_create_200_response_inner();
    Catalogs_local_stores_create_200_response_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Catalogs_local_stores_create_200_response_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Catalogs_local_stores_create_200_response_inner_data getData();

	/*! \brief Set 
	 */
	void setData(Catalogs_local_stores_create_200_response_inner_data data);


    private:
    Catalogs_local_stores_create_200_response_inner_data data;
};
}

#endif /* TINY_CPP_CLIENT_Catalogs_local_stores_create_200_response_inner_H_ */
