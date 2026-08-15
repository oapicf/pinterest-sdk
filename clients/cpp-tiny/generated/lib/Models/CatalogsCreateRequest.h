
/*
 * CatalogsCreateRequest.h
 *
 * Request object for creating a catalog.
 */

#ifndef TINY_CPP_CLIENT_CatalogsCreateRequest_H_
#define TINY_CPP_CLIENT_CatalogsCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsType.h"

namespace Tiny {


/*! \brief Request object for creating a catalog.
 *
 *  \ingroup Models
 *
 */

class CatalogsCreateRequest{
public:

    /*! \brief Constructor.
	 */
    CatalogsCreateRequest();
    CatalogsCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsCreateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get A human-friendly name associated to a given catalog.
	 */
	std::string getName();

	/*! \brief Set A human-friendly name associated to a given catalog.
	 */
	void setName(std::string  name);


    private:
    CatalogsType catalog_type;
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsCreateRequest_H_ */
