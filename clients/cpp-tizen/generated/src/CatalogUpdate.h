/*
 * CatalogUpdate.h
 *
 * Resource create or update operation model.
 */

#ifndef _CatalogUpdate_H_
#define _CatalogUpdate_H_


#include <string>
#include "CatalogsType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create or update operation model.
 *
 *  \ingroup Models
 *
 */

class CatalogUpdate : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogUpdate();
	CatalogUpdate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogUpdate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get A human-friendly name associated to a catalog entity.
	 */
	std::string getName();

	/*! \brief Set A human-friendly name associated to a catalog entity.
	 */
	void setName(std::string  name);

private:
	CatalogsType catalog_type;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogUpdate_H_ */
