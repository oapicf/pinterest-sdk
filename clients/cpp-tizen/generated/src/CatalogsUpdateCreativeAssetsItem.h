/*
 * CatalogsUpdateCreativeAssetsItem.h
 *
 * A creative assets item to be updated.
 */

#ifndef _CatalogsUpdateCreativeAssetsItem_H_
#define _CatalogsUpdateCreativeAssetsItem_H_


#include <string>
#include "CatalogsUpdatableCreativeAssetsAttributes.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A creative assets item to be updated.
 *
 *  \ingroup Models
 *
 */

class CatalogsUpdateCreativeAssetsItem : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsUpdateCreativeAssetsItem();
	CatalogsUpdateCreativeAssetsItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsUpdateCreativeAssetsItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The catalog creative assets item id in the merchant namespace
	 */
	std::string getCreativeAssetsId();

	/*! \brief Set The catalog creative assets item id in the merchant namespace
	 */
	void setCreativeAssetsId(std::string  creative_assets_id);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);
	/*! \brief Get 
	 */
	CatalogsUpdatableCreativeAssetsAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsUpdatableCreativeAssetsAttributes  attributes);

private:
	std::string creative_assets_id;
	std::string operation;
	CatalogsUpdatableCreativeAssetsAttributes attributes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsUpdateCreativeAssetsItem_H_ */
