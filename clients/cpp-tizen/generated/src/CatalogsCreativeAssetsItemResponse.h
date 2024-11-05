/*
 * CatalogsCreativeAssetsItemResponse.h
 *
 * Object describing a hotel record
 */

#ifndef _CatalogsCreativeAssetsItemResponse_H_
#define _CatalogsCreativeAssetsItemResponse_H_


#include <string>
#include "CatalogsCreativeAssetsAttributes.h"
#include "CatalogsType.h"
#include "Pin.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing a hotel record
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsItemResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreativeAssetsItemResponse();
	CatalogsCreativeAssetsItemResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreativeAssetsItemResponse();

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
	/*! \brief Get The pins mapped to the item
	 */
	std::list<Pin> getPins();

	/*! \brief Set The pins mapped to the item
	 */
	void setPins(std::list <Pin> pins);
	/*! \brief Get 
	 */
	CatalogsCreativeAssetsAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsCreativeAssetsAttributes  attributes);

private:
	CatalogsType catalog_type;
	std::string creative_assets_id;
	std::list <Pin>pins;
	CatalogsCreativeAssetsAttributes attributes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreativeAssetsItemResponse_H_ */
