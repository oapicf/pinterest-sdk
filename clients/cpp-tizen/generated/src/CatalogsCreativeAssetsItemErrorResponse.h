/*
 * CatalogsCreativeAssetsItemErrorResponse.h
 *
 * Object describing a creative assets item error
 */

#ifndef _CatalogsCreativeAssetsItemErrorResponse_H_
#define _CatalogsCreativeAssetsItemErrorResponse_H_


#include <string>
#include "CatalogsType.h"
#include "ItemValidationEvent.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing a creative assets item error
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsItemErrorResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreativeAssetsItemErrorResponse();
	CatalogsCreativeAssetsItemErrorResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreativeAssetsItemErrorResponse();

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
	/*! \brief Get The catalog creative assets id in the merchant namespace
	 */
	std::string getCreativeAssetsId();

	/*! \brief Set The catalog creative assets id in the merchant namespace
	 */
	void setCreativeAssetsId(std::string  creative_assets_id);
	/*! \brief Get Array with the errors for the item id requested
	 */
	std::list<ItemValidationEvent> getErrors();

	/*! \brief Set Array with the errors for the item id requested
	 */
	void setErrors(std::list <ItemValidationEvent> errors);

private:
	CatalogsType catalog_type;
	std::string creative_assets_id;
	std::list <ItemValidationEvent>errors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreativeAssetsItemErrorResponse_H_ */
