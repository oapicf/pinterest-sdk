/*
 * CatalogsCreateCreativeAssetsItem.h
 *
 * A creative assets item to be created.
 */

#ifndef _CatalogsCreateCreativeAssetsItem_H_
#define _CatalogsCreateCreativeAssetsItem_H_


#include <string>
#include "CatalogsCreativeAssetsAttributes.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A creative assets item to be created.
 *
 *  \ingroup Models
 *
 */

class CatalogsCreateCreativeAssetsItem : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreateCreativeAssetsItem();
	CatalogsCreateCreativeAssetsItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreateCreativeAssetsItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The catalog creative assets id in the merchant namespace
	 */
	std::string getCreativeAssetsId();

	/*! \brief Set The catalog creative assets id in the merchant namespace
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
	CatalogsCreativeAssetsAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsCreativeAssetsAttributes  attributes);

private:
	std::string creative_assets_id;
	std::string operation;
	CatalogsCreativeAssetsAttributes attributes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreateCreativeAssetsItem_H_ */
