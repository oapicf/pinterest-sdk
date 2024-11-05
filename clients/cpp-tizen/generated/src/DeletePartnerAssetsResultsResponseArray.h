/*
 * DeletePartnerAssetsResultsResponseArray.h
 *
 * 
 */

#ifndef _DeletePartnerAssetsResultsResponseArray_H_
#define _DeletePartnerAssetsResultsResponseArray_H_


#include <string>
#include "DeletePartnerAssetsResult.h"
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

class DeletePartnerAssetsResultsResponseArray : public Object {
public:
	/*! \brief Constructor.
	 */
	DeletePartnerAssetsResultsResponseArray();
	DeletePartnerAssetsResultsResponseArray(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeletePartnerAssetsResultsResponseArray();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of terminated asset access.
	 */
	std::list<DeletePartnerAssetsResult> getItems();

	/*! \brief Set List of terminated asset access.
	 */
	void setItems(std::list <DeletePartnerAssetsResult> items);

private:
	std::list <DeletePartnerAssetsResult>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeletePartnerAssetsResultsResponseArray_H_ */
