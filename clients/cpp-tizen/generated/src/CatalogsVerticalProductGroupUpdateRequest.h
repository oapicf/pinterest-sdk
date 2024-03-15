/*
 * CatalogsVerticalProductGroupUpdateRequest.h
 *
 * Request object for updating a hotel product group.
 */

#ifndef _CatalogsVerticalProductGroupUpdateRequest_H_
#define _CatalogsVerticalProductGroupUpdateRequest_H_


#include <string>
#include "CatalogsHotelProductGroupFilters.h"
#include "CatalogsHotelProductGroupUpdateRequest.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object for updating a hotel product group.
 *
 *  \ingroup Models
 *
 */

class CatalogsVerticalProductGroupUpdateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsVerticalProductGroupUpdateRequest();
	CatalogsVerticalProductGroupUpdateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsVerticalProductGroupUpdateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	CatalogsHotelProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsHotelProductGroupFilters  filters);

private:
	std::string catalog_type;
	std::string name;
	std::string description;
	CatalogsHotelProductGroupFilters filters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsVerticalProductGroupUpdateRequest_H_ */
