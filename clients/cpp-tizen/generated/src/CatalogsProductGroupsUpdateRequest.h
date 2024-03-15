/*
 * Catalogs_product_groups_update_request.h
 *
 * 
 */

#ifndef _Catalogs_product_groups_update_request_H_
#define _Catalogs_product_groups_update_request_H_


#include <string>
#include "CatalogsHotelProductGroupFilters.h"
#include "CatalogsProductGroupUpdateRequest.h"
#include "CatalogsVerticalProductGroupUpdateRequest.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Catalogs_product_groups_update_request : public Object {
public:
	/*! \brief Constructor.
	 */
	Catalogs_product_groups_update_request();
	Catalogs_product_groups_update_request(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Catalogs_product_groups_update_request();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get boolean indicator of whether the product group is being featured or not
	 */
	bool getIsFeatured();

	/*! \brief Set boolean indicator of whether the product group is being featured or not
	 */
	void setIsFeatured(bool  is_featured);
	/*! \brief Get 
	 */
	CatalogsHotelProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsHotelProductGroupFilters  filters);
	/*! \brief Get 
	 */
	std::string getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(std::string  catalog_type);

private:
	std::string name;
	std::string description;
	bool is_featured;
	CatalogsHotelProductGroupFilters filters;
	std::string catalog_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Catalogs_product_groups_update_request_H_ */
