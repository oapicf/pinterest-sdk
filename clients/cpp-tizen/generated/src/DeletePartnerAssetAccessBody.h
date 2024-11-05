/*
 * DeletePartnerAssetAccessBody.h
 *
 * 
 */

#ifndef _DeletePartnerAssetAccessBody_H_
#define _DeletePartnerAssetAccessBody_H_


#include <string>
#include "DeletePartnerAssetAccessBody_accesses_inner.h"
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

	/*! \brief Get 
	 */
	std::list<DeletePartnerAssetAccessBody_accesses_inner> getAccesses();

	/*! \brief Set 
	 */
	void setAccesses(std::list <DeletePartnerAssetAccessBody_accesses_inner> accesses);

private:
	std::list <DeletePartnerAssetAccessBody_accesses_inner>accesses;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeletePartnerAssetAccessBody_H_ */
