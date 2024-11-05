/*
 * DeleteMemberAccessResult.h
 *
 * The terminated asset access.
 */

#ifndef _DeleteMemberAccessResult_H_
#define _DeleteMemberAccessResult_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The terminated asset access.
 *
 *  \ingroup Models
 *
 */

class DeleteMemberAccessResult : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteMemberAccessResult();
	DeleteMemberAccessResult(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteMemberAccessResult();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of the business asset.
	 */
	std::string getAssetId();

	/*! \brief Set Unique identifier of the business asset.
	 */
	void setAssetId(std::string  asset_id);
	/*! \brief Get Unique identifier of the business member.
	 */
	std::string getMemberId();

	/*! \brief Set Unique identifier of the business member.
	 */
	void setMemberId(std::string  member_id);

private:
	std::string asset_id;
	std::string member_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteMemberAccessResult_H_ */
