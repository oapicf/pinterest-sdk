/*
 * CatalogsCreativeAssetsProductMetadata.h
 *
 * Creative assets product metadata entity
 */

#ifndef _CatalogsCreativeAssetsProductMetadata_H_
#define _CatalogsCreativeAssetsProductMetadata_H_


#include <string>
#include "CreativeAssetsVisibilityType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Creative assets product metadata entity
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsProductMetadata : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreativeAssetsProductMetadata();
	CatalogsCreativeAssetsProductMetadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreativeAssetsProductMetadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The user-created unique ID that represents the creative assets item.
	 */
	std::string getCreativeAssetsId();

	/*! \brief Set The user-created unique ID that represents the creative assets item.
	 */
	void setCreativeAssetsId(std::string  creative_assets_id);
	/*! \brief Get 
	 */
	CreativeAssetsVisibilityType getVisibility();

	/*! \brief Set 
	 */
	void setVisibility(CreativeAssetsVisibilityType  visibility);

private:
	std::string creative_assets_id;
	CreativeAssetsVisibilityType visibility;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreativeAssetsProductMetadata_H_ */
