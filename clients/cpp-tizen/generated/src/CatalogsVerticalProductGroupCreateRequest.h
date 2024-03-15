/*
 * CatalogsVerticalProductGroupCreateRequest.h
 *
 * Request object for creating a hotel product group.
 */

#ifndef _CatalogsVerticalProductGroupCreateRequest_H_
#define _CatalogsVerticalProductGroupCreateRequest_H_


#include <string>
#include "CatalogsHotelProductGroupCreateRequest.h"
#include "CatalogsHotelProductGroupFilters.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object for creating a hotel product group.
 *
 *  \ingroup Models
 *
 */

class CatalogsVerticalProductGroupCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsVerticalProductGroupCreateRequest();
	CatalogsVerticalProductGroupCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsVerticalProductGroupCreateRequest();

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
	/*! \brief Get Catalog id pertaining to the hotel product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the hotel product group.
	 */
	void setCatalogId(std::string  catalog_id);

private:
	std::string catalog_type;
	std::string name;
	std::string description;
	CatalogsHotelProductGroupFilters filters;
	std::string catalog_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsVerticalProductGroupCreateRequest_H_ */
