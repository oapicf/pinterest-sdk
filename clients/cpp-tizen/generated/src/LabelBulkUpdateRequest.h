/*
 * LabelBulkUpdateRequest.h
 *
 * 
 */

#ifndef _LabelBulkUpdateRequest_H_
#define _LabelBulkUpdateRequest_H_


#include <string>
#include "LabelStatusBulkUpdate.h"
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

class LabelBulkUpdateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	LabelBulkUpdateRequest();
	LabelBulkUpdateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LabelBulkUpdateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Label ID.
	 */
	std::string getId();

	/*! \brief Set Label ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
	 */
	std::string getParentId();

	/*! \brief Set Unique identifier of the asset you are labelling. Currently, you can only label campaigns.
	 */
	void setParentId(std::string  parent_id);
	/*! \brief Get 
	 */
	LabelStatusBulkUpdate getStatus();

	/*! \brief Set 
	 */
	void setStatus(LabelStatusBulkUpdate  status);

private:
	std::string id;
	std::string parent_id;
	LabelStatusBulkUpdate status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LabelBulkUpdateRequest_H_ */
