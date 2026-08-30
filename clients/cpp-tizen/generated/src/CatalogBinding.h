/*
 * CatalogBinding.h
 *
 * Information about a catalog asset.
 */

#ifndef _CatalogBinding_H_
#define _CatalogBinding_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Information about a catalog asset.
 *
 *  \ingroup Models
 *
 */

class CatalogBinding : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogBinding();
	CatalogBinding(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogBinding();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Catalog type
	 */
	std::string getCatalogType();

	/*! \brief Set Catalog type
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get Catalog ID.
	 */
	std::string getId();

	/*! \brief Set Catalog ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Catalog name
	 */
	std::string getName();

	/*! \brief Set Catalog name
	 */
	void setName(std::string  name);

private:
	std::string catalog_type;
	std::string id;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogBinding_H_ */
