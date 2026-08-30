/*
 * DeletePartnerAssetAccessResultsResponseArray.h
 *
 * 
 */

#ifndef _DeletePartnerAssetAccessResultsResponseArray_H_
#define _DeletePartnerAssetAccessResultsResponseArray_H_


#include <string>
#include "DeletePartnerAssetAccessResult.h"
#include <list>
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

class DeletePartnerAssetAccessResultsResponseArray : public Object {
public:
	/*! \brief Constructor.
	 */
	DeletePartnerAssetAccessResultsResponseArray();
	DeletePartnerAssetAccessResultsResponseArray(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeletePartnerAssetAccessResultsResponseArray();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of terminated partner asset accesses.
	 */
	std::list<DeletePartnerAssetAccessResult> getItems();

	/*! \brief Set List of terminated partner asset accesses.
	 */
	void setItems(std::list <DeletePartnerAssetAccessResult> items);

private:
	std::list <DeletePartnerAssetAccessResult>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeletePartnerAssetAccessResultsResponseArray_H_ */
