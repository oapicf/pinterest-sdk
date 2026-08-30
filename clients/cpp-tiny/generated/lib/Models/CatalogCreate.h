
/*
 * CatalogCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_CatalogCreate_H_
#define TINY_CPP_CLIENT_CatalogCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsType.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class CatalogCreate{
public:

    /*! \brief Constructor.
	 */
    CatalogCreate();
    CatalogCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogCreate();


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
	void setCatalogType(CatalogsType catalog_type);
	/*! \brief Get A human-friendly name associated to a catalog entity.
	 */
	std::string getName();

	/*! \brief Set A human-friendly name associated to a catalog entity.
	 */
	void setName(std::string name);


    private:
    CatalogsType catalog_type;
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogCreate_H_ */
