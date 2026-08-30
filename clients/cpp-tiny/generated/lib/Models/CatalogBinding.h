
/*
 * CatalogBinding.h
 *
 * Information about a catalog asset.
 */

#ifndef TINY_CPP_CLIENT_CatalogBinding_H_
#define TINY_CPP_CLIENT_CatalogBinding_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Information about a catalog asset.
 *
 *  \ingroup Models
 *
 */

class CatalogBinding{
public:

    /*! \brief Constructor.
	 */
    CatalogBinding();
    CatalogBinding(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogBinding();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Catalog type
	 */
	std::string getCatalogType();

	/*! \brief Set Catalog type
	 */
	void setCatalogType(std::string catalog_type);
	/*! \brief Get Catalog ID.
	 */
	std::string getId();

	/*! \brief Set Catalog ID.
	 */
	void setId(std::string id);
	/*! \brief Get Catalog name
	 */
	std::string getName();

	/*! \brief Set Catalog name
	 */
	void setName(std::string name);


    private:
    std::string catalog_type{};
    std::string id{};
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogBinding_H_ */
