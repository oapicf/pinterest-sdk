/*
 * UpdatePartnerAssetsResultsResponseArray.h
 *
 * 
 */

#ifndef _UpdatePartnerAssetsResultsResponseArray_H_
#define _UpdatePartnerAssetsResultsResponseArray_H_


#include <string>
#include "UpdatePartnerAssetsResult.h"
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

class UpdatePartnerAssetsResultsResponseArray : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatePartnerAssetsResultsResponseArray();
	UpdatePartnerAssetsResultsResponseArray(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatePartnerAssetsResultsResponseArray();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of assigned/updated partner asset access.
	 */
	std::list<UpdatePartnerAssetsResult> getItems();

	/*! \brief Set List of assigned/updated partner asset access.
	 */
	void setItems(std::list <UpdatePartnerAssetsResult> items);

private:
	std::list <UpdatePartnerAssetsResult>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdatePartnerAssetsResultsResponseArray_H_ */
