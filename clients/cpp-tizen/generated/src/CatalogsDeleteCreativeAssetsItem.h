/*
 * CatalogsDeleteCreativeAssetsItem.h
 *
 * A creative assets item to be deleted
 */

#ifndef _CatalogsDeleteCreativeAssetsItem_H_
#define _CatalogsDeleteCreativeAssetsItem_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A creative assets item to be deleted
 *
 *  \ingroup Models
 *
 */

class CatalogsDeleteCreativeAssetsItem : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsDeleteCreativeAssetsItem();
	CatalogsDeleteCreativeAssetsItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsDeleteCreativeAssetsItem();

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

private:
	std::string creative_assets_id;
	std::string operation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsDeleteCreativeAssetsItem_H_ */
