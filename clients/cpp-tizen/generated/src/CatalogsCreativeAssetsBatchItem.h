/*
 * CatalogsCreativeAssetsBatchItem.h
 *
 * Creative assets batch item
 */

#ifndef _CatalogsCreativeAssetsBatchItem_H_
#define _CatalogsCreativeAssetsBatchItem_H_


#include <string>
#include "CatalogsCreateCreativeAssetsItem.h"
#include "CatalogsDeleteCreativeAssetsItem.h"
#include "CatalogsUpdatableCreativeAssetsAttributes.h"
#include "CatalogsUpdateCreativeAssetsItem.h"
#include "CatalogsUpsertCreativeAssetsItem.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Creative assets batch item
 *
 *  \ingroup Models
 *
 */

class CatalogsCreativeAssetsBatchItem : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreativeAssetsBatchItem();
	CatalogsCreativeAssetsBatchItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreativeAssetsBatchItem();

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

#endif /* _CatalogsCreativeAssetsBatchItem_H_ */
