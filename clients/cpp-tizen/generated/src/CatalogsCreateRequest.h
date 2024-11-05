/*
 * CatalogsCreateRequest.h
 *
 * Request object for creating a catalog.
 */

#ifndef _CatalogsCreateRequest_H_
#define _CatalogsCreateRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object for creating a catalog.
 *
 *  \ingroup Models
 *
 */

class CatalogsCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreateRequest();
	CatalogsCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Type of the catalog entity.
	 */
	std::string getCatalogType();

	/*! \brief Set Type of the catalog entity.
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get A human-friendly name associated to a given catalog.
	 */
	std::string getName();

	/*! \brief Set A human-friendly name associated to a given catalog.
	 */
	void setName(std::string  name);

private:
	std::string catalog_type;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreateRequest_H_ */
