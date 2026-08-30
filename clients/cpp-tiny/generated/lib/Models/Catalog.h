
/*
 * Catalog.h
 *
 * Catalog entity
 */

#ifndef TINY_CPP_CLIENT_Catalog_H_
#define TINY_CPP_CLIENT_Catalog_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsType.h"

namespace Tiny {


/*! \brief Catalog entity
 *
 *  \ingroup Models
 *
 */

class Catalog{
public:

    /*! \brief Constructor.
	 */
    Catalog();
    Catalog(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Catalog();


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
	/*! \brief Get 
	 */
	std::string getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(std::string created_at);
	/*! \brief Get ID of the catalog entity.
	 */
	std::string getId();

	/*! \brief Set ID of the catalog entity.
	 */
	void setId(std::string id);
	/*! \brief Get A human-friendly name associated to a catalog entity.
	 */
	std::string getName();

	/*! \brief Set A human-friendly name associated to a catalog entity.
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	std::string getUpdatedAt();

	/*! \brief Set 
	 */
	void setUpdatedAt(std::string updated_at);


    private:
    CatalogsType catalog_type;
    std::string created_at{};
    std::string id{};
    std::string name{};
    std::string updated_at{};
};
}

#endif /* TINY_CPP_CLIENT_Catalog_H_ */
