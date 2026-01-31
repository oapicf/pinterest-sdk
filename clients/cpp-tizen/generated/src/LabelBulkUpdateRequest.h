/*
 * LabelBulkUpdateRequest.h
 *
 * 
 */

#ifndef _LabelBulkUpdateRequest_H_
#define _LabelBulkUpdateRequest_H_


#include <string>
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
	/*! \brief Get Set status to `ARCHIVED` to remove the label from the parent entity.
	 */
	std::string getStatus();

	/*! \brief Set Set status to `ARCHIVED` to remove the label from the parent entity.
	 */
	void setStatus(std::string  status);
	/*! \brief Get </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit.
	 */
	std::string getValue();

	/*! \brief Set </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit.
	 */
	void setValue(std::string  value);

private:
	std::string id;
	std::string status;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LabelBulkUpdateRequest_H_ */
