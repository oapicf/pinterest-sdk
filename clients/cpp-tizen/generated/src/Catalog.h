/*
 * Catalog.h
 *
 * Catalog entity
 */

#ifndef _Catalog_H_
#define _Catalog_H_


#include <string>
#include "CatalogsType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Catalog entity
 *
 *  \ingroup Models
 *
 */

class Catalog : public Object {
public:
	/*! \brief Constructor.
	 */
	Catalog();
	Catalog(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Catalog();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(std::string  created_at);
	/*! \brief Get ID of the catalog entity.
	 */
	std::string getId();

	/*! \brief Set ID of the catalog entity.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getUpdatedAt();

	/*! \brief Set 
	 */
	void setUpdatedAt(std::string  updated_at);
	/*! \brief Get A human-friendly name associated to a catalog entity.
	 */
	std::string getName();

	/*! \brief Set A human-friendly name associated to a catalog entity.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);

private:
	std::string created_at;
	std::string id;
	std::string updated_at;
	std::string name;
	CatalogsType catalog_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Catalog_H_ */
