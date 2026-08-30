/*
 * DeletePartnerAssetAccessBody.h
 *
 * An object with a list of partner asset accesses to delete.
 */

#ifndef _DeletePartnerAssetAccessBody_H_
#define _DeletePartnerAssetAccessBody_H_


#include <string>
#include "DeletePartnerAssetAccessItem.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object with a list of partner asset accesses to delete.
 *
 *  \ingroup Models
 *
 */

class DeletePartnerAssetAccessBody : public Object {
public:
	/*! \brief Constructor.
	 */
	DeletePartnerAssetAccessBody();
	DeletePartnerAssetAccessBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeletePartnerAssetAccessBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get List of partner asset accesses to delete.
	 */
	std::list<DeletePartnerAssetAccessItem> getAccesses();

	/*! \brief Set List of partner asset accesses to delete.
	 */
	void setAccesses(std::list <DeletePartnerAssetAccessItem> accesses);

private:
	std::list <DeletePartnerAssetAccessItem>accesses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeletePartnerAssetAccessBody_H_ */
