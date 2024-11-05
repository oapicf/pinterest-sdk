/*
 * CatalogsCreativeAssetsProductGroupCreateRequest.h
 *
 * Request object for creating a creative assets product group.
 */

#ifndef _CatalogsCreativeAssetsProductGroupCreateRequest_H_
#define _CatalogsCreativeAssetsProductGroupCreateRequest_H_


#include <string>
#include "CatalogsCreativeAssetsProductGroupFilters.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request object for creating a creative assets product group.
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsProductGroupCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreativeAssetsProductGroupCreateRequest();
	CatalogsCreativeAssetsProductGroupCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreativeAssetsProductGroupCreateRequest();

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
	CatalogsCreativeAssetsProductGroupFilters getFilters();

	/*! \brief Set 
	 */
	void setFilters(CatalogsCreativeAssetsProductGroupFilters  filters);
	/*! \brief Get Catalog id pertaining to the creative assets product group.
	 */
	std::string getCatalogId();

	/*! \brief Set Catalog id pertaining to the creative assets product group.
	 */
	void setCatalogId(std::string  catalog_id);

private:
	std::string catalog_type;
	std::string name;
	std::string description;
	CatalogsCreativeAssetsProductGroupFilters filters;
	std::string catalog_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreativeAssetsProductGroupCreateRequest_H_ */
